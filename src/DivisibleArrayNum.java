import java.util.Arrays;

/* 나누어 떨어지는 숫자 배열
* array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수 작성
* divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환
* */
public class DivisibleArrayNum {
    static int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        int[] noSearch = {-1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arr[cnt++] = arr[i];
            }
        }
        if (cnt == 0) {
            return noSearch;
        }
        int[] answer = Arrays.copyOf(arr, cnt);
        Arrays.sort(answer);
        return answer;
    }

    static int[] solution2(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if (answer.length == 0) answer = new int[]{-1};
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        int[] given1 = {9, 5, 7, 10};
        int[] given2 = {2, 36, 1, 3};
        int[] given3 = {3, 2, 6};


        System.out.println(Arrays.toString(solution2(given1, 5)));
        System.out.println(Arrays.toString(solution2(given2, 1)));
        System.out.println(Arrays.toString(solution2(given3, 10)));


    }
}
