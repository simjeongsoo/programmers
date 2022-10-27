import java.util.Arrays;

public class NumSpaced {

    static long[] solution(int x, int n){
        //--정수 x와 자연수 n을 입력받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴--//
        long[] answer = new long[n];
        long temp = x;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp;
            temp += x;
        }
        return answer;
    }

    static long[] solution2(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i + 1] + x;
        }

        return answer;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 3)));
        System.out.println(Arrays.toString(solution(-4, 2)));
    }
}
