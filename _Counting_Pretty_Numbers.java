import java.util.*;
public class Count{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i=0;i<n;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=0;
            for (int j=a;j<=b;j++){
                String res;
                res=Integer.toString(j);
                int l=res.length();
                if (res.charAt(l-1)=='2' || res.charAt(l-1)=='3' || res.charAt(l-1)=='9'){
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}