import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n) {
            int j = 1;
            while(j<=n-i) {
                System.out.print(" ");
                j++;
            }
            while(j<=n) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}