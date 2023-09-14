import java.util.*;
public class Compare{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] ar=new int[3];
        int[] br=new int[3];
        int a=0;
        int b=0;
        for(int i=0;i<3;i++){
            ar[i]=s.nextInt();
        }
        for(int i=0;i<3;i++){
            br[i]=s.nextInt();
            if(ar[i]>br[i]){
                a++;
            }
            else if(ar[i]<br[i]){
                b++;
            }
        }
       System.out.println(a+" "+b); 
    }
}