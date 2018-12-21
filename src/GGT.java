
/**
 *  Ermittelt den ggT nach dem Euklidschen Algorithmus
 */

import java.util.Scanner;

public class GGT {

    static long ggTr2(long a, long b) {
        if (a==0) return b;
        if (b==0) return a;
        if (Math.abs(a)>Math.abs(b)) return ggTr2(a%b, b);
        return ggTr2(a, b%a);
    }
    
    static long ggTr(long a, long b) {
        System.out.println("a="+a+",b="+b);
        if(b>a) {return ggTr(b,a);}
        if(b!=0) {return ggTr(a%b,b);}
        return a;
    }
    
    static long ggT(long a, long b) {
        do {
            if(b>a) {
                long c=a;
                a=b;
                b=c;
            }
            a=a%b;
        } while(a!=0);
        return b;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("*** Ermitteln des ggT ***");
            System.out.print("Bitte gib die erste ganze Zahl ein: ");
            long a = scanner.nextLong();
            System.out.println();
            System.out.print("Bitte gib die zweite ganze Zahl ein: ");
            long b = scanner.nextLong();
            System.out.println();
            System.out.println("ggt(" + a + "," + b + ") = " + ggTr2(a, b));
        }
    }

}
