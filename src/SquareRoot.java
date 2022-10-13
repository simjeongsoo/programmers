public class SquareRoot {

    public static long solution(long n) {
        // 제곱근 판별
        long answer = -1;
        long number = (long) Math.sqrt(n);

        if (Math.pow(number, 2) == n) {
            answer = (long) Math.pow(number, 2);
        }
        return answer;
    }

    public static long solution2(long n) {
        long answer = 0;

        for (long i = 0; i * i <= n; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
            } else answer = -1;
        }
        return answer;

    }

    public static long solution3(long n) {
        if (Math.pow((int) Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
    }
    public static long solution4(long n) {
        double i = Math.sqrt(n); // n의 제곱근 i

        return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1; // i가 내림한 결과와 i가 같다면 소수점이 없으므로 제곱근
    }

    public static void main(String[] args) {

//        System.out.println(solution(121));
        System.out.println(solution4(4));
        System.out.println(solution4(3));
        System.out.println(solution4(121));
        System.out.println(solution4(64));

    }
}
