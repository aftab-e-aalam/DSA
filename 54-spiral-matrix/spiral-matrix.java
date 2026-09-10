
class Solution {
    public List<Integer> spiralOrder(int[][] matrix){
  List result = new ArrayList<>();

        int top = 0;                        // Starting row
        int bottom = matrix.length - 1;     // Ending row
        int left = 0;                       // Starting column
        int right = matrix[0].length - 1;   // Ending column

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; 

           
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // Move the bottom boundary upward
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Move the left boundary rightward
            }
        }

       
        return result;
        

    }
}