import java.util.*;
public class Car{
    public static  void main(String[] args){
        Scanner s=new Scanner(System.in);
        int c1=s.nextInt();
        int c2=s.nextInt();
        int x=s.nextInt();
        if (c1>c2){
            System.out.println(-1);
        }
        else{
            System.out.println((x/(c2-c1))+1);
        }
    }
}