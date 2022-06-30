import java.util.Scanner;

public class TrackerCall {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();

        while (true) {
            printMenu();
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                System.out.println("Введите месяц в диапазоне от 0 до 11.");
                int month = scanner.nextInt();
                System.out.println("Введите день в диапазоне от 1 до 30.");
                int day = scanner.nextInt();
                System.out.println("Введите количество шагов.");
                int steps = scanner.nextInt();
                stepTracker.saveSteps(month,day,steps);
                continue;
            }

            if  (userInput == 2) {
                System.out.println("Введите месяц за который хотите ввести данные: ");
                int month = scanner.nextInt();
                stepTracker.showStatistic(month);
                continue;
            }

            if (userInput == 3) {
                System.out.println("Ваша текущая цель" + stepTracker.target);
                System.out.println( "Введите новую цель: ");
                int newTarget = scanner.nextInt();
                stepTracker.targetSteps(newTarget);
                continue;
            }

            if (userInput == 0) {
                System.out.println("Выход");
                break;
            }
            printMenu();
            userInput = scanner.nextInt();
            System.out.println("Программа завершена");
        }
    }
    private static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Ввести количество шагов за определённый день;");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выход.");
    }
}



