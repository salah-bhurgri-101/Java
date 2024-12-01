import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PractiveJava {

   
     
    public PractiveJava() {

    }


    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);

    }

    // public static long fib(long n, long[] f) {
    // if (n == 0 || n == 1) {
    // return n;
    // }

    // if (f[(int) n] != 0) {
    // return f[(int) n];
    // }
    // f[(int) n] = fib(n - 1, f) + fib(n - 2, f);
    // return f[(int) n];
    // }

    // public static BigInteger fib(int n, BigInteger[] f) {
    // if (n == 0) {
    // return BigInteger.ZERO;
    // }
    // if (n == 1) {
    // return BigInteger.ONE;
    // }

    // if (!f[n].equals(BigInteger.ZERO)) {
    // return f[n];
    // }

    // f[n] = fib(n - 1, f).add(fib(n - 2, f));
    // return f[n];
    // }

    public static void main(String[] args) {

        System.out.println(fib(40));

        // int n = 500;
        // long[] f = new long[n + 1];
        // System.out.println(fib(n, f));

        // int n = 500;
        // BigInteger[] f = new BigInteger[n + 1];

        // for (int i = 0; i <= n; i++) {
        // f[i] = BigInteger.ZERO;
        // }
        // System.out.println(fib(n, f));

        // for (int i = 0; i <= n; i++) {
        // System.out.println(f[i]);
        // }

        // Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // System.out.println(evenOrOld(a));
        // String nu= " ";
        // String sq= " ";
        // String cu= " ";
        // for (int i = 0; i < 10; i++) {
        // nu=nu+i;
        // sq=sq+i*i;
        // cu=cu+i*i*i;
        // System.out.println(i+" "+i*i+" "+i*i*i);

        // }
        // System.out.println(nu);
        // System.out.println(sq);
        // System.out.println(cu);

    }

    // static public boolean evenOrOld(int num){

    // return num%2!=0 ? false : true;

    // }

}