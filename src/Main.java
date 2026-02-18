import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Integer[] numbers1 = {1, 2, 3};
        Integer[] numbers2 = {4, 5, 6};

        Integer[] mergedNumbers = Pair.mergeArrays(numbers1, numbers2);
        System.out.println("Merged Integer Array: " + Arrays.toString(mergedNumbers));


        String[] fruits1 = {"apple", "banana"};
        String[] fruits2 = {"cherry", "date"};

        String[] mergedFruits = Pair.mergeArrays(fruits1, fruits2);
        System.out.println("Merged String Array: " + Arrays.toString(mergedFruits));
    }
}
