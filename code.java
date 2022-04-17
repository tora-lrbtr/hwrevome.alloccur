import java.util.Arrays;

public class code {
    public static int [] removeElement (int[] arr, int elem) {
        int index = 0;
        for(int i = 0; i <arr.length; i++)
            if (arr[i] != elem)
                arr[index++] = arr[i];
        return Arrays.copyOf(arr, index);

    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 8, 4, 4, 10, 12};
        int elem = 4;
        arr = removeElement(arr, elem);
        System.out.println(Arrays.toString(arr));
    }
}
