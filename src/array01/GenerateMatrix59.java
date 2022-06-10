package array01;

public class GenerateMatrix59 {
    public static void main(String[] args) {
        int[][] ints = new GenerateMatrix59().generateMatrix(3);
        for(int i=0;i<ints.length;i++){
            for(int j=0;j<ints[0].length;j++){
                System.out.print(ints[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int left=0,right=n-1;
        int up=0,down=n-1;
        int num=1;
        while(true){
            for(int i=left;i<=right;i++){
                res[up][i]=num++;
            }
            up++;
            if(up>down || left>right){
                break;
            }
            for(int i=up;i<=down;i++){
                res[i][right]=num++;
            }
            right--;
            if(up>down || left>right){
                break;
            }
            for(int i=right;i>=left;i--){
                res[down][i]=num++;
            }
            down--;
            if(up>down || left>right){
                break;
            }
            for(int i=down;i>=up;i--){
                res[i][left]=num++;
            }
            left++;
            if(up>down || left>right){
                break;
            }
        }
        return res;
    }
}
