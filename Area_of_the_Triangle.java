import java.util.*;
public class Area{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
        double S=(a+b+c)/2;
        double area=Math.sqrt((S*(S-a)*(S-b)*(S-c)));
        System.out.printf("%.2f",area);
        }
}