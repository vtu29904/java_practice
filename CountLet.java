import java.io.*;
import java.util.*;

public class CountLet {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();                        //trumpet   2
						       //reiterate 3
        int max=0;
        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
            if(s.charAt(i)==s.charAt(j)){
               count++; 
            }
            
            if(count>max){
                max=count;
            }
            }
        }
            
            System.out.print(max);
        
    }
}
