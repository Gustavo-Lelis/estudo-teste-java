package gus.study.service;

public enum Operation {
    ADD("+"),
    SUBTRACT("-"),
    DIVIDE("/"),
    MULTIPLY("*");

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String toString() {
        return symbol;
    }

}
