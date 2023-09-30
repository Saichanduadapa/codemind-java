import java.util.*;
public class Des{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for( int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int[] ar=Arrays.copyOf(arr,n);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]<ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println((Arrays.equals(arr,ar))?"yes":"no");
    }
}