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
<div><h5 align="center" > 전생에 자바 창시자 『제임스 고슬링』이였던 내가, <br>인생 2회차를 시작하니 『Hello World』를 출력하라고?! (何に？！) </h5>
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
            <td width="200">제가 현존하는 최고 자바머신이 되지 않을까요?</td>
            <td width="200"> 아이디어뱅크 그 자체입니다.<br>은행 잔고는 없지만요.ㅎ;</td>
        </tr>
    </tbody>
</table>

## 프로젝트 소개

#### 프로젝트 이름

기사(knight)식당(restaurant)에 오신걸 환영합니다.
- 프로젝트 지속기간: 2023.10.24-2023.10.30
- 개발 언어: <img src="https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white" />
- 프로젝트 노션: <td><a href="https://coordinated-spice-157.notion.site/2-Hello-World-11aa4c40170f41c7be809d4867470485?pvs=4">클릭시 이동합니다.</a></td>
#### 개요
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
아직 안넣음