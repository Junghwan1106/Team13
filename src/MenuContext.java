import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuContext {
    private Map<String, List<Menu>> menus;
    private Map<String, List<Item>> menuItems;
    private List<Item> cart;
    private double totalPrice;
    private int orderNumber;
    private List<Order> waitingOrders;
    private List<Order> completedOrders;

    /**             생성자                */
    public MenuContext() {
        menus = new HashMap<>();
        menuItems = new HashMap<>();
        cart = new ArrayList<>();
        totalPrice = 0.0;
        orderNumber = 0;
        waitingOrders = new ArrayList<>();
        completedOrders = new ArrayList<>();

        initializeMenuItems();
    }

    // 메뉴 생성 리스트 추가
    public void initializeMenuItems() {
        addMenus("Main",
                new Menu("메인 요리", "이색 재료들로 만든 푸짐한 한상-! "),
                new Menu("얼음 빙수", "3클래스 마법 아이스에이지로 직접 만든 얼음이라능-! "),
                new Menu("특제 음료", "암흑 주술사가 손수 섞어주는 영양만점 음료라능-! "),
                new Menu("기분 좋아지는 약", "잠시 정신을 이세카이로 보내드립니다.(진지) ")
        );

        addMenus("Order",
                new Menu("주문", "장바구니를 확인 후 주문합니다."),
                new Menu("취소", "진행중인 주문을 취소합니다.")
        );

        addMenuItems("메인 요리",
                new Item("레드오크 허벅다리 스테이크", 6.9, "이거 레드오크 허벅지 살이야,"),
                new Item("그리핀 날개 스테이크", 8.9, "탄력있고 쫀쫀한 스테이크-!"),
                new Item("자이언트 비버 버거", 9.4, "자이언트 비버의 모습을 본딴 햄버거 세트-!"),
                new Item("정령의 전골", 6.9, "데어라:5명의 정령이 들어간.."),
                new Item("드래곤 혓바닥 구이", 5.4, "불맛 최대로 -! ")
        );

        addMenuItems("얼음 빙수",
                new Item("생물학적 죽음", 1.4, "둘이 먹다 하나는 진짜로 죽어버림"),
                new Item("화학적 죽음", 1.0, "원폭의 추억을 느끼게 해드림, 진짜 피폭됨")
        );

        addMenuItems("특제 음료",
                new Item("가스트의 눈물", 1.5, "지옥최고의 울보 가스트(산타가 선물안줌)"),
                new Item("피 땀 눈물", 1.5, "피땀 눈물 내 차가운 숨을")
        );

        addMenuItems("기분 좋아지는 약",
                new Item("이세카이의 트럭 소환", 4.0, "브레이크가 고장난 8t 트럭-! "),
                new Item("메타버스 입장권", 4.0, "고양이 수인 냥냥 넷카마 가능-!")
        );
    }
    // 상품 생성 리스트 추가
    public void addItemToMenu(String menu, Item item) {
        List<Item> menuList = menuItems.get(menu);

        if (menuList == null) {
            menuList = new ArrayList<>();
            menuItems.put(menu, menuList);
        }
        menuList.add(item);
    }
    // 상품 삭제 리스트 추가
    public void deleteItemFromMenu(String menu, Item item) {
        List<Item> menuList = menuItems.get(menu);

        if (menuList != null) {
            menuList.remove(item);
        }
    }

    // 장바구니에 상품 추가
    public void addToCart(Item menuItem) {
        cart.add(menuItem);
        totalPrice += menuItem.getPrice();
    }
    // 장바구니에 상품 삭제
    public void displayCart() {
        for (Item item : cart) {
            System.out.println(item.getName() + " | "
                    + item.getPrice() + " | "
                    + item.getDescription());
        }
    }

    public List<Menu> getMenus(String key) {
        return menus.get(key);
    }

    public List<Item> getMenuItems(String key) {
        return menuItems.get(key);
    }
    public int getOrderNumber() {
        return orderNumber;
    }
    public List<Order> getCompletedOrders() {
        return completedOrders;
    }
    private void addMenus(String key, Menu... menusToAdd) {
        List<Menu> menuList = new ArrayList<>();
        for (Menu menu : menusToAdd) {
            menuList.add(menu);
        }
        menus.put(key, menuList);
    }
    public List<Order> getWaitingOrders() {
        return waitingOrders;
    }
    private void addMenuItems(String key, Item... itemsToAdd) {
        List<Item> itemList = new ArrayList<>();
        for (Item item : itemsToAdd) {
            itemList.add(item);
        }
        menuItems.put(key, itemList);
    }
    public void resetCart() {
        cart.clear();
        totalPrice = 0.0;
    }
    public int generateOrderNumber() {
        orderNumber++;
        return orderNumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    public List<Item> getCart() {
        return cart;
    }
    public void addToCompleteOrder(Order order) {
        // 관리자 페이지에서 주문 처리 완료 후에 싫행
        completedOrders.add(order);
    }
    public void addToWaitingOrder(Order order){
        // 주문 완료 후에 실행
        waitingOrders.add(order);
    }
}