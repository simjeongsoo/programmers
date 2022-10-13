// 문자열 내 p와 y의 개수

public class StringSearch {
    static boolean solution(String s) {
        char[] arr = s.toCharArray();
        boolean answer = false;
        int cntp = 0;               // p의 개수
        int cnty = 0;               // y의 개수

        for (int i = 0; i < s.length(); i++) {
            if (arr[i]  == (char)112 || arr[i] == (char)80) {
                cntp++;
            }
            if (arr[i] == (char)121 || arr[i] == (char)89) {
                cnty++;
            }
        }
        if (cntp == cnty) {
            return true;
        }
        return answer;
    }

    boolean solution2(String s) {
        s = s.toUpperCase();            // 대문자 변환

        return s.chars().filter( data -> 'P'== data).count() == s.chars().filter( data -> 'Y'== data).count();
    }

    boolean solution3(String s) {
        s = s.toLowerCase();            // 소문자 변환
        int count = 0;                  // 증감으로 변수 하나만 사용

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
    }

    boolean solution4(String s) {
        // 정규식 사용

        return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0 ? true : false;
    }


    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));    // true
        System.out.println(solution("Pyy"));        // false
    }
}
