// 3진법 뒤집기

public class TernaryFlip {
    static int mySolution(int n) {
        int answer = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while (n > 0) {
            stringBuilder.append(n % 3);
            n /= 3;
        }

//        int i = Integer.parseInt(stringBuilder.toString()); // 계산 범위 초과
        long parseLong = Long.parseLong(stringBuilder.toString());

        int cnt = 0;
        while (parseLong > 0) {
            answer += (parseLong % 10) * Math.pow(3, cnt++);
            parseLong /= 10;
        }

        return answer;
    }

    static int solution1(int n) {
        String s = "";

        while (n > 0) {
            s += (n % 3);
            n /= 3;
        }

        // Integer.parseInt("string", [n 진수]); : 3진법 -> 10진법 변환 메서드
        return Integer.parseInt(s, 3);
    }

    public static void main(String[] args) {
        System.out.println(solution1(45));         // result : 7
        System.out.println(solution1(125));         // result : 229
        System.out.println(mySolution(78413450));         // result : 110105530

    }
}
