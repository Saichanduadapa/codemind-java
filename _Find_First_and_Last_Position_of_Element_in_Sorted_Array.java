import java.util.*;
public class Find{
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int s=-1,e=-1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=S.nextInt();
        }
        int k=S.nextInt();
        for(int i=0;i<n;i++){
            if (arr[i]==k){
                s=i;
                break;
            }
        }
        for(int  i=n-1;i>=0;i--){
            if (arr[i]==k){
                e=i;
                break;
            }
        }
        
            System.out.printf("%d %d",s,e);
        
    }
}