import java.util.*;
public class Asc{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
            if(i>0){
                if(ar[i]>ar[i-1]){
                    continue;
                }
                else{
                    System.out.println("no");
                    c+=1;
                    break;
                }
            }
        }
        if(c==0){
            System.out.println("yes");
        }
    }
}