package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][]{
                {"a","a1","a2"},
                {"b","b1","b2"},
                {"c","c1","c2"}
        };
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.println(seats[i][j]);

            }

        }
    }
}
