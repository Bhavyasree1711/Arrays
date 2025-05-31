
//public class Revarr {

	//public static void main(String[] args) {
		//int arr[] = {10,30,40,70,50};
		
		//for(int i=arr.length-1;i>=0;i--) {
			//System.out.println(arr[i]);
		//}
		

	//}

//}
//class Revarr{
	//public static void main(String args[]) {
		//int arr[]= {10,20,30,40,50,70};
		//int temp[] = new int[arr.length];
		//int j = 0;
		//for(int i=arr.length-1;i>=0;i--) {
			//temp[j]=arr[i];
			//j++;
		//}
			//for(int val:temp) {
				//System.out.println(val);
			//}
			
		//}
		
	
	//}
import java.util.Arrays;

public class Revarr {

	public static void main(String[] args) {
		int arr[] = {10,30,40,70,50}; 
		int start = 0;
		int end = arr.length-1;
		int temp = 0;
		while(start<end) {
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		System.out.println(Arrays.toString(arr));

		


}
}