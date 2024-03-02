import java.util.*;
public class Eq{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(1);
        }
        else{
        int[] ar=new int[n];
        int s=0;
        int[] pre=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
            s+=ar[i];
            pre[i]=s;
        }
        int a=0;
        int p=0;
        for(int i=1;i<n-1;i++){
            if(pre[i-1]==s-pre[i]){
                a=i+1;
                p=1;
                break;
            }
        }
        if(p>0){
            System.out.println(a);
        }
        else{
            System.out.println(-1);
        }
        }
    }
}