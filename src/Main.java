public class Main {
    public static void main(String[] args) {
        // все задания
        // task1
        int i;
        byte b;
        short s;
        long l;
        float f;
        double d2;

        System.out.println("Значение переменной i с типом int равно 1");
        System.out.println("Значение переменной b с типом byte равно 2");
        System.out.println("Значение переменной s с типом short равно 3");
        System.out.println("Значение переменной l с типом long равно 4");
        System.out.println("Значение переменной f с типом float равно 1.5");
        System.out.println("Значение переменной d2 с типом double равно 4.3");

        //task2
        float boat = 27.12f;
        long car = 987678965549L;
        int apple = 2;
        int i2 = 786;
        boolean pen = false;
        short houses= -159;
        int bee = 27897;
        byte lesson = 67;

        //task3
        int lyudmilaPavlovnaClass = 23;
        int annaSergeevnaClass = 27;
        int ekaterinaAndreevnaClass = 30;
        int vsegoUcenikov = lyudmilaPavlovnaClass + ekaterinaAndreevnaClass + annaSergeevnaClass;
        int vsegoBumagi = 480;

        System.out.println("Каждому ученику достанется " + vsegoBumagi/vsegoUcenikov + " бумаги");

        //task4
        int capacityCar = 16/2;
        System.out.println("За 1 минуту машина произвела " + capacityCar + " штук бутылок");
        int capacityCar20min = capacityCar*20;
        System.out.println("За 20 минут машина произвела " + capacityCar20min + " штук бутылок");
        int capacityCars24hours = 24*60*capacityCar;
        System.out.println("За сутки машина произвела " + capacityCars24hours + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + capacityCars24hours*3 +" штук бутылок" );
        System.out.println("За 1 месяц машина произвела " + capacityCars24hours*30 + " штук бутылок");

        //task5
        int vsegoKraski = 120;
        int vsegoKlassov = 120/6;
        int white = vsegoKlassov * 2;
        int brown = vsegoKlassov * 4;
        System.out.println("В школе, где " + vsegoKlassov + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");

        //task6
        int banana = 5*80;
        int milk = 2*105;
        int icecream = 2*100;
        int eggs = 4*70;
        int result = banana + milk + icecream + eggs;
        System.out.println("Общий вес завтрака составляет " + result + " гр");

        //task7
        int sportsmen = 70;
        int nuznoSbrosit = 7;
        int idealVes = 70 - nuznoSbrosit;
        double variant1 = 7/0.250 ;
        double variant2 = 7/0.500 ;
        System.out.println("Идеальный вес спортсмена составляет " + idealVes + " кг");
        System.out.println(variant1 + " дней понадобится ему ,если он будет сбрасывать по 250 гр в день");
        System.out.println(variant2 + " дней понадобится ему ,если он будет сбрасывать по 500 гр в день");

        //task8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        //зарплата Маши
        int zarplataZaGodMasha = salaryMasha * 12;
        int newSalaryMasha = (salaryMasha / 100 *10) + salaryMasha;
        int godovoyDoxod = newSalaryMasha *12;
        int godovoyDoxodVyros = godovoyDoxod % zarplataZaGodMasha;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + godovoyDoxodVyros + " рублей");
        //зарплата Дениса
        int zarplataZaGodDenis = salaryDenis * 12;
        int newSalaryDenis = (salaryDenis / 100 *10) + salaryDenis;
        int godovoyDoxod2 = newSalaryDenis *12;
        int godovoyDoxodVyros2 = godovoyDoxod2 % zarplataZaGodDenis;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + godovoyDoxodVyros2 + " рублей");
        //зарплата Кристины
        int zarplataZaGodKristina = salaryKristina * 12;
        int newSalaryKristina = (salaryKristina / 100 *10) + salaryKristina;
        int godovoyDoxod3 = newSalaryKristina *12;
        int godovoyDoxodVyros3 = godovoyDoxod3 % zarplataZaGodKristina;
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + godovoyDoxodVyros3 + " рублей");





    }
}