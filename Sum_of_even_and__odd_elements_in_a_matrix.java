import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] ar=new int[n][m];
        int o=0;
        int e=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ar[i][j]=s.nextInt();
                if(ar[i][j]%2==0){
                    e+=ar[i][j];
                }
                else{
                    o+=ar[i][j];
                }
            }
        }
        System.out.println(e+" "+o);
    }
}