import java.util.Arrays;
import java.util.LinkedList;

public class App {

    public Integer[] methodOne(int[] setOfNumbers) {
        LinkedList<Integer> finalArray = new LinkedList<>();
        boolean writePermission = false;

        for (int number : setOfNumbers) {
            if (writePermission) {
                finalArray.add(number);
            }
            if (number == 4) {
                writePermission = true;
                finalArray.clear();
            }
        }
        if (!writePermission) {
            throw new RuntimeException("Прилетело исключение RuntimeException");
        }
        int[] newArray = new int[finalArray.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = finalArray.get(i);
        }
        return finalArray.toArray(new Integer[0]);
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
