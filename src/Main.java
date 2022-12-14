public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //variables

        //4 integer-based types (whole numbers)

        byte value = 28;                // values range from -128 to 127                    8-bit
        short anotherValue = -15937;    // value range from -32768 to 32767                 16-bit
        int mostPopularValue = 42;      // values range from -2147483648 to 2147483647      32-bit
        long extremelyBigNum = -831L;     // values range from -9quintillion to 9quintillion  64-bit

        //2 real number types (can have decimals)

        float realValue = 3.6f;         // values range from -big to big with ~7 significant digits  32-bit
        double popularRealValue = -324.86245;   //       " " " " with ~15 significant digits         64-bit

        //boolean (true/false)
        boolean lightSwitch = true;     // only values of true or false

        //character data -- a SINGLE character

        char singleCharacter = '#';     // unicode 65535    integers
                                        // 'A' == 65    'a' == 97       '0' == 48
                                        //  0100001       01100001        00110000

        // Strings - collections of information between quotation marks

        String schoolName = "Lubbock High School";


    }
}