import java.util.Scanner;
public class Array4d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of franchise:");
		int a = sc.nextInt();
		System.out.println("Enter the number of organisations:");
		int b = sc.nextInt();
		System.out.println("Enter the number of companies:");
		int c= sc.nextInt();
		System.out.println("Enter the number of employess:");
		int d = sc.nextInt();
		String arr[][][][] =new String[a][b][c][d];
		
		for(int i =0 ; i<a;i++) {
			for(int j=0;j<b;j++) {
				for(int k=0;k<c;k++) {
					for(int l=0;l<d;l++) {
						System.out.println("Enter the name of employee no:" + (l + 1) +" from company no:"+(k+1)+ "from organisation no:"+(j+1)+"from franchise no:"+(i+1) );
						arr[i][j][k][l]=sc.next();
						
					}
				}
			}
		}
		for(int i =0 ; i<a;i++) {
			for(int j=0;j<b;j++) {
				for(int k=0;k<c;k++) {
					for(int l=0;l<d;l++) {
						System.out.println("the name of employee no:" + (l + 1) +" from company no:"+(k+1)+ "from organisation no:"+(j+1)+"from franchise no:"+(i+1)+":"+arr[i][j][k][l]);
					}
				}
			}
		}
	}

}
