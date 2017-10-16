# 使用起步依赖
## 指定基于功能的依赖
Spring Boot提供的众多起步依赖可以大大降低“项目依赖”的复杂度。  
举个例子，现在我们正在做一个“阅读列表”应用，可以直接添加起步依赖来“声明”这是一个Web应用，而无需添加一堆单独的库依赖。与此同时，我们还想使用Thymeleaf作为Web视图、使用JPA来实现数据持久化等等，所以还在构建文件中添加这两者以及其他的起步依赖。起步依赖代码如下：
```
dependencies {
    compile('org.springframework.boot:spring-boot-starter-actuator')
    compile('org.springframework.boot:spring-boot-starter-data-jpa')
    compile('org.springframework.boot:spring-boot-starter-security')
    compile('org.springframework.boot:spring-boot-starter-thymeleaf')
    compile("org.springframework.boot:spring-boot-configuration-processor")
    compile('org.springframework.boot:spring-boot-starter-web')

    runtime('org.springframework.boot:spring-boot-devtools')
    runtime('com.h2database:h2')

    testCompile('org.springframework.boot:spring-boot-starter-test')
    testCompile('org.springframework.security:spring-security-test')
}
```
通过传递依赖，上面的10个依赖就等于于一大把独立的库，而且这些独立的库都是互相兼容的，我们不必担心需要维护哪些库，也不必担心他们的版本。  

如果你想知道自己具体在用哪些库，可以执行命令 `gradlew dependencies`  
比如上面的起步依赖具体用到的库有（节选）：
```
|    +--- org.hibernate:hibernate-core:5.0.12.Final
|    |    +--- org.jboss.logging:jboss-logging:3.3.0.Final -> 3.3.1.Final
|    |    +--- org.hibernate.javax.persistence:hibernate-jpa-2.1-api:1.0.0.Final
|    |    +--- org.javassist:javassist:3.18.1-GA -> 3.21.0-GA
|    |    +--- antlr:antlr:2.7.7
|    |    +--- org.jboss:jandex:2.0.0.Final
|    |    +--- dom4j:dom4j:1.6.1
|    |    \--- org.hibernate.common:hibernate-commons-annotations:5.0.1.Final
|    |         \--- org.jboss.logging:jboss-logging:3.3.0.Final -> 3.3.1.Final
|    +--- org.hibernate:hibernate-entitymanager:5.0.12.Final
|    |    +--- org.jboss.logging:jboss-logging:3.3.0.Final -> 3.3.1.Final
|    |    +--- org.hibernate:hibernate-core:5.0.12.Final (*)
|    |    +--- dom4j:dom4j:1.6.1
|    |    +--- org.hibernate.common:hibernate-commons-annotations:5.0.1.Final (*)
|    |    +--- org.hibernate.javax.persistence:hibernate-jpa-2.1-api:1.0.0.Final
|    |    \--- org.javassist:javassist:3.18.1-GA -> 3.21.0-GA
|    +--- javax.transaction:javax.transaction-api:1.2
|    +--- org.springframework.data:spring-data-jpa:1.11.7.RELEASE
|    |    +--- org.springframework.data:spring-data-commons:1.13.7.RELEASE
|    |    |    +--- org.springframework:spring-core:4.3.11.RELEASE
|    |    |    +--- org.springframework:spring-beans:4.3.11.RELEASE (*)
|    |    |    +--- org.slf4j:slf4j-api:1.7.25
|    |    |    \--- org.slf4j:jcl-over-slf4j:1.7.25 (*)
|    |    +--- org.springframework:spring-orm:4.3.11.RELEASE
|    |    |    +--- org.springframework:spring-beans:4.3.11.RELEASE (*)
|    |    |    +--- org.springframework:spring-core:4.3.11.RELEASE
|    |    |    +--- org.springframework:spring-jdbc:4.3.11.RELEASE (*)
|    |    |    \--- org.springframework:spring-tx:4.3.11.RELEASE (*)
|    |    +--- org.springframework:spring-context:4.3.11.RELEASE (*)
|    |    +--- org.springframework:spring-aop:4.3.11.RELEASE (*)
|    |    +--- org.springframework:spring-tx:4.3.11.RELEASE (*)
|    |    +--- org.springframework:spring-beans:4.3.11.RELEASE (*)
|    |    +--- org.springframework:spring-core:4.3.11.RELEASE
|    |    +--- org.slf4j:slf4j-api:1.7.25
|    |    \--- org.slf4j:jcl-over-slf4j:1.7.25 (*)
|    \--- org.springframework:spring-aspects:4.3.11.RELEASE
|         \--- org.aspectj:aspectjweaver:1.8.9 -> 1.8.10
+--- org.springframework.boot:spring-boot-starter-security: -> 1.5.7.RELEASE
|    +--- org.springframework.boot:spring-boot-starter:1.5.7.RELEASE (*)
|    +--- org.springframework:spring-aop:4.3.11.RELEASE (*)
|    +--- org.springframework.security:spring-security-config:4.2.3.RELEASE
|    |    +--- org.springframework.security:spring-security-core:4.2.3.RELEASE
|    |    |    +--- org.springframework:spring-aop:4.3.9.RELEASE -> 4.3.11.RELEASE (*)
|    |    |    +--- org.springframework:spring-beans:4.3.9.RELEASE -> 4.3.11.RELEASE (*)
|    |    |    +--- org.springframework:spring-context:4.3.9.RELEASE -> 4.3.11.RELEASE (*)
|    |    |    +--- org.springframework:spring-core:4.3.9.RELEASE -> 4.3.11.RELEASE
|    |    |    \--- org.springframework:spring-expression:4.3.9.RELEASE -> 4.3.11.RELEASE (*)
|    |    +--- org.springframework:spring-aop:4.3.9.RELEASE -> 4.3.11.RELEASE (*)
|    |    +--- org.springframework:spring-beans:4.3.9.RELEASE -> 4.3.11.RELEASE (*)
|    |    +--- org.springframework:spring-context:4.3.9.RELEASE -> 4.3.11.RELEASE (*)
|    |    \--- org.springframework:spring-core:4.3.9.RELEASE -> 4.3.11.RELEASE
|    \--- org.springframework.security:spring-security-web:4.2.3.RELEASE
|         +--- org.springframework.security:spring-security-core:4.2.3.RELEASE (*)
|         +--- org.springframework:spring-beans:4.3.9.RELEASE -> 4.3.11.RELEASE (*)
|         +--- org.springframework:spring-context:4.3.9.RELEASE -> 4.3.11.RELEASE (*)
|         +--- org.springframework:spring-core:4.3.9.RELEASE -> 4.3.11.RELEASE
|         +--- org.springframework:spring-expression:4.3.9.RELEASE -> 4.3.11.RELEASE (*)
|         \--- org.springframework:spring-web:4.3.9.RELEASE -> 4.3.11.RELEASE
|              +--- org.springframework:spring-aop:4.3.11.RELEASE (*)
|              +--- org.springframework:spring-beans:4.3.11.RELEASE (*)
|              +--- org.springframework:spring-context:4.3.11.RELEASE (*)
|              \--- org.springframework:spring-core:4.3.11.RELEASE
...
...
...
```

