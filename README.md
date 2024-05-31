# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항

### 상품

- 상품을 등록할 수 있다.
- 상품의 가격이 올바르지 않으면 등록할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 이름이 올바르지 않으면 등록할 수 없다.
    - 상품의 이름에는 비속어가 포함될 수 없다.
- 상품의 가격을 변경할 수 있다.
- 상품의 가격이 올바르지 않으면 변경할 수 없다.
    - 상품의 가격은 0원 이상이어야 한다.
- 상품의 가격이 변경될 때 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 크면 메뉴가 숨겨진다.
- 상품의 목록을 조회할 수 있다.

### 메뉴 그룹

- 메뉴 그룹을 등록할 수 있다.
- 메뉴 그룹의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴 그룹의 이름은 비워 둘 수 없다.
- 메뉴 그룹의 목록을 조회할 수 있다.

### 메뉴

- 1 개 이상의 등록된 상품으로 메뉴를 등록할 수 있다.
- 상품이 없으면 등록할 수 없다.
- 메뉴에 속한 상품의 수량은 0 이상이어야 한다.
- 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴는 특정 메뉴 그룹에 속해야 한다.
- 메뉴의 이름이 올바르지 않으면 등록할 수 없다.
    - 메뉴의 이름에는 비속어가 포함될 수 없다.
- 메뉴의 가격을 변경할 수 있다.
- 메뉴의 가격이 올바르지 않으면 변경할 수 없다.
    - 메뉴의 가격은 0원 이상이어야 한다.
- 메뉴에 속한 상품 금액의 합은 메뉴의 가격보다 크거나 같아야 한다.
- 메뉴를 노출할 수 있다.
- 메뉴의 가격이 메뉴에 속한 상품 금액의 합보다 높을 경우 메뉴를 노출할 수 없다.
- 메뉴를 숨길 수 있다.
- 메뉴의 목록을 조회할 수 있다.

### 주문 테이블

- 주문 테이블을 등록할 수 있다.
- 주문 테이블의 이름이 올바르지 않으면 등록할 수 없다.
    - 주문 테이블의 이름은 비워 둘 수 없다.
- 빈 테이블을 해지할 수 있다.
- 빈 테이블로 설정할 수 있다.
- 완료되지 않은 주문이 있는 주문 테이블은 빈 테이블로 설정할 수 없다.
- 방문한 손님 수를 변경할 수 있다.
- 방문한 손님 수가 올바르지 않으면 변경할 수 없다.
    - 방문한 손님 수는 0 이상이어야 한다.
- 빈 테이블은 방문한 손님 수를 변경할 수 없다.
- 주문 테이블의 목록을 조회할 수 있다.

### 주문

- 1개 이상의 등록된 메뉴로 배달 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 포장 주문을 등록할 수 있다.
- 1개 이상의 등록된 메뉴로 매장 주문을 등록할 수 있다.
- 주문 유형이 올바르지 않으면 등록할 수 없다.
- 메뉴가 없으면 등록할 수 없다.
- 매장 주문은 주문 항목의 수량이 0 미만일 수 있다.
- 매장 주문을 제외한 주문의 경우 주문 항목의 수량은 0 이상이어야 한다.
- 배달 주소가 올바르지 않으면 배달 주문을 등록할 수 없다.
    - 배달 주소는 비워 둘 수 없다.
- 빈 테이블에는 매장 주문을 등록할 수 없다.
- 숨겨진 메뉴는 주문할 수 없다.
- 주문한 메뉴의 가격은 실제 메뉴 가격과 일치해야 한다.
- 주문을 접수한다.
- 접수 대기 중인 주문만 접수할 수 있다.
- 배달 주문을 접수되면 배달 대행사를 호출한다.
- 주문을 서빙한다.
- 접수된 주문만 서빙할 수 있다.
- 주문을 배달한다.
- 배달 주문만 배달할 수 있다.
- 서빙된 주문만 배달할 수 있다.
- 주문을 배달 완료한다.
- 배달 중인 주문만 배달 완료할 수 있다.
- 주문을 완료한다.
- 배달 주문의 경우 배달 완료된 주문만 완료할 수 있다.
- 포장 및 매장 주문의 경우 서빙된 주문만 완료할 수 있다.
- 주문 테이블의 모든 매장 주문이 완료되면 빈 테이블로 설정한다.
- 완료되지 않은 매장 주문이 있는 주문 테이블은 빈 테이블로 설정하지 않는다.
- 주문 목록을 조회할 수 있다.

