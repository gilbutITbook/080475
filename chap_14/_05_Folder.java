package chap_14;

import java.io.File;

public class _05_Folder {
    public static void main(String[] args) {
        //String folderName = "A"; // 만들고 싶은 폴더 이름
        String folderName = "A/B/C";
        File folder = new File(folderName); // 폴더를 대표하는 File 객체 생성
        //folder.mkdir(); // 폴더 생성
        folder.mkdirs(); // 상위 폴더까지 한 번에 생성
        if (folder.exists()) { // 폴더 생성 여부 확인
            System.out.println("폴더 생성에 성공했습니다.");
            System.out.println("폴더 위치: " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성에 실패했습니다.");
        }
    }
}
