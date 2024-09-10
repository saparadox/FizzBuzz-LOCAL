public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int ans = 0;
        while(i<1000){
            i++;
            if(i%3==0 || i%5==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