## 용어 사전

### 상품

| 한글명   | 영문명           | 설명                                   |
|-------|---------------|--------------------------------------|
| 상품    | product       | 상품의 가격, 이름, 상태 등 정보가 한 곳에 모여 상품을 의미함 |
| 상품 가격 | product price | 상품의 가격                               |
| 상품 이름 | product name  | 상품의 이름 (이름은 비속어가 포함 될 수 없다.)         |
| 상품 목록 | product list  | 한 개 이상의 상품 모음이다.                     |

### 메뉴 그룹

| 한글명      | 영문명             | 설명                              |
|----------|-----------------|---------------------------------|
| 메뉴 그룹    | menu group      | 한 개 이상의 메뉴의 모음이다.               |
| 메뉴 그룹 이름 | menu group name | 메뉴 그룹의 이름 (이름은 비속어가 포함 될 수 없다.) |
| 메뉴 그룹 목록 | menu group list | 한 개 이상의 메뉴 그룹 모음이다.             |

### 메뉴

| 한글명        | 영문명                      | 설명                                       |
|------------|--------------------------|------------------------------------------|
| 메뉴         | menu                     | 손님이 주문할 수 있는 상품이다. 메뉴의 이름, 가격, 상태 등이 있다. |
| 메뉴 이름      | menu name                | 메뉴의 이름 (이름은 비속어가 포함 될 수 없다.)             |
| 메뉴 가격      | menu price               | 메뉴의 가격                                   |
| 메뉴 목록      | menu list                | 한 개 이상의 메뉴의 모음이다.                        |
| 메뉴 상태      | menu status              | 메뉴가 노출되거나 숨겨진 상태를 의미한다.                  |
| 숨겨진 메뉴     | unavailable menu         | 손님에게 노출되지 않은 메뉴이다.                       |
| 판매중인 메뉴    | available menu           | 손님이 주문할 수 있는 메뉴이다.                       |
| 메뉴 상품      | menu product             | 메뉴에 등록된 상품이다.                            |
| 메뉴 상품 목록   | menu product list        | 한 개 이상의 메뉴 상품의 모음이다.                     |
| 메뉴 상품 수량   | menu product quantity    | 메뉴에 등록된 상품의 수량을 의미한다.                    |
| 메뉴 상품 총 가격 | menu product total price | 메뉴를 구성하는 상품 가격의 총 합이다.                   |

### 주문 테이블

| 한글명       | 영문명                     | 설명                                                   |
|-----------|-------------------------|------------------------------------------------------|
| 주문 테이블    | order table             | 손님들이 매장에서 주문한 메뉴를 식사 하는 테이블로 이름, 손님 수, 상태 등 정보를 가진다. |
| 주문 테이블 목록 | order table list        | 한 개 이상의 주문 테이블의 모음이다.                                |
| 주문 테이블 이름 | order table name        | 주문 테이블의 이름                                           |
| 주문 테이블 인원 | order table guest count | 주문 테이블에 앉아 있는 손님의 수다.                                |
| 주문 테이블 상태 | order table status      | 손님의 이용 여부로 빈 테이블과 이용중인 테이블이 있다.                      |
| 빈 테이블     | empty table             | 손님이 없는 테이블                                           |
| 이용중인 테이블  | occupied table          | 손님이 앉아있는 테이블                                         |

### 주문

