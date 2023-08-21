import java.util.*;
public class M{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println(i);
            }
            else c++;
        }
        if (c==n){
            System.out.println(-1);
        }
        
    }
}