import java.util.*;
public class Table{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        for(int i=1;i<=m;i++){
            if(i%2==0){
                continue;
            }
            System.out.print(n+" x "+i+" = "+n*i+"
");
        }
    }
}