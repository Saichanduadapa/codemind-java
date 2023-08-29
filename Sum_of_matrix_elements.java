import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] arr=new int[n][m];
        int S=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
                S+=arr[i][j];
            }
        }
        System.out.println(S);
    } 
}