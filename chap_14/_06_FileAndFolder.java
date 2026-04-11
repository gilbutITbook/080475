package chap_14;

import java.io.File;

public class _06_FileAndFolder {
    public static void main(String[] args) {
        String folderPath = "."; // .은 현재 폴더를 의미
        File fileOrFolder = new File(folderPath); // 경로로 File 객체 생성
        System.out.println("현재 폴더의 전체 경로: " + fileOrFolder.getAbsolutePath());

        System.out.println("\n--- 폴더 내용 목록 ---");
        for (File item : fileOrFolder.listFiles()) {
            System.out.println(item.getName());
        }

        for (File file : fileOrFolder.listFiles()) {
            //System.out.println(item.getName());
            if (file.isFile()) {
                System.out.println("(파일)" + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더)" + file.getName());
            }

        }

    }

}
