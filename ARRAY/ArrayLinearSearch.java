public class ArrayLinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 30;
        boolean found = false; //by default false
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
