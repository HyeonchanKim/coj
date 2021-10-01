# coj

## 실행방법

``` bash
mvn spring-boot:run
```

## local에서 실행 시

수정 해야할 파일: 

https://github.com/HyeonchanKim/coj/blob/main/src/main/resources/application.properties

### 수정 전

``` properties
  2 spring.datasource.url=jdbc:mysql://10.0.0.232:3306/coj?useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC&allowPublicKeyRetrieval=true
```

### 수정 후

``` properties
  2 spring.datasource.url=jdbc:mysql://localhost:3306/coj?useSSL=false&characterEncoding=UTF-8&serverTimezone=UTC&allowPublicKeyRetrieval=true
```
