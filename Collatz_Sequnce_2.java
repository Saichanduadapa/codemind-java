// Collatz Sequnces 2
import java.util.*;
public class Col{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int m=0;
        int mi=0;
        for(int i=a;i<=b;i++){
           int n=i;
           int c=0;
            while(n!=1){
                if(n%2==0){
                    n/=2;
                    c++;
                }
                else{
                    n=3*n+1;
                    c++;
                }
            }
            if(m<c){
                    m=c;
                    mi=i;
                }
        }
        System.out.println(mi);
    }
}