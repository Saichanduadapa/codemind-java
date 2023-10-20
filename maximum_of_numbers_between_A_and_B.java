import java.util.*;
public class MaxP{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=0;
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=0;i<n;i++){
            if(ar[i]>=a && ar[i]<=b && m<ar[i]){
                m=ar[i];
            }
        }
        if(m==0){
            System.out.println(-1);
        }
        else{
        System.out.println(m);
        }
    }
}