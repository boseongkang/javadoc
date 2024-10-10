package assignment1;

public class MyMatrix
{
    private final int[][] matrix;

    public MyMatrix(int[][] matrix)
    {
        this.matrix = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++)
        {
            this.matrix[i] = matrix[i].clone();
        }
    }

    public int[][]getMatrix()
    {
        return matrix;
    }

    public MyMatrix multiply(MyMatrix other)
    {
        int m = this.matrix.length;
        int n = this.matrix[0].length;
        int p = other.matrix[0].length;
        int[][]result = new int[m][p];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < p; j++)
            {
                for(int k = 0; k < n; k++)
                {
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        return new MyMatrix(result);
    }

}
