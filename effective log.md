# effective log

__spring framework 에서 사용되는 log framework에 대하여__

* log4j -> logback -> log4j2 순으로 만들어짐
* log4j
  - 나열한 3가지 log framework 중 가장 오래됨. 그만큼 성능은 셋중 가장 떨어지는 편이며 최근엔 잘 안쓰임
* logback
  - log4j의 단점을 보완함. 파일 입출력이 10배 정도 빠르다고 함
* log4j2
  - 가장 최근에 나온 log framework
  - blocking IO 환경에서는 logback과 성능상 큰 차이가 없음
  - non blocking IO 환경에서 logback이 메시지 유실율이 높은 반면 log4j2는 안정적이다
* slf4j
  - java 로 따지면 interface의 역할을 한다
  - slf4j + log framework 를 조합해서 사용하고, 같은 포맷의 문법을 사용할 수 있는 편의성을 제공함
* 출처
  - https://www.loggly.com/blog/benchmarking-java-logging-frameworks/
* 결론
  - __webflux를 제대로 써보겠다면 log4j2를 도입하는것도 괜찮을것 같다__