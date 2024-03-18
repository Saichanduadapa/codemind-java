import java.util.*;
public class Sub{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(ar[i]==ar[j]){
                    cnt+=1;
                }
            }
        }
        System.out.println(cnt);
    }
}