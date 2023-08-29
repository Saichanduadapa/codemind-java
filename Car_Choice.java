import java.util.*;
public class Car{
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            double x1=s.nextInt();
            double x2=s.nextInt();
            double y1=s.nextInt();
            double y2=s.nextInt();
            if((y1/x1)<(y2/x2))System.out.println(-1);
            else if((y1/x1)==(y2/x2)) System.out.println(0);   
            else System.out.println(1);
            
        }
        
    }
}