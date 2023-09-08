import java.util.*;
public class Sum{
    public static void  main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int sum=0;
        for(char i:st.toCharArray()){
            if(Character.isDigit(i)){
                //System.out.print(i+" ");
                //System.out.print((int)i+" ");
                sum+=i - '0';
            }
        }
        System.out.println(sum);
    }
}