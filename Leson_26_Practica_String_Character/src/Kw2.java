public class Kw2 {
    //Дан текст:
    //
    //Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.);It is one of the most popular programming
    //language in the world; It has a large demand in the current job market; It is easy to learn and simple to use; It is
    //open-source and free; It is secure, fast and powerful; It has a huge community support (tens of millions of developers);
    //Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering
    //development costs; As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa;
    //Необходимо вывести этот текст в консоль (примерно) в таком виде вместе с заголовком Why Use Java?:


    public static void main(String[] args) {
        System.out.println( textOut("Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.);It is one of the most popular programming" +
                "language in the world; It has a large demand in the current job market; It is easy to learn and simple to use; It is" +
                "open-source and free; It is secure, fast and powerful; It has a huge community support (tens of millions of developers);" +
                "Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering" +
                "development costs; As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa;"));
    }


    public static String textOut(String text) {
        String[] textIn = text.split(";");
        String result = "";
        for (int i = 0; i < textIn.length; i++) {
            char pointChar = '\u2022';
            result += pointChar +" " + textIn[i].trim() + '\n';
        }return result.trim();
    }
}
