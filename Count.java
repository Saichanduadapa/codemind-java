import java.util.*;
public class Even{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int e=0,o=0;
        int[] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=s.nextInt();
            if(ar[i]%2==0){
                e+=1;
            }
            else{
                o+=1;
            }
        }
        System.out.println(e+" "+o);
    }
}