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