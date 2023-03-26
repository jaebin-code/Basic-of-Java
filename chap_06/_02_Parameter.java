package chap_06;

public class _02_Parameter {
    public static void power(int x){
        int result  = x * x;
        System.out.println(x+"의 2승은"+result);
    }
    public static void main(String[] args) {
        power(3);
    }
}
