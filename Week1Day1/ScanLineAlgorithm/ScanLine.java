package ScanLineAlgorithm;

public class ScanLine {
    public static void main(String[] args) {
        int t=5;
        int []arr={0,0,0,0,0};
        int [][]lrx={{1,3,4},{2,2,1},{0,4,6},{3,4,8}};
        
        //resultant array
        int []result=new int[arr.length+1];
        for(int i=0;i<lrx.length;i++){
            int l=lrx[i][0];
            int r=lrx[i][1];
            int x=lrx[i][2];
            result[l]+=x;
            result[r+1]-=x;
        }
        //variable sum
        for(int i=0, sum=0;i<result.length;i++)
            {
                result[i]+=sum;
                sum=result[i];
            }
        for(int i=0;i<result.length;i++)
            System.out.print(" "+result[i]);
    }    
}
