package kam.renata;

public class Main {
    public static void main(String[] args) {

        //математические операторы
        int a = 5;
        int b = 10;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        //логические операторы
        int calories = 200;
        String sex = "male";

        boolean enoughCaloriesPerDay = sex.equals("male") && calories >= 1500; //true
        boolean notEnoughCaloriesPerDay = sex.equals("male") || calories < 1500; //false

        if (enoughCaloriesPerDay) {
            System.out.println("The amount of calories is enough");
        } else if (notEnoughCaloriesPerDay) {
            System.out.println("Not enough calories, eat some more");
        } else {
            System.out.println("Error");
        }
        //переполнения при вычислениях
        short number_1 = 3200;
        short number_2 = 100;
        short result = number_1 * number_2;
        System.out.println(result);

        //комбинации типов данных (int и double)
        int amount = 10;
        double price = 82.5;
        System.out.println("To pay: " + (amount * price));

    }
}

