package lang.print.gaps.task5;

public class ThreeStuckVars {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 100;
        String result = String.format("%s%s%s", first, second, third);
        System.out.println(result);
    }
}
