// 문자열 내림차순으로 배치하기
// 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 메서드 작성
// s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringDesc {

    static String solution1(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        // 하나의 작업만 처리하는 클래스라면 StringBuffer보단 StringBuilder가 더 빠르다
        StringBuilder stringBuilder = new StringBuilder(new String(chars, 0, chars.length));

        return stringBuilder.reverse().toString();
    }

    static String solution2(String str){
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";       // result : "gfedcbZ"
        System.out.println(solution1(s));

    }
}
