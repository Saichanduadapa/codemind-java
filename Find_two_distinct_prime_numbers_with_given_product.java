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
        int c=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                if(isPrime(i) &&  isPrime(n/i)){
                    c=1;
                    System.out.print(i+" "+n/i);
                    break;
                }
            }
        }
        if(c==0){
            System.out.println(-1);
        }
    }
}