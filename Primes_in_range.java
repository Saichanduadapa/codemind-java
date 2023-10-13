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
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=a;i<=b;i++){
            if(isPrime(i)==1){
                c+=1;
            }
        }
        System.out.println(c);
    }
}