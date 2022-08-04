public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        int clientDeviceYear = 2022;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для для iOS по ссылке");
            }
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для для Android по ссылке");
            }
        }
    }
}