import java.util.Scanner;
public class Swap {
	public static void main(String[]args) {
		int arr[]= {1,2,3,4,5,6,7};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter th swap value:");
		int swap = sc.nextInt();
		
		arr=Swap(0,swap-1,arr);
		arr=Swap(swap,arr.length-1,arr);
		arr=Swap(0,arr.length-1,arr);
		for(int val:arr)
		{
			System.out.print(val+",");
		}
		
	}
	static int[] Swap(int start,int end, int[] arr)
	{
		
		while (start<end) {
			int temp=arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
		
	}
}
