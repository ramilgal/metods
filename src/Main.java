public class Main {
    public static int checkLeapYear(int yearInput) {
        if (yearInput % 4 == 0 && yearInput % 100 != 0 || yearInput % 400 == 0) {
            System.out.println(yearInput + " год является високосным");
        }
        else System.out.println(yearInput + " год не является високосным");
        return yearInput;
    }
    public static void printSeparator() {
        System.out.println("++++++++++");
        System.out.println("----------");
    }
    public static void printIssues(int issueCount){
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("Домашнее задание");
        //Задача 1
        System.out.println("Задача 1");
        int yearInput = 2024;
        checkLeapYear(yearInput);
        //Задача 2
        System.out.println("Задача 2");


        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i+1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);
    }
}