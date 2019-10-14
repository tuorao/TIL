# parallel stream

### 사용하는 이유는?
- stream 으로 병렬 처리를 위해 사용함

### 주의할 점
- 사용법은 간단하지만 제약사항이 많고, 오용 했을 경우 오히려 성능 저하를 일으킴
- cpu의 core가 여러개라면 성능 향상이 가능하지만 단일 core라면 parallel stream을 사용했을때 성능 저하를 일으킴
- collection의 요소가 적고 처리가 빠르면 parallel이 느릴 수 있다. parallel은 스레드풀과 스레드를 추가적으로 생성하기 때문

### 성능 개선이 가능한 자료형
- ArrayList, HashMap, HashSet, ConcurrentHashMap, 배열, int, long 

### 성능 개선이 불가능한 경우
- Stream.iterate, 중간 연산에 limit 포함, LinkedList와 같이 꼬리를 물고 있는 경우

### 결론
- MSA 환경이라면 필수. 그외의 경우는 옵션이라고 생각하지만 그래도 가능하다면 써보자.


   
