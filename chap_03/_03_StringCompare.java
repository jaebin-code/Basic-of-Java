package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용 비교
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 비교

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1==s2); // false (참조) -> 메모리 값 주소가 같은지 참조
    }
}
