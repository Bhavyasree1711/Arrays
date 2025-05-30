import java.util.Scanner;

public class Array2D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of companies:");
        int m = sc.nextInt();
        System.out.println("Enter the number of employees per company:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        String[][] arr = new String[m][n];

        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the name of employee no: " + (j + 1) +" from company no:"+(i+1)+":");
                arr[i][j] = sc.nextLine();
            }
        }

        
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
            	System.out.println("Enter the name of employee no: " + (j + 1) +" from company no:"+(i+1)+":"+arr[i][j]);
                
            }
            System.out.println();
        }

        sc.close(); // Close Scanner to prevent resource leak
    }
}