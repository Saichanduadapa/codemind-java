import java.util.*;
public class Shyffle{
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=0;
    int[] res=new int[n];
    int[] ar=new int[n];
    for(int i=0;i<n;i++){
        ar[i]=s.nextInt();
    }
    for(int i=0;i<n/2;i++){
        res[k++]=ar[i];
        res[k++]=ar[(n/2)+i];
    }
    for (int i=0;i<n;i++){
        System.out.print(res[i]+" ");
    }
}
}