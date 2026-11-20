
import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int fl=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>fl){
                sl=fl;
                fl=arr[i];
            }
            if(arr[i]>sl && fl!=arr[i]){
                sl=arr[i];
            }
        }
        if(sl==Integer.MIN_VALUE){
            System.out.println("0");
        }else{
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]==sl){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
