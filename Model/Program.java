package Model;

public class Program {
    public static void main(String[] args) {
        // подумать, каким образом пользователь выбирает действие (умножение / деление / сложение)
        // подумать, как сделать цикл бесконечным, чтобы программа работала до тех пор, 
        // пока пользователь не нажмет "q"
        Presenter p = new Presenter(new View());
        p.buttonClick();
    }
}
