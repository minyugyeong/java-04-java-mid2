package generic.ex5;

public class EraserBox<T> {

    public boolean instanceCheck(Object param) {
        //return param instanceof T; //오류
        // 여기서 T는 런타임에 모두 Object 가 되어버린다.
        // intanceof는 항상 Object와 비교하게 된다. 이렇게 되면 항상 참이 반환되는 문제가 발생하기 때문.
        return false;
    }

    public void create() {
        //return new T(); //오류
        // new T 는 항상 new Object 가 되어버린다.
        // 개발자가 의도한 것과 다르므로 자바는 타입 매개변수에 new 를 허용하지 않는다.
    }
}
