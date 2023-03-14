import java.util.Scanner;

/*
Написать метод, который выводит расписание на неделю.
Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Расписание на неделю.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня недели для вывода расписания");
        int day = scanner.nextInt();
        while (day != 0) {
//            System.out.println("Введите номер дня недели для вывода расписания");
//            int day = scanner.nextInt();
            scanner.close();
//            System.exit(0);
            dailyPlanner(day);
        }
    }

    static void dailyPlanner(int day) {
        switch (day) {
            case 1:
                System.out.println("Понедельник\n");
                System.out.println("6:00" + "|" + "Подъем\n");
                break;
            case 2:
                System.out.println("Вторник");
            default:
                System.out.println("Неверный ввод");
                break;
        }
    }
}