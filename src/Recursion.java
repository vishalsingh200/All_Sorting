public class Recursion {
    public static int sumOfNatural(int n){
        if (n == 0)
            return 0;
        return n+sumOfNatural(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNatural(4));
    }
}
