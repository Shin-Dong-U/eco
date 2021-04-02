# eco 커뮤니티가 가미 된 친환경 쇼핑몰  
> [Heroku 배포링크](https://eco-friends-mall.herokuapp.com/)
- 개선해야할 사항: React부분 병함, 이미지 경로, 업로드 

## React 사용 부분 링크 (미니게임, 차트)
- [미니게임](https://github.com/Leo-ground/ecogame)
- [차트](https://github.com/Leo-ground/reactcharts)

## 프로젝트 모듈별 기능 설명
<details open>
  <summary> 
    <b>장바구니/위시리스트/주문,결제/배송/게임/차트.</b><br>
      <h6>[장바구니]<br>
            *기능<br>
            - 상품상세페이지에서 장바구니 담기 버튼을 통해 해당 상품이 장바구니에 저장됩니다
            - 클릭이벤트 발생시 동일상품번호가 장바구니에 있는지 조회하여 모달창을 통해 존재여부를<br>
              확인하고 장바구니 페이지로 이동할지 계속 쇼핑을 진행할지 선택하게 됩니다.
            - 장바구니에 담기게 되면 네비게이션바에 위치한 장바구니 수량이 업데이트가 됩니다
            - 장바구니페이지에서 해당상품의 수량 조절과 가격계산 기능과 선택상품을 삭제하는<br>
              기능을 구성했습니다.
            - 삭제되거나 구매가 된 상품은 조회가 되지 않게 별도 컬럼을 만들어 삭제,구매되지<br>
              않은 장바구니 상품만 조회할 수 있게 했습니다.
      </h6> 
  </summary>
   <img src=https://github.com/luckyjek/TIL_/blob/main/Java/image/blokTest.jpg>
    <h6>클래스 초기화 블럭이 가장 먼저 수행되어 'static{}'이 화면에 출력된다.<br>
        그 다음에 main메서드가 수행되어 BlokTest인스턴스가 생성되면서 인스턴스 초기화블럭이<br>
        먼저 수행되고, 끝으로 생성자가 수행된다. <br>
        즉, 클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번 만 수행되었지만, <br>
        인스턴스 초기화 블럭은 인스턴스가 생성될 때 마다 수행되었다.
    </h6>
  </div>
</details>

### 프로젝트 전달 사항
2021 02 24 프로젝트 기본 설정 업로드 

* 추가로 필요한 라이브러리가 있다면 pom.xml 추가 해주세요


Todo.

설정 관련
-> transaction 설정
-> spring security 설정
-> xml 설정 완료 후 java 기반으로 변경
