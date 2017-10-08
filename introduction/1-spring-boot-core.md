# Spring Boot 精要
Spring Boot 的四个核心：
* 自动配置：自动提供相关配置
* 启动依赖：根据功能引入需要的库
* 命令行界面：只需写代码无需传统项目构建就能完成完整的应用程序（可选特性）
* Actuator：分析运行中的 Spring Boot 项目

## 自动配置
在任何 Spring 应用程序中，需要Java配置或XML配置来为应用程序开启特定的特性和功能。比如说，写一个用JDBC来访问关系型数据库的应用程序，需要在上下文里面配置`JdbcTemplate`这个Bean。那段配置看起来是这样的：
```java
// Bean声明创建了一个jdbcTemplate的实例，注入了一个DataSource依赖
// 这意味着你还需要配置一个DataSource的Bean来满足依赖
@Bean
public JdbcTemplate jdbcTemplate(DataSource dataSource) {
  return new JdbcTemplate(dataSource);
}

// 假设你将配置一个嵌入式H2数据库作为DataSource的Bean，代码大致如下
// 配置方法创建了一个嵌入式数据库，指定在该数据库上执行两段SQL脚本
// build()方法返回了一个指向该数据库的引用
@Bean
public DataSource dataSource() {
  return new EmbeddedDatabaseBuilder()
          .setType(EmbeddedDatabaseType.H2)
          .addScripts('schema.sql', 'data.sql')
          .build();
}
```

上面是一个常见的样板配置，而Spring Boot会为这些常见配置场景进行自动配置。你是不需要操心配置的，Spring Boot 会做好相关准备。比如说：  
* Spring Boot 在Classpath里发现了H2数据库的库，它就会自动为你配置一个嵌入式H2数据库。
* 如果在Classpath里发现`JdbcTemplate`，它就会自动为你配置一个`JdbcTemplate`的Bean。

## 起步依赖
以前我们向项目中添加依赖时是极富挑战性的，需要什么库？对应Group和Artifact又是什么？需要哪个版本？哪个版本才不会和其他依赖发生冲突？  
Spring Boot 通过起步依赖把常用库聚合在一起，组成了几个为特定功能而定制的依赖。举个例子：
* 用Spring MVC构造一个REST API
* 并将JSON作为资源表述
* 运用遵循JSR-303规范的声明式校验
* 使用嵌入式的Tomcat服务器来提供服务

实现以上目标，你需要至少以下8个依赖：
0. org.springframework:spring-core
0. org.springframework:spring-web
0. org.springframework:spring-webmvc
0. com.fasterxml.jackson.core:jackson-databind
0. org.hibernate:hibernate-validator
0. org.apache.tomcat.embed:tomcat-embed-core
0. org.apache.tomcat.embed:tomcat-embed-el
0. org.apache.tomcat.embed:tomcat-embed-logging-juli

但如果你打算利用Spring Boot的起步依赖，添加一个就好。
* org.springframework.boot:spring-boot-starter-web
它会根据依赖传递把其他所需依赖都引入到项目中，无需我们考虑，也无需考虑需要这些库的哪些版本。

类似的依赖还有（起步依赖引入的库的版本都是经过测试的，不会出现不兼容的情况）：
* org.springframework.boot:spring-boot-starter-actuator
* org.springframework.boot:spring-boot-starter-data-jpa
* org.springframework.boot:spring-boot-starter-security
* org.springframework.boot:spring-boot-starter-thymeleaf
* org.springframework.boot:spring-boot-configuration-processor

## 命令行界面
略

## Actuator
前面三个核心旨在简化Spring开发，而Actuator旨在通过**Web端**和**shell界面**向外界提供运行时检视应用程序内部情况的能力。
包括如下细节：  
* Spring应用程序上下文里配置的Bean
* Spring Boot的自动配置做的决策
* 应用程序取到的环境变量、系统属性、配置属性和命令行参数
* 应用程序里线程的当前状态
* 应用程序最近处理过的HTTP请求的追踪情况
* 各种和内存用量、垃圾回收、 Web请求以及数据源用量相关的指标
