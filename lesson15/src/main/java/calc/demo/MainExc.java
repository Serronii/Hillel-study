package calc.demo;

import java.io.IOException;

public class MainExc {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    public static int getNumber(){
        try {
           getExeption();
            return 2;
        } catch(IOException e){
            System.out.println(e.getMessage());
            return 3;
        }
        finally { //файнели главнее чем ретерн который перед этим, оно всегда выведет последним файнели+
            return 5;
        }
    }

    public static void getExeption() throws IOException {
    throw new IOException("Exception is here ");
    }
}
