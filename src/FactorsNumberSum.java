// 약수의 개수와 덧셈
// 두 정수 left와 right가 매개변수로 주어집니다.
// left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하는 메서드 작성

public class FactorsNumberSum {

    static int factorCnt(int num) {
        //--약수개수 구하는 메서드--//
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                ++cnt;
            }
        }
        return cnt;
    }

    static int mySolution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (factorCnt(i) % 2 == 0) {
                answer += i;
            } else {
                answer += (i * -1);
            }
        }
        return answer;
    }

    static int solution1(int left, int right) {
        int answer = 0;

        for (int i = left; i < right; i++) {
            // 제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            // 제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(mySolution(13,17));      // result : 43
        System.out.println(mySolution(24,27));      // result : 52

    }
}
