// 없는 숫자 더하기

import java.util.Arrays;
import java.util.stream.IntStream;

public class AddMissingNum {

    static int mySolution(int[] numbers) {
        int answer = 0;
        int[] reference = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int allSum = Arrays.stream(reference).sum();
        int numSum = Arrays.stream(numbers).sum();

        answer = allSum - numSum;

        return answer;
    }

    static int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }

    static int solution2(int[] numbers) {
        int answer = 0;
        int[] sum = {0,1,2,3,4,5,6,7,8,9};

        for(int i = 0; i< sum.length; i++){
            for(int j=0; j< numbers.length; j++){
                if(sum[i] == numbers[j]){
                    sum[i] -= numbers[j];
                }
            }
            answer += sum[i];
        }
        return answer;
    }

    static int solution3(int[] numbers) {
        return IntStream.rangeClosed(0, 9).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
    }
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] n2 = {5, 8, 4, 0, 6, 7, 9};

        System.out.println(mySolution(n));
        System.out.println(mySolution(n2));
    }
}
