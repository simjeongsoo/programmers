// [1차] 비밀지도

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class SecretMap {

    static String[] mySolution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        int[][] map1 = new int[n][n];
        int[][] map2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                map1[i][j] = arr1[i] % 2;
                arr1[i] /= 2;
                map2[i][j] = arr2[i] % 2;
                arr2[i] /= 2;
            }
        }

        for (int i = 0; i < n; i++) {
            String tmpS = "";
            for (int j = 0; j < n; j++) {
                if (map1[i][j] == 1 || map2[i][j] == 1) {
                    tmpS += "#";
                } else tmpS += " ";
            }
            answer[i] = tmpS;
        }
        return answer;
    }

    static String[] solution1(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            // arr1 과 arr2 의 요소를 or 연산 후 toBinaryString()메서드로 2진수 변환
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
        return answer;
    }

    static String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String temp;

        for(int i = 0 ; i < n ; i++){
            // "%" + n + "s" 보다 속도 향상
            temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
            temp = temp.substring(temp.length() - n);

            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }

        return answer;
    }


    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(Arrays.deepToString(solution1(n, arr1, arr2)));
    }

}
