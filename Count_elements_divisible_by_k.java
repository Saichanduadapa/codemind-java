import java.util.*;
public class Cnt{
    public static void  main(String[] args){
        Scanner s=new Scanner(System.in);
        int c=0;
        int n=s.nextInt();
        int k=s.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
            if(ar[i]%k==0){
                c+=1;
            }
        }
        System.out.println(c);
    }
}