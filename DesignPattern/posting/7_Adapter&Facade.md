

# Adapter & Facade

## Adapter
- 어떤 인터페이스를 클라이언트에서 요구하는 형태의 인터페이스에 적응시켜주는 역할
- 클라이언트로부터 요청을 받아서 새로운 업체에서 제공하는 클래스에서 받아들일 수 있는 형태의 요청으로 변환시켜주는 중개인 역할

```java
public interface Duck {
  void quack();

  void fly();
}

public interface Turkey {
  void gobble();

  void fly();
}
```

```java
public class TurkeyAdapter implements Duck {
  Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void fly() {
    for (int i = 0; i < 5; i++) {
	  turkey.fly();
    }
  }

  @Override
  public void quack() {
    turkey.gobble();
  }
}
```

### Adapter 정의
한 클래스의 인터페이스를 클라이언트에서 사용하고자 하는 다른 인터페이스로 변환합니다. 어댑터를 이용하면 인터페이스 호환성 문제 때문에 같이 쓸 수 없는 클래스들을 연결해서 쓸 수 있습니다.

- 클라이언트와 구현된 인터페이스의 분리. 나중에 인터페이스가 바뀌어도 어댑터에 캡슐화되기 때문에 클라이언트는 바뀔 필요 없음

![adapter](../img/adapter.jpeg)

- 여러 객체지향 원칙이 반영되어 있음
  - 어댑티를 새로 바뀐 인터페이스로 감쌀 때는 객체 구성을 사용
    - 어댑티의 어떤 서브 클래스에 대해서도 어댑터를 쓸 수 있다는 장점
  - 클라이언트를 특정 구현이 아닌 인터페이스에 연결
    - 타겟 인터페이스만 제대로 지킨다면 나중에 다른 구현을 추가하는 것도 가능

### Adapter 종류
#### 1. 객체 어댑터

#### 2. 클래스 어댑터
클래스 어댑터는 다중 상속이 필요합니다. 그러나 자바에서는 다중 상속이 불가능합니다.

### Adapter vs Decorator vs Facade
- 어댑터
  - 객체를 감싸서 인터페이스를 바꾸기 위한 용도
- 데코레이터
  - 객체를 감싸서 새로운 행동을 추가하기 위한 용도
- 퍼사드
  - 일력의 객체들을 감싸서 단순화시키기 위한 용도

## Facade

### Facade 정의
어떤 서브시스템의 일련의 인터페이스에 대한 `통합된 인터페이스`를 제공합니다. 퍼사드에서 고수준 인터페이스를 정의하기 때문에 서브시스템을 더 쉽게 사용할 수 있습니다.

- 용도 : 단순화된 인터페이스를 통해서 서브시스템을 더 쉽게 사용할 수 있도록 하기 위한 용도

![facade](../img/facade.jpeg)



## 핵심정리
- 기존 클래스를 사용하려고 하는데 인터페이스가 맞지 않으면 `어댑터`를 사용
- 큰 인터페이스, 또는 여러 인터페이스를 단순화시키거나 통합시켜야 되는 경우에는 `퍼사드`를 사용
- 어댑터는 인터페이스를 클라이언트에서 원하는 인터페이스로 바꿔주는 역할을 합니다.
- 퍼사드는 클라이언트를 복잡한 서브시스템과 분리시켜주는 역할을 합니다.
- 어댑터를 구현할 때는 타겟 인터페이스의 크기와 구조에 따라 코딩해야 할 분량이 결정됩니다.
- 퍼사드 패턴에서는 서브시스템을 가지고 퍼사드를 만들고, 실제 작업은 서브클래스에 위임
- 어댑터 패턴에는 객체 어댑터 패턴과 클래스 어댑터 패턴이 있다. 클래스 어댑터를 쓰려면 다중 상속 기능이 필요
- 한 서브시스템에 퍼사드를 여러 개 만들어도 됩니다.
- `어댑터`는 객체를 감싸서 인터페이스를 바꾸기 위한 용도 / `데코레이터`는 객체를 감싸서 새로운 행동을 추가하기 위한 용도 / `퍼사드`는 일련의 객체들을 감싸서 단순화시키기 위한 용도