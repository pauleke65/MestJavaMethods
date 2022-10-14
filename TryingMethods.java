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
     * This method has no return type, it takes a name
     * and prints whether the person is a MEST Teaching fellow.
     * If it does not find the name, it prints a not found string.
     * 
     * 
     * @param name {@code String} The name to check if it is a teaching fellow
     */
    public void isAFellow(String name) {
        String formattedName = name.trim().toUpperCase();

        if (formattedName.equals("BRIGHT") || formattedName.equals("LUCKY")) {
            System.out.println(name + " is a Tech Fellow");
        } else if (formattedName.equals("LADY-O")) {
            System.out.println(name + " is a Business Fellow");
        } else if (formattedName.equals("AFI")) {
            System.out.println(name + " is a Communications Fellow");
        } else if (formattedName.equals("DAVID")) {
            System.out.println(name + " is both a Communications and Business fellow");
        } else {
            System.out.println("Sorry, I couldn't find your details");

        }

    }

}
