import java.util.*;
public class H{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        double m=n/2;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    c+=1;
                }
            }
            if(c>m){
            System.out.print(arr[i]);
            break;
            }
        }
        
    }
}