class MonthData {
    public static MonthData monthToData;
    static int[] daySteps = new int[30];
    public static int getSteps(int day) {
        return daySteps[day];
    }
    static void setSteps(int day, int steps) {
        daySteps[day] = steps;
        // Заполните класс самостоятельно
    }
}
