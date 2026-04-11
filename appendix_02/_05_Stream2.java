package appendix_02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _05_Stream2 {
    public static void main(String[] args) {
/*        int[] scores = {100, 95, 90, 85, 80};
        Arrays.stream(scores)
            .filter(x -> x >= 90)
            .forEach(x -> System.out.println(x));

        long count = Arrays.stream(scores) // 90점 이상인 학생 수
                .filter(x -> x >= 90)
                .count(); // 반환 타입 long
        System.out.println("90점 이상인 학생 수: " + count + "명");
        int sum = Arrays.stream(scores) // 90 점 이상인 점수들의 합
                .filter(x -> x >= 90)
                .sum();
        System.out.println("90점 이상인 학생들의 총점: " + sum + "점");*/

/*        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        System.out.println("c로 시작하는 프로그래밍 언어");
        Arrays.stream(langs)
                .filter(x -> x.startsWith("c"))
                .forEach(System.out::println);
        System.out.println("java라는 글자를 포함하는 언어");
        Arrays.stream(langs)
                .filter(x -> x.contains("java"))
                .forEach(System.out::println);*/

        List<String> langList =
                Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        System.out.println("4글자 이하의 언어를 정렬해 출력");
        langList.stream()
                .filter(x -> x.length() <= 4)
                .sorted()
                .forEach(System.out::println);

        System.out.println("4글자 이하의 언어 중에서 c를 포함하는 언어");
        langList.stream()
                .filter(x -> x.length() <= 4) // 1차 필터: 4글자 이하인가?
                .filter(x -> x.contains("c")) // 2차 필터: c를 포함하는가?
                .forEach(System.out::println);

        System.out.println("4글자 이하의 언어 중에서 c를 포함하는 언어가 있는가?");
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);

        System.out.println("3글자 이하의 언어는 모두 c를 포함하는가?");
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 3)
                .allMatch(x -> x.contains("c"));
        System.out.println(allMatch);

        System.out.println("4글자 이하면서 c를 포함한 언어");
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + "(어려워요)") // 새로운 문자열로 변환
                .forEach(System.out::println);

        System.out.println("c를 포함하는 언어를 대문자로 출력");
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("c를 포함하는 언어를 대문자로 변경해 저장");
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        langListStartsWithC.stream().forEach(System.out::println);

    }
}
