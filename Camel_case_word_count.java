import java.util.*;
public class Cnt{
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        int c=1;
        String st=s.nextLine();
        for (int i=1;i<=st.length()-1;i++){
            char ch=st.charAt(i);
            if ((int)ch<=90){
                c+=1;
            }
        }
        System.out.println(c);
    }
}