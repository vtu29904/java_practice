import java.util.*;
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
