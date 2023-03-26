package chap_06;

public class _04_ParameterAndReturn {
    public static int power(int x){
        int result  = x * x;
        return result;
    }

    public static void main(String[] args) {
        int result = power(2);
        System.out.println(result);
    }
}
