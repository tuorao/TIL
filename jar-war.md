## 뜬금없이 이건 왜 ?

- 옛날 옛적에 war를 사용하다가 jar로 넘어온 이유가 궁금해서

## JAR (Java Archive)

- Class와 같은 Java 리소스, 속성 파일, 라이브러리 등이 포함되어 있다
- Java 어플리케이션이 동작할 수  있도록 Java 프로젝트를 압축한 파일
- Jar 파일의 구조는 원하는 형태로 구성이 가능하며 JDK 에 내장된 JRE(Java Runtime Environment) 만 가지고도 실행이 가능하다

## WAR (Web Application Archive)

- Servlet / Jsp 컨테이너에서 동작 시킬 수 있는 웹 어플리케이션 압축 파일 포맷
- Jsp, Servlet, Jar, Class, Xml, Html, Javascript 등 ServletContext와 관련된 파일로 패키징 되어 있다
- WAR는 웹 응용 프로그램 자원만을 포함하고 있다
- Jar 와는 다르게 WEB-INF 및 META-INF 디렉토리로 사전 정의 된 구조를 사용하며,
WAR 파일을 실행하려면 Tomcat과 같은 WAS가 필요하다

## 그렇다면 왜 Jar를 많이 쓸까?

- Spring → SpringBoot로 넘어오면서 Embedded Tomcat이 내장되어 있기 때문에 
StandAlone 으로 어플리케이션을 구동 시키기 때문에 WAR 보다는 JAR가 적합해서

