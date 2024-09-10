public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int i = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                i++;
                n = n / 2;
            } else {
                i++;
                n--;
            }
        }
        System.out.println(i);
    }
}