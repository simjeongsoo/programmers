// Lv1.짝수와 홀수

public class EvenOrOdd {

    static String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else return "Odd";
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(solution(num));
    }
}