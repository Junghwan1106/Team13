<img src="https://capsule-render.vercel.app/api?type=waving&color=FFFF&height=200&section=header&text=&fontSize=25" />

<div align="center">
<img src="https://github.com/Junghwan1106/LevelByThree/blob/main/spartasvg%20(1).png?raw=true"/></a>
</div>
<div align="center">
<h2>KIOSK TEAM PROJECT</h2>
</div>

### 목차
- [팀 소개](#팀-소개)
- [프로젝트 소개](#프로젝트-소개)
- [기능 구현에 대한 기술](#기능-구현에-대한-기술)

## 팀 소개
#### 팀 이름
<div><h3 align="center" > 전생에 자바 창시자 『제임스 고슬링』이였던 내가, <br>인생 2회차를 시작하니 『Hello World』를 출력하라고?! (何に？！) </h3>
<h5 align="left"> 팀 멤버 </h5>
</div>

<table align=center>
    <thead>
        <tr >
            <th style="text-align:center;" >박정환</th>
            <th style="text-align:center;" >우성현</th>
            <th style="text-align:center;" >이지선</th>
            <th style="text-align:center;" >오수식</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><img width="200" src="https://camo.githubusercontent.com/88959f3d8f8714b7cd6b82dc0926d7d52753f97a6e7e6f8e572203e679614d6e/68747470733a2f2f76656c6f672e76656c63646e2e636f6d2f696d616765732f746974616e69756d6469616e612f706f73742f65333732623539322d313565302d346161622d613462382d3233653832633763386637322f2545312538342538392545312538352542332545312538362541462545312538342539312545312538352542332545312538362541422545312538342538352545312538352541452545312538342539312545312538352542352e706e67"/> </td>
            <td><img width="200" src="https://i.namu.wiki/i/bXgZeqfJlt_GqEDqXbddCQ2kMaehRv6xHiAyOqeWErKWglicEP9doafEMhkzuzUgycm98zOKdwN9kViY3YwBeMS809VX6BD1Cmr6cnQ00SPmGOmuTUl_E75wjGO1AKBvD0v9oX9SQYWrR8lraLADCA.webp" /></td>
            <td><img width="200" src="https://i.pinimg.com/originals/53/de/70/53de70172685637e8d9a094928ad4f4b.png" /></td>
            <td><img width="200" src="https://item.kakaocdn.net/do/c6711410690de98cb3caa81418dbfb929f5287469802eca457586a25a096fd31" /></td>
        </tr>
        <tr>
            <td><a href="https://github.com/Junghwan1106">@Junghwan1106</a></td>
            <td><a href="https://github.com/sungpal">@sungpal</a></td>
            <td><a href="https://github.com/jiisuniui">@jiisuniui</a></td>
            <td><a href="https://github.com/susik2023">@susik2023</a></td>
        </tr>
        <tr>
            <td width="200">웃으면서 밝게 지내는 걸 좋아합니다. <br>협업시 항상 웃는 모습으로 !</td>
            <td width="200">코드로 세상을 바꾸고 싶습니다. <br>like 제임스 고슬링</td>
            <td width="200">간바레(がんばれ！) 응원담당이자,<br>현존하는 최고 자바머신이 되지 않을까요?</td>
            <td width="200"> 아이디어뱅크 그 자체입니다.<br>은행 잔고는 없지만요.ㅎ;</td>
        </tr>
    </tbody>
</table>

## 프로젝트 소개

### 프로젝트 이름

기사(knight)식당(restaurant)에 오신걸 환영합니다.
- 프로젝트 지속기간: 2023.10.24-2023.10.30
- 개발 언어: <img src="https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white" />
- 프로젝트 노션: <td><a href="https://coordinated-spice-157.notion.site/2-Hello-World-11aa4c40170f41c7be809d4867470485?pvs=4">클릭시 이동합니다.</a></td>
### 개요
음식점에서 주문할 때 사용하는 키오스크를 구현한 프로젝트입니다.<br>
고객이 원하는 메뉴를 주문하고 해당 주문을 취소할 수 있도록 하였습니다.<br>
또한, 해당 주문에 대해 완료가 되었는지 여부와 최근 완료가 된 주문을 볼 수 있습니다.


관리자 페이지를 만들어 주문에 대해 음식점 측에서 해야 할 역할 수행합니다.<br>
각 주문 별로 주문을 완료하고, 정렬하여 보여주며, 상품 메뉴를 추가 및 삭제합니다.

### 프로젝트의 기능 요구 사항
1. 상점은 메뉴와 상품을 가진다.
2. 메뉴는 메뉴명과 메뉴설명 그리고 여러개의 상품을 가진다.
3. 상품은 상품명과 상품설명 그리고 가격을 가진다.
4. 주문은 주문상품 목록과 수량 그리고 총가격을 가진다.
5. 고객은 상점의 키오스크 프로그램을 통해 상품 주문을 하고 대기번호를 받는다.

        - 주문 현황
            - 맨 위에 완료된 최근주문 3개를 출력한다.
            - 그 아래에 대기중인 모든 주문 목록을 출력한다.
        - 주문 화면
            - + 주문시 요청사항 메시지를 입력할 수 있습니다. (20자 제한)
6. 상점은 키오스크 관리 프로그램을 통해 아래와 같은 메뉴를 가진다.

                - “1. 대기주문 목록”
                - “2. 완료주문 목록”
                - “3. 상품 생성”
                - “4. 상품 삭제”
7. 대기주문 목록
   - 주문이 완료되어 처리 대기중인 주문을 조회하고 완료처리 할 수 있다.
   - 주문 데이터 형식은 아래와 같다.

              **[ 주문 데이터 ]**

                1. 대기 번호
                2. 주문 상품 목록
                3. 주문 총 가격
                4. 요청 사항
                5. 주문 일시

                   날짜는 ISO 8601 형식으로
                   조합된 UTC 날짜 및 시간
                   예) 2016-10-27T17:13:40+00:00

8. 완료 주문목록

            - 완료처리 했던 주문들을 모두 조회할 수 있다.
            - **[ 완료주문 데이터 ]**는 **[ 주문 데이터 ]**에 완료 일시를 추가로 가진다.
            - **[ 완료주문 데이터 ]**
                1. 대기 번호
                2. 주문 상품 목록
                3. 주문 총 가격
                4. 주문 일시
                5. 요청 사항
                6. 완료주문 일시

                   날짜는 ISO 8601 형식으로
                   조합된 UTC 날짜 및 시간
                   예) 2016-10-27T17:13:40+00:00
9. 메뉴와 상품을 등록/삭제하고 주문을 수신/완료한다.

        - 3. 상품 생성
            - 새로운 상품정보(메뉴, 이름, 설명, 가격)을 입력하여 생성할 수 있다.
            - 기존에 없는 메뉴라면 신규로 생성해준다.
            - 새로 생성된 메뉴와 상품은 각각 유일한 메뉴ID, 상품ID 식별자를 가진다.
        - 4. 상품 삭제
            - 상품ID를 가지고 기존 상품정보를 삭제할 수 있다.
            - 삭제이전에 주문된 주문정보에서는 삭제 되지 않는다.

## 기능 구현에 대한 기술
### 1. SOLID 원칙
SOLID 원칙은 객체 지향 프로그래밍과 설계를 할 때 지켜야 할 원칙<br>

해당 프로젝트에서 적용한 원칙은 다음과 같습니다.<br>
#### Single Responsibility Principle : 각 메소드는 하나의 기능을 수행한다.
displayAdminMenu() : 관리자 메뉴를 표시, 사용자 입력을 처리

        // 관리자 메뉴를 표시하고 사용자 입력을 처리하는 메소드
        public void displayAdminMenu() {
            //...
        }

#### Open-Closed Principle : 개방-폐쇄 원칙에 따라 확장에 열려있고, 수정에 대해 닫혀있다.
MenuContext.class : 새로운 아이템이 추가되거나 삭제될 때는 addItemToMenu() 또는 deleteItemFromMenu 메서드만을 활용해서 확장

        // 새로운 아이템을 추가하는 메소드
        public void addItemToMenu(String category, Item item) {
            //...
        }

        // 아이템을 삭제하는 메소드
        public void deleteItemFromMenu(String category, Item item) {
            //...
        }

#### Liskov Substitution Principle : 부모 객체와 이를 상속한 자식 객체가 있을 때 부모 객체를 호출하는 동작에서 자식 객체가 부모 객체를 완전히 대체할 수 있다.
Menu.class :기본적인 메뉴 아이템에 대한 정보를 가지고 있음.
Item.class : Menu.class를 상속해서 추가적인 가격 정보를 가짐.

        public class Item extends Menu {
            /...
        }
#### Dependency Injection : 외부에서 생성된 객체를 주입받아 사용한다.
Ex) MenuContext.class : 생성자를 통해 Menu.class를 주입받아 사용 (의존성 주입)

        public AdminMenuHandler(MenuContext menuContext) {
            this.menuContext = menuContext;
            this.scanner = new Scanner(System.in);
        }

