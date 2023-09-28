import java.util.*;
public class Dice{
    static boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        return (c==2);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int k=0;k<t;k++){
            int a=s.nextInt();
            int b=s.nextInt();
            if(isPrime(a+b)){
                System.out.println("tevitt");
            }
            else{
                System.out.println("Satya");
            }
            }
        }
}