package array;

public class SortedSquares977 {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        int[] res = new SortedSquares977().sortedSquares(nums);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
//    双指针，比暴力法耗时少。
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int i=0,j=nums.length-1;
        int index=nums.length-1;
        while(i<j){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                res[index--]=nums[i]*nums[i];
                i++;
            }else{
                res[index--]=nums[j]*nums[j];
                j--;
            }
        }
        res[index]=nums[i]*nums[i];
        return res;
    }
}
