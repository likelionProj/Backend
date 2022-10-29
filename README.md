# Backend

## API 사용 가이드
The app defines following CRUD APIs.

## Code Convention
#### Naming
변수명, 클래스명, 메서드명 -> 영어와 숫자만.
단어와 단어사이는 _(언더바)

한국어 발음표현 X => 영어로 번역해서.. 어려운 단어면 주석으로 표현
약어는 대문자
패키지 -> 소문자 || 클래스 -> 대문자
클래스 이름 명사

#### 카멜표기법
메서드 이름 동사 전치사 시작.

#### Declarations
탑 클래스는 하나만
애너테이션 선언 후 새줄 사용
한줄에 한문장
하나의 선언문은 하나의 변수만
배열에서 대괄호는 타입 뒤에 선언
Long형 값 뒤에는 마지막에 L 붙이기

#### Indentation
탭 네개

#### Braces
줄의 마지막에 중괄호
Else, catch, finally 닫는 중괄호와 같은 줄
한 블럭에 중괄호 무조건 
Line-wrapping
줄바꿈 후 추가 들여쓰기

#### Import 순서
1.	static imports
2.	java.
3.	javax.
4.	org.
5.	net.
6.	8~10을 제외한 com.*
메서드 사이에 빈 줄 삽입

