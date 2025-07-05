
public class Main {
    public static void main(String[] args) {
        // задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        // задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        // задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        // задача 4
        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // задача 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var weightDiff = boxer2 - boxer1;
        System.out.println(totalWeight);
        System.out.println(weightDiff);
        //задача 7
        var weightPercent = boxer2 % boxer1;
        System.out.println(weightPercent);
        //задача 8
        var totalWorktime = 640;
        var worktimePerPerson = 8;
        var numberOfWorker = totalWorktime / worktimePerPerson;
        System.out.println("Всего работников в компании - " + numberOfWorker + " человек");

    }
}
