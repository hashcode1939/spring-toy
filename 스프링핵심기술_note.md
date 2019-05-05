# 스프링 핵심기술 , Spring Framework Core

inflearn "스프링 프레임워크 핵심 기술" 강의 note

## IoC Container & Bean
### **IoC Container bean factory**
1. IoC Container
    - BeanFactory
    - 의존성관리
    - scope (singletone / prototype) 관리
    - 라이프사이클 인터페이스
2. Application Context
    - ClassPathXmlApplicationContext
    - AnnotationConfigApplicationContext
        - @Bean & @ComponenetScan
    - ...
3. Autowired
    - 생성자 / 세터 / 필드
    - 경우의 수
        - 해당타입의 빈이 0개 : exception
        - 해당타입의 빈이 1개 :
        - 해당타입의 빈이 N개 : 빈 이름으로 시도 후 , @primary @Qualifier 적용

4. Componenet Scan & @Componenet
    - BasePackage{class} 설정
    - BeanFactoryPostProcessor

5. 빈의 스코프
    - singletone
    - prototype
        - request
        - session
        - websocket
        - Thread 
        - ...
    - singletone이 prototype 빈을 갖게되면??
        - proxy mode 설정을 사용
### **environment**
1. Environment Capable, profile
    - 프로파일 : 빈 그룹 설정 
    - 
    - 클래스나 메서드에 설정
        - @profile("test")...
        - spring.profiles.active=dev
        - -Dspring.profiles.active=local,dev

1. Properties
    - 설정 방법별 우선순위가 있음
      - servlet 매개변수 ... JVM property ... properties file ...
      - @propertySource()
      - @value("${app.properties.value}")

### IoC Container
1. MessageSource
   - 국제화 (i18n) 기능을 제공하는 인터페이스
     - message.properteis / message_ko_kr.properteis ...
2. ApplicationEventPublisher
3. ResourceLoader
   - 리소스 읽어오기
     - 파일 시스템 / classpath / url / ...

---

## Resource / Validation 추상화

--- 

##  Data Binding
   - data -> Object binding
   - config
     - PropertyEditorSupport  
       - class A extends PropertyEditorSupport
     - Converter
       - class A implements Converter<in, out>
     - Formatter
       - class A implements Formatter<T>
---

## SpEL, Spring Expression Language

---

## Spring AOP
- 용어
  - Aspect : 모듈
  - Advice : 해야할일
  - JoinPoint : Advice가 실행될 시점
  - PointCut : 어디에 적용할 지
  - Target : AOP가 적용되는 대상

- AOP 적용 방법
  - Compile (AspectJ)
  - Load Time (AspectJ)
  - Runtime (Spring AOP)
- Spring AOP
  - 스프링 빈에만 AOP 적용가능
  - Proxy 기반 AOP
    - proxy bean 을 생성하여 AOP 구현
  - 동적 프록시 빈 생성 : BeanPostProcessor

## Null Safety