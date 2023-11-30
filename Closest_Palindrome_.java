import java.util.*;
public class ClosestPal{
    public static boolean pal(int n){
        String a=Integer.toString(n);
        String res="";
        for(int i=a.length()-1;i>=0;i--){
            res+=a.charAt(i);
        }  
        return(a.equals(res));
    } 
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int p;
        p=s.nextInt();
        int np=p+1;
        int pp=p-1;
        while(!pal(np)){
            np++;
        }
        while(!pal(pp)){
            pp--;
        }
        if(np-p<p-pp){
            System.out.println(np);
        }
        else if (p-pp<np-p){
            System.out.println(pp);
        }
        else{
            System.out.println(pp+" "+np);
        }
    }
}