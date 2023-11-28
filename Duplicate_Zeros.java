import java.util.*;
public class Duplicate{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
            if(ar[i]==0){
                ar[i+1]=0;
                i+=1;
            }
        }
        for(int i:ar){
            System.out.print(i+" ");
        }
    }
}