import java.util.Scanner; //importing scanner method from java.util
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // creating object of class scanner
        int n = s.nextInt(); // taking n as input from user, where n is no of days before current day d
        int d = s.nextInt(); // taking d as input from user, where d is current day
        int x = n%7; // finding modulus of n wrt 7
        int ans = d-x; // d-x will give the ans
        if(ans>=0) { // if answer is greater than 0
            System.out.println(ans);
        } else { // else if answer is a negative number
            System.out.println(ans+7);
        }
    }
}