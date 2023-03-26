package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        int index = 1;
        int max = 15;
        int noShow = 10;
        while(index<=50){
            System.out.println(index+"번 손님 음식 나왔습니다");
            if (index==noShow){
                System.out.println(index+"번 손님 노쇼로 인해 다음 손님께 먼저 드립니다.");
                index++;
                max++;
                continue;
            }
            if (index==max){
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
            index+=1;
        }
    }
}
