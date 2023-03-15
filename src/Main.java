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
        scanner.close();
        dailyPlanner(day);
}

    static void dailyPlanner(int day) {
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                System.out.println("6:00" + " | " + "Доброе утро! Успешного рабочего дня");
                System.out.println("6:10 - 6:45" + " | " + "Прогулка с собакой");
                System.out.println("7:00 - 7:20" + " | " + "Завтрак");
                System.out.println("9:00" + " | " + "Начало рабочего дня");
                System.out.println("10:00 - 10:15" + " | " + "Coffee break");
                System.out.println("12:30 - 13:00" + " | " + "Обед");
                System.out.println("15:00 - 15:15" + " | " + "Coffee break");
                System.out.println("18:00" + " | " + "Конец рабочего дня");
                System.out.println("19:00 - 20:00" + " | " + "Вечерняя тренировка");
                System.out.println("21:00 - 21:30" + " | " + "Прогулка с собакой");
                System.out.println("21:45 - 22:00" + " | " + "Ужин");
                System.out.println("22:00 - 23:00" + " | " + "Обучение");
                System.out.println("23:30" + " | " + "Отход ко сну. Спокойной ночи!");
                break;
            case 2:
                System.out.println("Вторник");
                System.out.println("6:00" + " | " + "Доброе утро! Успешного рабочего дня");
                System.out.println("6:10 - 6:45" + " | " + "Прогулка с собакой");
                System.out.println("7:00 - 7:20" + " | " + "Завтрак");
                System.out.println("9:00" + " | " + "Начало рабочего дня");
                System.out.println("10:00 - 10:15" + " | " + "Coffee break");
                System.out.println("11:00 - 12:15" + " | " + "Совещание");
                System.out.println("12:30 - 13:00" + " | " + "Обед");
                System.out.println("15:00 - 15:15" + " | " + "Coffee break");
                System.out.println("18:00" + " | " + "Конец рабочего дня");
                System.out.println("19:00 - 19:30" + " | " + "Прогулка с собакой");
                System.out.println("19:45 - 20:00" + " | " + "Ужин");
                System.out.println("20:15 - 22:15" + " | " + "Обучение");
                System.out.println("23:30" + " | " + "Отход ко сну. Спокойной ночи!");
                break;
            case 3:
                System.out.println("Среда");
                System.out.println("6:00" + " | " + "Доброе утро! Успешного рабочего дня");
                System.out.println("6:10 - 6:45" + " | " + "Прогулка с собакой");
                System.out.println("7:00 - 7:20" + " | " + "Завтрак");
                System.out.println("9:00" + " | " + "Начало рабочего дня");
                System.out.println("10:00 - 10:15" + " | " + "Coffee break");
                System.out.println("12:30 - 13:00" + " | " + "Обед");
                System.out.println("15:00 - 15:15" + " | " + "Coffee break");
                System.out.println("18:00" + " | " + "Конец рабочего дня");
                System.out.println("19:00 - 20:00" + " | " + "Вечерняя тренировка");
                System.out.println("21:00 - 21:30" + " | " + "Прогулка с собакой");
                System.out.println("21:45 - 22:00" + " | " + "Ужин");
                System.out.println("22:00 - 23:00" + " | " + "Обучение");
                System.out.println("23:30" + " | " + "Отход ко сну. Спокойной ночи!");
                break;
            case 4:
                System.out.println("Четверг");
                System.out.println("6:00" + " | " + "Доброе утро! Успешного рабочего дня");
                System.out.println("6:10 - 6:45" + " | " + "Прогулка с собакой");
                System.out.println("7:00 - 7:20" + " | " + "Завтрак");
                System.out.println("9:00" + " | " + "Начало рабочего дня");
                System.out.println("10:00 - 10:15" + " | " + "Coffee break");
                System.out.println("11:00 - 12:15" + " | " + "Совещание");
                System.out.println("12:30 - 13:00" + " | " + "Обед");
                System.out.println("15:00 - 15:15" + " | " + "Coffee break");
                System.out.println("18:00" + " | " + "Конец рабочего дня");
                System.out.println("19:00 - 19:30" + " | " + "Прогулка с собакой");
                System.out.println("19:45 - 20:00" + " | " + "Ужин");
                System.out.println("20:15 - 22:15" + " | " + "Обучение");
                System.out.println("23:30" + " | " + "Отход ко сну. Спокойной ночи!");
                break;
            case 5:
                System.out.println("Пятница");
                System.out.println("6:00" + " | " + "Доброе утро! Успешного рабочего дня");
                System.out.println("6:10 - 6:45" + " | " + "Прогулка с собакой");
                System.out.println("7:00 - 7:20" + " | " + "Завтрак");
                System.out.println("9:00" + " | " + "Начало рабочего дня");
                System.out.println("10:00 - 10:15" + " | " + "Coffee break");
                System.out.println("12:30 - 13:00" + " | " + "Обед");
                System.out.println("15:00 - 15:15" + " | " + "Coffee break");
                System.out.println("18:00" + " | " + "Конец рабочего дня. С успешным завершением рабочей недели!");
                System.out.println("19:00 - 20:00" + " | " + "Прогулка с собакой");
                System.out.println("20:30" + " | " + "Встреча с друзьями");
                break;
            case 6:
                System.out.println("Субботу");
                System.out.println("Доброе утро! Приятного отдыха!");
                System.out.println("Поездка за город");
                break;
            case 7:
                System.out.println("Воскресенье");
                System.out.println("Доброе утро! Приятного отдыха!");
                System.out.println("Подготовьтесь к новой рабочей неделе");
                break;
            default:
                System.out.println("Неверный ввод");
                break;
        }
    }
}