public class RunEncap {
   public static void main(String args[]) {
      EncapTest encap = new EncapTest();
      encap.setName("Deeksha");
      encap.setAge(25);
      encap.setIdNum("45678");
      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge() + " IdNum: " + encap.getIdNum());
   }
}