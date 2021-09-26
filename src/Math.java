public class Math {

    int result=-1;

    public int calc(int x, char z, int y){

        switch(z){
            case '+':
                result=x+y;
                break;
            case '-':
                result=x-y;
                break;
            case '*':
                result=x*y;
                break;
            case '/':
                result=x/y;
                break;
            default:
                throw new RuntimeException("Неправильный оператор");
        }
        return result;
    }
}
