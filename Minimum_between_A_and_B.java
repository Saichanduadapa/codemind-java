import java.util.*;
public class MaxP{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        int a=s.nextInt();
        int b=s.nextInt();
        int m=b;
        for(int i=0;i<n;i++){
            if(ar[i]>=a && ar[i]<=b && m>ar[i]){
                m=ar[i];
            }
        }
        if(m==b){
            System.out.println(-1);
        }
        else{
        System.out.println(m);
        }
    }
}