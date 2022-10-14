/**
 * The {@code TryingMethods} class contains four(4) methods,
 * and a <b>main</b> method.
 * These methods were created as an assignment in the MEST Tech class.
 * It cannot be instantiated.
 *
 * @author Paul Imoke
 */
public class TryingMethods {

    public static void main(String[] args) {

    }

    /**
     * This function returns the sum of all
     * the numbers from 0-999.
     * 
     */
    public static int sumLessThan1K() {
        int value = 1;
        int sum = 0;

        while (value < 1000) {
            sum += value;
            value++;
        }

        return sum;

    }

}
