// 내적
// 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다.
// a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

import java.util.Arrays;
import java.util.stream.IntStream;

public class DotProduct {
    static int mySolution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

    static int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        System.out.println(mySolution(a, b));

        System.out.println();

        int[] a2 = {-1, 0, 1};
        int[] b2 = {1, 0, -1};
        System.out.println(mySolution(a2, b2));
    }
}
