import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int CONTAINERS_IN_TRUCK = 12;
        final int BOXES_IN_CONTAINER = 27;
        int container = 1;
        int truck = 1;
        Scanner scanner = new Scanner(System.in);
        int box = scanner.nextInt();
        if (box != 0) {
            System.out.println("Грузовик: " + truck + "\n\tКонтейнер: " + container);
        } else {
            System.out.println("Необходимо:\nгрузовиков - " + (truck = 0) + " шт." + "\nконтейнеров - " + (container = 0) + " шт.");
        }
        for (int i = 1; i <= box; i++) {
            System.out.println("\t\tЯщик: " + i);
            if (i == box) {
                System.out.println("Необходимо:\nгрузовиков - " + truck + " шт." + "\nконтейнеров - " + container + " шт.");
            } else {
                if (i % (CONTAINERS_IN_TRUCK * BOXES_IN_CONTAINER) == 0) {
                    truck += 1;
                    System.out.println("Грузовик: " + truck);
                }
                if (i % BOXES_IN_CONTAINER == 0) {
                    container += 1;
                    System.out.println("\tКонтейнер: " + container);
                }
            }
        }
    }
}
