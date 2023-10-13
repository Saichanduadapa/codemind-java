import java.util.*;
public class Prime{
    public static int isPrime(int n){
        if(n<2){
            return 0;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return 0;
                }
            }
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bc=0,nc=0,np=0,bp=0;
        if(isPrime(n)==1){
            System.out.println(0);
        }
        else{
            for(int i=n-1;i>=0;i--){
                bc++;
                if(isPrime(i)==1){
                    bp=i;
                    break;
                }
            }
            for(int  i=n+1;i<=10000000;i++){
                nc++;
                if(isPrime(i)==1){
                    np=i;
                    break;
                }
            }
            if(nc<bc){
                System.out.println(np-n);
            }
            else{
                System.out.println(n-bp);
            }

        }
    }
}