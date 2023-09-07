import java.util.*;
public class Cnt{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        char k=s.next().charAt(0);
        int c=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==k)
            c++;
        }
        if(c==0)
        System.out.println(-1);
        else
        System.out.println(c);
    }
}