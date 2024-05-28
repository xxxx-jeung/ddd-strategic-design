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

### 공통

| 한글명 | 영문명        | 설명                                  |
|-----|------------|-------------------------------------|
| 비속어 | purgomalum | 사회적으로 부적절하거나 무례하게 여겨지는 단어나 표현을 말한다. |

## 모델링

### 상품
- `product` 속성
  - `product price`와 `product name`이 있다. 
- `product` 행동
  - `product price`가 비어있으면 등록할 수 없다.
  - `product price`가 0원 이상이어야 한다.
  - `product price`를 변경할 수 있다.
  - `product price`가 변경되면 `menu`에 영향이 간다.
    - `product price` > `menu product total price` = `menu status` -> `unavailable menu`
  - `product list`는 한 개 이상의 모음을 조회한다.
  - `product name`에 `purgomalum`가 포함될 수 없다.
  - `product name`가 비어있으면 등록할 수 없다.

### 메뉴 그룹
- `menu group` 속성
  - `menu group name`이 있다
- `menu group` 행동
  - `menu group name`이 비어있으면 등록할 수 없다. 
  - `menu group name`에 `purgomalum`가 포함될 수 없다.
  - `menu group list`는 한 개 이상의 모음을 조회한다.

### 메뉴
- `menu` 속성
  - `menu name`, `menu price`가 있다.
  - `menu status`에서 상태는 `unavailable menu`, `available menu`가 존재한다.
  - `menu product`와 `menu group`이 있다. 
- `menu` 행동
  - `menu`를 등록할 수 있다.
  - `menu group`에 속해있어야 한다.
  - `menu name`가 비어있으면 등록할 수 없다.
  - `menu name`에 `purgomalum`가 포함될 수 없다.
  - `menu status`는 `available menu`와 `unavailable menu`가 존재한다.
  - `menu status`는 최초 등록시 `available menu`이다.
  - `menu status`를 `available menu` 설정 할 수 있다.
  - `menu status`를 `unavailable menu` 설정 할 수 있다.
  - `menu product`를 1개 이상 등록해야 한다.
  - `menu product quantity`을 1개 이상 입력해야 한다.
  - `menu price`가 비어있으면 등록할 수 없다.
  - `menu price`가 0원 이상이어야 한다.
  - `menu product total price`는 `menu price` 보다 높아야 한다.
    - `menu product total price` > `menu price` = `menu status` -> `available menu`
  - `menu prodcut`는 `menu`에 등록할 수 있다.
    - `product`를 `menu`에 등록한다.
  - `menu product list`를 조회할 수 있다.
  - `menu product quantity`는 `menu`에 등록된 `product`의 수량을 입력해야 한다.  
  - `menu product total price`는 `menu`에 등록된 `product price`의 총 합을 조회할 수 있다. 

### 주문 테이블
- `order table` 속성
  - `order table name`이 있다.
  - `order table guest count`가 있다.
  - `order table status`의 상태는 `empty table`와 `occupied table`가 존재한다. 
- `order table` 행동
  - `order table list` 조회할 수 있다.
  - `order table name` 을 등록해야 한다.
  - `order table name` 비어있으면 안된다.
  - `order table guest count`는 초기에 0명이다.
  - `order table guest count`는 음수일 수 없다.
  - `order table guest count`는 손님이 있으면 `occupied table` 없으면 `empty table`이어야 한다..
  - `order table status`는 손님이 없을 경우 `empty table`이며 손님이 있으면 `occupied table` 상태이다.

### 주문
- `order` 속성
  - `order type`는 `DELIVERY`,`TAKEOUT`,`EAT_IN` 있다.
  - `order status`는 `WAITING`, `ACCEPTED`, `SERVED`, `DELIVERING`, `DELIVERED`, `COMPLETED` 있다.
  - `delivery address`와 `delivery agency` 있다.
- `order` 행동
  - `order`를 요청을 받으면 `order status`의 `WAITING` 상태를 가진다.
  - `order`를 요청을 수락하면 `order status`의 `ACCEPTED` 상태를 가진다.
  - `order type`은 `DELIVERY` 이다.
    - `call delivery agency`는 `delivery agency`를 호출한다.
    - `delivery agency`에게 메뉴를 주면 `delivery address` 가진다. 
    - `delivery agency`에게 메뉴를 주면 `order status`는 `SERVED` 상태를 가진다. 
    - `order status`는 배달중일 때  `DELIVERING` 상태를 가진다.
    - `order status`는 배달 완료일 때  `DELIVERED` 상태를 가진다.
    - `order status`는  `DELIVERED`일 때 `COMPLETED`를 가질 수 있다.
  - `order type`은 `TAKEOUT` 이다.
    - `order status`는 메뉴가 손님에게 전달될 때 `SERVED` 상태를 가진다.
    - `order status`는 메뉴를 손님이 가져갈 때 `COMPLETED` 상태를 가진다.
  - `order type`은 `EAT_IN` 이다.
    - `order status`는 메뉴가 손님에게 전달될 때 `SERVED` 상태를 가진다.
    - `order status`는 메뉴를 손님이 가져갈 때 `COMPLETED` 상태를 가진다.
