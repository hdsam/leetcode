package easy;

import java.util.Arrays;

public class RotateArray {
	
    public static void rotate(int[] nums, int k) {
        if(nums.length==0||k==0){
            return ;
        }
        int temp =0;
        for(int i=nums.length-1;i>0;){
            if(i>k){
                temp=nums[i];
                nums[i]=nums[i-k];
                i=(i+k)%nums.length;
                nums[i]=temp;
            }
        }
    }
	
	
	public static void main(String[] args) {
		int[]  nums = new int[] {1,2,3,4,5,6,7};
		int k=3;
		System.out.println("before ratating:"+Arrays.toString(nums));
		rotate(nums, k);
		System.out.println("after ratating"+Arrays.toString(nums));

	
	}
}
