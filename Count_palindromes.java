import java.util.*;
public class Cnt{
    public static boolean isPal(int n){
        int temp=n;
        int s=0;
        while(n>0){
            int r=n%10;
            s=s*10+r;
            n/=10;
        }
        if(s==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
            if(isPal(ar[i])){
                c+=1;
            }
        }
        System.out.println(c);
    }
}