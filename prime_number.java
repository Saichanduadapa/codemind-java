import java.util.*;
public class Prime{
    public static boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        return(c==2);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(isPrime(n)){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}