| 한글명        | 영문명                    | 설명                                                                                                                     |
|------------|------------------------|------------------------------------------------------------------------------------------------------------------------|
| 주문         | order                  | 손님이 매장에 메뉴를 요청하는 것이다. 주문의 유형, 상태, 가격, 주소 등 정보가 한 곳에 모여있는 것을 의미한다.                                                      |
| 주문 메뉴 가격   | order menu price       | 손님이 주문한 메뉴의 가격                                                                                                         |
| 주문 메뉴 총 가격 | order menu total price | 손님이 주문한 메뉴의 총 가격                                                                                                       |
| 주문 유형      | order type             | 손님이 메뉴를 요청하는 방식이다. 손님이 주문 유형을 선택할 수 있다.                                                                                |
| 배달         | DELIVERY               | 손님이 원거리에 있는 식당에서 메뉴를 주문하고, 이를 배달 기사가 손님이 입력한 주소지까지 전달해줄때 이를 배달이라 한다. <br/> 주문 접수 대기 -> 접수 -> 서빙 -> 배달 중 -> 배달 완료 -> 완료 |
| 포장         | TAKEOUT                | 손님이 주문한 메뉴를 가지고 식당을 떠날 경우 이를 포장이라 한다. <br/> 주문 접수 대기 -> 접수 -> 서빙 -> 완료                                                 |
| 매장내주문      | EAT_IN                 | 손님이 매장내에서 식사를 할 경우 이것을 매장내 주문이라고 한다. <br/> 주문 접수 대기 -> 접수 -> 서빙 -> 완료                                                  |
| 주문 상태      | order status           | 손님이 메뉴를 주문한 후 진행되는 과정이다.                                                                                               |
| 주문 접수 대기   | WAITING                | 손님이 메뉴를 주문한 상태이고, 가게에서 접수하기 이전 상태이다.                                                                                   |
| 접수         | ACCEPTED               | 가게에서 주문을 승낙한 상태이다.                                                                                                     |
| 서빙         | SERVED                 | 메뉴가 준비된 상태이다.                                                                                                          |
| 배달중        | DELIVERING             | 배달 기사가 손님이 입력한 주소지로 메뉴를 전달하는 중이다.                                                                                      |
| 배달 완료      | DELIVERED              | 배달 기사가 손님이 입력한 주소지로 전달을 완료한 상태이다.                                                                                      |
| 완료         | COMPLETED              | 메뉴가 손님에게 전달된 상태이다.                                                                                                     |
| 배달 주소      | delivery address       | 배달 주문 메뉴를 전달할 주소지이다.                                                                                                   |
| 배달 대행사     | delivery agency        | 배달을 요청한 손님에게 메뉴를 전달해주는 역할이다.                                                                                           |
| 배달 대행 호출   | call delivery agency   | 손님의 주문 메뉴와 배달 주소를 배달 대행사에 전달하는 것이다.                                                                                    |
| 주문 목록      | order menu             | 손님이 주문한 메뉴를 확인할 수 있다.                                                                                                  |
| 주문 시간      | order date time        | 손님이 주문한 시간을 확인할 수 있다.                                                                                                  |
| 주문 메뉴 항목   | order menu item        | 손님이 주문한 메뉴 항목을 확인할 수 있다.                                                                                               |

### 공통

| 한글명 | 영문명        | 설명                                  |
|-----|------------|-------------------------------------|
| 비속어 | purgomalum | 사회적으로 부적절하거나 무례하게 여겨지는 단어나 표현을 말한다. |

## 모델링

### 상품

- `product` 속성
    - `product price`와 `product name`이 있다.
- `product` 행동
    - `product`을 등록한다.
        - `product name`는 비어있거나 공백일 수 없다.
        - `purgomalum`가 포함될 수 없다.
        - `product price`는 비어있거나 공백일 수 없다.
        - `product price`는 음수 일 수 없다.
    - `product price`를 변경한다.
        - `product price`는 비어있거나 공백일 수 없다.
        - `product price`는 음수 일 수 없다.
    - `product price`가 변경되면 `menu`에 영향이 간다.
        - `product price` > `menu product total price` = `menu status` -> `unavailable menu`
    - `product list`는 한 개 이상의 모음을 조회한다.

