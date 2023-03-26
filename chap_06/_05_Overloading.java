package chap_06;

public class _05_Overloading {
    public static int power(int x){
        int result  = x * x;
        return result;
    }
    public static int power(String x){
        int num=Integer.parseInt(x);
        int result  = num * num;
        return result;
    }
    public static int power(int x, int y){
        int num=1;
        for (int i = 0; i < y; i++) {
            num*=x;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(power(2));
        System.out.println(power("2"));
        System.out.println(power(2,3));
    }
}
