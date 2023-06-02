/*
 *  Hashset : pas de doublons, acces direct
 * TreeSet : pas de doublons, ordonnée, pas d'accès direct
 */

import java.util.HashSet;
import java.util.Iterator;

public class Ensemble {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>(0);
        hashSet.add(10);
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(-10);

        if (hashSet.contains(10)) {
            System.out.println("yes");
        }

        Iterator<Integer> itr = hashSet.iterator();
        while (itr.hasNext()) {
            Integer number = itr.next();
            System.out.println(number + " ");
        }
    }
}
