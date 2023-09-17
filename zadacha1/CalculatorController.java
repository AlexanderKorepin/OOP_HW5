package zadacha1;

public class CalculatorController {

    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }
    public double inputValueOne(){
        return view.userInputOne();
    }
    public double inputValueTwo(){
        return view.userInputTwo();
    }
    public String inputOperator() {
        return view.userInputOp();
    }
    public void calc() {
        double result;
        try {
            switch (inputOperator()){
                case "+":
                    result = model.sumNumbers(inputValueOne(), inputValueTwo());
                    break;
                case "-":
                    result = model.subNumbers(inputValueOne(), inputValueTwo());
                    break;
                case "*":
                    result = model.mulNumbers(inputValueOne(), inputValueTwo());
                    break;
                case "/":
                    result = model.divNumbers(inputValueOne(), inputValueTwo());
                    break;
                default:
                    view.printError("Введите математический символ!");
                    return;
            }
            view.printResult(result);
        } catch (ArithmeticException er) {
            view.printError(er.getMessage());
        }
    }
}