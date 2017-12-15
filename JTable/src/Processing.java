package emf.output;

import java.sql.Connection;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 * Created by Frondo on 2017/11/30.
 */
public class Processing extends JFrame {
    static Connection conn = JDBC.getConnection();
    static String sql;
    static ResultSet resultSet;
    static EMfStructure emf;
    static List<EMfStructure> list = new ArrayList<EMfStructure>();
    static List<String> name = new ArrayList<String>();
    static JTable table;
    static JTableHeader header;
    static JScrollPane pane;

    public Processing() {
        super("EMFResult");
        this.setSize(800, 400);
        this.setLayout(null);
        this.setLocation(240, 25);
        this.setVisible(true);
        pane = new JScrollPane();
        pane.setBounds(0, 50, 800, 270);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pane);
        output();
        this.setVisible(true);
    }

    public static void output() {
        try {
            String isTableExist = "select table_name from information_schema. \"tables\" " +
                    "where table_name = \'sales\'";
            PreparedStatement preparedStatement1 = conn.prepareStatement(isTableExist);
            resultSet = preparedStatement1.executeQuery();
            if (resultSet.next()) {
                sql = "SELECT * FROM sales";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
                String cust, state, prod, year, day, month;
                int quant;
                List<String> gattrsL = new ArrayList<String>();
                gattrsL.add("cust");
                gattrsL.add("prod");
                while (resultSet.next()) {
                    cust = resultSet.getString("cust");
                    state = resultSet.getString("state");
                    quant = resultSet.getInt("quant");
                    prod = resultSet.getString("prod");
                    year = String.valueOf(resultSet.getInt("year"));
                    month = String.valueOf(resultSet.getInt("month"));
                    day = String.valueOf(resultSet.getInt("day"));
                    String[] temp = new String[2];
                    for (int i = 0; i < 2; i++) {
                        if (gattrsL.get(i).equals("cust"))
                            temp[i] = cust
                                    ;
                        else if (gattrsL.get(i).equals("prod"))
                            temp[i] = prod
                                    ;
                        else if (gattrsL.get(i).equals("year"))
                            temp[i] = year
                                    ;
                        else if (gattrsL.get(i).equals("month"))
                            temp[i] = month
                                    ;
                        else if (gattrsL.get(i).equals("day"))
                            temp[i] = day
                                    ;
                        else if (gattrsL.get(i).equals("state"))
                            temp[i] = state
                                    ;
                        else if (gattrsL.get(i).equals("quant"))
                            temp[i] = Integer.toString(quant);
                    }
                    String tem = null;
                    for (int i = 0; i < temp.length; i++) {
                        tem += temp[i];
                    }
                    if (!name.contains(tem)) {
                        name.add(tem);
                        emf = new EMfStructure();
                        emf.setcust(cust);
                        emf.setprod(prod);
                        list.add(emf);
                        emf.setquant_sum_0(quant);
                        emf.setquant_count_0(1);
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i).getcust().equals(cust) && list.get(i).getprod().equals(prod)) {
                                EMfStructure emf = list.get(i);
                                emf.setquant_sum_0(emf.getquant_sum_0() + quant);
                                emf.setquant_count_0(emf.getquant_count_0() + 1);
                            }
                        }
                    }
                }
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    cust = resultSet.getString("cust");
                    state = resultSet.getString("state");
                    quant = resultSet.getInt("quant");
                    prod = resultSet.getString("prod");
                    year = String.valueOf(resultSet.getInt("year"));
                    month = String.valueOf(resultSet.getInt("month"));
                    day = String.valueOf(resultSet.getInt("day"));
                    for (int i = 0; i < list.size(); i++) {
                        emf = list.get(i);
                        if (cust.equals(emf.getcust()) && prod.equals(emf.getprod())) {
                            emf.setquant_sum_1(emf.getquant_sum_1() + quant);
                            emf.setquant_count_1(emf.getquant_count_1() + 1);
                        }
                    }
                }
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    cust = resultSet.getString("cust");
                    state = resultSet.getString("state");
                    quant = resultSet.getInt("quant");
                    prod = resultSet.getString("prod");
                    year = String.valueOf(resultSet.getInt("year"));
                    month = String.valueOf(resultSet.getInt("month"));
                    day = String.valueOf(resultSet.getInt("day"));
                    for (int i = 0; i < list.size(); i++) {
                        emf = list.get(i);
                        if (!cust.equals(emf.getcust()) && prod.equals(emf.getprod())) {
                            emf.setquant_sum_2(emf.getquant_sum_2() + quant);
                            emf.setquant_count_2(emf.getquant_count_2() + 1);
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("table is not exist");
            }
            System.out.println();

            String[] title = {"cust", "prod", "quant_avg_1", "quant_avg_2"};
            Object[][] info = new Object[list.size()][4];
            for (int i = 0, j = 0; i < list.size(); i++) {
                info[j][0] = list.get(i).getcust();
                info[j][1] = list.get(i).getprod();
                int quant_avg_1 = list.get(i).getquant_sum_1() / list.get(i).getquant_count_1();
                info[j][2] = quant_avg_1;
                int quant_avg_2 = list.get(i).getquant_sum_2() / list.get(i).getquant_count_2();
                info[j][3] = quant_avg_2;
                j++;
            }
            table = new JTable(info, title);
            table.setRowHeight(50);
            table.setFont(new Font("Menu.front", Font.PLAIN, 20));
            header = table.getTableHeader();
            pane.getViewport().add(table);
        } catch (Exception e) {
            e.printStackTrace();
        }
        JDBC.close(conn);
    }
}