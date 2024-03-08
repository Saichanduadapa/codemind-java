import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int s=0;
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 a[i][j]=sc.nextInt();
                 
                 if(i!=0 && j!=0 && i!=n-1 && j!=m-1 ){
                    //   System.out.println(a[i][j]);
                     s+=a[i][j];
                 }
            }
        }
        System.out.println(s);
    }
}