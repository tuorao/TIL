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