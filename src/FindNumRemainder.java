import java.util.stream.IntStream;

public class FindNumRemainder {

    static int solution(int n) {
        //--매개변수 n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x return--//
        int x = 1;
        while (true) {
            if (n % x != 1) {
                ++x;
            } else break;
        }
        return x;
    }

    static int solution2(int n) {
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
    }
}
