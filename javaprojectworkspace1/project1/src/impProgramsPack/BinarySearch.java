package impProgramsPack;
import java.util.Scanner;
public class BinarySearch 
{
		// Recursive Function
		public static int binarySearch(int input[], int element) {
			// Write your code here
			int start,end;
			start = 0;
			end = input.length-1;
			//Call to helper function
			return binarySearch(input,element,start,end);   
		}

		//Helper Function
		public static int binarySearch(int input[], int element, int start, int end){
			//Base Case
			if(start>=end){
				if(input[end]==element){
					return end;
				}
				else{
					return -1;
				}
			}

			//Comparisions
			int mid = (start+end)/2;
			if(input[mid]==element){
				return mid;
			}
			else if(input[mid]>element){
				//Recursive Call
				return binarySearch(input,element,start,mid-1);   
			}
			else{
				//Recursive Call
				return binarySearch(input,element,mid+1,end);
			}
		}

		//Main
		public static void main(String[] args) {
			int arr[] = new int[10];

			System.out.println("Enter 10 integers in ascending order.");
			Scanner s = new Scanner(System.in);

			for(int i =0;i<10;i++) {
				arr[i] = s.nextInt();
			}

			System.out.println("Enter the number you want to search.");
			int num = s.nextInt();

			int res = binarySearch(arr,num);

			if(res!= -1) {
				System.out.println("The number is at index: "+ res);
			}
			else {
				System.out.println("Number Not Found.");
			}
		}
	}



