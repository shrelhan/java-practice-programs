import java.util.Scanner;

public class Main {
    public static String gCD(String prob, int a, int b) {
        int ans = 1;
        int minNum = Math.min(a,b);
        for(int i=1; i<=minNum; i++) {
            if(a%i == 0 && b%i == 0) {
                ans = i;
            }
        }
        return prob+" "+ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String prob = s.nextLine();
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print(gCD(prob,a,b));
    }
}