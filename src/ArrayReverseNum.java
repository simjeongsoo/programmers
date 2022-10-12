import java.util.Arrays;

public class ArrayReverseNum {
    //--자연수 뒤집어 배열로 만들기--//
    public int[] arrayReverseNum(long n) {
        int cnt = 0;
        long temp = n;

        while (temp > 0) {
            cnt++;
            if (temp / 10 == 0)
                break;
            temp = temp / 10;
        }

        int[] answer = new int[cnt];

        int i = 0;
        while (n > 0) {
            answer[i] = (int) (n % 10);
            n = n / 10;
            i++;
        }
        return answer;
    }

    public int[] solution2(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
        return answer;
    }

    public int[] solution3(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

    public int[] solution4(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split("");

        int[] answer = new int[ss.length];
        for (int i=0; i<ss.length; i++) {
            answer[i] = Integer.parseInt(ss[i]);
        }
        return answer;
    }

    public int[] solution5(long n) {
        int length = Long.toString(n).length();
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        ArrayReverseNum s = new ArrayReverseNum();

        System.out.println(Arrays.toString(s.arrayReverseNum(12345)));
    }
}
