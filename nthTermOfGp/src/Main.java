import java.util.Scanner;
public class Main {
    public static String nthTermOfGp(String prob,int a,int r, int n) {
        int ans = a*(int)(Math.pow(r,n-1));
        return prob + " " + ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String prob = s.nextLine();
        int a = s.nextInt();
        int r = s.nextInt();
        int n = s.nextInt();
        System.out.println(nthTermOfGp(prob,a,r,n));
    }
}