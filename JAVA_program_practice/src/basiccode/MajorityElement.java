package basiccode;

import java.util.Arrays;

public class MajorityElement {

	public static  int countMajority(int []arr)
	{
		/*int maxNum =0;
		int maxCnt = 0;
		for(int i=0;i<arr.length;i++)
		{
			int curcnt = 0;
			int curnum = arr[i];
			
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j] == curnum) {
					curcnt++;
				}
				
				
				if(maxCnt<curcnt) {
					maxCnt = curcnt;
					maxNum = arr[j];
				}
			}
		}
		
		return maxNum; */
		Arrays.sort(arr);
		return arr[arr.length/2];
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,8,8};
		int major=countMajority(arr);
		
		System.out.println(major);
	}

}
