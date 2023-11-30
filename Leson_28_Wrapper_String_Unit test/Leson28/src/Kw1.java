public class Kw1 {
    public static void main(String[] args) {
        String line = "68996 Max 767$£&00043217656£!!78643243.999 ___+";
        System.out.println(getDigits(line));

    }
    public static String getDigits(String source) {
        if(source == null){return null;}

        // вернуть из входящей строки только числа от 0 до 9.
        String res = "";
        for (int i = 0; i < source.length(); i++) {
            char currentChar = source.charAt(i);
            if (currentChar >= '0' && currentChar <= '9') { // 0 1 2 3 ... 9
//                res += currentChar;
                res = res + currentChar;
            }
        }
        return res;
    }


}
