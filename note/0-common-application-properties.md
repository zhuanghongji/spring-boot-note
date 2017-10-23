# 应用程序通用属性列表
各种属性都可以在application.properties/application.yml文件中或命令行中指定，下面是一些通用属性的列表。

参考文档：[Appendix A. Common application properties](https://docs.spring.io/spring-boot/docs/1.4.1.RELEASE/reference/htmlsingle/#common-application-properties)

```properties
# ===================================================================
# COMMON SPRING BOOT PROPERTIES
#
# This sample file is provided as a guideline. Do NOT copy it in its
# entirety to your own application.               ^^^
# ===================================================================


# ----------------------------------------
# CORE PROPERTIES
# ----------------------------------------

# BANNER
banner.charset=UTF-8 # Banner file encoding.
banner.location=classpath:banner.txt # Banner file location.
banner.image.location=classpath:banner.gif # Banner image file location (jpg/png can also be used).
banner.image.width= # Width of the banner image in chars (default 76)
banner.image.height= # Height of the banner image in chars (default based on image height)
banner.image.margin= # Left hand image margin in chars (default 2)
banner.image.invert= # If images should be inverted for dark terminal themes (default false)

# LOGGING
logging.config= # Location of the logging configuration file. For instance `classpath:logback.xml` for Logback
logging.exception-conversion-word=%wEx # Conversion word used when logging exceptions.
logging.file= # Log file name. For instance `myapp.log`
logging.level.*= # Log levels severity mapping. For instance `logging.level.org.springframework=DEBUG`
logging.path= # Location of the log file. For instance `/var/log`
logging.pattern.console= # Appender pattern for output to the console. Only supported with the default logback setup.
logging.pattern.file= # Appender pattern for output to the file. Only supported with the default logback setup.
logging.pattern.level= # Appender pattern for log level (default %5p). Only supported with the default logback setup.
logging.register-shutdown-hook=false # Register a shutdown hook for the logging system when it is initialized.

# AOP
spring.aop.auto=true # 添加 @EnableAspectJAutoProxy。
spring.aop.proxy-target-class=false # 是否要创建基于子类（即Code Generation Library， CGLIB）的代理来代替基于Java接口的代理，前者为true，后者为false

# IDENTITY (ContextIdApplicationContextInitializer)
spring.application.index= # Application index.
spring.application.name= # Application name.

# ADMIN (SpringApplicationAdminJmxAutoConfiguration)
spring.application.admin.enabled=false # 开启应用程序的管理功能
spring.application.admin.jmx-name=org.springframework.boot:type=Admin,name=SpringApplication # 应用程序管理MBean的JMX名称

# AUTO-CONFIGURATION
spring.autoconfigure.exclude= # 要排除的自动配置类

# SPRING CORE
spring.beaninfo.ignore=true # Skip search of BeanInfo classes.

# SPRING CACHE (CacheProperties)
spring.cache.cache-names= # 如果底层缓存管理器支持缓存名的话，可以在这里指定要创建的缓存名列表，用逗号分隔。通常这会禁用运行时创建其他额外缓存的能力
spring.cache.caffeine.spec= # The spec to use to create caches. Check CaffeineSpec for more details on the spec format.
spring.cache.couchbase.expiration=0 # Entry expiration in milliseconds. By default the entries never expire.
spring.cache.ehcache.config= # 用来初始化EhCache的配置文件的位置
spring.cache.guava.spec= # 用来创建缓存的Spec。要获得有关Spec格式的详细情况，可以查看CacheBuilderSpec
spring.cache.hazelcast.config= # 用来初始化Hazelcast的配置文件的位置
spring.cache.infinispan.config= # 用来初始化Infinispan的配置文件的位置
spring.cache.jcache.config= # 用来初始化缓存管理器的配置文件的位置。配置文件依赖于底层的缓存实现
spring.cache.jcache.provider= # CachingProvider实现的全限定类名，用来获取JSR-107兼容的缓存管理器，仅在Classpath里有不只一个JSR-107实现时才需要这个属性
spring.cache.type= # 缓存类型，默认根据环境自动检测

# SPRING CONFIG - using environment property only (ConfigFileApplicationListener)
spring.config.location= # Config file locations.
spring.config.name=application # Config file name.

# HAZELCAST (HazelcastProperties)
spring.hazelcast.config= # The location of the configuration file to use to initialize Hazelcast.

# PROJECT INFORMATION (ProjectInfoProperties)
spring.info.build.location=classpath:META-INF/build-info.properties # Location of the generated build-info.properties file.
spring.info.git.location=classpath:git.properties # Location of the generated git.properties file.

# JMX
spring.jmx.default-domain= # JMX domain name.
spring.jmx.enabled=true # Expose management beans to the JMX domain.
spring.jmx.server=mbeanServer # MBeanServer bean name.

# Email (MailProperties)
spring.mail.default-encoding=UTF-8 # 默认的MimeMessage编码，默认值： UTF-8
spring.mail.host= # SMTP server host. For instance `smtp.example.com`
spring.mail.jndi-name= # 会话的JNDI名称。设置之后，该属性的优先级要高于其他邮件设置
spring.mail.password= # Login password of the SMTP server.
spring.mail.port= # SMTP server port.
spring.mail.properties.*= # Additional JavaMail session properties.
spring.mail.protocol=smtp # SMTP服务器用到的协议，默认值： smtp
spring.mail.test-connection=false # 在启动时测试邮件服务器是否可用，默认值： false
spring.mail.username= # Login user of the SMTP server.

# APPLICATION SETTINGS (SpringApplication)
spring.main.banner-mode=console # Mode used to display the banner when the application runs.
spring.main.sources= # Sources (class name, package name or XML resource location) to include in the ApplicationContext.
spring.main.web-environment= # Run the application in a web environment (auto-detected by default).

# FILE ENCODING (FileEncodingApplicationListener)
spring.mandatory-file-encoding= # Expected character encoding the application must use.

# INTERNATIONALIZATION (MessageSourceAutoConfiguration)
spring.messages.always-use-message-format=false # Set whether to always apply the MessageFormat rules, parsing even messages without arguments.
spring.messages.basename=messages # 逗号分隔的基本名称列表，都遵循ResourceBundle的惯例。本质上这就是一个全限定的Classpath位置，如果不包含包限定符（比如org.mypackage），就从Classpath的根部开始解析，默认值： messages
spring.messages.cache-seconds=-1 # 加载的资源包文件的缓存失效时间，单位为秒。 在设置为-1时，包会永远缓存，默认值：-1）
spring.messages.encoding=UTF-8 # 消息包的编码，默认值： UTF-8
spring.messages.fallback-to-system-locale=true # Set whether to fall back to the system Locale if no files for a specific Locale have been found.

# OUTPUT
spring.output.ansi.enabled=detect # Configure the ANSI output.

# PID FILE (ApplicationPidFileWriter)
spring.pid.fail-on-write-error= # Fail if ApplicationPidFileWriter is used but it cannot write the PID file.
spring.pid.file= # Location of the PID file to write (if ApplicationPidFileWriter is used).

# PROFILES
spring.profiles.active= # Comma-separated list of active profiles.
spring.profiles.include= # Unconditionally activate the specified comma separated profiles.

# SENDGRID (SendGridAutoConfiguration)
spring.sendgrid.api-key= # SendGrid api key (alternative to username/password)
spring.sendgrid.username= # SendGrid account username
spring.sendgrid.password= # SendGrid account password
spring.sendgrid.proxy.host= # SendGrid proxy host
spring.sendgrid.proxy.port= # SendGrid proxy port


# ----------------------------------------
# WEB PROPERTIES
# ----------------------------------------

# EMBEDDED SERVER CONFIGURATION (ServerProperties)
server.address= # 服务器绑定的网络地址
server.compression.enabled=false # 是否要开启压缩，默认值： false
server.compression.excluded-user-agents= # 用逗号分割的列表，标明哪些用户代理不该开启压缩（可选值包括： text/html、text/xml、 text/plain、 text/css）
server.compression.mime-types= # 要开启压缩的MIME类型列表，用逗号分割，例如 `text/html,text/css,application/json`
server.compression.min-response-size= # 要执行压缩的最小响应大小（单位为字节），默认值： 2048
server.connection-timeout= # Time in milliseconds that connectors will wait for another HTTP request before closing the connection. When not set, the connector's container-specific default will be used. Use a value of -1 to indicate no (i.e. infinite) timeout.
server.context-parameters.*= # 设置一个Servlet上下文参数. For instance `server.context-parameters.a=alpha`
server.context-path= # 应用程序的上下文路径
server.display-name=application # 应用程序的显示名称，默认值： application
server.max-http-header-size=0 # Maximum size in bytes of the HTTP message header.
server.max-http-post-size=0 # Maximum size in bytes of the HTTP post content.
server.error.include-stacktrace=never # When to include a "stacktrace" attribute.
server.error.path=/error # Path of the error controller.
server.error.whitelabel.enabled=true # Enable the default error page displayed in browsers in case of a server error.
server.jetty.acceptors= # Number of acceptor threads to use.
server.jetty.selectors= # Number of selector threads to use.
server.jsp-servlet.class-name=org.apache.jasper.servlet.JspServlet # 针对JSP使用的Servlet类名
server.jsp-servlet.init-parameters.*= # 设置JSP Servlet初始化参数
server.jsp-servlet.registered=true # JSP Servlet是否要注册到内嵌的Servlet容器里，默认值： true）
server.port=8080 # 服务器的HTTP端口
server.server-header= # Value to use for the Server response header (no header is sent if empty)
server.servlet-path=/ # 主分发器Servlet的路径，默认值： /）
server.use-forward-headers= # If X-Forwarded-* headers should be applied to the HttpRequest.
server.session.cookie.comment= # 会话Cookie的注释
server.session.cookie.domain= # 会话Cookie的域
server.session.cookie.http-only= # 会话Cookie的HttpOnly标记
server.session.cookie.max-age= # 会话Cookie的最大保存时间，单位为秒
server.session.cookie.name= # 会话Cookie名称
server.session.cookie.path= # 会话Cookie的路径
server.session.cookie.secure= # 会话Cookie的Secure标记
server.session.persistent=false # 是否在两次重启间持久化会话数据，默认值： false
server.session.store-dir= # Directory used to store session data.
server.session.timeout= # 会话超时时间，单位为秒
server.session.tracking-modes= # 会话跟踪模式（包括： cookie、 url和ssl，可选其一或若干）
server.ssl.ciphers= # 支持的SSL加密算法
server.ssl.client-auth= # 客户端授权是主动想（want）还是被动需要（need）。要有一个TrustStore
server.ssl.enabled= # 是否开启SSL，默认值： true
server.ssl.enabled-protocols= # Enabled SSL protocols.
server.ssl.key-alias= # 在KeyStore里标识密钥的别名
server.ssl.key-password= # 在KeyStore里用于访问密钥的密码
server.ssl.key-store= # 持有SSL证书的KeyStore的路径（通常指向一个.jks文件）
server.ssl.key-store-password= # 访问KeyStore时使用的密钥
server.ssl.key-store-provider= # KeyStore的提供者
server.ssl.key-store-type= # KeyStore的类型
server.ssl.protocol=TLS # 要使用的SSL协议，默认值： TLS
server.ssl.trust-store= # 持有SSL证书的TrustStore
server.ssl.trust-store-password= # 用于访问TrustStore的密码
server.ssl.trust-store-provider= # TrustStore的提供者
server.ssl.trust-store-type= # TrustStore的类型
server.tomcat.accesslog.directory=logs # 创建日志文件的目录。可以相对于Tomcat基础目录，也可以是绝对路径，默认值：logs
server.tomcat.accesslog.enabled=false # 是否开启访问日志，默认值： false
server.tomcat.accesslog.pattern=common # 访问日志的格式，默认值： common
server.tomcat.accesslog.prefix=access_log # 日志文件名的前缀，默认值： access_log
server.tomcat.accesslog.rename-on-rotate=false # Defer inclusion of the date stamp in the file name until rotate time.
server.tomcat.accesslog.suffix=.log # 日志文件名的后缀，默认值： .log
server.tomcat.background-processor-delay=30 # 两次调用backgroundProcess方法之间的延迟时间，单位为秒，默认值： 30）
server.tomcat.basedir= # Tomcat的基础目录。如果没有指定则使用一个临时目录
server.tomcat.internal-proxies=10\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\
        192\\.168\\.\\d{1,3}\\.\\d{1,3}|\\
        169\\.254\\.\\d{1,3}\\.\\d{1,3}|\\
        127\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}|\\
        172\\.1[6-9]{1}\\.\\d{1,3}\\.\\d{1,3}|\\
        172\\.2[0-9]{1}\\.\\d{1,3}\\.\\d{1,3}|\\
        172\\.3[0-1]{1}\\.\\d{1,3}\\.\\d{1,3} # 匹配可信任代理服务器的正则表达式
server.tomcat.max-threads=0 # 最大工作线程数，默认值： 0
server.tomcat.min-spare-threads=0 # Minimum amount of worker threads.
server.tomcat.port-header=X-Forwarded-Port # 用来覆盖原始端口值的HTTP头的名字
server.tomcat.protocol-header= # 持有流入协议的HTTP头，通常的名字是X-Forwarded-Proto。仅当设置了remoteIpHeader的时候，它会被配置为RemoteIpValve。
server.tomcat.protocol-header-https-value=https # 协议头的值，表明流入请求使用了SSL，默认值： https
server.tomcat.redirect-context-root= # Whether requests to the context root should be redirected by appending a / to the path.
server.tomcat.remote-ip-header= # 表明从哪个HTTP头里可以提取到远端IP。仅当设置了remoteIpHeader的时候，它会被配置为RemoteIpValve. For instance `X-FORWARDED-FOR`
server.tomcat.uri-encoding=UTF-8 # 用来解码URI的字符编码
server.undertow.accesslog.dir= # Undertow的访问日志目录，默认值： logs）
server.undertow.accesslog.enabled=false # 是否开启访问日志，默认值： false）
server.undertow.accesslog.pattern=common # 访问日志的格式，默认值： common
server.undertow.accesslog.prefix=access_log. # Log file name prefix.
server.undertow.accesslog.suffix=log # Log file name suffix.
server.undertow.buffer-size= # 每个缓冲的字节数
server.undertow.buffers-per-region= # 每个区（region）的缓冲数
server.undertow.direct-buffers= # 在Java堆外分配缓冲
server.undertow.io-threads= # 要为工作线程创建的I/O线程数
server.undertow.worker-threads= # 工作线程数

# FREEMARKER (FreeMarkerAutoConfiguration)
spring.freemarker.allow-request-override=false # HttpServletRequest的属性是否允许覆盖（隐藏）控制器生成的同名模型属性
spring.freemarker.allow-session-override=false # HttpSession的属性是否允许覆盖（隐藏）控制器生成的同名模型属性
spring.freemarker.cache=false # 开启模板缓存
spring.freemarker.charset=UTF-8 # 模板编码
spring.freemarker.check-template-location=true # 检查模板位置是否存在
spring.freemarker.content-type=text/html # Content-Type value.
spring.freemarker.enabled=true # 开启FreeMarker的MVC视图解析
spring.freemarker.expose-request-attributes=false # 在模型合并到模板前，是否要把所有的请求属性添加到模型里
spring.freemarker.expose-session-attributes=false # 在模型合并到模板前，是否要把所有的HttpSession属性添加到模型里
spring.freemarker.expose-spring-macro-helpers=true # 是否发布供Spring宏程序库使用的RequestContext，并将命其名为springMacroRequestContext
spring.freemarker.prefer-file-system-access=true # 加载模板时优先通过文件系统访问。文件系统访问能够实时检测到模板变更，默认值：true
spring.freemarker.prefix= # 在构建URL时添加到视图名称前的前缀
spring.freemarker.request-context-attribute= # 在所有视图里使用的RequestContext属性的名称
spring.freemarker.settings.*= # 要传递给FreeMarker配置的各种键
spring.freemarker.suffix= # 在构建URL时添加到视图名称后的后缀
spring.freemarker.template-loader-path=classpath:/templates/ # 模板路径列表，用逗号分隔
spring.freemarker.view-names= # 可解析的视图名称的白名单

# GROOVY TEMPLATES (GroovyTemplateAutoConfiguration)
spring.groovy.template.allow-request-override=false # HttpServletRequest的属性是否允许覆盖（隐藏）控制器生成的同名模型属性
spring.groovy.template.allow-session-override=false # HttpSession的属性是否允许覆盖（隐藏）控制器生成的同名模型属性
spring.groovy.template.cache= # 开启模板缓存
spring.groovy.template.charset=UTF-8 # 模板编码
spring.groovy.template.check-template-location=true # 检查模板位置是否存在
spring.groovy.template.configuration.*= # See GroovyMarkupConfigurer
spring.groovy.template.content-type=test/html # Content-Type value.
spring.groovy.template.enabled=true # 开启Groovy模板的MVC视图解析
spring.groovy.template.expose-request-attributes=false # 在模型合并到模板前，是否要把所有的请求属性添加到模型里
spring.groovy.template.expose-session-attributes=false # 在模型合并到模板前，是否要把所有的HttpSession属性添加到模型里
spring.groovy.template.expose-spring-macro-helpers=true # 是否发布供Spring宏程序库使用的RequestContext，并将其命名为springMacroRequestContext
spring.groovy.template.prefix= # 在构建URL时，添加到视图名称前的前缀
spring.groovy.template.request-context-attribute= # 所有视图里使用的RequestContext属性的名称
spring.groovy.template.resource-loader-path=classpath:/templates/ # 模板路径
spring.groovy.template.suffix=.tpl # 在构建URL时，添加到视图名称后的后缀
spring.groovy.template.view-names= # 可解析的视图名称白名单

# SPRING HATEOAS (HateoasProperties)
spring.hateoas.use-hal-as-default-json-media-type=true # Specify if application/hal+json responses should be sent to requests that accept application/json.

# HTTP message conversion
spring.http.converters.preferred-json-mapper=jackson # HTTP消息转换时优先使用JSON映射器

# HTTP encoding (HttpEncodingProperties)
spring.http.encoding.charset=UTF-8 # HTTP请求和响应的字符集。如果没有显式地指定Content-Type头，则将该属性值作为这个头的值，默认值： UTF-8
spring.http.encoding.enabled=true # 开启HTTP编码支持（默认值：true）
spring.http.encoding.force= # 强制将HTTP请求和响应编码为所配置的字符集
spring.http.encoding.force-request= # Force the encoding to the configured charset on HTTP requests. Defaults to true when "force" has not been specified.
spring.http.encoding.force-response= # Force the encoding to the configured charset on HTTP responses.

# MULTIPART (MultipartProperties)
spring.http.multipart.enabled=true # 开启分段（multi-part）上传支持，默认值： true
spring.http.multipart.file-size-threshold=0 # 大于该阈值的文件会写到磁盘上。这里的值可以使用MB或KB后缀来表明是兆字节还是千字节，默认值： 0）
spring.http.multipart.location= # 上传文件的中间存放位置
spring.http.multipart.max-file-size=1Mb # 最大文件大小。这里的值可以使用MB或KB后缀来表明是兆字节还是千字节，默认值：1MB
spring.http.multipart.max-request-size=10Mb # 最大请求大小。这里的值可以使用MB或KB后缀来表明是兆字节还是千字节，默认值：10MB）
spring.http.multipart.resolve-lazily=false # Whether to resolve the multipart request lazily at the time of file or parameter access.

# JACKSON (JacksonProperties)
spring.jackson.date-format= # 日期格式字符串（yyyy-MM-dd HH:mm:ss）或日期格式类的全限定类名
spring.jackson.default-property-inclusion= # Controls the inclusion of properties during serialization.
spring.jackson.deserialization.*= # 影响Java对象反序列化的Jackson on/off特性
spring.jackson.generator.*= # 用于生成器的Jackson on/off特性
spring.jackson.joda-date-time-format= # Joda日期时间格式字符串（yyyy-MM-dd HH:mm:ss）。如果没有配置，而date-format又配置了一个格式字符串的话，会将它作为降级配置
spring.jackson.locale= # 用于格式化的地域值
spring.jackson.mapper.*= # Jackson的通用on/off特性
spring.jackson.parser.*= # 用于解析器的Jackson on/off特性
spring.jackson.property-naming-strategy= # Jackson的PropertyNamingStrategy中的一个常量（CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES）。也可以设置PropertyNamingStrategy的子类的全限定类名
spring.jackson.serialization.*= # 影响Java对象序列化的Jackson on/off特性
spring.jackson.serialization-inclusion= # 控制序列化时要包含哪些属性。可选择Jackson的JsonInclude.Include枚举里的某个值。
spring.jackson.time-zone= # 格式化日期时使用的时区。可以配置各种可识别的时区标识符，比如America/Los_Angeles或者GMT+10

# JERSEY (JerseyProperties)
spring.jersey.application-path= # Path that serves as the base URI for the application. Overrides the value of "@ApplicationPath" if specified.
spring.jersey.filter.order=0 # Jersey过滤器链的顺序，默认值： 0
spring.jersey.init.*= # 通过Servlet或过滤器传递给Jersey的初始化参数
spring.jersey.servlet.load-on-startup=-1 # Load on startup priority of the Jersey servlet.
spring.jersey.type=servlet # Jersey集成类型。可以是servlet或者filter

# SPRING MOBILE DEVICE VIEWS (DeviceDelegatingViewResolverAutoConfiguration)
spring.mobile.devicedelegatingviewresolver.enable-fallback=false # 开启降级解析支持，默认值： false
spring.mobile.devicedelegatingviewresolver.enabled=false # 开启设备视图解析器，默认值： false
spring.mobile.devicedelegatingviewresolver.mobile-prefix=mobile/ # 添加到移动设备视图名前的前缀，默认值： mobile/
spring.mobile.devicedelegatingviewresolver.mobile-suffix= # 添加到移动设备视图名后的后缀
spring.mobile.devicedelegatingviewresolver.normal-prefix= # 添加到普通设备视图名前的前缀
spring.mobile.devicedelegatingviewresolver.normal-suffix= # 加到普通设备视图名后的后缀
spring.mobile.devicedelegatingviewresolver.tablet-prefix=tablet/ # 添加到平板设备视图名前的前缀
spring.mobile.devicedelegatingviewresolver.tablet-suffix= # 添加到平板设备视图名后的后缀

# SPRING MOBILE SITE PREFERENCE (SitePreferenceAutoConfiguration)
spring.mobile.sitepreference.enabled=true # 开启SitePreferenceHandler，默认值： true

# MUSTACHE TEMPLATES (MustacheAutoConfiguration)
spring.mustache.allow-request-override= # Set whether HttpServletRequest attributes are allowed to override (hide) controller generated model attributes of the same name.
spring.mustache.allow-session-override= # Set whether HttpSession attributes are allowed to override (hide) controller generated model attributes of the same name.
spring.mustache.cache= # 开启模板缓存
spring.mustache.charset= # 模板编码
spring.mustache.check-template-location= # 检查模板位置是否存在
spring.mustache.content-type= # Content-Type value.
spring.mustache.enabled= # 开启Mustache的MVC视图解析
spring.mustache.expose-request-attributes= # Set whether all request attributes should be added to the model prior to merging with the template.
spring.mustache.expose-session-attributes= # Set whether all HttpSession attributes should be added to the model prior to merging with the template.
spring.mustache.expose-spring-macro-helpers= # Set whether to expose a RequestContext for use by Spring's macro library, under the name "springMacroRequestContext".
spring.mustache.prefix=classpath:/templates/ # Prefix to apply to template names.
spring.mustache.request-context-attribute= # Name of the RequestContext attribute for all views.
spring.mustache.suffix=.html # 添加到模板名后的后缀，默认值： .html
spring.mustache.view-names= # 可解析的视图名称的白名单

# SPRING MVC (WebMvcProperties)
spring.mvc.async.request-timeout= # 异步请求处理超时前的等待时间（单位为毫秒）。如果没有设置该属性，则使用底层实现的默认超时时间，比如， Tomcat上使用Servlet 3时超时时间为10秒
spring.mvc.date-format= # 要使用的日期格式（比如dd/MM/yyyy）
spring.mvc.dispatch-trace-request=false # Dispatch TRACE requests to the FrameworkServlet doService method.
spring.mvc.dispatch-options-request=true # Dispatch OPTIONS requests to the FrameworkServlet doService method.
spring.mvc.favicon.enabled=true # 开启favicon.ico的解析，默认值： true
spring.mvc.formcontent.putfilter.enabled=true # Enable Spring's HttpPutFormContentFilter.
spring.mvc.ignore-default-model-on-redirect=true # 在重定向的场景下，是否要忽略“默认”模型对象的内容，默认值： true
spring.mvc.locale= # 要使用的地域配置. By default, this locale is overridden by the "Accept-Language" header.
spring.mvc.locale-resolver=accept-header # Define how the locale should be resolved.
spring.mvc.log-resolved-exception=false # Enable warn logging of exceptions resolved by a "HandlerExceptionResolver".
spring.mvc.media-types.*= # Maps file extensions to media types for content negotiation.
spring.mvc.message-codes-resolver-format= # 消息代码格式（PREFIX_ERROR_CODE、 POSTFIX_ERROR_CODE）
spring.mvc.servlet.load-on-startup=-1 # Load on startup priority of the Spring Web Services servlet.
spring.mvc.static-path-pattern=/** # Path pattern used for static resources.
spring.mvc.throw-exception-if-no-handler-found=false # If a "NoHandlerFoundException" should be thrown if no Handler was found to process a request.
spring.mvc.view.prefix= # Spring MVC视图前缀
spring.mvc.view.suffix= # Spring MVC视图后缀

# SPRING RESOURCES HANDLING (ResourceProperties)
spring.resources.add-mappings=true # 开启默认资源处理，默认值： true
spring.resources.cache-period= # 资源处理器对资源的缓存周期，单位为秒
spring.resources.chain.cache=true # 对资源链开启缓存，默认值： true
spring.resources.chain.enabled= # 开启Spring资源处理链，默认关闭的，除非至少开启了一个策略
spring.resources.chain.gzipped=false # Enable resolution of already gzipped resources.
spring.resources.chain.html-application-cache=false # Enable HTML5 application cache manifest rewriting.
spring.resources.chain.strategy.content.enabled=false # 开启内容版本策略，默认值： false
spring.resources.chain.strategy.content.paths=/** # 要运用于版本策略的模式列表，用逗号分隔，默认值： [/**]
spring.resources.chain.strategy.fixed.enabled=false # 开启固定版本策略，默认值： false
spring.resources.chain.strategy.fixed.paths=/** # 要运用于固定版本策略的模式列表，用逗号分隔
spring.resources.chain.strategy.fixed.version= # 用于固定版本策略的版本字符串
spring.resources.static-locations=classpath:/META-INF/resources/,classpath:/resources/,classpath:/static/,classpath:/public/ # 静态资源位置

# SPRING SESSION (SessionProperties)
spring.session.hazelcast.map-name=spring:session:sessions # Name of the map used to store sessions.
spring.session.jdbc.initializer.enabled= # Create the required session tables on startup if necessary. Enabled automatically if the default table name is set or a custom schema is configured.
spring.session.jdbc.schema=classpath:org/springframework/session/jdbc/schema-@@platform@@.sql # Path to the SQL file to use to initialize the database schema.
spring.session.jdbc.table-name=SPRING_SESSION # Name of database table used to store sessions.
spring.session.mongo.collection-name=sessions # Collection name used to store sessions.
spring.session.redis.flush-mode= # Flush mode for the Redis sessions.
spring.session.redis.namespace= # Namespace for keys used to store sessions.
spring.session.store-type= # Session store type.

# SPRING SOCIAL (SocialWebAutoConfiguration)
spring.social.auto-connection-views=false # 针对所支持的提供方开启连接状态视图，默认值： false

# SPRING SOCIAL FACEBOOK (FacebookAutoConfiguration)
spring.social.facebook.app-id= # your application's Facebook App ID
spring.social.facebook.app-secret= # your application's Facebook App Secret

# SPRING SOCIAL LINKEDIN (LinkedInAutoConfiguration)
spring.social.linkedin.app-id= # your application's LinkedIn App ID
spring.social.linkedin.app-secret= # your application's LinkedIn App Secret

# SPRING SOCIAL TWITTER (TwitterAutoConfiguration)
spring.social.twitter.app-id= # your application's Twitter App ID
spring.social.twitter.app-secret= # your application's Twitter App Secret

# THYMELEAF (ThymeleafAutoConfiguration)
spring.thymeleaf.cache=true # 开启模板缓存，默认值： true
spring.thymeleaf.check-template=true # Check that the template exists before rendering it.
spring.thymeleaf.check-template-location=true # 检查模板位置是否存在，默认值： true
spring.thymeleaf.content-type=text/html # Content-Type value.
spring.thymeleaf.enabled=true # 开启MVC Thymeleaf视图解析，默认值： true
spring.thymeleaf.encoding=UTF-8 # Template encoding.
spring.thymeleaf.excluded-view-names= # 要被排除在解析之外的视图名称列表，用逗号分隔
spring.thymeleaf.mode=HTML5 # 要运用于模板之上的模板模式。另见StandardTemplate- ModeHandlers，默认值：HTML5
spring.thymeleaf.prefix=classpath:/templates/ # 在构建URL时添加到视图名称前的前缀，默认值： classpath:/templates/）
spring.thymeleaf.suffix=.html # 在构建URL时添加到视图名称后的后缀，默认值：.html）
spring.thymeleaf.template-resolver-order= # Thymeleaf模板解析器在解析器链中的顺序。默认情况下，它排在第一位。顺序从1开始，只有在定义了额外的TemplateResolver Bean时才需要设置这个属性
spring.thymeleaf.view-names= # 可解析的视图名称列表，用逗号分隔

# VELOCITY TEMPLATES (VelocityAutoConfiguration)
spring.velocity.allow-request-override=false # HttpServletRequest的属性是否允许覆盖（隐藏）控制器生成的同名模型属性
spring.velocity.allow-session-override=false # HttpSession的属性是否允许覆盖（隐藏）控制器生成的同名模型属性
spring.velocity.cache= # Enable template caching.
spring.velocity.charset=UTF-8 # Template encoding.
spring.velocity.check-template-location=true # Check that the templates location exists.
spring.velocity.content-type=text/html # Content-Type value.
spring.velocity.date-tool-attribute= # DateTool辅助对象在视图的Velocity上下文里呈现的名字
spring.velocity.enabled=true # 开启Velocity的MVC视图解析
spring.velocity.expose-request-attributes=false # 在模型合并到模板前，是否要把所有的请求属性添加到模型里
spring.velocity.expose-session-attributes=false # 在模型合并到模板前，是否要把所有的HttpSession属性添加到模型里
spring.velocity.expose-spring-macro-helpers=true # 是否发布供Spring宏程序库使用的RequestContext，并将其名命为springMacroRequestContext。
spring.velocity.number-tool-attribute= # NumberTool辅助对象在视图的Velocity上下文里呈现的名字
spring.velocity.prefer-file-system-access=true # 加载模板时优先通过文件系统访问。文件系统访问能够实时检测到模板变更，默认值：true
spring.velocity.prefix= # 在构建URL时添加到视图名称前的前缀
spring.velocity.properties.*= # 额外的Velocity属性
spring.velocity.request-context-attribute= # 所有视图里使用的Request- Context属性的名称
spring.velocity.resource-loader-path=classpath:/templates/ # 模板路径
spring.velocity.suffix=.vm # 在构建URL时添加到视图名称后的后缀
spring.velocity.toolbox-config-location= # Velocity Toolbox的配置位置，比如/WEB-INF/toolbox.xml。自动加载Velocity Tools工具定义文件，将所定义的全部工具发布到指定的作用域内
spring.velocity.view-names= # 可解析的视图名称白名单

# SPRING WEB SERVICES (WebServicesProperties)
spring.webservices.path=/services # Path that serves as the base URI for the services.
spring.webservices.servlet.init= # Servlet init parameters to pass to Spring Web Services.
spring.webservices.servlet.load-on-startup=-1 # Load on startup priority of the Spring Web Services servlet.



# ----------------------------------------
# SECURITY PROPERTIES
# ----------------------------------------
# SECURITY (SecurityProperties)
security.basic.authorize-mode=role # 要运用的安全授权模式
security.basic.enabled=true # 开启基本身份验证（默认值： true）
security.basic.path=/** # 要保护的路径，用逗号分隔（默认值： [/**]）
security.basic.realm=Spring # HTTP基本领域（realm）用户名，默认值： Spring
security.enable-csrf=false # 开启跨站请求伪造（cross-site request forgery）支持，默认值： false
security.filter-order=0 # 安全过滤器链顺序，默认值： 0
security.filter-dispatcher-types=ASYNC, FORWARD, INCLUDE, REQUEST # Security filter chain dispatcher types.
security.headers.cache=true # 开启缓存控制HTTP头，默认值： false
security.headers.content-type=true # 开启X-Content-Type-Options头，默认值： false
security.headers.frame=true # 开启X-Frame-Options头，默认值： false
security.headers.hsts= # HTTP Strict Transport Security（HSTS）模式（可设置为none、 domain、 all）
security.headers.xss=true # 开启跨站脚本（cross-site scripting）保护，默认值： false
security.ignored= # 要从默认保护路径中排除掉的路径列表，用逗号分隔
security.require-ssl=false # 对所有请求开启安全通道，默认值： false
security.sessions=stateless # 创建会话使用的策略，可选值包括： always、 never、 if_required、 stateless）
security.user.name=user # 默认的用户名（默认值： user）
security.user.password= # 默认用户的密码 (A random password is logged on startup by default.)
security.user.role=USER # 赋予默认用户的角

# SECURITY OAUTH2 CLIENT (OAuth2ClientProperties
security.oauth2.client.client-id= # OAuth2客户端ID
security.oauth2.client.client-secret= # OAuth2客户端密钥，默认随机生成

# SECURITY OAUTH2 RESOURCES (ResourceServerProperties
security.oauth2.resource.id= # 资源的标识符
security.oauth2.resource.jwt.key-uri= # JWT令牌的URI，如果没有配置key-value，使用的又是公钥，那么可以对这个属性进行设置
security.oauth2.resource.jwt.key-value= # WT令牌的验证密钥，可以是对称密钥，也可以是PEM编码的RSA公钥。如果没有配置这个属性，那么可以用key-uri代替
security.oauth2.resource.prefer-token-info=true # 使用令牌的信息，设置为false则使用用户信息，默认值： true）
security.oauth2.resource.service-id=resource # 服务ID，默认值： resource）
security.oauth2.resource.token-info-uri= # 令牌解码端点URI
security.oauth2.resource.token-type= # 在使用userInfoUri时发送的令牌类型
security.oauth2.resource.user-info-uri= # URI of the user endpoint.

# SECURITY OAUTH2 SSO (OAuth2SsoProperties
security.oauth2.sso.filter-order= # 在没有显式提供WebSecurityConfigurerAdapter时应用的过滤器顺序，在WebSecurityConfigurerAdapter里也可以指定顺序
security.oauth2.sso.login-path=/login # 登录页的路径——登录页是触发重定向到OAuth2授权服务器的页面，默认值：/login）


# ----------------------------------------
# DATA PROPERTIES
# ----------------------------------------

# FLYWAY (FlywayProperties)
flyway.baseline-description= # 执行基线时标记已有Schema的描述
flyway.baseline-version=1 # 执行基线时用来标记已有Schema的版本，默认值：1）
flyway.baseline-on-migrate= # 在没有元数据表的情况下，针对非空Schema执行迁移时是否自动调用基线，默认值：false）
flyway.check-location=false # 检查迁移脚本所在的位置是否存在，默认值：false）
flyway.clean-on-validation-error= # 在验证错误时，是否自动执行清理，默认值：false）
flyway.enabled=true # 开启Flyway，默认值：true）
flyway.encoding= # 设置SQL迁移文件的编码，默认值：UTF-8）
flyway.ignore-failed-future-migration= # 在读元数据表时，是否忽略失败的后续迁移（默认值：false）
flyway.init-sqls= # 获取连接后立即执行初始化的SQL语句
flyway.locations=classpath:db/migration # 迁移脚本的位置（默认值：db/migration）
flyway.out-of-order= # 是否允许乱序（out of order）迁移，默认值： false
flyway.password= # 待迁移数据库的登录密码
flyway.placeholder-prefix= # 设置每个占位符的前缀，默认值： ${
flyway.placeholder-replacement= # 是否要替换占位符，默认值： true
flyway.placeholder-suffix= # 设置占位符的后缀，默认值： }
flyway.placeholders.*= # 设置占位符的值（flyway.placeholders.[placeholder name]）
flyway.schemas= # Flyway管理的Schema列表，区分大小写。默认连接对应的默认Schema
flyway.sql-migration-prefix=V # SQL迁移的文件名前缀，默认值： V
flyway.sql-migration-separator= # SQL迁移的文件名分隔符，默认值： __
flyway.sql-migration-suffix=.sql # SQL迁移的文件名后缀，默认值： .sql
flyway.table= # Flyway使用的Schema元数据表名称，默认值： schema_version
flyway.url= # 待迁移的数据库的JDBC URL。如果没有设置，就使用配置的主数据源
flyway.user= # 待迁移数据库的登录用户
flyway.validate-on-migrate= # 在运行迁移时是否要自动验证，默认值： true

# LIQUIBASE (LiquibaseProperties)
liquibase.change-log=classpath:/db/changelog/db.changelog-master.yaml # 变更日志配置路径。
liquibase.check-change-log-location=true # 检查变更日志位置是否存在
liquibase.contexts= # 要使用的运行时上下文列表，用逗号分隔
liquibase.default-schema= # 默认的数据库Schema
liquibase.drop-first=false # 先删除数据库Schema，默认值： false
liquibase.enabled=true # 开启Liquibase支持，默认值： true
liquibase.labels= # Comma-separated list of runtime labels to use.
liquibase.parameters.*= # Change log parameters.
liquibase.password= # 待迁移数据库的登录密码
liquibase.rollback-file= # File to which rollback SQL will be written when an update is performed.
liquibase.url= # 待迁移数据库的JDBC URL。如果没有设置，就使用配置的主数据源
liquibase.user= # 待迁移数据库的登录用户

# COUCHBASE (CouchbaseProperties)
spring.couchbase.bootstrap-hosts= # Couchbase nodes (host or IP address) to bootstrap from.
spring.couchbase.bucket.name=default # Name of the bucket to connect to.
spring.couchbase.bucket.password=  # Password of the bucket.
spring.couchbase.env.endpoints.key-value=1 # Number of sockets per node against the Key/value service.
spring.couchbase.env.endpoints.query=1 # Number of sockets per node against the Query (N1QL) service.
spring.couchbase.env.endpoints.view=1 # Number of sockets per node against the view service.
spring.couchbase.env.ssl.enabled= # Enable SSL support. Enabled automatically if a "keyStore" is provided unless specified otherwise.
spring.couchbase.env.ssl.key-store= # Path to the JVM key store that holds the certificates.
spring.couchbase.env.ssl.key-store-password= # Password used to access the key store.
spring.couchbase.env.timeouts.connect=5000 # Bucket connections timeout in milliseconds.
spring.couchbase.env.timeouts.key-value=2500 # Blocking operations performed on a specific key timeout in milliseconds.
spring.couchbase.env.timeouts.query=7500 # N1QL query operations timeout in milliseconds.
spring.couchbase.env.timeouts.socket-connect=1000 # Socket connect connections timeout in milliseconds.
spring.couchbase.env.timeouts.view=7500 # Regular and geospatial view operations timeout in milliseconds.

# DAO (PersistenceExceptionTranslationAutoConfiguration)
spring.dao.exceptiontranslation.enabled=true # Enable the PersistenceExceptionTranslationPostProcessor.

# CASSANDRA (CassandraProperties)
spring.data.cassandra.cluster-name= # Name of the Cassandra cluster.
spring.data.cassandra.compression= # Compression supported by the Cassandra binary protocol.
spring.data.cassandra.connect-timeout-millis= # Socket option: connection time out.
spring.data.cassandra.consistency-level= # Queries consistency level.
spring.data.cassandra.contact-points=localhost # Comma-separated list of cluster node addresses.
spring.data.cassandra.fetch-size= # Queries default fetch size.
spring.data.cassandra.keyspace-name= # Keyspace name to use.
spring.data.cassandra.load-balancing-policy= # Class name of the load balancing policy.
spring.data.cassandra.port= # Port of the Cassandra server.
spring.data.cassandra.password= # Login password of the server.
spring.data.cassandra.read-timeout-millis= # Socket option: read time out.
spring.data.cassandra.reconnection-policy= # Reconnection policy class.
spring.data.cassandra.retry-policy= # Class name of the retry policy.
spring.data.cassandra.serial-consistency-level= # Queries serial consistency level.
spring.data.cassandra.schema-action=none # Schema action to take at startup.
spring.data.cassandra.ssl=false # Enable SSL support.
spring.data.cassandra.username= # Login user of the server.

# DATA COUCHBASE (CouchbaseDataProperties)
spring.data.couchbase.auto-index=false # Automatically create views and indexes.
spring.data.couchbase.consistency=read-your-own-writes # Consistency to apply by default on generated queries.
spring.data.couchbase.repositories.enabled=true # Enable Couchbase repositories.

# ELASTICSEARCH (ElasticsearchProperties)
spring.data.elasticsearch.cluster-name=elasticsearch # Elasticsearch集群名
spring.data.elasticsearch.cluster-nodes= # 集群节点地址列表，用逗号分隔。如果没有指定，就启动一个客户端节点
spring.data.elasticsearch.properties.*= # 用来配置客户端的额外属性
spring.data.elasticsearch.repositories.enabled=true # 开启Elasticsearch仓库

# MONGODB (MongoProperties)
spring.data.mongodb.authentication-database= # 身份认证数据库名
spring.data.mongodb.database=test # 数据库名
spring.data.mongodb.field-naming-strategy= # 要使用的FieldNamingStrategy的全限定名
spring.data.mongodb.grid-fs-database= # GridFS数据库名称
spring.data.mongodb.host=localhost # Mongo服务器主机地址
spring.data.mongodb.password= # Mongo服务器的登录密码
spring.data.mongodb.port=27017 # Mongo服务器端口号
spring.data.mongodb.repositories.enabled=true # 开启Mongo仓库
spring.data.mongodb.uri=mongodb://localhost/test # Mongo数据库URI。设置了该属性后就主机和端口号会被忽略
spring.data.mongodb.username= # Mongo服务器的登录用户名

# DATA REDIS
spring.data.redis.repositories.enabled=true # Enable Redis repositories.

# NEO4J (Neo4jProperties)
spring.data.neo4j.compiler= # Compiler to use.
spring.data.neo4j.embedded.enabled=true # Enable embedded mode if the embedded driver is available.
spring.data.neo4j.password= # Login password of the server.
spring.data.neo4j.repositories.enabled=true # Enable Neo4j repositories.
spring.data.neo4j.session.scope=singleton # Scope (lifetime) of the session.
spring.data.neo4j.uri= # URI used by the driver. Auto-detected by default.
spring.data.neo4j.username= # Login user of the server.

# DATA REST (RepositoryRestProperties)
spring.data.rest.base-path= # Base path to be used by Spring Data REST to expose repository resources.
spring.data.rest.default-page-size= # 分页数据的默认页大小，默认值： 20）
spring.data.rest.enable-enum-translation= # Enable enum value translation via the Spring Data REST default resource bundle.
spring.data.rest.limit-param-name= # 用于标识一次返回多少记录的URL查询字符串参数名
spring.data.rest.max-page-size= # 最大分页大小，默认值： 1000
spring.data.rest.page-param-name= # URL查询字符串参数的名称，用来标识返回哪一页，默认值： page
spring.data.rest.return-body-on-create= # 在创建实体后是否返回一个响应体，默认值： false
spring.data.rest.return-body-on-update= # 在更新实体后是否返回一个响应体，默认值： false
spring.data.rest.sort-param-name= # URL查询字符串参数的名称，用来标识结果排序的方向，默认值： sort

# SOLR (SolrProperties)
spring.data.solr.host=http://127.0.0.1:8983/solr # Solr的主机地址。如果设置了zk-host则忽略该属性
spring.data.solr.repositories.enabled=true # 开启Solr仓库
spring.data.solr.zk-host= #ZooKeeper主机地址，格式为“主机:端口”

# DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.continue-on-error=false # 初始化数据库时发生错误不要终止，默认值： false
spring.datasource.data= # 指向数据（数据库操纵语言， Data Manipulation Language， DML）脚本资源的引用
spring.datasource.data-username= # User of the database to execute DML scripts (if different).
spring.datasource.data-password= # Password of the database to execute DML scripts (if different).
spring.datasource.dbcp.*= # Commons DBCP specific settings
spring.datasource.dbcp2.*= # Commons DBCP2 specific settings
spring.datasource.driver-class-name= # JDBC驱动的全限定类名。默认根据URL自动检测
spring.datasource.hikari.*= # Hikari specific settings
spring.datasource.initialize=true # 使用data.sql初始化数据库，默认值：true）
spring.datasource.jmx-enabled=false # 开启JMX支持（如果底层连接池提供该功能的话），默认值： false）
spring.datasource.jndi-name= # 数据源的JNDI位置。设置了该属性则忽略类、 URL、用户名和密码属性
spring.datasource.name=testdb # 数据源的名称
spring.datasource.password= # 数据库的登录密码
spring.datasource.platform=all # Platform to use in the schema resource (schema-${platform}.sql).
spring.datasource.schema= # Schema（数据定义语言， Data Definition Language， DDL）脚本资源的引用
spring.datasource.schema-username= # User of the database to execute DDL scripts (if different).
spring.datasource.schema-password= # Password of the database to execute DDL scripts (if different).
spring.datasource.separator=; # SQL初始化脚本里的语句分割符，默认值： ;
spring.datasource.sql-script-encoding= # SQL脚本的编码
spring.datasource.tomcat.*= # Tomcat datasource specific settings
spring.datasource.type= # Fully qualified name of the connection pool implementation to use. By default, it is auto-detected from the classpath.
spring.datasource.url= # 数据库的JDBC URL
spring.datasource.username=

# JEST (Elasticsearch HTTP client) (JestProperties)
spring.elasticsearch.jest.connection-timeout=3000 # Connection timeout in milliseconds.
spring.elasticsearch.jest.password= # Login password.
spring.elasticsearch.jest.proxy.host= # Proxy host the HTTP client should use.
spring.elasticsearch.jest.proxy.port= # Proxy port the HTTP client should use.
spring.elasticsearch.jest.read-timeout=3000 # Read timeout in milliseconds.
spring.elasticsearch.jest.uris=http://localhost:9200 # Comma-separated list of the Elasticsearch instances to use.
spring.elasticsearch.jest.username= # Login user.

# H2 Web Console (H2ConsoleProperties)
spring.h2.console.enabled=false # 开启控制台（默认值： false）
spring.h2.console.path=/h2-console # 可以找到控制台的路径，默认值： /h2-console
spring.h2.console.settings.trace=false # Enable trace output.
spring.h2.console.settings.web-allow-others=false # Enable remote access.

# JOOQ (JooqAutoConfiguration)
spring.jooq.sql-dialect= # 在与配置的数据源通信时， JOOQ使用的SQLDialect，比如POSTGRES

# JPA (JpaBaseConfiguration, HibernateJpaAutoConfiguration)
spring.data.jpa.repositories.enabled=true # 开启JPA仓库，默认值： true
spring.jpa.database= # 要操作的目标数据库，默认自动检测。也可以通过databasePlatform属性进行设置
spring.jpa.database-platform= # 要操作的目标数据库，默认自动检测。也可以通过Database枚举来设置
spring.jpa.generate-ddl=false # 启动时要初始化Schema
spring.jpa.hibernate.ddl-auto= # DDL模式（none、 validate、 update、 create和create-drop）。这是hibernate.hbm2ddl.auto属性的一个快捷方式。在使用嵌入式数据库时，默认为create-drop；其他情况下默认为none
spring.jpa.hibernate.naming.implicit-strategy= # Hibernate 5 implicit naming strategy fully qualified name.
spring.jpa.hibernate.naming.physical-strategy= # Hibernate 5 physical naming strategy fully qualified name.
spring.jpa.hibernate.naming.strategy= # Hibernate 4 naming strategy fully qualified name. Not supported with Hibernate 5.
spring.jpa.hibernate.use-new-id-generator-mappings= # Use Hibernate's newer IdentifierGenerator for AUTO, TABLE and SEQUENCE.
spring.jpa.open-in-view=true # 注册OpenEntityManagerInViewInterceptor，在请求的整个处理过程中， 将一个JPAEntityManager绑定到线程上，默认值： true
spring.jpa.properties.*= # JPA提供方要设置的额外原生属性
spring.jpa.show-sql=false # 在使用Bitronix Transaction Manager时打开SQL语句日志

# JTA (JtaAutoConfiguration)
spring.jta.enabled=true # 开启JTA支持
spring.jta.log-dir= # 事务日志目录
spring.jta.transaction-manager-id= # 事务管理器的唯一标识符

# ATOMIKOS (AtomikosProperties)
spring.jta.atomikos.connectionfactory.borrow-connection-timeout=30 # Timeout, in seconds, for borrowing connections from the pool.
spring.jta.atomikos.connectionfactory.ignore-session-transacted-flag=true # Whether or not to ignore the transacted flag when creating session.
spring.jta.atomikos.connectionfactory.local-transaction-mode=false # Whether or not local transactions are desired.
spring.jta.atomikos.connectionfactory.maintenance-interval=60 # The time, in seconds, between runs of the pool's maintenance thread.
spring.jta.atomikos.connectionfactory.max-idle-time=60 # The time, in seconds, after which connections are cleaned up from the pool.
spring.jta.atomikos.connectionfactory.max-lifetime=0 # The time, in seconds, that a connection can be pooled for before being destroyed. 0 denotes no limit.
spring.jta.atomikos.connectionfactory.max-pool-size=1 # The maximum size of the pool.
spring.jta.atomikos.connectionfactory.min-pool-size=1 # The minimum size of the pool.
spring.jta.atomikos.connectionfactory.reap-timeout=0 # The reap timeout, in seconds, for borrowed connections. 0 denotes no limit.
spring.jta.atomikos.connectionfactory.unique-resource-name=jmsConnectionFactory # The unique name used to identify the resource during recovery.
spring.jta.atomikos.datasource.borrow-connection-timeout=30 # Timeout, in seconds, for borrowing connections from the pool.
spring.jta.atomikos.datasource.default-isolation-level= # Default isolation level of connections provided by the pool.
spring.jta.atomikos.datasource.login-timeout= # Timeout, in seconds, for establishing a database connection.
spring.jta.atomikos.datasource.maintenance-interval=60 # The time, in seconds, between runs of the pool's maintenance thread.
spring.jta.atomikos.datasource.max-idle-time=60 # The time, in seconds, after which connections are cleaned up from the pool.
spring.jta.atomikos.datasource.max-lifetime=0 # The time, in seconds, that a connection can be pooled for before being destroyed. 0 denotes no limit.
spring.jta.atomikos.datasource.max-pool-size=1 # The maximum size of the pool.
spring.jta.atomikos.datasource.min-pool-size=1 # The minimum size of the pool.
spring.jta.atomikos.datasource.reap-timeout=0 # The reap timeout, in seconds, for borrowed connections. 0 denotes no limit.
spring.jta.atomikos.datasource.test-query= # SQL query or statement used to validate a connection before returning it.
spring.jta.atomikos.datasource.unique-resource-name=dataSource # The unique name used to identify the resource during recovery.
spring.jta.atomikos.properties.checkpoint-interval=500 # Interval between checkpoints.
spring.jta.atomikos.properties.console-file-count=1 # Number of debug logs files that can be created.
spring.jta.atomikos.properties.console-file-limit=-1 # How many bytes can be stored at most in debug logs files.
spring.jta.atomikos.properties.console-file-name=tm.out # Debug logs file name.
spring.jta.atomikos.properties.console-log-level= # Console log level.
spring.jta.atomikos.properties.default-jta-timeout=10000 # Default timeout for JTA transactions.
spring.jta.atomikos.properties.enable-logging=true # Enable disk logging.
spring.jta.atomikos.properties.force-shutdown-on-vm-exit=false # Specify if a VM shutdown should trigger forced shutdown of the transaction core.
spring.jta.atomikos.properties.log-base-dir= # Directory in which the log files should be stored.
spring.jta.atomikos.properties.log-base-name=tmlog # Transactions log file base name.
spring.jta.atomikos.properties.max-actives=50 # Maximum number of active transactions.
spring.jta.atomikos.properties.max-timeout=300000 # Maximum timeout (in milliseconds) that can be allowed for transactions.
spring.jta.atomikos.properties.output-dir= # Directory in which to store the debug log files.
spring.jta.atomikos.properties.serial-jta-transactions=true # Specify if sub-transactions should be joined when possible.
spring.jta.atomikos.properties.service= # Transaction manager implementation that should be started.
spring.jta.atomikos.properties.threaded-two-phase-commit=true # Use different (and concurrent) threads for two-phase commit on the participating resources.
spring.jta.atomikos.properties.transaction-manager-unique-name= # Transaction manager's unique name.

# BITRONIX
spring.jta.bitronix.connectionfactory.acquire-increment=1 # Number of connections to create when growing the pool.
spring.jta.bitronix.connectionfactory.acquisition-interval=1 # Time, in seconds, to wait before trying to acquire a connection again after an invalid connection was acquired.
spring.jta.bitronix.connectionfactory.acquisition-timeout=30 # Timeout, in seconds, for acquiring connections from the pool.
spring.jta.bitronix.connectionfactory.allow-local-transactions=true # Whether or not the transaction manager should allow mixing XA and non-XA transactions.
spring.jta.bitronix.connectionfactory.apply-transaction-timeout=false # Whether or not the transaction timeout should be set on the XAResource when it is enlisted.
spring.jta.bitronix.connectionfactory.automatic-enlisting-enabled=true # Whether or not resources should be enlisted and delisted automatically.
spring.jta.bitronix.connectionfactory.cache-producers-consumers=true # Whether or not produces and consumers should be cached.
spring.jta.bitronix.connectionfactory.defer-connection-release=true # Whether or not the provider can run many transactions on the same connection and supports transaction interleaving.
spring.jta.bitronix.connectionfactory.ignore-recovery-failures=false # Whether or not recovery failures should be ignored.
spring.jta.bitronix.connectionfactory.max-idle-time=60 # The time, in seconds, after which connections are cleaned up from the pool.
spring.jta.bitronix.connectionfactory.max-pool-size=10 # The maximum size of the pool. 0 denotes no limit.
spring.jta.bitronix.connectionfactory.min-pool-size=0 # The minimum size of the pool.
spring.jta.bitronix.connectionfactory.password= # The password to use to connect to the JMS provider.
spring.jta.bitronix.connectionfactory.share-transaction-connections=false #  Whether or not connections in the ACCESSIBLE state can be shared within the context of a transaction.
spring.jta.bitronix.connectionfactory.test-connections=true # Whether or not connections should be tested when acquired from the pool.
spring.jta.bitronix.connectionfactory.two-pc-ordering-position=1 # The position that this resource should take during two-phase commit (always first is Integer.MIN_VALUE, always last is Integer.MAX_VALUE).
spring.jta.bitronix.connectionfactory.unique-name=jmsConnectionFactory # The unique name used to identify the resource during recovery.
spring.jta.bitronix.connectionfactory.use-tm-join=true Whether or not TMJOIN should be used when starting XAResources.
spring.jta.bitronix.connectionfactory.user= # The user to use to connect to the JMS provider.
spring.jta.bitronix.datasource.acquire-increment=1 # Number of connections to create when growing the pool.
spring.jta.bitronix.datasource.acquisition-interval=1 # Time, in seconds, to wait before trying to acquire a connection again after an invalid connection was acquired.
spring.jta.bitronix.datasource.acquisition-timeout=30 # Timeout, in seconds, for acquiring connections from the pool.
spring.jta.bitronix.datasource.allow-local-transactions=true # Whether or not the transaction manager should allow mixing XA and non-XA transactions.
spring.jta.bitronix.datasource.apply-transaction-timeout=false # Whether or not the transaction timeout should be set on the XAResource when it is enlisted.
spring.jta.bitronix.datasource.automatic-enlisting-enabled=true # Whether or not resources should be enlisted and delisted automatically.
spring.jta.bitronix.datasource.cursor-holdability= # The default cursor holdability for connections.
spring.jta.bitronix.datasource.defer-connection-release=true # Whether or not the database can run many transactions on the same connection and supports transaction interleaving.
spring.jta.bitronix.datasource.enable-jdbc4-connection-test= # Whether or not Connection.isValid() is called when acquiring a connection from the pool.
spring.jta.bitronix.datasource.ignore-recovery-failures=false # Whether or not recovery failures should be ignored.
spring.jta.bitronix.datasource.isolation-level= # The default isolation level for connections.
spring.jta.bitronix.datasource.local-auto-commit= # The default auto-commit mode for local transactions.
spring.jta.bitronix.datasource.login-timeout= # Timeout, in seconds, for establishing a database connection.
spring.jta.bitronix.datasource.max-idle-time=60 # The time, in seconds, after which connections are cleaned up from the pool.
spring.jta.bitronix.datasource.max-pool-size=10 # The maximum size of the pool. 0 denotes no limit.
spring.jta.bitronix.datasource.min-pool-size=0 # The minimum size of the pool.
spring.jta.bitronix.datasource.prepared-statement-cache-size=0 # The target size of the prepared statement cache. 0 disables the cache.
spring.jta.bitronix.datasource.share-transaction-connections=false #  Whether or not connections in the ACCESSIBLE state can be shared within the context of a transaction.
spring.jta.bitronix.datasource.test-query= # SQL query or statement used to validate a connection before returning it.
spring.jta.bitronix.datasource.two-pc-ordering-position=1 # The position that this resource should take during two-phase commit (always first is Integer.MIN_VALUE, always last is Integer.MAX_VALUE).
spring.jta.bitronix.datasource.unique-name=dataSource # The unique name used to identify the resource during recovery.
spring.jta.bitronix.datasource.use-tm-join=true Whether or not TMJOIN should be used when starting XAResources.
spring.jta.bitronix.properties.allow-multiple-lrc=false # Allow multiple LRC resources to be enlisted into the same transaction.
spring.jta.bitronix.properties.asynchronous2-pc=false # Enable asynchronously execution of two phase commit.
spring.jta.bitronix.properties.background-recovery-interval-seconds=60 # Interval in seconds at which to run the recovery process in the background.
spring.jta.bitronix.properties.current-node-only-recovery=true # Recover only the current node.
spring.jta.bitronix.properties.debug-zero-resource-transaction=false # Log the creation and commit call stacks of transactions executed without a single enlisted resource.
spring.jta.bitronix.properties.default-transaction-timeout=60 # Default transaction timeout in seconds.
spring.jta.bitronix.properties.disable-jmx=false # Enable JMX support.
spring.jta.bitronix.properties.exception-analyzer= # Set the fully qualified name of the exception analyzer implementation to use.
spring.jta.bitronix.properties.filter-log-status=false # Enable filtering of logs so that only mandatory logs are written.
spring.jta.bitronix.properties.force-batching-enabled=true #  Set if disk forces are batched.
spring.jta.bitronix.properties.forced-write-enabled=true # Set if logs are forced to disk.
spring.jta.bitronix.properties.graceful-shutdown-interval=60 # Maximum amount of seconds the TM will wait for transactions to get done before aborting them at shutdown time.
spring.jta.bitronix.properties.jndi-transaction-synchronization-registry-name= # JNDI name of the TransactionSynchronizationRegistry.
spring.jta.bitronix.properties.jndi-user-transaction-name= # JNDI name of the UserTransaction.
spring.jta.bitronix.properties.journal=disk # Name of the journal. Can be 'disk', 'null' or a class name.
spring.jta.bitronix.properties.log-part1-filename=btm1.tlog # Name of the first fragment of the journal.
spring.jta.bitronix.properties.log-part2-filename=btm2.tlog # Name of the second fragment of the journal.
spring.jta.bitronix.properties.max-log-size-in-mb=2 # Maximum size in megabytes of the journal fragments.
spring.jta.bitronix.properties.resource-configuration-filename= # ResourceLoader configuration file name.
spring.jta.bitronix.properties.server-id= # ASCII ID that must uniquely identify this TM instance. Default to the machine's IP address.
spring.jta.bitronix.properties.skip-corrupted-logs=false # Skip corrupted transactions log entries.
spring.jta.bitronix.properties.warn-about-zero-resource-transaction=true # Log a warning for transactions executed without a single enlisted resource.

# NARAYANA (NarayanaProperties)
spring.jta.narayana.default-timeout=60 # Transaction timeout in seconds.
spring.jta.narayana.expiry-scanners=com.arjuna.ats.internal.arjuna.recovery.ExpiredTransactionStatusManagerScanner # Comma-separated list of expiry scanners.
spring.jta.narayana.log-dir= # Transaction object store directory.
spring.jta.narayana.one-phase-commit=true # Enable one phase commit optimisation.
spring.jta.narayana.periodic-recovery-period=120 # Interval in which periodic recovery scans are performed in seconds.
spring.jta.narayana.recovery-backoff-period=10 # Back off period between first and second phases of the recovery scan in seconds.
spring.jta.narayana.recovery-db-pass= # Database password to be used by recovery manager.
spring.jta.narayana.recovery-db-user= # Database username to be used by recovery manager.
spring.jta.narayana.recovery-jms-pass= # JMS password to be used by recovery manager.
spring.jta.narayana.recovery-jms-user= # JMS username to be used by recovery manager.
spring.jta.narayana.recovery-modules= # Comma-separated list of recovery modules.
spring.jta.narayana.transaction-manager-id=1 # Unique transaction manager id.
spring.jta.narayana.xa-resource-orphan-filters= # Comma-separated list of orphan filters.

# EMBEDDED MONGODB (EmbeddedMongoProperties)
spring.mongodb.embedded.features=SYNC_DELAY # 要开启的特性列表，用逗号分隔
spring.mongodb.embedded.storage.databaseDir= # Directory used for data storage.
spring.mongodb.embedded.storage.oplogSize= # Maximum size of the oplog in megabytes.
spring.mongodb.embedded.storage.replSetName= # Name of the replica set.
spring.mongodb.embedded.version=2.6.10 # 要使用的Mongo版本（默认值： 2.6.10

# REDIS (RedisProperties)
spring.redis.cluster.max-redirects= # Maximum number of redirects to follow when executing commands across the cluster.
spring.redis.cluster.nodes= # Comma-separated list of "host:port" pairs to bootstrap from.
spring.redis.database=0 # 连接工厂使用的数据库索引，默认值： 0
spring.redis.host=localhost # Redis服务器主机地址，默认值： localhost
spring.redis.password= # Redis服务器的登录密码
spring.redis.pool.max-active=8 # 连接池在指定时间里能分配的最大连接数。负数表示无限制，默认值： 8
spring.redis.pool.max-idle=8 # 连接池里的最大空闲连接数。负数表示空闲连接数可以是无限大，默认值： 8
spring.redis.pool.max-wait=-1 # 当连接池被耗尽时，分配连接的请求应该在抛出异常前被阻塞多长时间（单位为秒）。负数表示一直阻塞，默认值： -1
spring.redis.pool.min-idle=0 # 连接池里要维持的最小空闲连接数。该属性只有在设置为正数时才有效，默认值： 0
spring.redis.port=6379 # Redis服务器端口，默认值： 6379
spring.redis.sentinel.master= # Name of Redis server.
spring.redis.sentinel.nodes= # 形如“主机:端口”配对的列表，用逗号分隔
spring.redis.timeout=0 # 连接超时时间，单位为秒，默认值： 0


# ----------------------------------------
# INTEGRATION PROPERTIES
# ----------------------------------------

# ACTIVEMQ (ActiveMQProperties)
spring.activemq.broker-url= # ActiveMQ代理的URL。默认自动生成 For instance `tcp://localhost:61616`
spring.activemq.in-memory=true # 标明默认代理URL是否应该在内存里。如果指定了一个显式的代理则忽略该属性，默认值： true
spring.activemq.password= # 代理的登录密码
spring.activemq.user= # 代理的登录用户名
spring.activemq.packages.trust-all=false # Trust all packages.
spring.activemq.packages.trusted= # Comma-separated list of specific packages to trust (when not trusting all packages).
spring.activemq.pool.configuration.*= # See PooledConnectionFactory.
spring.activemq.pool.enabled=false # Whether a PooledConnectionFactory should be created instead of a regular ConnectionFactory.
spring.activemq.pool.expiry-timeout=0 # Connection expiration timeout in milliseconds.
spring.activemq.pool.idle-timeout=30000 # Connection idle timeout in milliseconds.
spring.activemq.pool.max-connections=1 # Maximum number of pooled connections.

# ARTEMIS (ArtemisProperties)
spring.artemis.embedded.cluster-password= # Cluster password. Randomly generated on startup by default.
spring.artemis.embedded.data-directory= # Journal file directory. Not necessary if persistence is turned off.
spring.artemis.embedded.enabled=true # Enable embedded mode if the Artemis server APIs are available.
spring.artemis.embedded.persistent=false # Enable persistent store.
spring.artemis.embedded.queues= # Comma-separated list of queues to create on startup.
spring.artemis.embedded.server-id= # Server id. By default, an auto-incremented counter is used.
spring.artemis.embedded.topics= # Comma-separated list of topics to create on startup.
spring.artemis.host=localhost # Artemis broker host.
spring.artemis.mode= # Artemis deployment mode, auto-detected by default.
spring.artemis.password= # Login password of the broker.
spring.artemis.port=61616 # Artemis broker port.
spring.artemis.user= # Login user of the broker.

# SPRING BATCH (BatchProperties)
spring.batch.initializer.enabled= # 如果有必要的话，在启动时创建需要的批处理表
spring.batch.job.enabled=true # 在启动时执行上下文里的所有Spring Batch任务
spring.batch.job.names= # 启动时要执行的任务名列表，用逗号分隔。默认在上下文里找到的所有任务都会执行
spring.batch.schema=classpath:org/springframework/batch/core/schema-@@platform@@.sql # 指向初始化数据库Schema用的SQL文件的路径
spring.batch.table-prefix= # 所有批处理元数据表的表前缀

# HORNETQ (HornetQProperties)
spring.hornetq.embedded.cluster-password= # 集群密码。默认在启动时随机生成
spring.hornetq.embedded.data-directory= # Journal文件目录。如果关闭了持久化则不需要该属性
spring.hornetq.embedded.enabled=true # 如果有Artemis服务器API则开启嵌入模式
spring.hornetq.embedded.persistent=false # 开启持久化存储
spring.hornetq.embedded.queues= # 要在启动时创建的队列列表，用逗号分隔
spring.hornetq.embedded.server-id= # 服务器ID。默认情况下，使用一个自动递增的计数器（默认值： 0）
spring.hornetq.embedded.topics= # 在启动时要创建的主题列表，用逗号分隔
spring.hornetq.host=localhost # Artemis代理主机，默认值： localhost
spring.hornetq.mode= # Artemis部署模式，默认自动检测。可以显式地设置为native或embedded
spring.hornetq.password= # Login password of the broker.
spring.hornetq.port=5445 # Artemis代理端口
spring.hornetq.user= # Login user of the broker.

# JMS (JmsProperties)
spring.jms.jndi-name= # 连接工厂的JNDI名字。设置了该属性，则优先于其他自动配置的连接工厂
spring.jms.listener.acknowledge-mode= # 容器的应答模式（acknowledgment mode）。默认情况下，监听器使用自动应答
spring.jms.listener.auto-startup=true # 启动时自动启动容器，默认值： true）
spring.jms.listener.concurrency= # 并发消费者的数量下限
spring.jms.listener.max-concurrency= # 并发消费者的数量上限
spring.jms.pub-sub-domain=false # 如果是主题而非队列，指明默认的目的地类型是否支持Pub/Sub，默认值： false

# RABBIT (RabbitProperties)
spring.rabbitmq.addresses= # 客户端应该连接的地址列表，用逗号分隔
spring.rabbitmq.cache.channel.checkout-timeout= # Number of milliseconds to wait to obtain a channel if the cache size has been reached.
spring.rabbitmq.cache.channel.size= # Number of channels to retain in the cache.
spring.rabbitmq.cache.connection.mode=CHANNEL # Connection factory cache mode.
spring.rabbitmq.cache.connection.size= # Number of connections to cache.
spring.rabbitmq.connection-timeout= # Connection timeout, in milliseconds; zero for infinite.
spring.rabbitmq.dynamic=true # 创建一个AmqpAdmin Bean，默认值： true
spring.rabbitmq.host=localhost # RabbitMQ主机地址，默认值： localhost
spring.rabbitmq.listener.acknowledge-mode= # 容器的应答模式
spring.rabbitmq.listener.auto-startup=true # 启动时自动开启容器，默认值： true
spring.rabbitmq.listener.concurrency= # 消费者的数量下限
spring.rabbitmq.listener.default-requeue-rejected= # Whether or not to requeue delivery failures; default `true`.
spring.rabbitmq.listener.max-concurrency= # 消费者的数量上限
spring.rabbitmq.listener.prefetch= # 单个请求里要处理的消息数。该数值不应小于事务数（如果用到的话）
spring.rabbitmq.listener.retry.enabled=false # Whether or not publishing retries are enabled.
spring.rabbitmq.listener.retry.initial-interval=1000 # Interval between the first and second attempt to deliver a message.
spring.rabbitmq.listener.retry.max-attempts=3 # Maximum number of attempts to deliver a message.
spring.rabbitmq.listener.retry.max-interval=10000 # Maximum interval between attempts.
spring.rabbitmq.listener.retry.multiplier=1.0 # A multiplier to apply to the previous delivery retry interval.
spring.rabbitmq.listener.retry.stateless=true # Whether or not retry is stateless or stateful.
spring.rabbitmq.listener.transaction-size= # 一个事务里要处理的消息数。为了保证效果，应该不大于预先获取的数量
spring.rabbitmq.password= # 进行身份验证的密码
spring.rabbitmq.port=5672 # RabbitMQ port.
spring.rabbitmq.publisher-confirms=false # Enable publisher confirms.
spring.rabbitmq.publisher-returns=false # Enable publisher returns.
spring.rabbitmq.requested-heartbeat= # 请求心跳超时，单位为秒； 0表示不启用心跳
spring.rabbitmq.ssl.enabled=false # 开启SSL支持，默认值： false
spring.rabbitmq.ssl.key-store= # 持有SSL证书的KeyStore路径
spring.rabbitmq.ssl.key-store-password= # 访问KeyStore的密码
spring.rabbitmq.ssl.trust-store= # 持有SSL证书的TrustStore
spring.rabbitmq.ssl.trust-store-password= # 访问TrustStore的密码
spring.rabbitmq.ssl.algorithm= # SSL algorithm to use. By default configure by the rabbit client library.
spring.rabbitmq.template.mandatory=false # Enable mandatory messages.
spring.rabbitmq.template.receive-timeout=0 # Timeout for `receive()` methods.
spring.rabbitmq.template.reply-timeout=5000 # Timeout for `sendAndReceive()` methods.
spring.rabbitmq.template.retry.enabled=false # Set to true to enable retries in the `RabbitTemplate`.
spring.rabbitmq.template.retry.initial-interval=1000 # Interval between the first and second attempt to publish a message.
spring.rabbitmq.template.retry.max-attempts=3 # Maximum number of attempts to publish a message.
spring.rabbitmq.template.retry.max-interval=10000 # Maximum number of attempts to publish a message.
spring.rabbitmq.template.retry.multiplier=1.0 # A multiplier to apply to the previous publishing retry interval.
spring.rabbitmq.username= # Login user to authenticate to the broker.
spring.rabbitmq.virtual-host= # 在连接RabbitMQ时的虚拟主机


# ----------------------------------------
# ACTUATOR PROPERTIES
# ----------------------------------------

# ENDPOINTS (AbstractEndpoint subclasses)
endpoints.enabled=true # Enable endpoints.
endpoints.sensitive= # Default endpoint sensitive setting.
endpoints.actuator.enabled=true # Enable the endpoint.
endpoints.actuator.path= # Endpoint URL path.
endpoints.actuator.sensitive=false # Enable security on the endpoint.
endpoints.autoconfig.enabled= # Enable the endpoint.
endpoints.autoconfig.id= # Endpoint identifier.
endpoints.autoconfig.path= # Endpoint path.
endpoints.autoconfig.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.beans.enabled= # Enable the endpoint.
endpoints.beans.id= # Endpoint identifier.
endpoints.beans.path= # Endpoint path.
endpoints.beans.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.configprops.enabled= # Enable the endpoint.
endpoints.configprops.id= # Endpoint identifier.
endpoints.configprops.keys-to-sanitize=password,secret,key,token,.*credentials.*,vcap_services # Keys that should be sanitized. Keys can be simple strings that the property ends with or regex expressions.
endpoints.configprops.path= # Endpoint path.
endpoints.configprops.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.docs.curies.enabled=false # Enable the curie generation.
endpoints.docs.enabled=true # Enable actuator docs endpoint.
endpoints.docs.path=/docs #
endpoints.docs.sensitive=false #
endpoints.dump.enabled= # Enable the endpoint.
endpoints.dump.id= # Endpoint identifier.
endpoints.dump.path= # Endpoint path.
endpoints.dump.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.env.enabled= # Enable the endpoint.
endpoints.env.id= # Endpoint identifier.
endpoints.env.keys-to-sanitize=password,secret,key,token,.*credentials.*,vcap_services # Keys that should be sanitized. Keys can be simple strings that the property ends with or regex expressions.
endpoints.env.path= # Endpoint path.
endpoints.env.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.flyway.enabled= # Enable the endpoint.
endpoints.flyway.id= # Endpoint identifier.
endpoints.flyway.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.health.enabled= # Enable the endpoint.
endpoints.health.id= # Endpoint identifier.
endpoints.health.mapping.*= # Mapping of health statuses to HttpStatus codes. By default, registered health statuses map to sensible defaults (i.e. UP maps to 200).
endpoints.health.path= # Endpoint path.
endpoints.health.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.health.time-to-live=1000 # Time to live for cached result, in milliseconds.
endpoints.heapdump.enabled= # Enable the endpoint.
endpoints.heapdump.path= # Endpoint path.
endpoints.heapdump.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.info.enabled= # Enable the endpoint.
endpoints.info.id= # Endpoint identifier.
endpoints.info.path= # Endpoint path.
endpoints.info.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.jolokia.enabled=true # Enable Jolokia endpoint.
endpoints.jolokia.path=/jolokia # Endpoint URL path.
endpoints.jolokia.sensitive=true # Enable security on the endpoint.
endpoints.liquibase.enabled= # Enable the endpoint.
endpoints.liquibase.id= # Endpoint identifier.
endpoints.liquibase.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.logfile.enabled=true # Enable the endpoint.
endpoints.logfile.external-file= # External Logfile to be accessed.
endpoints.logfile.path=/logfile # Endpoint URL path.
endpoints.logfile.sensitive=true # Enable security on the endpoint.
endpoints.mappings.enabled= # Enable the endpoint.
endpoints.mappings.id= # Endpoint identifier.
endpoints.mappings.path= # Endpoint path.
endpoints.mappings.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.metrics.enabled= # Enable the endpoint.
endpoints.metrics.filter.enabled=true # Enable the metrics servlet filter.
endpoints.metrics.filter.gauge-submissions=merged # Http filter gauge submissions (merged, per-http-method)
endpoints.metrics.filter.counter-submissions=merged # Http filter counter submissions (merged, per-http-method)
endpoints.metrics.id= # Endpoint identifier.
endpoints.metrics.path= # Endpoint path.
endpoints.metrics.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.shutdown.enabled= # Enable the endpoint.
endpoints.shutdown.id= # Endpoint identifier.
endpoints.shutdown.path= # Endpoint path.
endpoints.shutdown.sensitive= # Mark if the endpoint exposes sensitive information.
endpoints.trace.enabled= # Enable the endpoint.
endpoints.trace.id= # Endpoint identifier.
endpoints.trace.path= # Endpoint path.
endpoints.trace.sensitive= # Mark if the endpoint exposes sensitive information.

# ENDPOINTS CORS CONFIGURATION (EndpointCorsProperties)
endpoints.cors.allow-credentials= # Set whether credentials are supported. When not set, credentials are not supported.
endpoints.cors.allowed-headers= # Comma-separated list of headers to allow in a request. '*' allows all headers.
endpoints.cors.allowed-methods=GET # Comma-separated list of methods to allow. '*' allows all methods.
endpoints.cors.allowed-origins= # Comma-separated list of origins to allow. '*' allows all origins. When not set, CORS support is disabled.
endpoints.cors.exposed-headers= # Comma-separated list of headers to include in a response.
endpoints.cors.max-age=1800 # How long, in seconds, the response from a pre-flight request can be cached by clients.

# JMX ENDPOINT (EndpointMBeanExportProperties)
endpoints.jmx.domain= # JMX domain name. Initialized with the value of 'spring.jmx.default-domain' if set.
endpoints.jmx.enabled=true # Enable JMX export of all endpoints.
endpoints.jmx.static-names= # Additional static properties to append to all ObjectNames of MBeans representing Endpoints.
endpoints.jmx.unique-names=false # Ensure that ObjectNames are modified in case of conflict.

# JOLOKIA (JolokiaProperties)
jolokia.config.*= # See Jolokia manual

# MANAGEMENT HTTP SERVER (ManagementServerProperties)
management.add-application-context-header=true # Add the "X-Application-Context" HTTP header in each response.
management.address= # Network address that the management endpoints should bind to.
management.context-path= # Management endpoint context-path. For instance `/actuator`
management.port= # Management endpoint HTTP port. Uses the same port as the application by default. Configure a different port to use management-specific SSL.
management.security.enabled=true # Enable security.
management.security.roles=ADMIN # Comma-separated list of roles that can access the management endpoint.
management.security.sessions=stateless # Session creating policy to use (always, never, if_required, stateless).
management.ssl.ciphers= # Supported SSL ciphers. Requires a custom management.port.
management.ssl.client-auth= # Whether client authentication is wanted ("want") or needed ("need"). Requires a trust store. Requires a custom management.port.
management.ssl.enabled= # Enable SSL support. Requires a custom management.port.
management.ssl.enabled-protocols= # Enabled SSL protocols. Requires a custom management.port.
management.ssl.key-alias= # Alias that identifies the key in the key store. Requires a custom management.port.
management.ssl.key-password= # Password used to access the key in the key store. Requires a custom management.port.
management.ssl.key-store= # Path to the key store that holds the SSL certificate (typically a jks file). Requires a custom management.port.
management.ssl.key-store-password= # Password used to access the key store. Requires a custom management.port.
management.ssl.key-store-provider= # Provider for the key store. Requires a custom management.port.
management.ssl.key-store-type= # Type of the key store. Requires a custom management.port.
management.ssl.protocol=TLS # SSL protocol to use. Requires a custom management.port.
management.ssl.trust-store= # Trust store that holds SSL certificates. Requires a custom management.port.
management.ssl.trust-store-password= # Password used to access the trust store. Requires a custom management.port.
management.ssl.trust-store-provider= # Provider for the trust store. Requires a custom management.port.
management.ssl.trust-store-type= # Type of the trust store. Requires a custom management.port.

# HEALTH INDICATORS (previously health.*)
management.health.db.enabled=true # Enable database health check.
management.health.defaults.enabled=true # Enable default health indicators.
management.health.diskspace.enabled=true # Enable disk space health check.
management.health.diskspace.path= # Path used to compute the available disk space.
management.health.diskspace.threshold=0 # Minimum disk space that should be available, in bytes.
management.health.elasticsearch.enabled=true # Enable elasticsearch health check.
management.health.elasticsearch.indices= # Comma-separated index names.
management.health.elasticsearch.response-timeout=100 # The time, in milliseconds, to wait for a response from the cluster.
management.health.jms.enabled=true # Enable JMS health check.
management.health.mail.enabled=true # Enable Mail health check.
management.health.mongo.enabled=true # Enable MongoDB health check.
management.health.rabbit.enabled=true # Enable RabbitMQ health check.
management.health.redis.enabled=true # Enable Redis health check.
management.health.solr.enabled=true # Enable Solr health check.
management.health.status.order=DOWN, OUT_OF_SERVICE, UNKNOWN, UP # Comma-separated list of health statuses in order of severity.

# INFO CONTRIBUTORS (InfoContributorProperties)
management.info.build.enabled=true # Enable build info.
management.info.defaults.enabled=true # Enable default info contributors.
management.info.env.enabled=true # Enable environment info.
management.info.git.enabled=true # Enable git info.
management.info.git.mode=simple # Mode to use to expose git information.

# REMOTE SHELL (ShellProperties)
management.shell.auth.type=simple # Authentication type. Auto-detected according to the environment.
management.shell.auth.jaas.domain=my-domain # JAAS domain.
management.shell.auth.key.path= # Path to the authentication key. This should point to a valid ".pem" file.
management.shell.auth.simple.user.name=user # Login user.
management.shell.auth.simple.user.password= # Login password.
management.shell.auth.spring.roles=ADMIN # Comma-separated list of required roles to login to the CRaSH console.
management.shell.command-path-patterns=classpath*:/commands/**,classpath*:/crash/commands/** # Patterns to use to look for commands.
management.shell.command-refresh-interval=-1 # Scan for changes and update the command if necessary (in seconds).
management.shell.config-path-patterns=classpath*:/crash/* # Patterns to use to look for configurations.
management.shell.disabled-commands=jpa*,jdbc*,jndi* # Comma-separated list of commands to disable.
management.shell.disabled-plugins= # Comma-separated list of plugins to disable. Certain plugins are disabled by default based on the environment.
management.shell.ssh.auth-timeout = # Number of milliseconds after user will be prompted to login again.
management.shell.ssh.enabled=true # Enable CRaSH SSH support.
management.shell.ssh.idle-timeout = # Number of milliseconds after which unused connections are closed.
management.shell.ssh.key-path= # Path to the SSH server key.
management.shell.ssh.port=2000 # SSH port.
management.shell.telnet.enabled=false # Enable CRaSH telnet support. Enabled by default if the TelnetPlugin is  available.
management.shell.telnet.port=5000 # Telnet port.

# TRACING (TraceProperties)
management.trace.include=request-headers,response-headers,cookies,errors # Items to be included in the trace.

# METRICS EXPORT (MetricExportProperties)
spring.metrics.export.aggregate.key-pattern= # Pattern that tells the aggregator what to do with the keys from the source repository.
spring.metrics.export.aggregate.prefix= # Prefix for global repository if active.
spring.metrics.export.delay-millis=5000 # Delay in milliseconds between export ticks. Metrics are exported to external sources on a schedule with this delay.
spring.metrics.export.enabled=true # Flag to enable metric export (assuming a MetricWriter is available).
spring.metrics.export.excludes= # List of patterns for metric names to exclude. Applied after the includes.
spring.metrics.export.includes= # List of patterns for metric names to include.
spring.metrics.export.redis.key=keys.spring.metrics # Key for redis repository export (if active).
spring.metrics.export.redis.prefix=spring.metrics # Prefix for redis repository if active.
spring.metrics.export.send-latest= # Flag to switch off any available optimizations based on not exporting unchanged metric values.
spring.metrics.export.statsd.host= # Host of a statsd server to receive exported metrics.
spring.metrics.export.statsd.port=8125 # Port of a statsd server to receive exported metrics.
spring.metrics.export.statsd.prefix= # Prefix for statsd exported metrics.
spring.metrics.export.triggers.*= # Specific trigger properties per MetricWriter bean name.


# ----------------------------------------
# DEVTOOLS PROPERTIES
# ----------------------------------------

# DEVTOOLS (DevToolsProperties)
spring.devtools.livereload.enabled=true # Enable a livereload.com compatible server.
spring.devtools.livereload.port=35729 # Server port.
spring.devtools.restart.additional-exclude= # Additional patterns that should be excluded from triggering a full restart.
spring.devtools.restart.additional-paths= # Additional paths to watch for changes.
spring.devtools.restart.enabled=true # Enable automatic restart.
spring.devtools.restart.exclude=META-INF/maven/**,META-INF/resources/**,resources/**,static/**,public/**,templates/**,**/*Test.class,**/*Tests.class,git.properties # Patterns that should be excluded from triggering a full restart.
spring.devtools.restart.poll-interval=1000 # Amount of time (in milliseconds) to wait between polling for classpath changes.
spring.devtools.restart.quiet-period=400 # Amount of quiet time (in milliseconds) required without any classpath changes before a restart is triggered.
spring.devtools.restart.trigger-file= # Name of a specific file that when changed will trigger the restart check. If not specified any classpath file change will trigger the restart.

# REMOTE DEVTOOLS (RemoteDevToolsProperties)
spring.devtools.remote.context-path=/.~~spring-boot!~ # Context path used to handle the remote connection.
spring.devtools.remote.debug.enabled=true # Enable remote debug support.
spring.devtools.remote.debug.local-port=8000 # Local remote debug server port.
spring.devtools.remote.proxy.host= # The host of the proxy to use to connect to the remote application.
spring.devtools.remote.proxy.port= # The port of the proxy to use to connect to the remote application.
spring.devtools.remote.restart.enabled=true # Enable remote restart.
spring.devtools.remote.secret= # A shared secret required to establish a connection (required to enable remote support).
spring.devtools.remote.secret-header-name=X-AUTH-TOKEN # HTTP header used to transfer the shared secret.
```
