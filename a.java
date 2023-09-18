// Java code to illustrate print()

import java.util.Arrays;

class Demo_print {
	public static int threeSum(int[] A, int target){
		Arrays.sort(A);
		int n = A.length;
		int ans = Integer.MAX_VALUE;
		int temp;
		for(int i = 0; i < n-2; i++){
			int j = i + 1, k = n - 1;
			while(j<k){
				temp = A[i] + A[j] + A[k];
				if(Math.abs(ans - target) > Math.abs(temp - target)) ans = temp;
				if(ans == target) return ans;
				if(ans < target) j++;
				else k--;
			}
		}
		return ans;
	}
	public static void main(String[] args)
	{
		int[] A = new int[] {44,41,50,55,22,35};
		int target = 108;
		System.out.println(threeSum(A, target));
	}
}