### 메뉴 그룹

- `menu group` 속성
    - `menu group name`이 있다
- `menu group` 행동
    - `menu group`을 등록한다.
        - `menu group name`이 비어있거나 공백일 수 없다.
        - `purgomalum`가 포함될 수 없다.
    - `menu group list`는 한 개 이상의 모음을 조회한다.

### 메뉴

- `menu` 속성
    - `menu name`과 `menu price`가 있다.
    - `menu products`가 있다.
        - `menu products`는 여러개의 `menu product`가 들어있다.
    - `menu group`이 있다.
        - `menu`는 `menu group`에 속해있다.
    - `menu status`가 있다.
        - `unavailable menu`와 `available menu`로 나뉜다.
- `menu` 행동
    - `menu`를 등록한다.
        - `menu name`가 비어있거나 공백일 수 없다.
        - `menu name`에 `purgomalum`가 포함될 수 없다.
        - `menu price`는 비어있거나 공백일 수 없다.
        - `menu price`는 음수 일 수 없다.
        - `menu status`는 사용자의 요청에 따라 `available menu`, `unavailable menu`가 설정 된다.
        - `menu products`는 `menu product`가 1개 이상 있어야 한다.
        - `menu product total price` > `menu price` 이어야 한다.
    - `menu price`를 수정한다.
        - `menu price`가 비어있거나 공백일 수 없다.
        - `menu price`는 음수 일 수 없다.
        - `menu product total price` > `menu price` 이어야 한다.
    - `menu`를 보여준다.
        - `menu product total price` > `menu price` 이어야 한다.
    - `menu`를 숨긴다.

### 메뉴 상품

- `menu product` 속성
    - `product`를 가지고 있다.
    - `menu product quantity`는 수량이 있다.
- `menu product` 행동
    - `menu product`를 등록한다.
        - `menu product`는 `menu`에 종속되어 있다.
        - `menu`를 등록할 때 `menu product`를 등록할 수 있다.
        - `product`는 비어있을 수 없다.
        - `menu product quantity`는 비어있거나 공백일 수 없다.
        - `menu product quantity`는 0보다 작을 수 없다.
- `menu products` 속성
    - `menu product`를 여러개 갖고 있다.
- `menu products` 행동
    - `menu products`에 `menu product`를 여러개 등록할 수 있다.
        - 비어있거나 존재하지 않는 `menu product`를 등록할 수 없다.
    - `menu products` -> `menu product` -> `menu product price`의 총 합을 조회할 수 있다.
        - `menu product`가 1개 이상 있어야 한다.

### 주문 테이블

- `order table` 속성
    - `order table name`이 있다.
    - `order table guest count`가 있다.
    - `order table status`가 있다.
        - `order table`의 상태를 판별한다.
        - `empty table`와 `occupied table`는 상태를 의미한다.
- `order table` 행동
    - `order table`을 생성한다.
        - `order table name`가 비어있거나 공백일 수 없다.
        - `order table guest count`는 0으로 초기화 한다.
        - `order table status`의 상태는 `empty table`이다.
    - `order table`을 앉는다.
        - `order table guest count`는 1보다 작을 수 없다.
        - `order table status` -> `occupied table` 변경된다.
    - `order table`을 비운다.
        - `order table guest count`는 0값이 된다.
        - `order table status` -> `empty table` 변경된다.
    - `order table`의 인원을 바꾼다.
        - `order table guest count`는 0보다 작을 수 없다.
        - `order table status` -> `empty table` 일 수 없다.
    - `order table`을 전체 조회한다.

### 주문

