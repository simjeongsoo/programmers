// 정수 내림차순으로 배치하기

import java.util.*;

public class ReverseInt {
    static long solution(long n) {

        String s = Long.toString(n);                // String 타입으로 변환
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));                  // list에 charAt() 으로 요소 담음
        }

        list.sort(Comparator.reverseOrder());       // 내림차순 정렬

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            temp += list.get(i);                    // String 타입으로 형변환
        }

        return Long.parseLong(temp);                // long 타입으로 형변환 후 리턴
    }


    String s = "";
    public int solution2(int n) {
        s = "";
        Integer.toString(n).chars().sorted().forEach(c -> s = Character.valueOf((char) c) + s);
        return Integer.parseInt(s);

    }

    public long solution3(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);                              // 오름차순 정렬

        StringBuilder sb = new StringBuilder();         // StringBuilder 를 사용하여 숫자 뒤집기
        for (String aList : list)
            sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(solution(118373));

        ReverseInt reverseInt = new ReverseInt();
        System.out.println(reverseInt.solution2(118373));
    }
}
