package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {
        run(new HashSet<>()); //HashSet: 입력한 순서를 보장하지 않는다. O(1)
        run(new LinkedHashSet<>()); //LinkedHashSet: 입력한 순서를 정확히 보장한다. O(1)
        run(new TreeSet<>()); //TreeSet: 데이터 값을 기준으로 정렬한다. O(logN)
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
