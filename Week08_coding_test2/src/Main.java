class Solution {
    public static StringBuilder sb = new StringBuilder();
    public String solution(int[][] img) {
        String answer = "";
        int N = img.length;

        QuadTree(img, 0, 0, N);
        answer = String.valueOf(sb);

        return answer;
    }

    public static void QuadTree(int[][] img, int x, int y, int size) {
        if(isPossible(img, x, y, size)) {
            sb.append(img[x][y]);
            return;
        }

        int newSize = size / 2;
        sb.append('(');

        QuadTree(img, x, y, newSize);						// 왼쪽 위
        QuadTree(img, x, y + newSize, newSize);				// 오른쪽 위
        QuadTree(img, x + newSize, y, newSize);				// 왼쪽 아래
        QuadTree(img, x + newSize, y + newSize, newSize);	// 오른쪽 아래

        sb.append(')');

    }

    public static boolean isPossible(int[][] img, int x, int y, int size) {
        int value = img[x][y];

        for(int i = x; i < x + size; i++) {
            for(int j = y; j < y + size; j++) {
                if(value != img[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}