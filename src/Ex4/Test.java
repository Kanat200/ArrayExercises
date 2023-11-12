package Ex4;

public class Test {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);
        }

        /////////////////////
        System.out.println("");
        /////////////////////

        for (int i = 0; i < nums.length/2; i++) {
            System.out.println(nums[i]);
        }

        /////////////////////
        System.out.println("");
        /////////////////////

        for (int i = nums.length/2; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        /////////////////////
        System.out.println("");
        /////////////////////

        for (int i = 1; i < nums.length - 1; i++) {
            System.out.println(nums[i]);
        }

        /////////////////////
        System.out.println("");
        /////////////////////

        for (int i = nums.length - 3; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        /////////////////////
        System.out.println("");
        /////////////////////

        for (int i = 1; i < nums.length; i+=2) {
            System.out.println(nums[i]);
        }

        /////////////////////
        System.out.println("");
        /////////////////////

        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positiveCount++;
            }
            if (nums[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Положительные числа: " + positiveCount);
        System.out.println("Негативные числа: " + negativeCount);

        /////////////////////
        System.out.println("");
        /////////////////////

        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] > nums[i - 1] && nums[i] > max) {
                max = nums[i];
            }
            if (i != 0 && nums[i] < nums[i - 1] && min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("Максимальное значения: " + max);
        System.out.println("Минимальное значения: " + min);

    }
}














