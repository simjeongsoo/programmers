// String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 프로그램

import java.util.Arrays;

public class FindKim {
    static String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break; // search 성공 시 break 로 루프 횟수 줄이기
            }
        }
        return answer;
    }

    static String solution2(String[] seoul) {
        // list로 변경 후 indexOf 메서드 사용
        // indexOf()안에서 for loop 가 돌기 때문에 굳이 해당 배열을 갖는 ArrayList 메모리 할당해서 indexOf쓸 필요 없이 배열 자체 for문 돌리는게 더 효율적
        int index = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + index + "에 있다";
    }
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }
}
