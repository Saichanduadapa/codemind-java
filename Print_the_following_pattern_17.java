import java.util.*;
public class rough {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        //System.out.println(n);
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == n - i + 1 ) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
