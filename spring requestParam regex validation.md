# spring requestParam regex validation

### parameter 검증 방법
- javax.validation

```java
// 이런식이면 RequestBody 형태로 들어온 파라미터를 검증하는데 용이하다
@RestController
public class Test1{
    @GetMapping
    public String getApple(@Valid @RequestBody Dummy dummy) {
        return dummy.getApple();
    }

    @Data
    class Dummy {
        @NonNull
        private String apple;
    }
}
```

- org.springframework.validation.annotation.Validated

```java
// RequestParam을 검증할땐 이렇게 하는게 더 편리하다 
@RestController
@Validated
public class Test2 {
    @GetMapping
    public String getBanana(@Pattern(regexp = "([_0-9a-zA-Z]+)") @RequestParam String banana) {
        return banana;
    }
}
```


   
