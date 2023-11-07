import java.util.*;
public class Pal{
    static boolean isPal(int a){
        String res="";
        String n=Integer.toString(a);
        for(int i=n.length()-1;i>=0;i--){
            res+=n.charAt(i);
        }
        //System.out.println(res);
        
        return((Integer.parseInt(res))==a);
    }
    static boolean isPrime(int n){
        if (n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=0;
        for(int i=a+1;i<=100000;i++){
            if(isPrime(i)){
                
                if(isPal(i)){
                System.out.println(i);
                c=1;
                break;
                }
            }
        }
    }
}