- `order` 속성
    - `order type`이 있다.
        - `order type`의 상태는 `DELIVERY`,`TAKEOUT`,`EAT_IN` 이다.
    - `order status`가 있다.
        - `order status`의 상태는 `WAITING`, `ACCEPTED`, `SERVED`, `DELIVERING`, `DELIVERED`, `COMPLETED` 이다.
    - `delivery address`가 있다.
    - `order date time`이 있다.
    - `order menu`가 있다.
        - `order menu item`은 `order menu`에 속해있다.
- `order` 행동
    - `order`를 생성한다.
        - `order status` 상태가 있어야 한다.
        - `order menu` 안에 `order menu item`가 1개 이상 있어야 한다.
        - `order type`은 `order`에 따라 지정된다.
        - `order status`는 `WAITING` 이다.
        - `order date time`은 `order`가 들어온 시간이다.

### 배달

- `order` 행동
    - `order`를 수락한다.
        - `order`가 존재해야 한다.
        - `order status`가 `WAITING` 이어야 한다.
        - `order type`은 `DELIVERY` 이어야 한다.
        - `call delivery agency` 한다.
        - `order status`를 `ACCEPTED`로 변경한다.
    - `order`를 서빙한다.
        - `order`가 존재해야 한다.
        - `order status`를 `SERVED`로 변경한다.
    - `order`를 배달한다.
        - `order`가 존재해야 한다.
        - `order type`은 `DELIVERY`가 아니어야 한다.
        - `order status`는 `SERVED`가 아니어야 한다.
        - `call delivery agency` 한다.
        - `order status`를 `DELIVERING`로 변경한다.
    - `order`를 배달 완료 한다.
        - `order`가 존재해야 한다.
        - `order status`는 `DELIVERING`이 아니어야 한다.
        - `order status`를 `DELIVERED`로 변경한다.
    - `order`를 완료한다.
        - `order`가 존재해야 한다.
        - `order type`은 `DELIVERY`이고, `order status`는 `DELIVERED`여야 한다.
        - `order type`은 `COMPLETED`로 변경한다.

### 가져가기

- `order` 행동
    - `order`를 수락한다.
        - `order`가 존재해야 한다.
        - `order status`가 `WAITING` 이어야 한다.
        - `order status`를 `ACCEPTED`로 변경한다.
    - `order`를 서빙한다.
        - `order`가 존재해야 한다.
        - `order status`를 `SERVED`로 변경한다.
    - `order`를 완료한다.
        - `order type`은 `TAKEOUT`여야 한다.
        - `order status`는 `SERVED`가 아니여야 한다.
        - `order type`은 `COMPLETED`로 변경한다.

### 먹고가기

- `order` 행동
    - `order`를 수락한다.
        - `order`가 존재해야 한다.
        - `order status`가 `WAITING` 이어야 한다.
        - `order status`를 `ACCEPTED`로 변경한다.
    - `order`를 서빙한다.
        - `order`가 존재해야 한다.
        - `order status`를 `SERVED`로 변경한다.
    - `order`를 완료한다.
        - `order type`은 `TAKEOUT`여야 한다.
        - `order status`는 `SERVED`가 아니여야 한다.
        - `order type`은 `COMPLETED`로 변경한다.
        - `order table` -> `order table guest count`는 0값이 된다.
        - `order table status` -> `empty table` 변경된다.

### 주문 메뉴

- `order menu` 속성
    - `order menu`는 손님이 주문한 `order menu item`이다
- `order menu` 행동
    - `order menu`에 `order menu item`을 여러개 등록할 수 있다.
        - 비어있거나 존재하지 않는 `order menu item`를 등록할 수 없다.

- `order menu item` 속성
    - `menu`가 있다.
    - `quantity`가 있다.
    - `price`가 있다.
- `order menu item` 행동
    - `order menu item`을 등록한다.
        - `menu` 중 `order menu item` 같은 메뉴가 있어야 한다.
        - `price`는 `menu price`와 같아야 한다.
        - `menu` -> `menu status` -> `available menu` 이어야 한다.
        - `order` -> `order type` -> `EAT_IN` 이거나, `EAT_IN`이 아니어도 `quantity`가 0보다 커야 한다.
