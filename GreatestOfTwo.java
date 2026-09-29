import java.util.Scanner;
class GreatestOfTwo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter three numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int greatest=(a>b)? a : b;
System.out.println("Greatest number="+greatest);
}
}