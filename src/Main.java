import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку. Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner in = new Scanner(System.in);
        String answer;
        boolean attempt;
        int count = 0;
        String advice = "Подсказка: Заразная упакованная гадость";
        while (count<3) {
            answer = in.nextLine();
            attempt = answer.equalsIgnoreCase("Заархивированный вирус");
            if (answer.equalsIgnoreCase("Подсказка") && count ==0) {
                System.out.println(advice);
                count = 2;
                System.out.println(count);

            }else if (answer.equalsIgnoreCase("Подсказка") && count != 0){
                System.out.println("Подсказка уже недоступна");
            }
            else if (attempt) {
                System.out.println("Правильно!");
                break;
            } else if (count<2){
                System.out.println("Подумай еще");
                count++;
            }else{
                System.out.println("Обидно, приходи в другой раз");
                break;
            }
        }


    }

}
