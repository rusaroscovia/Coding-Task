public class Pair {

    public static <T> T[] mergeArrays(T[] a, T[] b) {
        int lengthA = a.length;
        int lengthB = b.length;


        T[] merged = java.util.Arrays.copyOf(a, lengthA + lengthB);


        System.arraycopy(b, 0, merged, lengthA, lengthB);

        return merged;
    }
}
