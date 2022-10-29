// 두 정수 사이의 합

public class SumTwoInt {
    static long solution(int a, int b) {
        int num = Math.abs(a - b);
        long answer = 0;

        if (a > b) {
            answer = a;
            for (int i = 0; i < num; i++) {
                answer += --a;
            }
        } else {
            answer = b;
            for (int i = 0; i < num; i++) {
                answer += --b;
            }
        }
        return answer;
    }

    static long solution2(int a, int b) {
        // 등차수열의 합으로 풀이
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }
    static long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }

    static long solution3(int a, int b) {
        // for 문 안에 3항식
        long answer = 0;
        for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) {
            answer += i;
        }
        return answer;
    }

    static long solution4(int a, int b) {
        long answer = 0;

        if (a > b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        return answer;
    }

    static long solution5(int a, int b) {
        long answer = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }
        return answer;
    }

    static long solution6(int a, int b) {
        long answer = 0;

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3,5));
        System.out.println(solution(5,3));
        System.out.println(solution(3,3));
    }
}
