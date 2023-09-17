package zadacha1;

public class CalculatorModel {
    public double sumNumbers(double value1, double value2) {
        return value1 + value2;
    }
    public double subNumbers(double value1, double value2) {
        return value1 - value2;
    }
    public double mulNumbers(double value1, double value2) {
        return value1 * value2;
    }
    public double divNumbers(double value1, double value2) {
        if (value2 == 0) {
            throw new Error("На ноль делить нельзя!");
        }else {
            return value1 / value2;
        }
    }
}