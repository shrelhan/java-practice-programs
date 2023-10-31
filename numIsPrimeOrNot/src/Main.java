import java.util.Scanner;

public class Main {
    public static boolean primeNo(int num) {
        if(num == 0) return false;
        for(int i=2; i<num; i++)
            if(num%i == 0 ) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.print(primeNo(num));
    }
}