 public class two
 {
 String empName; // contains employee name
 int empId; // stores employee id
 
 two(String name, int id)//  two parameters
 {
     empName = name;// initializing
     empId = id;
 }
 void printInfo()
 {
     System.out.println("Employee name is: " + empName + ", and id is: " + empId);
 }
 public static void main(String argvs[])
 {  
     two e1 = new two("Ajay", 12345);
     two e2 = new two("Amar", 26789);
     e1.printInfo();
     e2.printInfo();
 }
 } 