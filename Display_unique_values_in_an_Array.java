import java.util.*;
public class Dis{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int e=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if (arr[i]==arr[j]){
                    c+=1;
                }
            }
            if (c==1) {
                e+=1; 
                System.out.print(arr[i]+" "); 
            }
        }
        if (e==0) System.out.println(-1);
    }
}