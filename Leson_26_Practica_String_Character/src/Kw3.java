public class Kw3 {

    //Вырезать из текста полное предложение, которое начинается с It (до .)
    //Проверить, начинается ли текст с Java is a high-level - новый метод - startsWith().
    //Проверить, заканчивается ли текст подстрокой wikipedia - новый метод - endsWith().
    public static void main(String[] args) {

        textEdition("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation" +
                "dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run" +
                "anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to" +
                "recompile. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM)" +
                "regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level" +
                "facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code" +
                "modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most" +
                "popular programming languages in use according to GitHub, particularly for client–server web" +
                "applications, with a reported 9 million developers.Java was originally developed by James Gosling at Sun Microsystems. It was released in May 1995 as a core component of" +
                "Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class" +
                "libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the" +
                "specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GPL-2.0-only" +
                "license. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the" +
                "OpenJDK JVM which is free open-source software and used by most developers and is the default JVM for almost all Linux" +
                "distributions. As of September 2023, Java 21 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS)" +
                "versions. Quelle: wikipedia");

    }
    public static void textEdition(String text) {
        String[] arrText = text.split("\\.");
        for (int i = 0; i < arrText.length; i++) {
            String currentLine = arrText[i].trim();
                    String[] arrText1 = currentLine.split(" ");
            if ( arrText1[0].equals("It"))
                    System.out.println(arrText[i]);
                }
            }
        }




       // substring(int beginIndex, int endIndex)

//
//    }
//    public static void texts (String text){
//        String [] arrText = text.split(".");
//        for (int i = 0; i < arrText.length; i++) {
//           String [] arrText1 = arrText[i].split(" ");
//           for (int j = 0; j < arrText1.length; j++) {
//               if(arrText1[j] == "It" && arrText1[j] == "."){
//        }
//    }
//
//
