package chap_08;

public class _03_Return {
    // 호텔 전화번호를 반환하는 메서드
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678"; // 전화번호를 phoneNumber 변수에 저장
        return phoneNumber; // return으로 phoneNumber 변수 값을 반환
    }

    // 호텔 주소를 반환하는 메서드
    public static String getAddress() {
        return "서울시 어딘가"; // 변수에 저장하지 않고 값을 바로 반환
    }

    // 호텔 액티비티 정보를 반환하는 메서드
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        // getPhoneNumber 메서드의 반환값을 contactNumber 변수에 저장
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호: " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소: " + address);

        // 반환값을 변수에 저장하지 않고 바로 사용
        System.out.println("호텔 액티비티: " + getActivities());



    }

}
