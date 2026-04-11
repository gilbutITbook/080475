package chap_09;

public class _Quiz_09 {
    public static void main(String[] args) {
        // ClassSlot 클래스로부터 객체 생성
        ClassSlot slot1 = new ClassSlot("수요일", "09:00", "10:00");
        ClassSlot slot2 = new ClassSlot("목요일", "14:00", "15:00");
        ClassSlot slot3 = new ClassSlot("금요일", "17:00", "18:00");
        System.out.println("--- 보충 수업 가능 시간 ---");
        // 각 객체의 정보 출력
        slot1.displayScheduleInfo(1);
        slot2.displayScheduleInfo(2);
        slot3.displayScheduleInfo(3);
    }
}

class ClassSlot {
    // 인스턴스 변수: 데이터 묶음
    private String day;
    private String startTime;
    private String endTime;
    // 생성자: 객체 생성과 동시에 초기화
    public ClassSlot(String day, String startTime, String endTime) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    // 메서드: 보충 수업 시간 정보 출력 기능
    public void displayScheduleInfo(int index) {
        System.out.println(index + ". " + this.day + " " + this.startTime
                + "~" + this.endTime);
    }

}

class Student {
    String name;
    int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public boolean isPassed() {
        if (score >= 60) {
            return true;
        } else {
            return false;
        }
        // 또는 return score >= 60;
    }
}

