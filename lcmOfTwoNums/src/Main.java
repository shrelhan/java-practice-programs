import java.util.Scanner;

public class Main {
    public static String lcmOfTwoNums(String prob, int a, int b) {
        int x = Math.max(a,b);
        int y = a*b;
        int ans = x;
        for(int i=x; i<=y; i++) {
            if(i%a == 0 && i%b == 0) {
                ans = i;
                break;
            }
        }
        return prob+" "+ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String prob = s.nextLine();
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print(lcmOfTwoNums(prob,a,b));
    }
}