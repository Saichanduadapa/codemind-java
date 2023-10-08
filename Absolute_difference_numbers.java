import java.util.*;
public class Abs{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.next();
        int n=s.nextInt();
        String s1="";
        String s2="";
        String s3="";
        for(int i=0;i<n;i++){
            s1+=st.charAt(i);
        }
        for(int i=st.length()-1;i>=(st.length())-n;i--){
            s2+=st.charAt(i);
        }
        for(int i=s2.length()-1;i>=0;i--){
            s3+=s2.charAt(i);
        }
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s3);
        if(n1<n2)
        System.out.println(n2-n1);
        else
        System.out.println(n1-n2);
    }
}