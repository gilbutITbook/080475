package chap_09;

public class _SelfCheck_09 {
    public static void main(String[] args) {
        // 학생 객체 생성
        Student student1 = new Student("김민수", 75);
        Student student2 = new Student("최지연", 58);
        // 결과 출력
        System.out.println(student1.name + " 님 합격 여부: " + student1.isPassed());
        System.out.println(student2.name + " 님 합격 여부: " + student2.isPassed());
    }
    }

