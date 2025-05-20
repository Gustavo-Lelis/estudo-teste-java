package gus.study.model;

public class Divide implements Action {
    public double execute(double a,double b){
        if(b == 0) throw new ArithmeticException("denominator equal to zero");
        return a / b;
    }
}
