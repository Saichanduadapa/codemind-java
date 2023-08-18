import java.util.*;
public class Fib{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        for (int i=0;i<n;i++){
            System.out.printf("%d ",a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}