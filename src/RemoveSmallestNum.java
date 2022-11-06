//--제일 작은 수 제거하기--//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveSmallestNum {
    static int[] solution(int[] arr) {
        //--정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수
        // 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴--//

        int[] answer = Arrays.stream(arr).filter(data -> data != Arrays.stream(arr).min().getAsInt()).toArray();
        if (arr.length <= 1) answer = new int[]{-1};
        return answer;
    }

    static int[] solution2(int[] arr) {
        //--index search--//
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length-1];
        int minIndex=0;

        for(int i=0;i<arr.length;i++){
            if(arr[minIndex]>arr[i]){
                minIndex = i;
            }
        }
        for(int i=minIndex+1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        for(int i=0;i<answer.length;i++){
            answer[i] = arr[i];
        }
        return answer;
    }

    static int[] solution3(int[] arr) {
        //--List, stream , sort--//
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Arrays.sort(arr);
        list.remove(list.indexOf(arr[0]));
        if (list.size() <= 0) return new int[]{-1};
        return list.stream().mapToInt(i->i).toArray();
    }

    public int[] solution4(int[] arr) {
        //--ArrayList, Arrays, Collections--//
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        } else {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int a : arr) {
                arrayList.add(a);                           // list 에 배열 값 담음
            }
            Integer minimum = Collections.min(arrayList);   // min 값 search
            arrayList.remove(minimum);                      // remove min
            int[] resultArray = new int[arr.length - 1];    // min 값을 뺀 요소를 담을 배열 선언
            for (int i = 0; i < arrayList.size(); ++i) {
                resultArray[i] = arrayList.get(i);          // copy
            }
            return resultArray;
        }
    }

    public static void main(String[] args) {
        int[] given = {4,3,2,1};        // 4,3,2
        int[] given2 = {10};            // -1
        System.out.println(Arrays.toString(solution(given)));
        System.out.println(Arrays.toString(solution(given2)));

    }
}
