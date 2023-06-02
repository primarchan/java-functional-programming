# Functional Programming in Java & Stream API

## Lambda Expression

## Functional Interface

## Method Reference
- 매서드 레퍼런스 (Method Reference)
  - 기존에 이미 선언되어있는 메서드를 지정하고 싶을 때
  - `::` 오퍼레이터를 사용
  - 생략이 많기 때문에 사용할 메서드의 매개변수의 타입과 리턴 타입을 미리 숙지해야 함
- 메서드 레퍼런스의 4가지 케이스
  1) `ClassNamd::staticMethodName` : 클래스의 static method 를 지정할 때
  2) `ObjectName::instanceMethodName` : 선언된 객체의 instance method 를 지정할 때
  3) `ClassName::instanceMethodName` : 객체의 instance method 를 지정할 때
  4) `ClassName::new` : 클래스의 constructor 를 지정할 때

### Stream

### Optional
- NPE - NullPointerException
  - Null 상태인 오브젝트를 참조할 때 발생
  - Runtime error 이기 때문에 실행 전까지는 발생 여부를 알기 쉽지 않음
  - "[Null pointer 를 발명한 것]은 나의 10억 불 짜리 실수였다. (I call it billion-dollar mistake.)" - 토니 호어(Tony Hoare), 2009년 한 강연에서
- Optional 만드는 법
  - of - Null 이 아닌 오브젝트를 이용해 Optional 을 만들 때
  - Empty - 빈 Optional 을 만들 때
  - ofNullable - Null 인지 아닌지 알지 못하는 오브젝트로 Optional 을 만들 때
```java
public static <T> Optional<T> of(T value)
public static <T> Optional<T> empty()
public static <T> Optional<T> ofNullable(T value)
```

### Advanced STREAM

### 함수형 프로그래밍의 응용

### 함수형 프로그래밍을 이용한 디자인 패턴
