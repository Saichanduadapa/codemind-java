import java.util.*;
public class Str{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        String res=s1+s2;
        char arr[]=res.toCharArray();
        Arrays.sort(arr);
        //result=new String(arr);
        System.out.println(new String(arr));
    }
}