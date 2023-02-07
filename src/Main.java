import java.util.*;

public class Main {



    public static void main(String[] args) {

        ex1();
    }

    //    Пусть дан произвольный список целых чисел, удалить из него четные числа
    static void ex0() {
        System.out.println("Введите n");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(n));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }

/* Задан целочисленный список ArrayList.
Найти минимальное, максимальное и
среднее арифметическое из этого списка.
Collections.max()

 */
    static void ex1() {
        System.out.println("Введите n");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(n));
        }
        System.out.println(list);

        System.out.println("Минимальное число: " + Collections.min(list));

        System.out.println("Максимальное число: " + Collections.max(list));
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + list.get(i);
        }
        System.out.println("Среднее арифметическое число: " + sum/n);
    }
}

