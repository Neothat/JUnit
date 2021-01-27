import java.util.Arrays;

public class App {

    public int[] methodOne(int[] setOfNumbers) {
        for (int i = setOfNumbers.length - 1; i >= 0; i--) {
            if (setOfNumbers[i] == 4) {
                return Arrays.copyOfRange(setOfNumbers, i + 1, setOfNumbers.length);
            }
        }
        throw new RuntimeException("В массиве нет 4");
    }

    public boolean methodTwo(int[] setOfNumbers) {
        boolean numberOne = false;
        boolean numberFour = false;
        boolean differentNumber = false;

        for (int number : setOfNumbers) {
            switch (number) {
                case (1) -> numberOne = true;
                case (4) -> numberFour = true;
                default -> differentNumber = true;
            }
        }

        return numberOne && numberFour && !differentNumber;
    }


}
