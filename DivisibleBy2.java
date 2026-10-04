import java.util.Scanner;
class DivisibleBy2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter two numbers:");
int num1=sc.nextInt();
int num2=sc.nextInt();
if ((num1+num2)%2==0){
System.out.println("is divisible");
}
else{
System.out.println("is not divisible");
}
}
}