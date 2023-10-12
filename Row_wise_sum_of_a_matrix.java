import java.util.*;
public class Mat{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int mat[][] =new int[n][m];
        for(int i=0;i<n;i++){
            int sm=0;
            for (int j=0;j<m;j++){
                mat[i][j]=s.nextInt();
                sm+=mat[i][j];
            }
            System.out.print(sm+" ");
        }
    }
}