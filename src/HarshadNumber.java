import java.util.Arrays;

public class HarshadNumber {
    public static boolean mySolution1(int x) {
        // x의 자릿수의 합으로 x가 나누어 지는 수
        // 18의 자릿수의 합은 1+8=9 이고 , 18은 9로 나누어 떨어진다.
        // 하샤드 수인지 검사하는 함수

        boolean answer = false;
        int sum = 0;
        int tempX = x;
        String s = "" + x;
        int[] tmp = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.length() == 1) {
                return true;
            }
            tmp[i] = tempX % 10;
            tempX /= 10;
        }
        for (int i = 0; i < s.length(); i++) {
            sum += tmp[i];
        }
        if (x % sum == 0) {
            answer = true;
        }

        return answer;
    }

    public static boolean solution1(int x) {
        String[] temp = String.valueOf(x).split("");        // 스트링 타입으로 형변환 후 스트링 배열에 저장

        int sum = 0;

        for (String data : temp) {
            sum += Integer.parseInt(data);                         // 배열요소를 int 형 형변환 후 자릿수 sum
        }

        if (x%sum==0)
            return true;
        else return false;
    }

    private int sum = 0;
    public boolean solution2(int x) {
        Integer.toString(x).chars().forEach(c -> sum += c - '0');
        return x % sum == 0;
    }

    public boolean solution23(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        return x % sum == 0;
    }


    public static void main(String[] args) {
        System.out.println(solution1(10));       //true
        System.out.println(solution1(12));       //true
        System.out.println(solution1(11));       //false
        System.out.println(solution1(13));       //false
    }
}
