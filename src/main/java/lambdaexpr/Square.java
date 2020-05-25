package lambdaexpr;
@FunctionalInterface
interface DoMath{
    int calculate(int n);

}



public class Square {

    public static void main(String[] args) {
        int a = 5;
        DoMath mat = (int x)->x*x;
        System.out.println(mat.calculate(a));
    }
}
