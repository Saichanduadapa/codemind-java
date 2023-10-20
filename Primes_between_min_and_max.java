import java.util.*;
public class MaxP{
    public static boolean isPrime(int n){
        if(n<2) return false;
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cnt=0;
        int[]arr= new int[n];
        int min=Integer.MAX_VALUE, minindex=0;
        int max=-1, maxindex=0;
        for( int i=0;i<n;i++){
            arr[i]=s.nextInt();
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
            if(arr[i]<min){
                min= arr[i];
                minindex=i;
            }
        }
        //System.out.println(minindex+" "+ min +" "+maxindex+" "+ max);
        if(minindex<maxindex){
            for(int i=minindex;i<=maxindex;i++){
                if(isPrime(arr[i])){
                    cnt++;
                    //System.out.println("Hello");
                }
            }
        }
        else{
            for(int i=maxindex;i<=minindex;i++){
                if(isPrime(arr[i])){
                    cnt+=1;
                    //System.out.println("Hai");
                }
            }
    }
    System.out.println(cnt);
}
}