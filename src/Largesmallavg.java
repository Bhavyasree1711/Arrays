
public class Largesmallavg {

	public static void main(String[] args) {
		int arr[]= {10,20,35,60,78};
		int max = arr[0];
		int min = arr[0];
		int sum = arr[0];
		for(int i =1;i<arr.length;i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
			sum = sum + arr[i];
		}
		double average = (double) sum / arr.length;
			System.out.println(max);
			System.out.println(min);
			System.out.println(average);
			}
		

	}


