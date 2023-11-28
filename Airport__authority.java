import java.util.*;
public class Air{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        int t=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(ar[i]<=t){
                sum+=1;
            }
            else{
                sum+=2;
            }
        }
        System.out.println(sum);
    }
    
}