// 자릿수 더하기
public class AddDigits {
    //--String 변환--//
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);

        for (int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(s.substring(i, i + 1));
        }
        return answer;
    }
    
    //--정수 나눗셈--//
    public int solution2(int n) {
        int answer = 0;

        while(n > 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    //--Math 이용--//
    public int solution3(int n) {
        int answer = 0;
        int len = (int)Math.log10(n)+1;
        for(int i = 0; i < len; i++) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        AddDigits s = new AddDigits();

        System.out.println(s.solution(123));
        System.out.println(s.solution2(123));
        System.out.println(s.solution3(123));

    }
}
