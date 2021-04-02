# eco 커뮤니티가 가미 된 친환경 쇼핑몰  
> [Heroku 배포링크](https://eco-friends-mall.herokuapp.com/)
- 개선해야할 사항: React부분 병함, 이미지 경로, 업로드 

## React 사용 부분 링크 (미니게임, 차트)
- [미니게임](https://github.com/Leo-ground/ecogame)
- [차트](https://github.com/Leo-ground/reactcharts)

## 프로젝트 모듈별 기능 설명
<details close>
  <summary> 
    <b>장바구니/위시리스트/주문,결제/배송/게임/차트.</b>      
  </summary>
   <div>
    <h6>*구현방법<br>
        - 클릭이벤트 발생시 해당 상품의 정보를 Ajax를 통해 JSON형태로 데이터를 송신해 DB에서
        해당 상품번호를 카운트로 조회해서 조건문을 통해 다른 결과가 반환되게 했습니다.<br>
        - 장바구니 이동클릭 이벤트가 발생하면 장바구니 링크를 통해 페이지가 이동할 수 있게
        구성했습니다.<br>
        - 장바구니에 담길 경우 callback함수에 장바구니의 전체 개수를 조회하는 함수를 호출하게
        구성해 갱신할 수 있게 했습니다.<br>
        - REST 방식으로 데이터를 받은 다음 DOM에 추가하는 방식으로 구성했기 때문에
        선택자 선택을 jQuery의 이벤트 위임방법을 사용해 수량 데이터를 받아 DB정보 갱신과
        금액을 계산할 수 있게 구현했습니다.
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
