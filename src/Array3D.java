import java.util.Scanner;

public class Array3D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of organisations:");
        int l = sc.nextInt();
        

        System.out.println("Enter the number of companies:");
        int m = sc.nextInt();
        System.out.println("Enter the number of employees per company:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        String[][][] arr = new String[l][m][n];

        for (int i = 0; i < l; i++) {
            
            for (int j = 0; j < m; j++) {
            	for(int k=0;k<n;k++) {
            		System.out.println("Enter the name of employee no: " + (k + 1) +" from company no:"+(j+1)+ "from organisation no:"+(i+1)+":");
                    arr[i][j][k] = sc.nextLine();
            		
            	}
                
            }
        }

        
        for (int i = 0; i < l; i++) {
            
            for (int j = 0; j < m; j++) {
            	for(int k=0;k<n;k++) {
            		System.out.println("Enter the name of employee no: " + (k + 1) +" from company no:"+(j+1)+ "from organisation no:"+(i+1)+":"+arr[i][j][k]);
            }
            }
        }

         
    }
}