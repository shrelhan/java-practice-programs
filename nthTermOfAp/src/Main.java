import java.util.Scanner;

public class Main {
    public static String nthTerm(String prob,int a,int d, int n) {
        int ans = a+(n-1)*d;
        return prob+" "+ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String prob = s.nextLine();
        int a = s.nextInt();
        int d = s.nextInt();
        int n = s.nextInt();
        System.out.print(nthTerm(prob,a,d,n));
    }
}