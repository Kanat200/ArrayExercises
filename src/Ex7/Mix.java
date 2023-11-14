package Ex7;

public class Mix {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner--) {
                x = x + 3; // 54 6
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);

        System.out.println("For testing commit");
    }
}
// x = x + 6; 60 10
// x = x + 2;
// x = x + 0; 6 14
//For Test Committing