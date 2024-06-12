package Model;

public class Presenter {
    View view;
    public Presenter(View view) {
        this.view = view;
    }
    public void buttonClick(){
        Model model = new ModelDeductor().deductModel();
        boolean flag = false;
        int b = 0;
        int a = view.getValue("a: ");
        while (flag == false) {
            b = view.getValue("b: ");
            if (model instanceof DivisionModel && b == 0) {
                System.out.println("На ноль делить нельзя, введите второй параметр заново.");
            } else {
                flag = true;
            }
        }
        model.setX(a);
        model.setY(b);

        if (model instanceof DivisionModel) {
            float result = ((DivisionModel)model).res_dev();
            view.print(result, titleDeterminator(model));
        } else {
            float result = (float)model.result();
            view.print(result, titleDeterminator(model));
        }
    }
    
    private String titleDeterminator(Model model){
        if (model instanceof SumModel) {
            return "Sum: ";
        } else if (model instanceof MultiplicationModel) {
            return "Multiplication: ";
        } else if (model instanceof DivisionModel) {
            return "Division: ";
        }
        return null;
    }
}
