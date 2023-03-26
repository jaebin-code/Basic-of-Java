package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 2;
        do{
            System.out.println("발차기");
            move+=3;
        }while(move+height<distance);
        System.out.println("도착");
    }
}
