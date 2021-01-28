## G1GC - Garbage First Garbage Collector

- G1은 이름을 보면 짐작할 수 있듯, 쓰레기로 가득찬 heap 영역을 집중적으로 수집한다.
- G1은 큰 메모리를 가진 멀티 프로세서 시스템에서 사용하기 위해 개발된 GC이다.
- GC 일시 정지 시간을 최소화하면서, 따로 설정을 하지 않아도 가능한 한 처리량(throughput)도 확보하는 것이 G1GC의 목표이다.
- G1은 Java 9부터 디폴트 GC이다.
- G1은 실시간(real time) GC가 아니다. 일시 정지 시간을 최소화하긴 하지만 완전히 없애지는 못한다.
- G1은 통계를 계산해가면서 GC 작업량을 조절한다.


## Java 에서 GC의 도입
- GC의 도입은 weak generational hypohesis 가설로부터 시작됐다
  - 대부분 객체는 금방 접근 불가능 상태가 된다 -> 이말인 즉슨 더이상 참조하지 않는 상태를 뜻함
  - 오래된 객체에서 젊은 객체로 참조는 아주 적게 일어난다 -> 오래된 객체부터 GC의 대상이 된다
 
## GC가 일어나는 과정
- JVM은 생성된 객체들의 생성순서를 표현하기 위해 메모리를 여러 영역으로 나눔

![iimage](https://github.com/tuorao/TIL/blob/master/JVMObjectLifecycle.png?raw=true)
객체 생성 -> Young Generation의 일부인 Eden에 위치 -> 여기서 살아남으면 Survivor 영역으로 이동 
-> Major GC가 발생할때마다 Survivor1 <-> Survivor2 로 이동되고, 이 과정에서 더이상 참조되지 않는 객체는 제거됨
-> Major GC 발생동안 살아남은 객체들은 Old Generation으로 이동하며 OG에서 미사용으로 판별된 객체는 Full GC를 통해 메모리에서 
