package assignment1;

public class Main
{
    public static void main(String[] args)
    {
//        MyTime.printTimeDifference("0120", "1510");
//        System.out.println();
//        MyTime.printTimeDifference("1635", "0250");

        int [][] m = {{1,2},{3,4}};
        MyMatrix matrix = new MyMatrix(m);
        System.out.println("Before: " + matrix.getMatrix()[0][0]);
        m[0][0] = 100;
        System.out.println("After: " + matrix.getMatrix()[0][0]);

    }
}
