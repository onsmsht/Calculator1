public class Rresult {
    public String RomanResult(String result) {
        String rResult = "";
        if(result.equals("100")) {
            rResult = "C";
            return rResult;
        }else if(result.equals("1")) {
            rResult = "I";
            return rResult;
        }else if(result.equals("2")) {
            rResult = "II";
            return rResult;
        }else if(result.equals("3")) {
            rResult = "III";
            return rResult;
        }else if(result.equals("4")) {
            rResult = "IV";
            return rResult;
        }else if(result.equals("5")) {
            rResult = "V";
            return rResult;
        }else if(result.equals("6")) {
            rResult = "VI";
            return rResult;
        }else if(result.equals("7")) {
            rResult = "VII";
            return rResult;
        }else if(result.equals("8")) {
            rResult = "VIII";
            return rResult;
        }else if(result.equals("9")) {
            rResult = "IX";
            return rResult;
        }else if(result.equals("10")) {
            rResult = "X";
            return rResult;
        }else if(result.equals("0")) {
            throw new RuntimeException("Результат равен 0(не существует)");
        }

        if(result.charAt(0) == '1' ) {
            rResult = rResult + "X";
        }else if(result.charAt(0) == '2') {
            rResult = rResult + "XX";
        }else if(result.charAt(0) == '3') {
            rResult = rResult + "XXX";
        }else if(result.charAt(0) == '4') {
            rResult = rResult + "XL";
        }else if(result.charAt(0) == '5') {
            rResult = rResult + "L";
        }else if(result.charAt(0) == '6') {
            rResult = rResult + "LX";
        }else if(result.charAt(0) == '7') {
            rResult = rResult + "LXX";
        }else if(result.charAt(0) == '8') {
            rResult = rResult + "LXXX";
        }else if(result.charAt(0) == '9') {
            rResult = rResult + "XC";
        }else if(result.charAt(0) == '-') {
            throw new RuntimeException("Результат меньше 0(не существует)");
        }

        if(result.charAt(1) == '1' ) {
            rResult = rResult + "I";
        }else if(result.charAt(1) == '2') {
            rResult = rResult + "II";
        }else if(result.charAt(1) == '3') {
            rResult = rResult + "III";
        }else if(result.charAt(1) == '4') {
            rResult = rResult + "IV";
        }else if(result.charAt(1) == '5') {
            rResult = rResult + "V";
        }else if(result.charAt(1) == '6') {
            rResult = rResult + "VI";
        }else if(result.charAt(1) == '7') {
            rResult = rResult + "VII";
        }else if(result.charAt(1) == '8') {
            rResult = rResult + "VIII";
        }else if(result.charAt(1) == '9') {
            rResult = rResult + "IX";
        }else if(result.charAt(1) == '0') {
            rResult = rResult + "";
        }
        return rResult;
    }
}
