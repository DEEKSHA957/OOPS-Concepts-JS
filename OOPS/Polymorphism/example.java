class Arithmetic{
int cube(int x){
return x*x*x;
}
double cube(double x){
return x*x*x;
}
float cube(float x){
return x*x*x;
}
public static void main(String[] args){
Arithmetic myMultiplication = new Arithmetic();
System.out.println("The cube of 5 is " + myMultiplication.cube(5));
System.out.println("The cube of 5.0 is " + myMultiplication.cube(5.0));
System.out.println("The cube of 0.5 is " + myMultiplication.cube(0.5));
}
}