package appendix_02;

import java.util.ArrayList;

class Task {
    public String title;
    public String category;
    public boolean isCompleted;
    public Task(String title, String category, boolean isCompleted) {
        this.title = title;
        this.category = category;
        this.isCompleted = isCompleted;
    }
}
public class _Quiz_a2 {
    public static void main(String[] args) {
        ArrayList<Task> todoList = new ArrayList<>();
        todoList.add(new Task("자바 강의 듣기", "공부", true));
        todoList.add(new Task("이메일 회신하기", "업무", false));
        todoList.add(new Task("운동하기", "개인", false));
        todoList.add(new Task("주간 보고서 작성", "업무", false));
        todoList.add(new Task("알고리즘 문제 풀기", "공부", false));
        todoList.add(new Task("팀 미팅 준비", "업무", true));
        System.out.println("--- 미완료된 업무 목록 ---");
        todoList.stream()
                .filter(task -> task.category.equals("업무"))
        .filter(task -> !task.isCompleted)
        .forEach(task -> System.out.println("- " + task.title));
    }
}
