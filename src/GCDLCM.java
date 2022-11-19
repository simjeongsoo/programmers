// 최대공약수와 최소공배수, greatest common divisor & largest common multiple
// 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 메서드 작성
// 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
// 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

import java.util.Arrays;

public class GCDLCM {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else return gcd(y, x % y);
    }

    static int[] mySolution(int n, int m) {
        int gcdNum = gcd(n, m);    // 유클리드 호제법, 최대공약수
        int lcm = (n * m) / gcdNum;   // 최소공배수

        return new int[]{gcdNum, lcm};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mySolution(3, 12)));
        System.out.println(Arrays.toString(mySolution(2, 5)));
    }
}