### 2. List Collection
#### List Collection을 사용한 이유
* 객체 타입의 다중배열이 아닌 List Collection을 활용하였습니다.<br/>
    * 다중배열을 사용하게 되면 index처리를 하게 되면서 가독성이 떨어지게 되므로 List를 선택했습니다.<br/>
    * 객체 타입의 다중 배열을 사용할 경우, 변수를 선언할 때 크기를 지정해야 하므로 확장성이 떨어진다는 단점이 있습니다.<br/>

```java
public class MenuContext {

	private Map<String, List<Menu>> menus;
	private Map<String, List<Item>> menuItems;
	private List<Item> cart;
	private double totalPrice;
	private int orderNumber;
	private List<Order> waitingOrders; // add - 대기 주문 상품
	private List<Order> completedOrders; // add - 완료된 주문 상품
	private String requestContent;
  
}  
```

* 장바구니, 대기 주문 목록, 완료 처리된 목록을 List 타입의 변수를 선언하였습니다.<br/><br/>
    * Item Class 타입의 객체를 장바구니 List에 담으면 Cart에 저장이 됩니다.<br/>
    * 장바구니에 있는 상품을 주문하게 되면 새로운 new Order 클래스 타입의 order 객체를 생성합니다.<br/>
* 생성된 order 객체의 멤버변수인 orderItems List에 장바구니의 요소들을 담습니다. <br/><br/>
  ```java
    private static void setWaitingOrder(String request) {
        Order order = new Order();
        Date now = new Date();
    
        // List의 깊은 복사
        List<Item> it = new ArrayList<>();
        for(Item its : menuContext.getCart()){
          it.add(its);
    }
    
        order.setOrderItems(it);
        order.setTotalPrice(menuContext.getTotalPrice());
        order.setRequestContent(request); //요청 사항
        order.setOrderDate(now);
        order.generateOrderCnt();
        order.setOrderNum(menuContext.getOrderNumber());
        menuContext.addToWaitingOrder(order);
    }
  ```
  * ***이때 깊은 복사(Deep Copy)를 하여 장바구니의 요소들의 값이 변해도 orderItems 내용은 변하지 않도록 합니다.*** <br/>
  * waitingOrders에 생성된 order 객체를 요소로 add 시켜 해당 주문을 대기 중인 주문 목록에 추가합니다. <br/>

