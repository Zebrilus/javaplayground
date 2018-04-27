/**
 * ©2018 Ulrich Lübke
 */
package javaplayground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ulrich.luebke
 *
 */
public class MullpepperScale {

    private static ArrayList<int[]> candidates = new ArrayList<>();
    
    /**
     * 
     */
    public MullpepperScale() {
        // TODO Auto-generated constructor stub
    }

    static void add (int i1, int i2, int i3) { 
        int[] na = new int[] {i1,i2,i3};
        Arrays.sort(na);
        for(int[] x : candidates) {
            if (Arrays.equals(na, x)) {
                return;
            }
        }
        candidates.add(na);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        for (int i1=11; i1 > 2; i1--) {
            for (int i2 = 1; i2 < 11; i2++) {
                int i3 = 13-i1-i2;
                if (i3 < 1) break;
                add (i1, i2, i3);
            }
        }
        for(int[] x : candidates) {
            System.out.println (x[0] + "," + x[1] + "," +x[2]);
            for (int i=1; i<=13; i++) {
            
            }
        }
        
        tryrace(new HashSet<Integer>(Arrays.asList(0,1,2,3,4)), new int[5]);
        
        for (int i=1; i<100; i++) {
            age(i);
            //if (age(i)) break;
        }
        //age(1);
    }
    
    enum SuperHero {CATWOMAN, WONDERWOMAN, SPIDERMAN, BATMAN, WOLVERINE};
    static final int cat = SuperHero.CATWOMAN.ordinal();
    static final int ww = SuperHero.WONDERWOMAN.ordinal();
    static final int spider = SuperHero.SPIDERMAN.ordinal();
    static final int bat = SuperHero.BATMAN.ordinal();
    static final int wolf = SuperHero.WOLVERINE.ordinal();
    
    private static void tryrace(Set<Integer> all, int[] r) {
        for (Integer i : all) {
            HashSet<Integer> rest = new HashSet<Integer>(all);
            rest.remove(i);
            r[all.size()-1] = i;
            tryrace(rest, r);
        }
        if (all.isEmpty()) {            
            race(r);
        }
    }
    
    private static void race(int[] r) {
        boolean correct = (r[cat] < r[ww]) ^ (r[cat] < r[bat]);
        correct &= (r[wolf] < r[spider]);
        correct &= (r[bat] < r[wolf]);
        correct &= (r[ww] < r[wolf]) ^(r[ww] <r[bat]) ^ (r[ww] < r[spider]);
        correct &= (r[wolf] < r[cat] ^ (r[spider] < r[cat]));
        if (correct) {
            System.out.println("Solution: ----------");
            String[] names = new String[5];
            for(int i=0; i<r.length; i++) {
                names[r[i]] = SuperHero.values()[i].toString();                
            }
            for (String string : names) {
                System.out.println(string);
            }
            System.out.println("---------------------");
        }
    }

    private static boolean  age (double melinda) {
        double vater = 50;
        double schwager = vater - melinda;
        double bruder = ((vater+2)/2) -2;
        if (melinda + bruder != schwager) {
            return false;
        }
        
//        int melinda = bruder;
//        int schwager = bruder;
        double mutter = ((melinda +4) *2)-4;
        double nichte = vater-mutter;
        
        System.out.println("Vater:" + vater);
        System.out.println("Mutter:" + mutter);
        System.out.println("Melinda:" + melinda);
        System.out.println("Bruder:" + bruder);
        System.out.println("Schwager:" + schwager);
        System.out.println("Nichte:" + nichte);
        return true;
    }

    }
