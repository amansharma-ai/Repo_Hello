import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7, 3};

        System.out.println("Before sorting: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}
