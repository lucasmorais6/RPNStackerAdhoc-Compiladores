import calculator.RPN;
import utils.Value;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        int input;
        String operator;

        Scanner Scanner = new Scanner(System.in);
        RPN RpnStacker = new RPN();

        while (Scanner.hasNextLine()) {
            operator = Scanner.nextLine();
            if (Value.isStringInt(operator)) {
                input = Integer.parseInt(operator);
                RpnStacker.saveRPN(input);
            } else {
                RpnStacker.RpnStacker(operator.charAt(0));
            }
        }

        result = RpnStacker.getResult();
        System.out.println("Resultado: " + result);
    }
}
