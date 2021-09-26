public class Rnumbers {
    public static int[] decodRnum(String x, String y){
        int z=0;
        int q=0;

            if (x.equals("I")) {
                z = 1;
            } else if (x.equals("II")) {
                z = 2;
            } else if (x.equals("III")) {
                z = 3;
            } else if (x.equals("IV")) {
                z = 4;
            } else if (x.equals("V")) {
                z = 5;
            } else if (x.equals("VI")) {
                z = 6;
            } else if (x.equals("VII")) {
                z = 7;
            } else if (x.equals("VIII")) {
                z = 8;
            } else if (x.equals("IX")) {
                z = 9;
            } else if (x.equals("X")) {
                z = 10;
            }else{
                throw new RuntimeException("Число должно быть от I до X");
            }


            if (y.equals("I")) {
                q = 1;
            } else if (y.equals("II")) {
                q = 2;
            } else if (y.equals("III")) {
                q = 3;
            } else if (y.equals("IV")) {
                q = 4;
            } else if (y.equals("V")) {
                q = 5;
            } else if (y.equals("VI")) {
                q = 6;
            } else if (y.equals("VII")) {
                q = 7;
            } else if (y.equals("VIII")) {
                q = 8;
            } else if (y.equals("IX")) {
                q = 9;
            } else if (y.equals("X")) {
                q = 10;
            }else{
                throw new RuntimeException("Число должно быть от I до X");
            }
        int[] w = new int[2];
            w[0] = z;
            w[1] = q;
        return w;
    }
}