import java.util.*;
public class S{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int sum=a+b+c;
            int max=0;
            if(a>b&&a>c) max=a;
            else if(b>a && b>c) max=b;
            else max=c;
            if((sum-max)<max) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}