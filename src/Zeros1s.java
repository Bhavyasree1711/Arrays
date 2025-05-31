public class Zeros1s {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 1, 1};
        int ones = 0;
        int zeroes = 0;

        // Count 0s and 1s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroes++;
            } else {
                ones++;
            }
        }

        // Create a new array to store the sorted elements
        int[] temp = new int[arr.length];

        // Fill the temp array with 0s and 1s
        for (int i = 0; i < arr.length; i++) {
            if (i < zeroes) {
                temp[i] = 0;
            } else {
                temp[i] = 1;
            }
        }

        // Print the sorted array
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
