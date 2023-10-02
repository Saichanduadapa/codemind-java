import java.util.*;
public class Array{
    static boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c+=1;
            }
        }
        return (c==2);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=new int[n];
        float c=0;
        float sum=0;
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(isPrime(ar[i])){
                c+=1;
                sum+=ar[i];
            }
        }
        float res=sum/c;
        System.out.printf("%.2f",res);
    }
}