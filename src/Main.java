public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
       task6();
       task7();
       task8();
    }

    public static void task1() {

        System.out.println("Задание 1");

        byte a = 98;
        short b = 20000;
        int c = 600000000;
        long d = 9000000000L;
        float e = 1.2f;
        double f = 1.647d;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }

    public static void task2 () {

        System.out.println("Задание 2");

        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786d;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }

    public static void task3 () {

        System.out.println("Задание 3");

        byte ludmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA = 30;

        short papers =480;

        int paper = papers /  (ludmilaP + annaS + ekaterinaA);

        System.out.println( "На каждого ученика рассчитано " + paper +" листов бумаги");

    }

    public static void task4() {
        System.out.println("Задание 4");

        byte bottle =16;
        byte min = 2;

        byte minutes = 20;
        short dayMinutes= 1440;
        short dayThreeMinutes = 4320;
        int monthMinutes = 43200;

        int productivity = bottle / min;
        System.out.println("За 1 минуту машина произвела " + productivity+ " штук бутылок");

        int productivityMinutes = productivity * minutes;
        System.out.println("За " + minutes+ " минут машина произвела " + productivityMinutes+ " штук бутылок");

        int productivityDayMinutes = productivity * dayMinutes;
        System.out.println("За " + dayMinutes + " минут машина произвела " + productivityDayMinutes+ " штук бутылок");

        int productivityDayThreeMinutes = productivity * dayThreeMinutes;
        System.out.println("За " + dayThreeMinutes + " минут машина произвела " + productivityDayThreeMinutes+ " штук бутылок");

        int productivityMonthMinutes = productivity * monthMinutes;
        System.out.println("За " + monthMinutes + " минут машина произвела " + productivityMonthMinutes+ " штук бутылок");


    }
    public static void task5() {
        System.out.println("Задание 5");

        byte cansPaint = 120;
        byte whitePoint = 2;
        byte brownPaint = 4;

        int schoolClasses = cansPaint / (whitePoint + brownPaint);

        int whitePoints = schoolClasses * whitePoint;
        System.out.println("В школе, где " + schoolClasses + " классов, нужно … банок белой краски и " + whitePoints +" банок коричневой краски");

        int brownPoints = schoolClasses * brownPaint;
        System.out.println("В школе, где " + schoolClasses + " классов, нужно … банок белой краски и " + brownPoints +" банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задание 6");

        byte weightBanan = 80;
        byte weightMilk = 105;
        byte weightIceCream = 100;
        byte weightEgg = 70;

        byte banan = 5;
        short milk = 200;
        byte iceCream = 2;
        byte egg = 4;

        int kilogram = 1000;

        int weightBreakfast = (banan * weightBanan) + (milk * weightMilk) + (iceCream * weightIceCream) + (egg * weightEgg);
        System.out.println("Вес  в граммах " + weightBreakfast + "гр");

        int kilograms = weightBreakfast / kilogram;
        System.out.println("Вес  в килограммах  " + kilograms + "кг");
    }
    public static void task7() {
        System.out.println("Задание 7");

        int kilogram = 1000;
        byte weight = 7;
        short weight1 = 250;
        short weight2 = 500;
        int diet1 = (weight * kilogram) / weight1;
        int diet2 = (weight * kilogram) / weight2;

        System.out.println(diet1 + " дней");
        System.out.println(diet2 + " дней");

    }
    public static void task8() {
        System.out.println("Задание 8");
        byte yers = 12;
        int masha = 67760;
        int denis = 83690;
        int kristina  = 76230;

        byte percent = 10;

        int mashaPercent = masha * percent/100;
        int denisPercent = denis * percent/100;
        int kristinaPercent = kristina * percent/100;

        int salaryGrowthMasha = masha + mashaPercent;
        int salaryGrowthDenis = denis + denisPercent;
        int salaryGrowthKristina = kristina + kristinaPercent;


        int afterSalaryGrowthMasha = masha * yers;
        int afterSalaryGrowthDenis = denis * yers;
        int afterSalaryGrowthKristina = kristina * yers;

        int beforSalaryGrowthMasha = salaryGrowthMasha * yers - afterSalaryGrowthMasha;
        int beforSalaryGrowthDenis  = salaryGrowthDenis * yers - afterSalaryGrowthDenis ;
        int beforSalaryGrowthKristina = salaryGrowthKristina * yers - afterSalaryGrowthKristina;


        System.out.println("Маша теперь получает " + salaryGrowthMasha + " рублей. Годовой доход вырос на " + beforSalaryGrowthMasha + " рублей");
        System.out.println("Денис  теперь получает " + salaryGrowthDenis + " рублей. Годовой доход вырос на " + beforSalaryGrowthDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryGrowthKristina + " рублей. Годовой доход вырос на " + beforSalaryGrowthKristina + " рублей");


    }
}