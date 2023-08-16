import java.util.*;
public class Can{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        if (x%2==0 && (x>0 || y%2==0)) System.out.printf("YES");
        else System.out.printf("NO");
    }
}