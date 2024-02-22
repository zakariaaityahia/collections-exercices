import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SetsApp {
    public static void main(String[] args) {
        Set<String> groupe1 = new HashSet<>();
        Set<String> groupe2 = new HashSet<>();

        groupe1.add("zakaria");
        groupe1.add("ayman");
        groupe1.add("Aicha");
        System.out.println(groupe1);

        groupe2.add("mohamed");
        groupe2.add("aya");
        groupe2.add("zakaria");
        System.out.println(groupe2);

        // intersection
        Set<String> intersection = new HashSet<>(groupe1);
        intersection.retainAll(groupe2);
        System.out.println("intersection :" + intersection);

        // union all
        Set<String> union = new HashSet<>(groupe1);
        union.addAll(groupe2);
        System.out.println(union);
    }
}