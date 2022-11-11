// 가운데 글자 가져오기
// 단어 s의 가운데 글자를 반환하는 메서드작성, 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

public class GetMiddleLetter {
    static String mySolution(String s) {
        //--단어 s의 가운데 글자를 반환하는 메서드--//

        String answer = "";
        int middle = (s.length()) / 2;

        if (s.length() % 2 == 0) {      // s의 길이가 짝수라면
            answer = s.substring(middle - 1, middle + 1);
        } else {                        // s의 길이가 홀수라면
            answer = s.substring(middle, middle + 1);
        }

        return answer;
    }

    static String solution1(String s) {
        return s.substring((s.length()-1) / 2, s.length()/2 + 1);
    }
    public static void main(String[] args) {
        System.out.println(mySolution("abcde"));        // result : "c"
        System.out.println(mySolution("qwer"));         // result : "we"
    }
}
