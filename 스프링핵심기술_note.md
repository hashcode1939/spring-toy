# 스프링 핵심기술 , Spring Framework Core

## IoC Container & Bean
### **IoC Container bean factory**
1. IoC Container
    - 의존성관리
    - scope (singletone / prototype) 관리
    - 라이프사이클 인터페이스
2. type
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
    - 설정
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
2. ApplicationEventPublisher
3. ResourceLoader

---

## Resource / Validation