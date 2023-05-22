## 수강 신청 기능 요구사항
- 과정(Course)은 기수 단위로 여러 개의 강의(Session)를 가질 수 있다.
- 강의는 시작일과 종료일을 가진다.
- 강의는 강의 커버 이미지 정보를 가진다.
- 강의는 무료 강의와 유료 강의로 나뉜다.
- 강의 상태는 준비중, 모집중, 종료 3가지 상태를 가진다.
- 강의 수강신청은 강의 상태가 모집중일 때만 가능하다.
- 강의는 강의 최대 수강 인원을 초과할 수 없다.

## 프로그래밍 요구사항
- DB 테이블 설계 없이 도메인 모델부터 구현한다.
- 도메인 모델은 TDD로 구현한다.
- 단, Service 클래스는 단위 테스트가 없어도 된다.

---

### 구현 목록
- [X] 강의 도메인 만들기