### 3. 날짜는 ISO 8601 형식으로 조합된 UTC 날짜 및 시간
  ```java
    Date date = selectedOrder.getOrderDate();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:XXX");
    sdf.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
    String dateString = sdf.format(date);
    System.out.println("주문 일시: " + dateString);
  ```
* Date 객체를 생성하여 해당 객체를 SimpleDateFormat 객체에 담습니다.<br/>
* SimpleDateFormat 객체의 format 메소드를 사용하여 날짜를 ISO 8601 형식으로 변환합니다.<br/>
* 변환된 날짜를 출력합니다.<br/>
* 이때, 날짜를 출력할 때는 SimpleDateFormat 객체의 setTimezone 메소드를 사용하여 한국 시간대로 설정합니다.***<br/>
* 이렇게 함으로써, 날짜를 출력할 때 한국 시간대로 출력이 되어 사용자가 보기에 편리합니다.***<br/>
* ***또한, 날짜를 출력할 때는 Date 객체를 사용하지 않고, LocalDateTime 객체를 사용하여 출력할 수도 있습니다.***<br/>
  ```java
    LocalDateTime localDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss:XXX");
    String formattedString = localDateTime.format(formatter);
    System.out.println("주문 일시: " + formattedString);
  ```
### 4. Tread.sleep() 메소드
* Thread.sleep() 메소드는 현재 실행중인 스레드를 지정된 시간동안 멈추게 합니다.<br/>
* 해당 메소드를 사용한 이유는 주문이 완료되었을 때, 3초간 멈추게 하여 사용자가 주문이 완료되었음을 확인할 수 있도록 하기 위함입니다.<br/>
  ```java
    public static void completeOrder() {
        System.out.println("주문이 완료되었습니다.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
  ```

### 환경설정
Language : Java 11 <br>
IDLE : IntelliJ <br>
JDK : 17.0.8.1 LTS