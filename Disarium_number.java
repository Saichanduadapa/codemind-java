import java.util.*;
public class Dis{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int sum=0;
        for(int i=0;i<st.length();i++){
            sum+=Math.pow(st.charAt(i)-'0',i+1);
        }
        if(sum==Integer.parseInt(st))
        System.out.println("True");
        else
        System.out.println("False");
    }
}