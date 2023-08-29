import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int[] arr=new int[n];
        int s=1;
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
            if(arr[i]!=0) s*=arr[i];
        }
        for(int i=0;i<n;i++){
            int res=0;
            if(arr[i]==0){
                res=s;
            }
            else{
                res=s/arr[i];
            }
            System.out.print(res+" ");
        }
    }
}