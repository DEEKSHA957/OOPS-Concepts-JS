class A{  
private A(){}//private constructor  
void msg(){System.out.println("Hello java");}  
}  
 class Simple{  
 public static void main(String args[]){  
   A obj=new A();//Compile Time Error  
 }  
}
