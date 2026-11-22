import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] pos = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                pos[count] = arr[i];
                count++;
            }
        }

        if(count == 0) {
            System.out.println(-1);
        } else {
            int mid = count / 2;
            System.out.println(pos[mid]);
        }
    }
}