package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("상품명: " + items.get(i).getName() + ", 합계: " + items.get(i).getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    public int calculateTotalPrice() {
        int sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getTotalPrice();
        }
        return sum;
    }
}
