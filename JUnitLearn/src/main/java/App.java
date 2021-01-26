import java.util.Arrays;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(methodOne(new int[]{1, 2, 5, 3, 4, 4, 6, 6, 4, 1, 7})));
        System.out.println(methodTwo(new int[]{1, 1, 1, 4, 4, 1, 1}));
    }

    public static Integer[] methodOne(int[] setOfNumbers) {
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

    public static boolean methodTwo(int[] setOfNumbers) {
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
