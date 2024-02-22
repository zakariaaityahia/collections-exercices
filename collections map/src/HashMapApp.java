import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HashMapApp {
    public static void main(String[] args) {
        Map<String, Double> marks = new HashMap<>();

        marks.put("Zakaria", 18.5);
        marks.put("nadia", 19.5);
        marks.put("amine", 15.5);
        System.out.println(marks);
        // increase amine's mark
        marks.replace("amine", 17.2);
        System.out.println(marks);
        // remove nadia from the map
        marks.remove("nadia");
        System.out.println(marks);
        // display map size :
        System.out.println(marks.size());
        // display average mark
        // Display average mark

        double averageMark = calculateAverage(marks);
        System.out.println("Average Mark: " + averageMark);

        // Display smallest and highest marks
        double smallestMark = Collections.min(marks.values());
        double highestMark = Collections.max(marks.values());
        System.out.println("Smallest Mark: " + smallestMark);
        System.out.println("Highest Mark: " + highestMark);

        // Check if there is a mark equal to 20
        boolean hasTwenty = marks.containsValue(20.0);
        System.out.println("Is there a mark equal to 20 ? " + hasTwenty);
    }

        public static double calculateAverage(Map<String, Double> marks) {
            double sum = 0;
            for (double mark : marks.values()) {
                sum += mark;
            }
            return sum / marks.size();
        }

        public static void displayMap(Map<String, Double> marks) {
            System.out.println("Current Map:");
            marks.forEach((key, value) -> System.out.println(key + " : " + value));
        }


}