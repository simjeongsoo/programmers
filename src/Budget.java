// 예산
// combination algorithm

import java.util.Arrays;

public class Budget {
    static int solution1(int[] d, int budget) {
        int answer = 0;

        // 최대한 많은 부서에 지원해야 하기 때문에 지원 금액이 적은 순으로 정력
        Arrays.sort(d);

        for (int requireBudget : d) {
            // 총 예산이 신청 금액보다 크거나 같으면
            if (requireBudget <= budget) {
                // 총 예산에서 신청 금액 제외
                budget -= requireBudget;
                // 지원부서 카운트
                answer++;

                // 총 예산이 부족한 경우
            } else break;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] d1 = {1, 3, 2, 5, 4};
        int budget1 = 9;

        int[] d2 = {2, 2, 3, 3};
        int budget2 = 10;

        System.out.println(solution1(d1, budget1));        // result : 3
        System.out.println(solution1(d2, budget2));        // result : 4


    }
}
