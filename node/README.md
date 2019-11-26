# kubernetes 시작하기

### 시작하기 전에 할것
- docker 설치
- gcloud 설정
- node 설치(java app이나 기타 등등 다른 어플리케이션도 ㄱㅊㄱㅊ)

### docker build & run test
- docker build -t kubia . (현재 디렉토리 기준)
- docker run --name kubia-container -p 8081:8081 -d kubia (생성해놓은 kubia 이미지를 사용해서 도커 컨테이너를 띄운다. 8081 포트로 외부에서 접근해서 컨테이너 내부의 8081 포트로 연결)
- curl localhost:8081

### google cloud platform - kubernetes engine
- docker hub & k8s cluster로 사용할 수 있다. docker image를 등록 -> k8s node setting -> app deploy 순으로 진행할 예정
- gcp(google cloud platform)에서 kubernetes engine 프로젝트를 생성
- 클러스터 생성. gui로 그냥 하자 -_-ㅋ
- (gcp docker registry에 로컬에서 만들어둔 docker image를 등록)[https://cloud.google.com/container-registry/docs/pushing-and-pulling?hl=ko&_ga=2.108880011.-848379874.1573964982&_gac=1.183399764.1574038347.Cj0KCQiA2b7uBRDsARIsAEE9XpHXmz4MTd0UPcXHxkLpvH-VnAB-JuDYP5GenORq-GnsW3RYLYaPRywaAmhrEALw_wcB]
- kubectl run kubia --image={docker registry에 등록한 이미지} --port=8081 --generator=run-pod/v1
- kubectl get pods - 팟이 제대로 생성됐는지 확인하는 작업을 거친다 STATUS가 RUNNING이면 정상 동작
- kubectl expose rc kubia --type=LoadBalancer --name kubia-http - 외부에서 접근가능한 LB를 생성한다
- kubectl get svc - kubia-http에 EXTERNAL-IP가 붙어있으면 정상 동작
- kubectl scale rc kubia --replicas=3 - 이러면 팟을 3개로 증가시킬수 있다.. 순식간에 스케일아웃이 가능함! 물론 app server 기준이다
- curl localhost:8081 - 테스트해보면 무작위의 인스턴스를 호출하는걸 알 수 있다