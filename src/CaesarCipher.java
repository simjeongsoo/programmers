// 시저암호
// 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.

public class CaesarCipher {

    static String solution1(String s, int n) {
        // isUpperCase 사용
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isUpperCase(c)) {
                answer.append(c + n <= 'Z' ? (char) (c + n) : (char) (c + n - 26));
            } else if (Character.isLowerCase(c)) {
                answer.append(c + n <= 'z' ? (char) (c + n) : (char) (c + n - 26));
            } else {
                answer.append(c);
            }
        }

        return answer.toString();
    }

    public String solution2(String s, int _n) {
        // 람다식, 스트림 풀이
        return s.chars().map(c -> {
                    int n = _n % 26;
                    if (c >= 'a' && c <= 'z') {
                        return 'a' + (c - 'a' + n) % 26;
                    } else if (c >= 'A' && c <= 'Z') {
                        return 'A' + (c - 'A' + n) % 26;
                    } else {
                        return c;
                    }
                }).mapToObj(c -> String.valueOf((char)c))
                .reduce((a, b) -> a + b).orElse("");
    }

    static String solution3(String s, int n) {
        // 나머지 연산 사용
        String result = "";
        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(solution1("AB", 1));
        System.out.println(solution1("z", 1));
        System.out.println(solution1("a B z", 4));
        System.out.println(solution1("P", 15)); // E

    }
}
