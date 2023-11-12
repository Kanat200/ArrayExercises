package Ex2;

public class Test {
    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z < 3) {
            h[z] = new Hobbits();
            h[z].name = "Бильбо";
            if (z == 1) {
                h[z].name = "Фрода";
            }
            if (z == 2) {
                h[z].name = "Сэм";
            }
            System.out.print(h[z].name + " - ");
            System.out.println("Имя прохожего хоббита");
            z = z + 1;
        }
    }
}
