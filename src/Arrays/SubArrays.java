package Arrays;

public class SubArrays {
    public static void printSubarrays(int[] arr) {
        int totalSubarrays = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    if (k < j) System.out.print(", ");
                }
                System.out.print("] ");
                totalSubarrays++;
            }
            System.out.println();
        }

        System.out.println("Total Subarrays: " + totalSubarrays);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        printSubarrays(arr);
    }
}