## 覆盖起步依赖引入的传递依赖
如果起步依赖所选的库仍有问题，可以通过构建工具中的功能，选择性地覆盖他们引入的传递依赖的版本号，排除传递依赖。同时，也可以为起步依赖中没有涵盖的库指定依赖。  

### 排除依赖
以Spring Boot的Web依赖为例，它传递了Jackson库。如果你构建的是一个生产或消费JSON资源表述的REST服务，它会很有用。但是，如果你构建的是Web应用，可能就用不上它了。  
我们可以这样来排除传递依赖：
```
compile('org.springframework.boot:spring-boot-starter-web') {
    exclude group: 'com.fasterxml.jackson.core'
}
```

### 修改依赖版本
如果项目需要Jackson，但你需要用另一个版本的Jackson来进行构建，而不是Web依赖里的那个。  
可以这样做来使用较新版本的依赖：
```
compile("com.fasterxml.jackson.core:jackson-databind:2.4.3")
```
因为这个依赖的版本比Spring Boot的Web依赖引入的要新，所以是生效的。但是，如果你需要的是一个较早版本的依赖呢？（Gradle与Maven不要一样，Gradle倾向于使用库的最新版本）  
可以这样做来使用较早版本的依赖：
```
// 把Web起步依赖的那个版本排除掉，加入较早版本的依赖
compile("org.springframework.boot:spring-boot-starter-web") {
exclude group: 'com.fasterxml.jackson.core'
}
compile("com.fasterxml.jackson.core:jackson-databind:2.3.1")
```
>不管什么情况，在覆盖Spring Boot起步依赖引入的传递依赖时要多加小心，因为起步依赖中各个依赖版本之间的兼容性都经过了精心的测试，应该只在特殊的情况下做覆盖（比如新版本修复了一个BUG等）
