public class NullPointer {
    public static void genExp() {
        String text = null;
        System.out.println("Length of text = " + text.length());
    }

    public static void handleExp() {
        String text = null;
        try {
            System.out.println("Length of text = " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException = " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException = ");
        try {
            genExp();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred in generateException() = " + e.getMessage());
        }

        System.out.println("\nHandling NullPointerException safely = ");
        handleExp();
    }
}
