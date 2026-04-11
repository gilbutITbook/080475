package chap_08;

public class _Quiz_08 {
    public static void main(String[] args) {
        int totalCost = 50000; // 총 주유 금액
        int pricePerLiter = 1600; // 리터당 휘발유 가격
        double distance = 620; // 총 주행 거리(km)
        // 메서드 호출
        double fuelAmount = calculateFuelAmount(totalCost, pricePerLiter);
        double fuelEfficiency = calculateFuelEfficiency(distance, fuelAmount);
        // 결과 출력
        System.out.println("--- 연비 계산 결과 ---");
        System.out.println("주유 금액: " + totalCost + "원");
        System.out.println("리터당 가격: " + pricePerLiter + "원");
        System.out.println("총 주유량: " + fuelAmount + "L");
        System.out.println("주행 거리: " + distance + "km");
        System.out.println("--------------------");
        System.out.println("연비: " + fuelEfficiency + " km/L");
    }
    // 총 주유량 계산
    public static double calculateFuelAmount(int totalCost, int pricePerLiter) {
        return (double) totalCost / pricePerLiter;
    }
    // 연비 계산
    public static double calculateFuelEfficiency(double distance, double fuelAmount) {
        return distance / fuelAmount;
    }

}
