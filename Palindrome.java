import java.util.*;
public class Pan{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String res="";
        for(int i=st.length()-1;i>=0;i--){
            res+=st.charAt(i);
        }
        if(st.equals(res)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}