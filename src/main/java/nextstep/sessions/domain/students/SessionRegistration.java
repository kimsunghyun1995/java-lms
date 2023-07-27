package nextstep.sessions.domain.students;

import nextstep.sessions.domain.SessionProgressStatus;
import nextstep.sessions.domain.SessionRecruitingStatus;

public class SessionRegistration {

    private int capacity;
    private SessionRecruitingStatus recruitingStatus;
    private SessionProgressStatus progressStatus;
    public SessionRegistration(int capacity, Long sessionRecruitingStatusId,
        Long sessionProgressStatusId) {
        this(capacity,
            SessionRecruitingStatus.from(sessionRecruitingStatusId),
            SessionProgressStatus.from(sessionProgressStatusId));
    }

    public SessionRegistration(int capacity, int sessionRecruitingStatusId,
        int sessionProgressStatusId) {
        this(capacity,
            SessionRecruitingStatus.from(Long.valueOf(sessionRecruitingStatusId)),
            SessionProgressStatus.from(Long.valueOf(sessionProgressStatusId)));
    }

    public SessionRegistration(int capacity) {
        this(capacity,
            SessionRecruitingStatus.NOTHING,
            SessionProgressStatus.READY);
    }

    public SessionRegistration(int capacity, SessionRecruitingStatus recruitingStatus,
        SessionProgressStatus progressStatus) {
        this.capacity = capacity;
        this.recruitingStatus = recruitingStatus;
        this.progressStatus = progressStatus;
    }

    public void recruitStart() {
        this.recruitingStatus = SessionRecruitingStatus.RECRUITING;
    }

    public void recruitEnd() {
        this.recruitingStatus = SessionRecruitingStatus.NOTHING;
    }

    public void enrolment(Students students, Student student) {
        if (students.overFull(capacity)) {
            // 사용자에겐 굳이 몇명 모집 중에 다 찼는지를 알릴 필요 없다
            throw new IllegalStateException("수강인원이 초과되었습니다");
        }

        if (students.contains(student)) {
            throw new IllegalStateException("이미 수강신청한 사용자입니다");
        }

        if (!progressStatus.isApplicable()) {
            throw new IllegalStateException("강의가 종료된 상태입니다");
        }

        SessionRecruitingStatus.isRecruitingOrThrow(recruitingStatus);

        students.add(student);
    }

    public void validateInit() {
        if (capacity <= 0) {
            throw new IllegalArgumentException("수강인원 수는 1명 이상이어야 합니다");
        }
    }

    public void accept(Students students, Student student) {
        if (students.overFull(capacity)) {
            throw new IllegalStateException(
                String.format("수강인원이 초과되었습니다. 제한 인원 : %d, 현재 인원 : %d", capacity, students.size()));
        }

        student.accept();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public SessionRecruitingStatus getRecruitingStatus() {
        return this.recruitingStatus;
    }

    public SessionProgressStatus getProgressStatus() {
        return this.progressStatus;
    }

    @Override
    public String toString() {
        return "SessionRegistration{" +
            "capacity=" + capacity +
            ", status=" + recruitingStatus +
            '}';
    }
}
