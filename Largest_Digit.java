import java.util.*;
public class Lar{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        char max=' ';
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>max){
                max=st.charAt(i);
            }
        }
        System.out.println(max);
    }
}