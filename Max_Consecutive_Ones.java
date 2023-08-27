import java.util.*;
public class Dis{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int m=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i;j<n;j++){
                if (arr[i]==1 &&arr[j]==1){
                    c+=1;
                }
                else break;
            }
            if(m<c) m=c;
        }
        System.out.println(m);
    }
}