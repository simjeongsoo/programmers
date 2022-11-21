// 이상한 문자 만들기
// 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
// 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
// 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 메서드 작성

public class StringChange {

    static String solution1(String s) {
        // +10
        // StringBuilder 를 사용하는게 성능이 좋음

        String answer = "";
        int cnt = 0;
        String[] split = s.split("");

        for(String value : split) {
            cnt = value.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? value.toLowerCase() : value.toUpperCase();
        }
        return answer;
    }

    static String solution2(String s) {
        String answer = "";
        String[] str = s.split("");
        int idx = 0;                                // 단어 내부 순서 판단할 변수

        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }
        return answer;
    }

    static String solution3(String s) {
        char[] chars = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                idx = 0;
            } else {
                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
            }
        }
        return String.valueOf(chars);
    }

    static String solution4(String s) {
        // 대문자를 세팅하고 소문자로 변환

        String answer;
        answer = s.toUpperCase();
        char[] chars = answer.toCharArray();

        //앞문자가 대문자라면 소문자로 치환
        for (int i = 1; i < chars.length; i++) {
            if (62 <= chars[i - 1] && chars[i - 1] <= 90) {     // 앞의 문자가 대문자라면
                chars[i] = Character.toLowerCase(chars[i]);     // 뒤의 문자는 소문자로 변환
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }


    public static void main(String[] args) {
        /* 예외 테스트 케이스
        * 1. 단어 사이 공백이 여러개
          2. 문자의 시작과 끝에 공백
          3. 단어에 대문자가 섞여있는 경우
        * */
        String s = "  tRy hello  WORLD    ";
        System.out.println(solution4(s));
//        System.out.println(solution3("try hello world"));
//        System.out.println(mySolution("abc abc abc "));
    }
}
