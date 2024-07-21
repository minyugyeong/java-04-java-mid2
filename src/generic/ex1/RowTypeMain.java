package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); //<> 을 지정하지 않으면 row type 또는 원시 타입이라고 한다.
        //GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
