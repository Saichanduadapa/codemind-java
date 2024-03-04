import java.util.*;
public class St{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        int m=sc.nextInt();
        String res=s.substring(n,m+1);
        System.out.println(res);
    }
}