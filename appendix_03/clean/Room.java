package appendix_03.clean;

public class Room {
    public int number = 1; // 청소할 방 번호(1부터 시작)
    public synchronized void clean(String name) {
        System.out.println(name + ": " + number + "번방 청소 중");
        number++;
    }
}
