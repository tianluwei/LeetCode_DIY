package array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,0,0,8};
//        int[] nums={0,1,0,3,12};
        new MoveZeroes().moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
//    双指针，位置不变，但中间值一样，都是0.就可以这样换。左右指针中间维护全是0，将第一个0和第一个非0交换，顺序不发生改变。
    public void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
//    pass,well done,bro!
//        自己写的，最基本的写法，但很扎实！基本功扎实是最厉害的！
//        int len=nums.length;
//        int j=0;
//        for(int i=len-1;i>=0;i--){
//            if(nums[i]==0){
//                for(j=i;j<len-1 && nums[j+1]!=0;j++){
//                    nums[j]=nums[j+1];
//                }
//                nums[j]=0;
//            }
//        }

//        这样为什么不行？因为她要的是顺序不变，这样顺序就会发生变化。
//        int left=0;
//        int right=nums.length-1;
//        while(left<right){
//            while(nums[left]!=0){
//                left++;
//            }
//            while(nums[right]==0){
//                right--;
//            }
//            int temp=nums[left];
//            nums[left]=nums[right];
//            nums[right]=temp;
//        }
    }
}
