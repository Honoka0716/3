public class Person implements java.io.Serializable {
  private int age;
  private String first;
  private String last;
  private Person[] children;
  
  public Person() {
    first = ""; last = ""; age = 0;
    children  = null;
  }
  
  public void setAge(int a) { age = a; }
  public int getAge() { return age; }
  
  public void setFirstName(String j) { first = j; }
  public String getFirstName() { return first; }
  
  public Person[] getChildren() {
    return children;
  }
  
  public void setChildren(Person[] child) {
    children = child;
  }
  
  public Person getChild(int i) { return children[i]; }
  public void setChild(int i, Person p) { children[i] = p; }
  
  
}