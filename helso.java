
/**
 * Write a description of class helso here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class helso
{public static void main(String[] args) {
        double waterLevel = 1200;
        System.out.println("=== Water Level Monitor ===");
        System.out.println("Current Water Level: " + waterLevel + "L");
        String status = (waterLevel >= 1000)
                ? "WARNING: Water level has reached 1000L or more!"
                : "Status: Normal";
        System.out.println(status);
    }

}