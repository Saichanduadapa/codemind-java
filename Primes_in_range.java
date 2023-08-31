import java.util.*;
public class Prime{
    static boolean is_prime(int n)
    {
        int p=0;
        if(n<2){
            return(p==1);
        }
        for(int i=2;i<(int)Math.sqrt(n)+1;i++){
            if(n%i==0){
                p+=1;
                break;
            }
        }
        return(p==0);
    }
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=0;
        for(int i=a;i<=b;i++){
            if(is_prime(i)){
                c+=1;
            }
        }
        System.out.println(c);
    }
}