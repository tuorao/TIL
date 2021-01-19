## Spring Boot Actuator

- Spring Boot Application의 상태정보를 다룰 수 있는 프로젝트
- 각종 추상화 클래스를 제공하여, 상태정보를 조회, 변경 할 수 있는 Service를 제공

## ex) health indicator → 이건 주로 gateway에서 사용한다

- /actuator/health/up → up 상태로 변경
- /actuator/health/down : down 상태로 변경
- /actuator/health/maintenance : 점검 상태로 변경

## 수집 하는 Metrics 예시

- JVM 정보
    - thread 수
    - GC 정보
    - heap 정보
- DBCP 정보
- PROCESS 관련 정보
- CPU
    - USAGE
    - LOAD
- FILE
    - 최대 사용가능한 File Descriptor 수
    - 현재 사용중인 File Descriptor 수
