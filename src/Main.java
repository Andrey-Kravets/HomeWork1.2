public class Main {

    public static void main(String[] args) {
        byte a = 127;
        short b = -129;
        int c = 32_768;
        long d = 5L;
        float e = 4.1234f;
        double f = 12.123_456_78;
        char g = 65_000;
        boolean h = 1 < 0;

        double weightBoxer1 = 78.2;
        System.out.println("Вес первого боксера: " + weightBoxer1 + " кг");
        double weightBoxer2= 82.7;
        System.out.println("Вес второго боксера: " + weightBoxer2 + " кг");
        double totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес бойцов: " + totalWeight + " кг");
        double weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("Второй боксер тяжелее первого на " + weightDifference + " кг");

        byte bananaWeight = 80;
        int bananasTotalWeight = bananaWeight * 5;
        short milkVolume = 200;
        float milkWeight1ml = 1.05f;
        float milkTotalWeight = milkVolume * milkWeight1ml;
        byte iceCreamWeight = 100;
        int iceCreamTotalWeight = iceCreamWeight * 2;
        byte eggWeight = 70;
        int eggTotalWeight = eggWeight * 4;
        float breakfastWeight = bananasTotalWeight + milkTotalWeight + iceCreamTotalWeight + eggTotalWeight;
        System.out.println("Общий вес завтрака: " + breakfastWeight + " г");
        float breakfastWeightInKg = breakfastWeight / 1000;
        System.out.println("Или: " + breakfastWeightInKg + " кг");

        byte weightLoss = 7;
        float diet1 = 0.25f;
        float diet2 = 0.5f;
        float daysForDiet1 = weightLoss / diet1;
        System.out.println("Количество дней для похудения по рациону №1: " + daysForDiet1);
        float daysForDiet2 = weightLoss / diet2;
        System.out.println("Количетсво дней для похудения по рациону №2: " + daysForDiet2);
        float averageDays = (daysForDiet1 + daysForDiet2) / 2;
        System.out.println("В среднем понадобится дней: " + averageDays);

        int salaryMary = 67760;
        int salaryDen = 83690;
        int salaryKris = 76230;
        double newSalaryMary = salaryMary + salaryMary * 0.1;
        System.out.println("Новая зарплата Марии: " + newSalaryMary + " рублей");
        double annualIncreaseMary = (newSalaryMary - salaryMary) * 12;
        System.out.println("Годовой доход Марии вырос на: " + annualIncreaseMary + " рублей");
        double newSalaryDen = salaryDen + salaryDen * 0.1;
        System.out.println("Новая зарплата Дениса: " + newSalaryDen + " рублей");
        double annualIncreaseDen = (newSalaryDen - salaryDen) * 12;
        System.out.println("Годовой доход Дениса вырос на: " + annualIncreaseDen + " рублей");
        double newSalaryKris = salaryKris + salaryKris * 0.1;
        System.out.println("Новая зарплата Кристины: " + newSalaryKris + " рублей");
        double annualIncreaseKris = (newSalaryKris - salaryKris)  * 12;
        System.out.println("Годовой доход Кристины вырос на: " + annualIncreaseKris + " рублей");

    }
}