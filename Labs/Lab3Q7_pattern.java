public class Lab3Q7_pattern {
    public static void main(String[] args) {
        int[] rows = {5, 5, 5};
        for (int i = 0; i < rows.length; i++) {
            char symbol = (i % 2 == 0) ? '#' : '?';
            for (int j = 0; j < rows[i]; j++) {
                System.out.print(symbol + " ");
                symbol = (symbol == '#') ? '?' : '#';
            }
            System.out.println();
        }
    }
}