package Model;
public class DivisionModel extends CalcModel  {

    public float res_dev(){
        return (float)x / (float)y;
    }

    @Override
    public int result() {
        return x / y;
    }


    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }

    
}
