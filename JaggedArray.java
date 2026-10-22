class Solution {
    public static int minSum(int[][] arr) {
        if (arr == null || arr.length == 0) return 0;
        int maxC = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > maxC) maxC = arr[i].length;
        }
        int minVert = Integer.MAX_VALUE;
        for (int c = 0; c < maxC; c++) {
            int currentSum = 0;
            for (int row = 0; row < arr.length; row++) {
                if (c < arr[row].length) {
                    currentSum += arr[row][c];
                }
            }
            minVert = Math.min(minVert, currentSum);
        }
        return minVert;
    }

    public static void main(String[] args) {
        int[][] xyz = {{1, 2, 3, 4}, {2, 3, 4}, {3, 5}};
        int x = minSum(xyz);
        System.out.println(x);
    }
}
