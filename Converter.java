public class Converter {

    public static MonthData month;

    public static int getSeriesLenght(MonthData[] monthToData) {
        int maxLength = 0;
        int curLength = 0;
        for (int i = 0; i < MonthData.daySteps.length; i++) {
            int steps = MonthData.getSteps(i);
            if (steps > StepTracker.target) {
                curLength++;
            } else {
                maxLength = Math.max(curLength, maxLength);
                curLength = 0;
            }
            return maxLength;
        }
        return maxLength;
    }

    public static int getStepsForDay(MonthData[] monthToData, int day) {
        return MonthData.daySteps[day];
    }

    public static int getSum(MonthData[] monthToData) {
        int steps;
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            steps = MonthData.getSteps(i);
            sum += steps;
        }
        return sum;
    }

    public static double convertCalories(MonthData[] monthToData) {
        double Kcal = 0;
        for (int i = 0; i < 30; i++) {
            int steps = MonthData.getSteps(i);
            Kcal += (steps * 50) / 1000;
        }
        return Kcal;
    }

    static double convertDistans(MonthData[] monthToData) {
        double distans = 0;
        for (int i = 0; i < 30; i++) {
            int steps = MonthData.getSteps(i);
            distans += (steps * 0.75) / 1000;
        }
        return distans;
    }

    static int findMaxSteps(MonthData[] monthToData) {
        int maxSteps = 0;
        for (int i = 0; i < 30; i++) {

            if (maxSteps < MonthData.daySteps[i]) ;
            maxSteps = MonthData.daySteps[i];

        }
        return maxSteps;
    }

    static int getMean(MonthData[] monthToData) {
        int mean = getSum(monthToData) / 30;
        return mean;
    }
}

