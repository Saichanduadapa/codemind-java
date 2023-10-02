import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] ar=new int[n];
        HashSet<Integer> res=new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
            if(ar[i]%2!=0){
                res.add(ar[i]);
            }
        }
        for(int i:res){
            sum+=i;
        }
        System.out.println(sum);
    }
}