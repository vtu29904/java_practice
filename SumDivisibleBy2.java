import java.util.Scanner;
class SumDivisibleBy2{
public static void main(String amgs[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
if (a%2==0){
System.out.println("Sum is divisible by 2");
}
else {
System.out.println("Sum is not divisible by 2");
}
}
}