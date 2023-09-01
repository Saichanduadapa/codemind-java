import java.util.*;
public class Arr{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=new int[n];
        for (int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        int r=0;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int m=0;
            for(int j=i+1;j<n;j++){
                if(m<ar[j]){
                    m=ar[j];
                }
            }
            if(m==0){
            res[r]=-1;
            r++;
            }
            else{
                res[r]=m;
                r++;
            }
        }
        for(int i:res){
        System.out.print(i+" ");
        }
    }
}