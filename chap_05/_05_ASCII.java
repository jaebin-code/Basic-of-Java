package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드(ASCII) : 미국 표준 코드
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        String[][] seats=new String[10][15];
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j]=String.valueOf(c)+(j+1);
            }
            c++;
        }
        System.out.println(seats[0][0]);
    }
}
