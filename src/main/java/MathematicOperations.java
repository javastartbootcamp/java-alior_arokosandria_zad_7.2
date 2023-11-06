import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MathematicOperations {
    public static List<Integer> numbersList(Scanner scanner) {
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Podaj liczby całkowite, wprowadzenie liczby ujemnej program zakonczy");
        int numb;
        while ((numb = scanner.nextInt()) >= 0) {
            integerList.add(numb);
        }
        return integerList;
    }

    public static void numbersReversal(List<Integer> numbersList) {
        for (int i = numbersList.size() - 1; i >= 0; i--) {
            System.out.print(numbersList.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static int sumNumbers(List<Integer> numbersList) {
        int sum = 0;
        for (Integer integer : numbersList) {
            sum += integer;
        }

        return sum;
    }

    public static void viewSum(List<Integer> numbersList) {
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i));
            if (i < numbersList.size() - 1) {
                System.out.print(" + ");
            }
        }

        System.out.print(" = " + sumNumbers(numbersList));
        System.out.println();
    }

    public static int minNumbers(List<Integer> numbersList) {
        return Collections.min(numbersList);
    }

    public static void minNumbersView(List<Integer> numbersList) {
        System.out.println("Najmniejsza liczba w liście to " + minNumbers(numbersList));
    }

    public static int maxNumbers(List<Integer> numbersList) {
        return Collections.max(numbersList);
    }

    public static void maxNumbersView(List<Integer> numbersList) {
        System.out.println("Największa liczba w liście to " + maxNumbers(numbersList));
    }

    public static boolean checkNumbersList(List<Integer> numbersList) {
        if (numbersList.size() == 0) {
            System.out.println("Lista jest pusta, brak wyników");
            return false;
        }
        return true;
    }
}
