// 주어진 수가 1이 될 때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측
/*
*   1-1. 입력된 수가 짝수라면 2로 나눕니다.
    1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
    2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
* */

public class CollatzConjecture {

    static int solution(int num) {
        int answer = 0;
        long n = num;
        if (n == 1) {
            return 0;
        }
        do {
            if (n % 2 == 0) {         // 짝수라면
                n /= 2;
            } else {                    // 짝수가 아니라면(홀수)
                n = (n * 3) + 1;
            }
            ++answer;
            if (answer == 500) {
                return -1;
            }
        } while (n != 1);

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
        System.out.println(solution(1));

    }
}
