import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr= new String[5];
		for(int i=1;i<=5;i++) {
			System.out.println("Enter thr name of employee no:"+i);
			arr[i-1]=sc.next();
			
		}
		for(String name :arr) {
			System.out.println(name);
		}
		
		// TODO Auto-generated method stub

	}

}
