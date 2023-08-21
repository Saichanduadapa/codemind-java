import java.util.*;
public class Sq{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] arr= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt(); 
        }
        for(int i=0;i<a;i++){
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }
}