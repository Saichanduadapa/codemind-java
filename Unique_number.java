import java.util.*;
public class Uni{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int c=0;
        for(int i=0;i<st.length();i++){
            for(int j=i+1;j<st.length();j++){
                if(st.charAt(i)==st.charAt(j)){
                    c+=1;
                }
            }
        }
        if(c==0){
            System.out.println("Unique Number");
        }
        else{
            System.out.println("Not Unique Number");
        }
    }
}