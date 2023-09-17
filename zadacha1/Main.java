package zadacha1;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляров модели, представления и презентера
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController calcController = new CalculatorController(model, view);

        calcController.calc();
    }
}