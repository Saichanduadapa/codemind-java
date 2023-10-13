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
        if(isPrime(n)==1){
            String s=Integer.toString(n);
            int l=s.length()-1;
            String res="";
            for(int i=l;i>=0;i--){
                res+=s.charAt(i);
            }
            int num=Integer.parseInt(res); 
            if(isPrime(num)==1){
                System.out.println("circular prime");
            }
            else{
                System.out.println("prime but not a circular prime");
            }
        }
        else{
            System.out.println("not prime");
        }
    }
}