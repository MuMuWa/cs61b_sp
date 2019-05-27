public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0, i, sum;
        while (x < 10) {
            sum = 0;
            for(i=0;i<=x;i++){
                sum += i;
            }
            System.out.print(sum + " ");
            x = x + 1;
        }
    }
}