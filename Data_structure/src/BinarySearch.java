import java.util.*;


public class BinarySearch {
	
	public static int BSearch(int arr[], int target){
		int start=0;
		int end=arr.length-1;
		int mid;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else {
				if(arr[mid]>target) {
					end=mid-1;
				}
				else
					start=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,7,9};
		int idx;
		
		idx=BSearch(arr,7);
		System.out.println(idx);
		idx=BSearch(arr,4);
		System.out.println(idx);
	}

}
