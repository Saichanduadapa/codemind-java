import java.util.*;
public class Unique{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int p=0;
        for(int i=0;i<st.length();i++){
            int c=0;
            for(int j=0;j<st.length();j++){
                if(st.charAt(i)==st.charAt(j)){
                    c++;
                }
            }
            if(c==1){
                System.out.println(i);
                p++;
                break;
            }
        }
        if(p==0){
            System.out.println(-1);
        }
    }
}