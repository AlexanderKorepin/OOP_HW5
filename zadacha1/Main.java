package zadacha1;

public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController calcController = new CalculatorController(model, view);

        calcController.calc();
    }
}