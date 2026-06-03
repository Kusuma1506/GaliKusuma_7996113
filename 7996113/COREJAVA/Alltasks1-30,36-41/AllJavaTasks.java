
import java.io.*;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class AllJavaTasks {

    // Task 1
    static void task1() {
        System.out.println("Hello, World!");
    }

    // Task 2
    static void task2() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+,-,*,/): ");
        char op = sc.next().charAt(0);

        switch (op) {

            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':

                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");

                break;

            default:
                System.out.println("Invalid operator");
        }
    }

    // Task 3
    static void task3() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    // Task 4
    static void task4() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }

    // Task 5
    static void task5() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // Task 6
    static void task6() {

        int a = 10;
        float b = 5.5f;
        double c = 100.99;
        char d = 'A';
        boolean e = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

    // Task 7
    static void task7() {

        double d = 55.78;
        int i = (int) d;

        int num = 20;
        double d2 = (double) num;

        System.out.println(i);
        System.out.println(d2);
    }

    // Task 8
    static void task8() {

        int result = 10 + 5 * 2;

        System.out.println(result);
    }

    // Task 9
    static void task9() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90)
            System.out.println("A");
        else if (marks >= 80)
            System.out.println("B");
        else if (marks >= 70)
            System.out.println("C");
        else if (marks >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }

    // Task 10
    static void task10() {

        Random r = new Random();

        int number = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        int guess;

        do {

            System.out.print("Guess number: ");

            guess = sc.nextInt();

            if (guess > number)
                System.out.println("Too High");

            else if (guess < number)
                System.out.println("Too Low");

            else
                System.out.println("Correct");

        } while (guess != number);
    }

    // Task 11
    static void task11() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int n = sc.nextInt();

        long fact = 1;

        for (int i = 1; i <= n; i++) {

            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }

    // Task 12
    int add(int a, int b) {

        return a + b;
    }

    double add(double a, double b) {

        return a + b;
    }

    int add(int a, int b, int c) {

        return a + b + c;
    }

    // Task 13
    static int fibonacci(int n) {

        if (n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Task 14
    static void task14() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            sum += arr[i];
        }

        System.out.println("Sum = " + sum);

        System.out.println("Average = " + (double) sum / n);
    }

    // Task 15
    static void task15() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");

        String str = sc.nextLine();

        String rev = new StringBuilder(str).reverse().toString();

        System.out.println(rev);
    }

    // Task 16
    static void task16() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");

        String str = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    // Task 17
    static class Car {

        String make;
        String model;
        int year;

        void displayDetails() {

            System.out.println(make + " " + model + " " + year);
        }
    }

    // Task 18
    static class Animal {

        void makeSound() {

            System.out.println("Animal Sound");
        }
    }

    static class Dog extends Animal {

        void makeSound() {

            System.out.println("Bark");
        }
    }

    // Task 19
    interface Playable {

        void play();
    }

    static class Guitar implements Playable {

        public void play() {

            System.out.println("Playing Guitar");
        }
    }

    static class Piano implements Playable {

        public void play() {

            System.out.println("Playing Piano");
        }
    }

    // Task 20
    static void task20() {

        Scanner sc = new Scanner(System.in);

        try {

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a / b);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
        }
    }

    // Task 21
    static class InvalidAgeException extends Exception {

        InvalidAgeException(String msg) {

            super(msg);
        }
    }

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18)
            throw new InvalidAgeException("Invalid Age");

        System.out.println("Eligible");
    }

    // Task 22
    static void task22() throws Exception {

        FileWriter fw = new FileWriter("output.txt");

        fw.write("Hello File");

        fw.close();

        System.out.println("File Written");
    }

    // Task 23
    static void task23() throws Exception {

        File file = new File("output.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {

            System.out.println(sc.nextLine());
        }

        sc.close();
    }

    // Task 24
    static void task24() {

        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("David");

        System.out.println(names);
    }

    // Task 25
    static void task25() {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "John");
        map.put(2, "David");

        System.out.println(map.get(1));
    }

    // Task 26
    static class MyThread extends Thread {

        public void run() {

            for (int i = 1; i <= 5; i++) {

                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    // Task 27
    static void task27() {

        List<String> list = new ArrayList<>();

        list.add("Banana");
        list.add("Apple");
        list.add("Orange");

        Collections.sort(list);

        System.out.println(list);
    }

    // Task 28
    static void task28() {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> even = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(even);
    }

    // Task 29
    record Person(String name, int age) {
    }

    // Task 30
    static void task30(Object obj) {

        if (obj instanceof Integer)
            System.out.println("Integer " + obj);

        else if (obj instanceof String)
            System.out.println("String " + obj);

        else if (obj instanceof Double)
            System.out.println("Double " + obj);

        else
            System.out.println("Unknown");
    }

    // Task 31
    static void task31() {

        System.out.println("Database Connection Example");
    }

    // Task 32
    static void task32() {

        System.out.println("Insert Record Example");
    }

    // Task 33
    static void task33() {

        System.out.println("Transaction Successful");
    }


    // Task 36
    static void task36() {

        try {

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com"))
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString());

            System.out.println(response.statusCode());

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    // Task 37
    static void task37() {

        System.out.println("Run javap -c ClassName");
    }

    // Task 38
    static void task38() {

        System.out.println("Use JD-GUI or CFR");
    }

    // Task 39
    static class Test {

        public void show() {

            System.out.println("Reflection Called");
        }
    }

    static void task39() throws Exception {

        Class<?> cls = Class.forName("AllJavaTasks$Test");

        Object obj = cls.getDeclaredConstructor().newInstance();

        Method m = cls.getDeclaredMethod("show");

        m.invoke(obj);
    }

    // Task 40
    static void task40() {

        for (int i = 1; i <= 5; i++) {

            int n = i;

            new Thread(() -> {

                System.out.println("Thread " + n);

            }).start();
        }
    }

    // Task 41
    static void task41() throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<Integer>> tasks = new ArrayList<>();

        tasks.add(() -> 10 + 20);
        tasks.add(() -> 30 + 40);
        tasks.add(() -> 50 + 60);

        List<Future<Integer>> results = executor.invokeAll(tasks);

        for (Future<Integer> f : results) {

            System.out.println(f.get());
        }

        executor.shutdown();
    }
public static void main(String[] args) throws Exception {

    AllJavaTasks obj = new AllJavaTasks();

    // Task 1
    task1();

    // Task 2
     task2();

    // Task 3
    task3();

    // Task 4
     task4();

    // Task 5
     task5();

    // Task 6
    task6();

    // Task 7
    task7();

    // Task 8
    task8();

    // Task 9
     task9();

    // Task 10
     task10();

    // Task 11
     task11();

    // Task 12
    System.out.println(obj.add(10, 20));
    System.out.println(obj.add(5.5, 4.5));
    System.out.println(obj.add(1, 2, 3));

    // Task 13
    System.out.println(fibonacci(6));

    // Task 14
    // task14();

    // Task 15
    // task15();

    // Task 16
    // task16();

    // Task 17
    Car car = new Car();

    car.make = "Toyota";
    car.model = "Camry";
    car.year = 2022;

    car.displayDetails();

    // Task 18
    Animal a = new Animal();
    Dog d = new Dog();

    a.makeSound();
    d.makeSound();

    // Task 19
    Guitar g = new Guitar();
    Piano p = new Piano();

    g.play();
    p.play();

    // Task 20
    // task20();

    // Task 21
    try {

        checkAge(20);

    } catch (InvalidAgeException e) {

        System.out.println(e.getMessage());
    }

    // Task 22
    task22();

    // Task 23
    task23();

    // Task 24
    task24();

    // Task 25
    task25();

    // Task 26
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();

    t1.start();
    t2.start();

    // Task 27
    task27();

    // Task 28
    task28();

    // Task 29
    Person p1 = new Person("Kusu", 25);

    System.out.println(p1);

    // Task 30
    task30(10);
    task30("Hello");
    task30(25.5);

    // Task 31
    task31();

    // Task 32
    task32();

    // Task 33
    task33();

    // Task 34
    task34();

    // Task 35
    task35();

    // Task 36
    task36();

    // Task 37
    task37();

    // Task 38
    task38();

    // Task 39
    task39();

    // Task 40
    task40();

    // Task 41
    task41();
}
}
