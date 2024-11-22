package objectClass;

public class EmployeeDriver {
 public static void main(String[] args) {
    Employee e1=new Employee("Rahul", 10);
    /* To String */
    System.out.println("This is for toString() method");
   // System.out.println(e1); //objectClass.Employee@15db9742
  System.out.println(e1); //Rahul, 10
  System.out.println("==================================================================");
  System.out.println("                           XXX                                    ");
  System.out.println("==================================================================");
    /* equals */
    Employee e2=new Employee("Rahul.", 10);
    System.out.println("This is for equals() method");
   //System.out.println(e1.equals(e2));// false
    System.out.println(e1.equals(e2));//true

    System.out.println("==================================================================");
    System.out.println("                           XXX                                    ");
    System.out.println("==================================================================");
    /* hasCode() */
    System.out.println("This is for hashCode() method");
    System.out.println(e1.hashCode());
    System.out.println(e2.hashCode());
    System.out.println(e1.hashCode());
 }
}
