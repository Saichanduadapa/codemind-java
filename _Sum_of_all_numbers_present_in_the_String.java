import java.util.*;
public class Dig{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int sum=0;
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(Character.isDigit(ch)){
                //System.out.println(ch);
                sum+=ch-'0';
                //System.out.println(sum);
            }
        }
            System.out.println(sum);
}
}