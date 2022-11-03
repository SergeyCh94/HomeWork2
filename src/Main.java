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

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " " + cat + " " + paper);
        System.out.println("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog + " " + cat + " " + paper);
        System.out.println("\n");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog + " " + cat + " " + paper);
        System.out.println("\n");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println("\n");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println("\n");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sumResult = boxer1 + boxer2;
        System.out.println("Общий вес бойцов: " + sumResult + " кг.");
        var difResult = boxer2 - boxer1;
        System.out.println("Разница в весе бойцов: " + difResult + " кг.");
        System.out.println("\n");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var result1 = boxer2 - boxer1;
        var result2 = boxer2 % boxer1;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println("\n");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        var sumHour = 640;
        var onlyHour = 8;
        var sumEmp = sumHour / onlyHour;
        System.out.println("Всего работников в компании — " + sumEmp + " человек");
        sumEmp += 94;
        System.out.println("Если в компании работает " + sumEmp + " человека, то всего " + sumEmp * onlyHour + " часа работы может быть поделено между сотрудниками");
    }
}