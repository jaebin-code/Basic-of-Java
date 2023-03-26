package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 10;
        if (hour < 14){
            System.out.println("아메리카노");
            System.out.println("샷추가");}
        boolean morning = false;
        if (hour < 14 && !morning){
            System.out.println(("morning coffee"));
        }
        if (hour >12 || !morning){
            System.out.println("not Morning");
        }

    }
}
