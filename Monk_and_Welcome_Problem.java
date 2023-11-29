import java.util.*;
public class sum{
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] ar=new int[n];
    int[] br=new int[n];
    int[] res=new int[n];
    for(int i=0;i<n;i++){
        ar[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
        br[i]=s.nextInt();
        res[i]=ar[i]+br[i];
    }
    for(int i=0;i<n;i++){
        System.out.print(res[i]+" ");
    }
}
}