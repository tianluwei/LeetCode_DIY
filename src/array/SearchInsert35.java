package array;

public class SearchInsert35 {

//    我自己的写法，pass
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int res=0;
         if(nums[right]<target){
             return nums.length;
         }
         if(nums[left]>target){
             return 0;
         }
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
                res=left;
            }else if(nums[mid]>target){
                right=mid-1;
                res=mid;
            }else{
                return mid;
            }
        }
        return res;
    }
}
