package chap_06;

public class _03_Return {
    public static String getPhoneNumber(){
        String phoneNumber = "010-1234-5678";
        return phoneNumber;
    }

    public static String getAdress(){
        return "seoul";
    }

    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println(contactNumber);
        String location = getAdress();
        System.out.println(location);
    }
}
