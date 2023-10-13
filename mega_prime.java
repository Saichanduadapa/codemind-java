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
            String res=Integer.toString(n);
            int p=0;
            for(int i=res.length()-1;i>=0;i--){
                int num=res.charAt(i)-'0';
                if(isPrime(num)==1){
                    p+=1;
                }
                else{
                    System.out.println("Not Mega Prime");
                    break;
                }
            }
            if(p==res.length()){
                    System.out.println("Mega Prime");
                }
        }
        else{
            System.out.println("Not Mega Prime");
        }
           
    }
}