import java.util.*;
public class Rev{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String[] words=st.split(" ");
        String res="";
        for(int i=words.length-1;i>=0;i--){
            res+=words[i];
            res+=" ";
        }
        System.out.print(res);
    }
}