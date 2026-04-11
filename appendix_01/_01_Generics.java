package appendix_01;

public class _01_Generics {
    public static void main(String[] args) {
        // 각기 다른 타입의 배열 3개 준비
/*        int[] iArray = {1, 2, 3, 4, 5};
        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};
        printIntArray(iArray);    // 정수 배열 출력
        printDoubleArray(dArray); // 실수 배열 출력
        printStringArray(sArray); // 문자열 배열 출력*/

        // 각기 다른 타입의 배열 3개 준비
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};
        // 어떤 타입의 배열이든 하나의 메서드로 처리
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }
/*    // Integer 배열을 전달받아 내용을 출력
    private static void printIntArray(int[] iArray) {
        for (int i : iArray) {         // 배열에 담긴 값을 하나씩 꺼내
            System.out.print(i + " "); // 출력하고 한 칸 띄우기
        }
        System.out.println();          // 마지막에 줄바꿈
    }
    // Double 배열을 전달받아 내용을 출력
    private static void printDoubleArray(double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
    // String 배열을 전달받아 내용을 출력
    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }*/

    // 어떤 타입이든 처리할 수 있는 제네릭 메서드
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }


}
