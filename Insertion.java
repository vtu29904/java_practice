import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr= new int[n+1];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        
       }
       int x =sc.nextInt();
       for(int i=n-1;i>=0;i--){
        if(arr[i]>x){
            arr[i+1]=arr[i];
        }
        else{
            arr[i+1]=x;
            break;
        }
       }
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");            
        }    
}
}
