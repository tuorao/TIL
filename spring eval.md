# spring eval 을 사용해서 application.yml 가져오기

- application.yml
```yaml
dummy:
    data: babo
```

- test.jsp
```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8" />
<title>아 jsp 극혐!!!</title>
</head>
<body>
<a><spring:eval expression="@environment.getProperty('dummy.babo')"/></a>
</body>
</html
```

- 이런식으로 property 를 가져올수 있다 ~~아 그래도 jsp 시르다..~~




   
