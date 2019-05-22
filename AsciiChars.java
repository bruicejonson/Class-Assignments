public class AsciiChars {
    private static void printRange(char start, char end) {
        for(char c = start; c <= end; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void printNumbers() {
        printRange('0', '9');
    }

    public static void printLowerCase() {
        printRange('a', 'z');
    }

    public static void printUpperCase() {
        printRange('A', 'Z');
    }
}