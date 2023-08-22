import java.util.*;
public class Can{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            if (arr[i]%2!=0){
                c++;
            }
        }
        if (c>2){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
        
    }
}