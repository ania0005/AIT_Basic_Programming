package ait.exeption;

public class ExeptionsApp {
    public static void main(String[] args) throws IllegalAccessException {
        int a = 0;
        int b = 0;
        try {
            int x = solution(a, b);
            System.out.println("Solution = " + x);
        } catch (SolutionAnyNumberExeption e) {
//            e.printStackTrace();
            System.out.println("Solution any number");
            return;
        } catch (NoSolutionExeption e) {
            System.out.println(e.getMessage());
            return;
        } finally {
            System.out.println("Bye, bye");
        }
        System.out.println("Math is great!");
    }

    public static int solution(int a, int b) throws NoSolutionExeption {
        if (a == 0 && b != 0) {
            throw new NoSolutionExeption("No Solution");
        }
        if (a == 0 && b == 0) {
            throw new SolutionAnyNumberExeption("Solution any number");
        }
        int res = b / a;
        return res;
    }

}
