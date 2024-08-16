package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==단어 입력 단계==");
        Map<String, String> dict = new HashMap<>();

        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q') : ");
            String eng = sc.nextLine();

            if (eng.equals("q")) break;

            System.out.print("한글 뜻을 입력하세요 : ");
            String kor = sc.nextLine();
            dict.put(eng, kor);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q') : ");
            String search = sc.nextLine();

            if (search.equals("q")) break;

            if (!dict.containsKey(search)) {
                System.out.println(search + "은(는) 사전에 없는 단어입니다.");
            } else {
                String result = dict.get(search);
                System.out.println(search + "의 뜻 : " + result);
            }
        }

    }
}
