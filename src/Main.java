import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrVal;

        Math asdf;
        char op;

        CheckExpression checkExpression = new CheckExpression();

        while (checkExpression.expressionIsCorrect(arrVal = scanner.nextLine().split(" "))) {
            asdf = new Math();
            op = arrVal[1].charAt(0);

            if (checkExpression.isRomanNum(arrVal[0])) {
                int[] fromR = new int[2];
                fromR = Rnumbers.decodRnum(arrVal[0], arrVal[2]);
                int qwerty = asdf.calc(fromR[0], op, fromR[1]);
                String result = qwerty + "";
                Rresult rresult = new Rresult();
                String resultt = rresult.RomanResult(result);
                System.out.println(resultt);
            } else {
                int value1 = Integer.parseInt(arrVal[0]);
                int value2 = Integer.parseInt(arrVal[2]);
                int qwerty = asdf.calc(value1, op, value2);
                String result = qwerty + "";
                System.out.println(result);
            }
        }
    }
}
