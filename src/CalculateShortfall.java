// 부족한 금액 계산하기
/*
* 새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다.
* 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
* 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
* 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
* 단, 금액이 부족하지 않으면 0을 return 하세요.
* */
public class CalculateShortfall {
    static long solution1(int price, int money, int count) {
        long answer = 0;
        long totalFee = 0;

        for (long i = 1; i <= count; i++) {
            totalFee += (price * i);
        }

        answer = money - totalFee;

        if (totalFee < money) {
            answer = 0;
        } else {
            answer = Math.abs(answer);
        }

        return answer;
    }

    static long solution2(int price, int money, int count) {
        // 등차수열의 합 공식
        // r(n(n+1))/2
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }

    static long solution3(int price, int money, int count) {
        // 삼항연산자
        long answer = money;

        for (int cnt = 0; cnt < count; cnt++) {
            answer -= ((long) price * (cnt + 1));
        }
        return (answer > 0 ? 0 : -answer);

    }

    static long solution4(int price, int money, int count) {
        // 등차수열의 합 , 삼항연산자
        long answer = -1;
        answer = (long) price * count * (count + 1) / 2 - money;
        return answer <= 0 ? 0 : answer;

    }

    public static void main(String[] args) {
        System.out.println(solution1(3, 20, 4));       // retult : 10
        System.out.println(solution1(3, 30, 4));
    }
}
