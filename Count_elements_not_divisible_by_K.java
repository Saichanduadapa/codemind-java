import java.util.*;
public class Cnt{
    public static  void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=new int[n];
        int k=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
            if(ar[i]%k!=0)
                c++;
            }
        System.out.println(c);
    }
}