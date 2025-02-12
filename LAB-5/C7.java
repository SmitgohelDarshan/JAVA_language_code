import java.util.Scanner;

public class C7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element "+(i + 1)+": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter pivot index: ");
        int pivotIndex = sc.nextInt();

        int j = 0;
        for (int i = pivotIndex; i < n; i++, j++) {
            arr2[j] = arr[i]; //only pivot index to n-1 element 
        }
        for (int i = 0; i < pivotIndex; i++, j++) {
            arr2[j+1] = arr[i]; // after other in this array
        }

        System.out.print("change Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        int output = -1;
        for (int i = 0; i < n; i++) {
            if (arr2[i] == target) {
                output = i;
                break;
            }
        }

        if (output != -1) {
            System.out.println(target +" is found at index: "+output);
        } else {
            System.out.println("Output = "+output);
        }
    }
}
