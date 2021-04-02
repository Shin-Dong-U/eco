# eco 커뮤니티가 가미 된 친환경 쇼핑몰  
> [Heroku 배포링크](https://eco-friends-mall.herokuapp.com/)
- 개선해야할 사항: React부분 병함, 이미지 경로, 업로드 

## React 사용 부분 링크 (미니게임, 차트)
- [미니게임](https://github.com/Leo-ground/ecogame)
- [차트](https://github.com/Leo-ground/reactcharts)

## 프로젝트 모듈별 기능 설명
> 장바구니/위시리스트/주문,결제/배송/게임/차트
> <details open>
  <summary> 
    <b>초기화 블럭에는 '클래스 초기화 블럭'과 '인스턴스 초기화 블럭' 2종류가 있다.</b><br>
      <h6>클래스 초기화 블럭 : 클래스가 메모리에 처음 로딩될 때 한 번만 수행<br>
          인스턴스 초기화 블럭 : 생성자와 같이 인스턴스를 생성할 때 마다 수행된다.<br>
          +)생성자 보다 인스턴스 초기화 블럭이 먼저 수행된다는 사실도 기억하자!
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
