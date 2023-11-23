# 🚀 2단계 - 수강신청(도메인 모델)

# 학습 관리 시스템(LMS)

[넥스트스텝](https://edu.nextstep.camp/)은 재직자를 대상으로 소프트웨어 교육을 진행하는 교육 기관이다.
2018년 교육 사업을 시작했다.
교육 사업을 시작하며 자체적으로 학습 관리 시스템을 개발해 수강생을 모집하고, 컨텐츠를 관리하고 있다.

## 수강 신청 기능 요구사항

- 과정(Course)은 기수 단위로 운영하며, 여러 개의 강의(Session)를 가질 수 있다.
- 강의는 시작일과 종료일을 가진다.
- 강의는 강의 커버 이미지 정보를 가진다.
    - 이미지 크기는 1MB 이하여야 한다.
    - 이미지 타입은 gif, jpg(jpeg 포함),, png, svg만 허용한다.
    - 이미지의 width는 300픽셀, height는 200픽셀 이상이어야 하며, width와 height의 비율은 3:2여야 한다.
- 강의는 무료 강의와 유료 강의로 나뉜다.
    - 무료 강의는 최대 수강 인원 제한이 없다.
    - 유료 강의는 강의 최대 수강 인원을 초과할 수 없다.
    - 유료 강의는 수강생이 결제한 금액과 수강료가 일치할 때 수강 신청이 가능하다.
- 강의 상태는 준비중, 모집중, 종료 3가지 상태를 가진다.
- 강의 수강신청은 강의 상태가 모집중일 때만 가능하다.
- 유료 강의의 경우 결제는 이미 완료한 것으로 가정하고 이후 과정을 구현한다.
    - 결제를 완료한 결제 정보는 payments 모듈을 통해 관리되며, 결제 정보는 Payment 객체에 담겨 반한된다.

## 프로그래밍 요구사항

- DB 테이블 설계 없이 도메인 모델부터 구현한다.
- 도메인 모델은 TDD로 구현한다.
    - 단, Service 클래스는 단위 테스트가 없어도 된다.
- 다음 동영상을 참고해 DB 테이블보다 도메인 모델을 먼저 설계하고 구현한다.

## 구현 목록

### 강의 (Sessiont, List)

* [x] 강의 기간 (Period)
    * [x] 시작일 (startDate)
    * [x] 종료일 (endDate)
    * [x] 시작일은 종료일 이후 일 수 없다
* [x] 커버 이미지 (Thumbnail)
    * [x] 크기 (volume)
        * [x] 1MB 이하이다
    * [x] 타입 (extension)
        * [x] gif, jpg, jpeg, png, svg 만 허용한다
    * [x] 크기 (size)
        * [x] 가로 (width)
            * [x] 300픽셀 이상이다
        * [x] 세로 (height)
            * [x] 200픽셀 이상이다
        * [x] 3:2의 비율 이다
    * [x] 파일 이름
    * [x] 저장 위치
* [x] 강의 타입 (type, Interface...?)
    * [x] 강의 타입에 따라 지원을 한다
    * [x] 수강생수
        * [x] 증가 할 수 있다
    * [ ] 무료
        * [ ] 인원 제한이 없다
    * [ ] 유료
        * [ ] 최대 수강 인원 (Limit Students)
            * [ ] 인원 제한이 넘을 수 없다
        * [ ] 수강료
        * [ ] 결제 금액과 수강료 가 일치 해야 한다
* [ ] 강의 상태 (status)
    * [ ] 모집중일 때만 강의 신청이 가능하다
