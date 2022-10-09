// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는  프로그램
public class SumDivisor {
    public int sumDivisor(int num) {
        int answer = 0;
        for(int i = 1; i <= num/2; i++){    // 주어진 수의 절반까지만 루프를 돌림(최대공약수의 합이 아니라 모든 약수의 합이기때문)
            if(num%i == 0) answer += i;
        }
        return answer+num;
    }

    public static void main(String[] args) {
        SumDivisor c = new SumDivisor();

        System.out.println("result : "+c.sumDivisor(12));
        System.out.println("result : "+c.sumDivisor(5));
    }
}
