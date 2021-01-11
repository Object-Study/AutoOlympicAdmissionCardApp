# OlympicPlatform-SpringBootVer
## 개요
책 <오브젝트>를 공부한 내용을 적용하기 위해 2018 평창 동계 올림픽 때 봉사자로 일했던 친구의 생생한 경험담을 바탕으로 올림픽에 관계된 다양한 사람들의 편의를 고려한 앱을 문제로 정의함. SpringBootVer의 경우 BasicJavaVer와 달리 객체지향보단 앱의 현실성과 기술적 고려에 좀더 비중을 둔 코드를 기술한다.<br><br>
## 이용 대상자
관객, 봉사자, 근무자, 선수 및 코치진, 기자, 방송 관계자<br>
##### *관객을 제외한 모든 올림픽 관계자는 올림픽 주최 측에서 데이터베이스로 인적 정보를 관리하고 있다고 가정하며, 고유한 바코드를 통해 각종 게이트 출입, (봉사자의 경우)봉사 시간 입력에 이용할 수 있다.*<br><br>
## 기능 명세
1. 앱 초기 실행 시 "티켓 예매", "예매한 티켓 조회", "주변 시설 둘러보기", "로그인/로그아웃(관객 외 관계자만 이용 가능)", "내 정보 조회(관객 외 관계자만 이용 가능)" 를 실행할 수 있는 메인 목록 화면이 나온다.

2. 티켓 예매<br>
티켓 예매 기능은 다음과 같은 절차로 이뤄진다.<br>
1)메인 화면에서 예매 메뉴를 누른다.<br>
2)예매 가능한 경기 조회 및 선택<br>
3)인원, 특성(아동/성인 등) 및 좌석 선택<br>
4)카드 결제(롯데월드처럼 카드별로 다양한 할인 정책이 있음)<br>

3. 예매한 티켓 조회<br>
아래와 같은 티켓을 화면에 띄워준다. 티켓의 QR 코드를 통해 경기장 게이트 입장이 가능하다.<br>
![image](https://user-images.githubusercontent.com/48075848/104144713-bdc15380-5407-11eb-836e-8b3a983ae63a.png)
<br>

4. 주변 시설 둘러보기<br>
경기장 주변 숙소 및 편의 시설을 안내해준다.<br>
단, 이를 사용자의 현위치를 기반으로 할지, 장소 검색 기반으로 할지 정하지 않음.<br>

5. 로그인/로그아웃(관객 외 관계자만 이용 가능)<br>
이름, 생년월일, 번호 인증을 거치면 로그아웃 버튼을 직접 누르지 않는 한 영구 로그인이 가능하다. 로그인 시 입력한 정보를 통해 주최 측 데이터베이스에 등록된 사람인지 검사하여 등록된 사람이면 로그인 성공, 아니면 불가<br>

6. 내 정보 조회(관객 외 관계자만 이용 가능)<br>
고유 바코드, 회원 프로필 사진, 역할, 이름이 기재된 출입증 정보가 화면에 그대로 나온다.<br><br>

## 구현의 어려움을 겪고 있는 issue
- 예매 기능의 좌석 선택 부분: 총체적으로 모르겠다.
