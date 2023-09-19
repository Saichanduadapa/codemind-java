import java.util.*;
public class Rev{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            //System.out.println(str.charAt(i));
            res+=str.charAt(i);
        }
        System.out.println(res);
    }
}