// 행렬의 덧셈

import java.util.Arrays;

public class AddMatrix {

    static int[][] mySolution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        // arr1.length : 행
        // arr1[0].length : 열

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    static int[][] solution1(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = arr1;      // 할당
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                answer[i][j] += arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(mySolution(arr1,arr2)));

        int[][] arr3 = {{1}, {2}};
        int[][] arr4 = {{3}, {4}};
        System.out.println(Arrays.deepToString(mySolution(arr3,arr4)));


    }
}
