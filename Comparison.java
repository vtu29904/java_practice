import java.util.Scanner;
class Comparison{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the A value:");
int A=sc.nextInt();
System.out.print("Enter the B value:");
int B=sc.nextInt();
System.out.println( A + "<" + B + "is" + (A<B));
System.out.println( A + "<=" + B + "is" + (A<=B));
System.out.println( A + ">" + B + "is" + (A>B));
System.out.println( A + ">=" + B + "is" + (A>=B));
System.out.println( A + "==" +B + "is" + (A==B));
System.out.println( A + "!=" + B + "is" + (A!=B));
}
}



