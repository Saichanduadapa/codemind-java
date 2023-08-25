import java.util.*;
public class Bin{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            String str=s.next();
            int d=Integer.parseInt(str,2);
            System.out.println(Integer.toString(d,8));
            
            
        }
    }
}