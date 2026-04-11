package chap_14;

import java.io.File;

public class _08_DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt"); // 삭제할 파일 객체 생성
        if (file.exists()) { // 파일  존재 여부 확인
            if (file.delete()) { // 삭제에 성공하면 true, 실패하면 false 반환
                System.out.println("파일 삭제 성공: " + file.getName());
            } else {
                System.out.println("파일 삭제 실패: " + file.getName());
            }
        }
        // 파일이 존재하지 않으면, 아무 작업도 하지 않음

       File folder = new File("A");
/*        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공: " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패: " + folder.getAbsolutePath());
            }
        }*/

         if (deleteFolder(folder)) {
            System.out.println("폴더 삭제 성공: " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 삭제 실패: " + folder.getAbsolutePath());
        }
    }
    // 폴더와 그 안의 내용을 모두 삭제하는 메서드
    public static boolean deleteFolder(File folder) {
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                deleteFolder(file); // 재귀 호출
            }
        }
        System.out.println("삭제 대상: " + folder.getAbsolutePath());
        return folder.delete();
    }
}
