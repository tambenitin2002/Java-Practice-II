package objectClass;

import java.util.Objects;

public class Employee {
  String ename;
  int id;

  public Employee(String ename, int id){
    this.ename=ename;
    this.id=id;

  }
/* ToString() */
  @Override
  public String toString(){

    return "Employee [ename=" + ename + ", id=" + id + "]";
  }

 /* Equals() */
 @Override
 public boolean equals(Object ob) {

     if (ob == null || !(ob instanceof Employee)) return false;  // Null and type check
     Employee e = (Employee) ob;
     return this.ename.equals(e.ename) && this.id == e.id;  // Compare ename and id fields
 }

 @Override
 public int hashCode(){
   return Objects.hash(ename, id);
 }
}
