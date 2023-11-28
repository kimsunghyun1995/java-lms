# 학습 관리 시스템(Learning Management System)
## 진행 방법
* 학습 관리 시스템의 수강신청 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

</br>

---

## 요구사항

<details>
<summary><b>🚀 1단계 - 레거시 코드 리팩터링</b></summary>

**리팩터링 요구사항**
> - [X] QnaService의 deleteQuestion() 메서드에 단위 테스트 가능한 코드(핵심 비지니스 로직)를 도메인 모델 객체에 구현한다.
> - [X] QnaService의 비지니스 로직을 도메인 모델로 이동하는 리팩터링을 진행할 때 TDD로 구현한다.
>> - [X] 질문(Question)은 Question Domain 에서 삭제 가능 검증 후, 삭제한다.
>> - [X] 질문에 달린 답변들(Answers)는 Answers 일급 컬렉션에서 삭제 가능 검증 후, 삭제한다.
</details>
