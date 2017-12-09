+import java.io.*;

public class FileOpen {
    public static void main(String[] arg) {
        try{
            FileReader f = new FileReader("tset.txt");
            BufferedReader br = new BufferedReader(f);
            String s = br.readLine();
            while(s != null) {
                System.out.println(s);
                s = br.readLine();
            }
        } catch(IOException e) {
            System.out.println("error");
        } finally {
            System.out.println("this will be deploy!");
        }

    }
}
