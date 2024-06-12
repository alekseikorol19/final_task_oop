package Model;

import java.util.Scanner;

public class ModelDeductor {
    Scanner in = new Scanner(System.in);
    Model model;

    public ModelDeductor(){

    }

    public Model deductModel(){
        String operation = getSign();
        if (operation == "Sum") {
            return new SumModel();
        } else if (operation == "Multiplication") {
            return new MultiplicationModel();
        } else {
            return new DivisionModel();
        }
    }

    private String getSign(){
        boolean flag = false;
        while (flag == false) {
            System.out.println("Выберите операцию:\n1 - Сложение\n2 - Умножение\n3 - Деление\n");
            int usrInput = in.nextInt();
            if (usrInput == 1) {
                flag = true;
                return "Sum";
            } else if (usrInput == 2) {
                flag = true;
                return "Multiplication";
            } else if (usrInput == 3) {
                flag = true;
                return "Division";
            } else {
                System.out.println("Введена неверная цифра, попробуйте снова.");
            }
        }
        return "";
        
    }
}
