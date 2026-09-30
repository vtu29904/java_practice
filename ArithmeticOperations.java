import java.util.Scanner;
class ArithmeticOperations{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Addition="+(a+b));
System.out.println("Subtraction="+(a-b));
System.out.println("Multiplication="+(a*b));
System.out.println("Divition="+(a/b));
System.out.println("Modulus="+(a%b));
}
}