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
     * the even numbers between 12 and 103
     * This means that it excludes both 12 and 103
     * so 13-102
     * 
     */
    public static void findSumOfEvenNumberBetween12And103() {

        int sum = 0;
        for (int i = 13; i < 103; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);

    }

}
