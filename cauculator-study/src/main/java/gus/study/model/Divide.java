package gus.study.model;

public class Divide implements Action {
    public double executar(double a,double b){
        if(b == 0) throw new ArithmeticException("Divisão por zero");
        return a / b;
    }
}
