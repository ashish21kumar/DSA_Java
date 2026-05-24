class Solution {
    public static void swap(int[] nums, int st, int en){
        int temp = nums[st];
        nums[st] = nums[en];
        nums[en]= temp;
    }

    public static void reverse(int[] nums, int st, int en){
        while(st<en){
            swap(nums, st, en);
            st++;
            en--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(nums, 0, n-1);
            return;
        }

        for(int i=n-1; i>index; i--){
            if(nums[i]>nums[index]){
                swap(nums, i, index);
                break;
            }
        }

        reverse(nums, index+1, n-1);
        
    }
}