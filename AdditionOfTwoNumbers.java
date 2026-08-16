import java.util.Scanner;
class AdditionOfTwoNumbers{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter two numbers:");
int num1=scan.nextInt();
int num2=scan.nextInt();
int Result=num1+num2;
System.out.println("Result:"+Result);
}
}