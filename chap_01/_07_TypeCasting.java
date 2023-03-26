package chap_01;

import java.sql.SQLOutput;

public class _07_TypeCasting {
    public static void main(String[] args) {
        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double)score);

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        double d = Double.parseDouble("98.8");


    }
}
