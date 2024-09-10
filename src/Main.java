public class Main {
    public static void main(String[] args) {
        // task #1
        int [] salary = new int[5];
        salary[0] = 15000;
        salary[1] = 20000;
        salary[2] = 2359;
        salary[3] = 21000;
        salary[4] = 35000;
        int sum = 0;
        for (int i = 0; i < salary.length; i++)
        {
            sum += salary[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // task #2
        int min = salary[0], max = salary[0];
        for (int i = 0; i < salary.length; i++)
        {
            if (min > salary[i])
            {min = salary[i];}
            if (max < salary[i])
            {max = salary[i];}
        }
        System.out.println("\nМинимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей\n");

        // task #3
        sum = 0;
        for (int i = 0; i < salary.length; i++)
        {
            sum += salary[i];
        }
        float average = (float) sum / salary.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей\n");

        // task #4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++)
        {
                char helper = reverseFullName[i];
                reverseFullName[i] = reverseFullName[reverseFullName.length-1-i];
                reverseFullName[reverseFullName.length-1-i] = helper;
        }
        System.out.println(reverseFullName);

    }
}