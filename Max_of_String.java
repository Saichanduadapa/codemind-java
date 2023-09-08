import java.util.*;
public class Max{
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        String str=s.nextLine();
        int m=0;
        char c=' ';
        for(int i=0;i<str.length();i++){
            if(m<(int)str.charAt(i)){
                m=(int)str.charAt(i);
                c=str.charAt(i);
            }
        }
        System.out.println(c);
    }
}