// 문자열을 정수로 바꾸기

public class StringToInt {

    static int solution(String s) {
        int temp = 0;
        temp = Integer.parseInt(s);

        return temp;
    }

    static int solution2(String str){
        boolean Sign = true;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '-')
                Sign = false;
            else if (ch != '+')
                result = result * 10 + (ch - '0');      //
        }
        return Sign ? 1 : -1 * result;
    }

    public static void main(String[] args) {

//        System.out.println(solution("-1234"));
        System.out.println(solution2("-1234"));

    }
}
