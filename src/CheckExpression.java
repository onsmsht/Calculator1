public class CheckExpression {
    public boolean expressionIsCorrect(String[] arrVal) {

        if(arrVal.length != 3){//проверка по размеру массива
            throw new RuntimeException("Неправильное выражение");
        }

        try{//проверка одинаковости цифр
            int a = Integer.parseInt(arrVal[0]);
            if(a < 1 || a > 10) {         //проверка от 1 до 10
                throw new RuntimeException("Первое число должно быть от 1 до 10");
            }
            try{
                int b = Integer.parseInt(arrVal[2]);
                if(b < 1 || b > 10) {       //проверка от 1 до 10
                    throw new RuntimeException("Второе число должно быть от 1 до 10");
                }
            }catch(NumberFormatException e){
                throw new RuntimeException("Введены числа разного формата");
            }
        }catch(NumberFormatException j){
            if(arrVal[2].charAt(0)!='X'&&arrVal[2].charAt(0)!='V'&&arrVal[2].charAt(0)!='I'){
                throw new RuntimeException("Введены числа разного формата");
            }
        }
        return true;
    }

       //проверка на римские цифры
    public boolean isRomanNum(String value1) {

        if (value1.charAt(0) == 'X' || value1.charAt(0) == 'V' || value1.charAt(0) == 'I') {
            return true;
        } else {
            return false;
        }
    }
}
