public class Calculator {
    private double num1;
    private double num2;
    private char sign;
    private double result;

    public Calculator(){}

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double getResult() {
        return result;
    }
    public void performOperation() {
        if( this.sign == '+') {
            this.result = (num1) + (num2);
        }
        if( this.sign == '-') {
            this.result = (num1) - (num2);
        }
    }
    public void getResults() {
        System.out.println(this.result);
    }
}
