import java.util.*;
public class H{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        int m=s.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=s.nextInt();
        }
        int k=s.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(arr1[i]<=k && arr2[i]>=k){
                c+=1;
            }
        }
        System.out.println(c);
        
    }
}