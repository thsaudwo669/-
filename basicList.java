package h1;

import java.util.Scanner;

public class basicList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++) {
            System.out.print((i+1)+"번째 수 입력 : ");
            arr[i] = sc.nextInt();
        }       
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
            idx=i;
            for(int j=(i+1); j<arr.length; j++) {
                if(arr[j] > arr[idx]) {
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("정렬 후 ");
        for(int i : arr) {
            System.out.print(i+"\t");
        }

	}

}
