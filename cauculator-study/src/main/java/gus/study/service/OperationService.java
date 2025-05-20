package gus.study.service;

import gus.study.model.*;

import java.util.Map;

public class OperationService {

    Map<Operation, Action> operations = Map.of(
            Operation.ADD, new Add(),
            Operation.SUBTRACT, new Subtract(),
            Operation.MULTIPLY, new Multiply(),
            Operation.DIVIDE, new Divide()
    );

    public double executOperation(Operation op, double a, double b) {
        Action action = operations.get(op);
        if (action == null) throw new IllegalArgumentException("Operação inválida");
        return action.executar(a, b);
    }

}
