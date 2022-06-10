package array01;

//完全有效的平方数
public class IsPerfectSquare367 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2,30));
        int x= (int) Math.pow(2,30);
        int y=x+x;
        System.out.println(y);
    }
//    我的解法，pass，yes！！！
//    and  definitely right！
    public boolean isPerfectSquare(int num) {
        if(num==0 || num==1){
            return true;
        }
        int left=1;
        int right=num/2;
        while(left<=right){
            int mid=(left+right)/2;
            if(num/mid<mid){
                right=mid-1;
            }else if(num/mid>mid){
                left=mid+1;
            }else if(num/mid==mid && num%mid==0){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
