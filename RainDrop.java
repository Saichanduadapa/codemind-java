import java.util.*;
public class Rain{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if (n%3==0) System.out.print("Pling");
        if(n%5==0) System.out.print("Plang");
        if(n%7==0) System.out.print("Plong");
        if(n%3!=0 && n%5!=0 && n%7!=0) System.out.println(Integer.toString(n));
    }
}