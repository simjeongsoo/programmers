// 음양 더하기
/* 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 boolean 배열 signs가 매개변수로 주어집니다.
 실제 정수들의 합을 구하여 return 하는 프로그램 작성 */

import java.util.Arrays;

public class AddAbsoluteSign {

    static int mySolution(int[] absolutes, boolean[] signs) {
        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] *= -1;
            }
//            answer += absolutes[i];
        }
        return Arrays.stream(absolutes).sum();
    }

    static int solution(int[] absolutes, boolean[] signs) {
        //--삼항연산자 사용--//
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            answer += absolutes[i] * (signs[i] ? 1 : -1);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] ab = {4, 7, 12};
        boolean[] sign = {true, false, true};
        int[] ab2 = {1, 2, 3};
        boolean[] sign2 = {false, false, true};

//        System.out.println(mySolution(ab, sign));       // result : 9
//        System.out.println(mySolution(ab2, sign2));     // result : 0

        System.out.println(solution(ab, sign));       // result : 9
        System.out.println(solution(ab2, sign2));     // result : 0

    }
}
