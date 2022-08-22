package calculator;

import utils.Stack;

public class RPN {

    private Stack<Integer> operands;

    public RPN() {
        operands = new Stack<>();
    }

    public void saveRPN(Integer operand) {
        operands.push(operand);
    }

    public Integer RpnStacker(Character operator) {

        Integer fistOperand = operands.pop();
        Integer secondOperand = operands.pop();
        Integer result = 0;

        switch (operator) {
            case '+':
                result =  secondOperand + fistOperand;
                break;
            case '-':
                result = secondOperand - fistOperand;
                break;
            case '*':
                result = secondOperand * fistOperand;
                break;
            case '/':
                result = secondOperand / fistOperand;
                break;
        }

        operands.push(result);
        return result;
    }

    public Integer getResult() {
        return operands.pop();
    }

}
