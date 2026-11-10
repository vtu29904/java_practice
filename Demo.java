import java.util.*;
class Calculator{
    public int add(int n1,int n2){

        return n1+n2;
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator obj=new Calculator();
        int r1=obj.add(sc.nextInt(),sc.nextInt());
        System.out.println("ans="+r1);
    }
}
