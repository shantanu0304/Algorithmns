package Algos;

import java.util.Scanner;
public class Sum {
    static boolean checksum(int sum)
    {
        return sum>0;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum=0;
        Scanner ob = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = ob.nextInt();
            sum+=arr[i];
        }
        System.out.println(checksum(sum));

    }

}
