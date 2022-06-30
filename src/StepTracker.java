public class StepTracker {
    Converter converter = new Converter();

   public MonthData[] monthToData;
   static int target;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void saveSteps(int month,int day,int steps){
        MonthData.monthToData = monthToData[month];
        MonthData.setSteps(day,steps);
    }

    void showStatistic(int month) {
        MonthData.monthToData = monthToData[month];
        System.out.println("Количество пройденных шагов по дням : ");

        for (int i = 0; i < 31; i++) {
            System.out.println("День" + i + "-й" + Converter.getStepsForDay(monthToData,i));
        }
        int sum = Converter.getSum(monthToData);

        System.out.println("Общее количество шагов за месяц: " + sum + ";");
        System.out.println("среднее количество шагов за день в течении месяца: " + Converter.getMean(monthToData));
        System.out.println("Максимальное количество пройенных шагов за день: " + Converter.findMaxSteps(monthToData));
        System.out.println("Пройденная дистанция в километрах: " + Converter.convertDistans(monthToData));
        System.out.println("Сожгли калорий: " + Converter.convertCalories(monthToData));
        System.out.println("длинна серии дней превышающиъ заданную цель по шагам в месяце: " + Converter.getSeriesLenght(monthToData));


    }
    public void targetSteps(int target) {
        if (target <= 0) {
            System.out.println(" цель не может быть меньше 0. ");
        } else {
            System.out.println("Новая цель сохранена. ");
        }

    }
}