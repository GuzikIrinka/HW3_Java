
import java.util.*;

public class array {

    /*
     * Один большой массив и два маленьких
     */

    public class Solution {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int[] numbers = new int[20];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();
            }

            int[] part1 = Arrays.copyOf(numbers, 10);
            int[] part2 = Arrays.copyOfRange(numbers, 10, 20);
            System.out.println(Arrays.toString(part1));
            System.out.println(Arrays.toString(part2));

        }
    }
}