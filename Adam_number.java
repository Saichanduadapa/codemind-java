import java.util.*;
public class Adam{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int s1=n*n;
        String n1=Integer.toString(n);
        String r1="";
        for(int i=n1.length()-1;i>=0;i--){
            r1+=n1.charAt(i);
        }
        int res=Integer.parseInt(r1);
        int s2=res*res;
        String n2=Integer.toString(s2);
        String res1="";
        for(int i=n2.length()-1;i>=0;i--){
            res1+=n2.charAt(i);
        }
        int s3=Integer.parseInt(res1);
        System.out.println((s1==s3)?"True":"False");
    }
}