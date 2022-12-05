// 최소 직사각형

import java.util.Arrays;

public class MinimumRectangle {

    static void swap(int[][] sizes) {
        int tmp = 0;
        for (int i = 0; i < sizes.length; i++) {
            tmp = Math.max(sizes[i][0], sizes[i][1]);
            sizes[i][1] = Math.min(sizes[i][0], sizes[i][1]);
            sizes[i][0] = tmp;
        }
    }

    static int mySolution(int[][] sizes) {
        int widthMax = sizes[0][0];       // 가로 max
        int verticalMax = sizes[0][1];    // 세로 max

        swap(sizes);    // 가로 = 두 변중 긴부분, 세로 = 두 변중 작은 부분 으로 스왑

        for (int i = 1; i < sizes.length; i++) {
                widthMax = Math.max(widthMax, sizes[i][0]);
                verticalMax = Math.max(verticalMax, sizes[i][1]);
        }

        return widthMax * verticalMax;
    }

    static int solution1(int[][] sizes) {
        int widthMax = 0;
        int verticalMax = 0;

        for (int[] size : sizes) {
            int width = Math.max(size[0], size[1]);
            int vertical = Math.min(size[0], size[1]);

            widthMax = Math.max(widthMax, width);
            verticalMax = Math.max(verticalMax, vertical);
        }
        return widthMax * verticalMax;
    }

    static int solution2(int[][] sizes) {
        return Arrays.stream(sizes).reduce((a, b) -> new int[]{
                Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])), Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))
        }).map(it -> it[0] * it[1]).get();
    }

    public int solution3(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        return length * height;
    }

    public static void main(String[] args) {
        int[][] size1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] size2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] size3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        System.out.println(mySolution(size1));  // result : 40000
        System.out.println(mySolution(size2));  // result : 120
        System.out.println(mySolution(size3));  // result : 133


    }
}
