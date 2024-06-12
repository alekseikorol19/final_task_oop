package Model;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    // Подумать, что будет, если пользователь введет НЕ числа

    public int getValue(String title){
        System.out.printf("%s",title);
        return in.nextInt();
    }

    public void print(float data, String title){
        System.out.printf("%s %.2f\n", title, data);
    }
}
