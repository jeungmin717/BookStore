# BookStore
2017 2학기 데이터베이스 3번 과제
JSP 웹 프로그래밍과 MySQL 을 사용하여 온라인 서점 구축하기
============

-	MYSQL CASE TOOL을 이용한 DB 스키마 생성 및 relation 사상 (개념설계)

![image](https://user-images.githubusercontent.com/34965935/43259061-f87557f0-910f-11e8-8f17-74dac50b9b0c.png)

![image](https://user-images.githubusercontent.com/34965935/43259068-fc4dae22-910f-11e8-9679-4258b27ed34d.png)
![image](https://user-images.githubusercontent.com/34965935/43259079-039e89e4-9110-11e8-837f-6c990c6db348.png)
![image](https://user-images.githubusercontent.com/34965935/43259090-086273d2-9110-11e8-9abf-f7ddbe6dd3ab.png)
![image](https://user-images.githubusercontent.com/34965935/43259093-0dea5b94-9110-11e8-9c38-dc9304adbb2b.png)
![image](https://user-images.githubusercontent.com/34965935/43259102-146cef72-9110-11e8-9cd1-2846ed1376e9.png)

논리설계
1단계:정규 엔티티 타입
사용하지않았다.

2단계: 약한 엔티티 타입
사용하지않았다.

3단계:1:1 2진 관계
고객테이블과 장바구니 테이블의 1대1 관계를 보면 장바구니 테이블의 기본키인 장바구니번호를 고객테이블의 외래키로 포함시켰다.
또 주문 테이블에 장바구니테이블의 기본키인 장바구니 번호를 외래키로 넣어주었다.

4단계
정규 2진 1:N 관계타입은 사용하지않았다.

5단계 2진 M:N 관계타입
도서와 장바구니 의 관계의 같은경우 M:N 으로 설정하여 주었는데.
이는 CASE 툴을 사용하였을시 basket_has_book 이라는 테이블이 자동적으로
생성이 되었고, 테이블안에 도서의 기본키인 ISBN 과 장바구니의 기본키인 장바구니 번호가 
basket_has_book 테이블의 기본키로 포함되었다. (두개의 외래키가 하나의 기본키가된것으로 볼 수 있다.)
