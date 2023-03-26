package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        int ranking = 3;
        switch (ranking){
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학생 대상 아님");
        }
        int price=7000;
        int grade = 1;
        switch (grade){ // break가 없으면 아래 케이스도 순차적으로 실행
            case 1 :
                price+=1000;
            case 2 :
                price+=1000;
            case 3 :
                price+=1000;
                break;
        }
        System.out.println(price);
    }

}
