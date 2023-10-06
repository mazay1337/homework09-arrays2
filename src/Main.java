public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    // вводная часть
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    // 1) Бухгалтеры попросили посчитать сумму всех выплат за месяц. Формат:
    //    «Сумма трат за месяц составила … рублей».
    public static void task1() {
        int[] ledger = generateRandomArray();
        int sum = 0;
        for (int j : ledger) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    // 2)  Также бухгалтерия попросила найти минимальную и максимальную трату за день. Формат:
    //     «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
    public static void task2() {
        int[] ledger = generateRandomArray();
        int maxWaste = 0;
        int minWaste = 200_000;
        for (int i = 0; i < ledger.length; i++) {
            if (ledger[i] > maxWaste) {
                maxWaste = ledger[i];
            }
            if (ledger[i] < minWaste) {
                minWaste = ledger[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей. " +
                "Максимальная сумма трат за день составила " + maxWaste + " рублей");
    }

    // 3) Какую в среднем сумму компания тратила в течение 30 дней.
    public static void task3() {
        int[] ledger = generateRandomArray();
        int sum = 0;
        for (int j : ledger) {
            sum += j;
        }
        double average = (double) sum / ledger.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }


    // 4) В бухгалтерской книге появился баг: фамилии и имена сотрудников начали отображаться в обратную сторону.
    //    Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов
    //    char[ ]. В качестве данных для массива используйте: char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    //    В результате в консоль должно быть выведено: Ivanov Ivan. Важно: не используйте дополнительные массивы
    //    Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
    public static void task4() {
        char[] reverseFullName = {'y', 'a', 'z', 'a', 'M', ' ', 'a', 'n', 'a', 'i', 't', 'a', 'T'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (reverseFullName[i] == ' ') {
                System.out.print(" ");
            } else {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}