import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        List<Integer> numbers = MathematicOperations.numbersList(scanner);
        if (MathematicOperations.checkNumbersList(numbers)) {
            MathematicOperations.numbersReversal(numbers);
            MathematicOperations.viewSum(numbers);
            MathematicOperations.minNumbersView(numbers);
            MathematicOperations.maxNumbersView(numbers);
        }
    }
}
