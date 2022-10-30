// 핸드폰 번호 가리기

import java.util.Arrays;

public class CoverNum {
    static String solution(String phone_number) {
        String answer = "";
        char[] chars = phone_number.toCharArray();

        for (int i = phone_number.length()-1; i >= 0; i--) {
            if (i < phone_number.length() - 4) {
                chars[i] = '*';
            }
        }

        answer = String.valueOf(chars);

        return answer;
    }

    static String solution2(String phone_number) {
        char[] ch = phone_number.toCharArray();     // char 배열로 변환
        for(int i = 0; i < ch.length - 4; i ++){    // length - 4 까지 *로 변환
            ch[i] = '*';
        }
        return String.valueOf(ch);                  // char 배열을 String 타입을 변환 후 리턴
    }

    static String solution3(String phone_number) {
        // 정규식 전방 탐색
        // . -> 임의의 문자 한 개
        // (?=.) -> 뒷쪽에 임의의 문자 한 개를 제외하고 선택
        // {숫자} -> 숫자 만큼의 자릿수
        // .(?=.{4}) ==> 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한 개 선택
        return phone_number.replaceAll(".(?=.{4})", "*");
    }

    static String solution4(String phone_number) {
        // substring 사용
        String answer = "";
        for (int i = 0; i < phone_number.length() - 4; i++)
            answer += "*";
        answer += phone_number.substring(phone_number.length() - 4);

        return answer;
    }

    static String solution5(String phone_number) {
         // StringBuilder 사용
        int size = phone_number.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size-4; i++){
            sb.append("*");
        }
        sb.append(phone_number.substring(size-4, size));
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));

    }
}
