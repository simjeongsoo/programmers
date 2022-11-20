// 같은 숫자는 싫어

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class RemoveSameNum {

    static int[] solution1(int[] arr) {
        // return 해야할 배열의 크기를 알 수 없기 때문에 ArrayList 생성
        ArrayList<Integer> answer = new ArrayList<>();
        int preValue = -1;

        for (int data : arr) {
            if (data != preValue) {
                answer.add(data);
                preValue = data;
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    static int[] solution2(int []arr) {
        // LinkedList 로 풀이
        LinkedList<Integer> list = new LinkedList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {  // i = 1 부터
            if (arr[i] != list.getLast()) {     // list.getLast()로 비교
                list.add(arr[i]);
            }
        }

        Integer[] listing = list.toArray(new Integer[list.size()]);
        return Arrays.stream(listing).mapToInt(Integer::intValue).toArray();
        // 리스트 순회하면서 배열에 넣는게 속도가 빠름
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        System.out.println(Arrays.toString(solution2(arr1)));
        System.out.println(Arrays.toString(solution2(arr2)));
    }
}
