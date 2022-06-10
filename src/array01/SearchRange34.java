package array01;

public class SearchRange34 {

    //    不能让我们的父母失望。---周杰伦
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
//        三种情况：在外面、中间有、中间但不存在（通过left边界的差来判断）
//        int rightBorder = new SearchRange34().getRightBorder(nums, 4);
//        System.out.println(rightBorder);
//        int leftBorder = new SearchRange34().getLeftBorder(nums, 4);
//        System.out.println(leftBorder);
        int[] res = new SearchRange34().searchRange(nums, 8);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }

    public int[] searchRange(int[] nums, int target) {
        int rightBorder=getRightBorder(nums,target);
        int leftBorder=getLeftBorder(nums,target);
        // 在数组外
        if(leftBorder==-2||rightBorder==-2){
            return new int[]{-1,-1};
        }
        // 在数组内部
        if(rightBorder-leftBorder>1){
            return new int[]{leftBorder+1,rightBorder-1};
        }
        // 在数组内部且不存在。
        return new int[]{-1,-1};
    }
    public int getRightBorder(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int rightBorder=-2;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=target){
                left=mid+1;
                rightBorder=left;
            }else{
                right=mid-1;
            }
        }
        return rightBorder;
    }

    public int getLeftBorder(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int leftBorder=-2;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
                leftBorder=right;
            }
        }
        return leftBorder;
    }


//    我自己写的 pass，厉害厉害！
//    public int[] searchRange(int[] nums, int target) {
//        int left=0;
//        int right=nums.length-1;
//        int[] res=new int[2];
//        while(left<=right){
//            int mid=left+(right-left)/2;
//            if(nums[mid]<target){
//                left=mid+1;
//            }else if(nums[mid]>target){
//                right=mid-1;
//            }else{
//                int i=mid;
//                int j=mid;
//                while(i>=0 && nums[i]==target){
//                    i--;
//                }
//                while(j<nums.length && nums[j]==target){
//                    j++;
//                }
//                res[0]=i+1;
//                res[1]=j-1;
//                return res;
//            }
//        }
//        return new int[]{-1,-1};
//    }
}
