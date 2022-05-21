package array;

public class SearchInsert35 {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int i = new SearchInsert35().searchInsert(arr, 7);
        System.out.println(i);
    }

//    我自己的写法，pass
//    public int searchInsert(int[] nums, int target) {
//        int left=0;
//        int right=nums.length-1;
//        int res=0;
//         if(nums[right]<target){
//             return nums.length;
//         }
//         if(nums[left]>target){
//             return 0;
//         }
//        while(left<=right){
//            int mid=(left+right)/2;
//            if(nums[mid]<target){
//                left=mid+1;
//                res=left;
//            }else if(nums[mid]>target){
//                right=mid-1;
//                res=mid;
//            }else{
//                return mid;
//            }
//        }
//        return res;
//    }
//    暴力法
//    public int searchInsert(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]>=target){
//                return i;
//            }
//        }
//        return nums.length;
//    }


//    a better solution
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                return mid;
            }
        }
        return right+1;
//        return left;  //**也是OK的**
    }
}
