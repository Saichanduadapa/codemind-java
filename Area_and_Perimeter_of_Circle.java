import java.util.*;
public class Area{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        double area=3.14*a*a;
        double peri=2*3.14*a;
        System.out.printf("%.2f
%.2f ",area,peri);
    }
}