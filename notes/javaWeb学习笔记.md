1javaWeb学习笔记

# 入门

![1](figs/Web流程.png)

Web中的三剑客：

![1](figs/前端三剑客的作用.png)

# Day1-HTML到CSS

HTML是一种**超文本**标记语言，可以定义文字、图片、音频、视频：

![1](figs/HTML.png)

HTML由浏览器解析，故标签都是预定义好的。

CSS是层叠样式表，用于控制页面的样式（表现）。

## 快速入门HTML

写一个HTML文件的快速步骤为：

![1](figs/HTML快速入门.png)

> VSCODE中的！后直接回车，直接生成html的基本语句。

### CSS

CSS的三种引入方式：

![1](figs/三种使用CSS样式的方法.png)

设置颜色时的三种表示形式，推荐内嵌方式写在style中：

```html
<style>
    h1{
        三种颜色定义方式
        color: black;			单词
        color: rgb(1, 1, 1);	rgb表示
        color: #00f;			十六进制
    }
</style>
```

并使用**span标签**对一行的内容进行分别处理。

### 超链接

超链接使用a标签加入，可以相应的设置样式。

### 正文排版

常用的标签列出来如下：

![1](figs/HTML常用正文的排版.png)

对于页面布局，需要了解一个**盒子模型**的概念：

![1](figs/HTML的盒子模型.png)

通过使用盒子模型的标签，就可以设置类似标签的布局了。

### 表格

表格的标签有如下常用的：

![1](figs/HTML-表格标签.png)

### 表单

表单是网页中常用的数据采集方法。

表单标签用于定义整个表单；表单项标签用于定义表单里的表单项。

![1](figs/HTML-表单项标签.png)

注：单选按钮中要确定name字段完全相同。

# Day02-JS语句到VUE框架

## JS

是一门跨平台、面向对象的**脚本语言**（无需编译，浏览器可直接运行）。javaScript是遵循ECMA标准的。

### 输出语句

有以下的三种输出形式：

![1](figs/JS输出语句的三种方式.png)

### 变量

JS的变量是弱类型的，可存不同类型，统一用var声明。

![1](figs/JS变量.png)

> Var定义的变量有以下特点：
>
> 1.是全局变量，作用域很大，可在代码块外使用。局部变量使用**let**声明。常量值则用**const**定义。
>
> 2.可重复定义。

### 数据类型

分为原始类型和引用类型：

![1](figs/JS数据类型.png)

### 运算符

运算符基本和JAVA相似，但特殊的是一个**全等运算符===**：

![1](figs/JS全等运算符.png)

### 类型转换

常用的类型转换为：

![1](figs/JS类型转换.png)

流程控制语句就更一样了，直接省略。

### 函数

定义很简单：

![1](figs/JS函数定义.png)

### 对象

包括：Array数组，String字符串，JSON，BOM，DOM等，JS将浏览器直接封装成了一个对象。

#### 自定义对象

JS中的自定义对象比较简单：

![1](figs/JS自定义对象.png)

#### JSON

JSON就是JS**对象标记法书写出来的文本**，非常类似JS的自定义对象的形式。

![1](figs/JS中的JSON.png)

基础语法有基本的规定，不同的数据类型有不同的表示方法：

![1](figs/JSON的基本语法.png)

#### BOM浏览器对象

由五个部分组成：

![1](figs/BOM的组成.png)

主要了解Window对象和Location对象即可：

![1](figs/BOM-Window对象.png)

对于Location，其实只需要了解一个属性：**URL**。

![1](figs/BOM-Location.png)

#### DOM文档对象

HTML最终其实也会被JS封装成DOM来处理，每个HTML标签都被封装成了DOM对象。

![1](figs/DOM概述.png)

### 事件

![1](figs/JS事件监听.png)

通过两种方式进行事件绑定：

![1](figs/JS事件绑定.png)

常见的事件有：

![1](figs/JS某些常见的事件.png)

## VUE框架

对于框架和VUE的理解，免除DOM的繁琐操作：

![1](figs/VUE框架介绍.png)

VUE的建立方式可以简单概括为：

![1](figs/VUE快速入门.png)

对于VUE的常见指令：

![1](figs/VUE的常见指令.png)

#### 生命周期

![1](figs/VUE生命周期.png)

整个流程图是：

![1](figs/VUE声明周期的流程图.png)

> 基本只需要知道**Mounted**周期，VUE初始化成功，HTML渲染成功，发送请求到服务端，加载数据。

# Day03-Ajax到VUE项目与前端项目的打包部署

## Ajax

是一项异步交互基础，从服务器端获取数据。

![1](figs/ajax的概述.png)

一般步骤为：

![1](figs/Ajax的步骤.png)

### Axios

原生Ajax比较繁琐，对原生Ajax进行了封装简化，诞生了Axios，用于快速开发，使用方式很简单，步骤只有两步：

![1](figs/Ajax-Axios步骤.png)

但Axios事实上已经进一步的简化了请求方式别名为：

![1](figs/Axios的简化操作.png)

## 前后端分离开发YAPI

前后端分离开发，需要用到**接口文档**进行沟通。

![1](figs/前后端分离开发概述.png)

### YAPI

是一个API管理平台，提供接口管理服务。

### 前端工程化

大型项目的开发，讲究模块化，组件化，规范化和自动化。

#### 环境准备

![1](figs/前端工程化-VUE脚手架.png)

## VUE项目开发流程

### 创建Vue项目

创建个Vue文件夹，在文件夹中进入命令行，并输入`Vue ui`进入网页中，进行创建Vue项目。

通过Vue脚手架创建的Vue项目具有相同的目录结构：

![1](figs/VUE项目的目录结构.png)

### 运行Vue项目

可以直接通过VSCODE运行npm脚本，以启动VUE项目，事实上就是访问其public中index.html。又关联到APP.vue文件，入口文件是main.js。

APP.vue是一种根组件，分为三部分，其结构为：

![1](figs/VUE的app根组件结构.png)

## Element组件库

![1](figs/Element概述.png)

对于各种组件的使用，直接去官网CV即可，就可以做想要的前端效果。

## VUE路由

就是让一个HTML界面显示不同的内容：

![1](figs/VUE路由.png)

其组成为：

![1](figs/VUE路由的组成.png)

使用Router_Link后，浏览器会识别成一个**超链接**，路由定义的地方和方法如下图所示：

![1](figs/VUE路由的定义.png)

## 打包部署

实际开发中，前后端工程最终被分开部署在服务器上。

### 打包

对于前端打包，使用Build脚本打包，生成的dist目录为打包后的文件，部署到服务器上即可。

![1](figs/前端打包过程.png)

### 部署

一般部署在**Nginx服务器**上，Nginx如下：

![1](figs/Nginx的介绍和目录.png)部署也比较方便：

![1](figs/Nginx部署前端项目.png)

可以在**nginx.conf**文件中更改端口号到90。

# Day04-maven学习和Web入门

## maven-管理和构建maven项目的工具

### 基本概述

具有如下的优点：

> 方便管理项目的依赖资源，避免版本冲突问题。
>
> 统一的项目结构，在不同开发工具中通用。
>
> 标准的项目构建流程：编译，打包等操作。

需要知道的操作：Maven项目的创建、导入、移除等

### 依赖管理

依赖就是项目运行中需要的jar包。

#### 依赖传递

Maven中还有一个特性：**依赖传递**。

IDEA中可以直接在pom文件中右键点击图标，显示依赖的**树形**关系。

#### 排除依赖

在pom文件中的关键字是**\<exclusions>**。

#### 依赖范围

依赖的jar包默认在任何地方都可以使用，也可以通过\<scope>关键字设定其生效范围。其具体规则为：

![1](figs/maven-依赖范围的规则.png)

### 生命周期

有很多阶段，但其实只需掌握以下五个：

> clean：清除缓存
>
> compile：编译项目源码
>
> test：使用合适的单元测试框架
>
> package：将编译后的文件打包：jar或war中
>
> install：安装项目到本地仓库

同一套生命周期中，运行后边的操作会自动执行前边的。共有三套生命周期clean、default、site。

## Web入门

### Spring

Spring Framework配置繁琐，难度大，故使用Spring Boot，快速构建和开发项目。

Springboot都有一个起步依赖，并且都继承自SpringBoot的父工程。

### HTTP

超文本传输协议，规定了浏览器和服务器之间的数据传输规则。

#### 请求协议

HTTP的请求数据格式如下，get请求体大小有限制，而Post没有限制：

![1](figs/HTTP的请求格式.png)

#### 响应协议

HTTP的响应格式也分为三部分：

![1](figs/HTTP响应格式.png)

对于响应行，需要了解各**状态码**是什么情况。

#### 协议解析

后端需要解析由客户端发来的数据的。自己写比较复杂，用封装好的**Tomcat**。因此只需要关注于业务逻辑的实现。

### Tomcat

Web服务器是一个软件程序，对HTTP协议的操作进行封装，使得程序员不必直接对协议进行操作，让Web开发更加便捷主要功能是“提供网上信息浏览服务”。

部署项目的话，只需要将项目放在tomcat的webapps文件夹下即可。

**Springboot其实内嵌了Tomcat**，启动SpringBoot时，都会自动启动Tomcat，所以自己安装的Tomcat基本用不到。

# Day05-从postman到请求响应参数与分层解耦的写法controller\dao\service

## 模型

![1](figs/05-不同的架构模式.png)

## Postman

后端开发时需要用到前端界面进行测试，这就要用到Postman。

## 请求响应-请求

### 简单参数

简单参数的三种接收形式，最好用的还是要属**SpringBoot方式通过使用@RequestParam注解**实现。

![1](figs/请求响应-简单请求.png)

### 实体参数

让传入的参数存到类中，还可以**通过.进行嵌套**。

### 数组、集合（list）参数

基本相同，但需在**集合List前增加一个注解@RequestParam**才可。

### 日期参数

前端传递的日期格式可能多种多样，后端通常需要一个注解**@DateTimeFormat来实现日期参数的格式转换**。

### JSON参数

没啥好细说的。

### 路径参数

在RequestMapping中的写法需要用{}写路径，同时需要用到注解**@PathVariable**将路径参数绑定到特定参数中。

总结来看：

![1](figs/请求响应-请求总结.png)

## 请求响应-响应

响应需要用到一个注解：**@ResponseBody**。

![1](figs/请求响应-ResponseBody.png)

由于注解的封装，所有无需显式地写出来。

### 统一响应结果

响应结果千奇百怪，前端需要一个统一的响应结果，方便维护和管理，现在大多使用的是统一的**Result响应结果类**。

## 分层解耦

把操作都写在Controller里，是比较复杂的，不容易维护，那么可以如何分层呢？

### Web开发的三层架构

![1](figs/05-三层架构.png)

![1](figs/05-三层架构细节.png)

### 分层解耦

高内聚，低耦合。

为了减少程序之间的耦合（即**解耦**，通俗来讲就是将程序中new其他部分对象的操作去除），引入了**容器**的概念。涉及到**控制反转IOC**和**依赖注入DI**。

![1](figs/05-分层解耦的思想.png)

如何使用呢？通过两个注解：**@Component**和**@Autowired**。

![1](figs/05-容器操作入门.png)

当有不同的实现类时，只需要把想使用的实现类上写@Component即可控制具体使用哪个类。

![1](figs/05-Bean的声明.png)

还有更细的Bean包扫描问题，用于不在同目录下的问题，但还是建议三层的包全在统一目录下（规范）。

DI的问题，如果有两个依赖注入的实现类，会导致无法运行。可以使用其他注解来解决这个冲突问题。

# Day06-MySQL语句

Dao层访问数据，但企业一般不会将数据直接存在xml文件中，而是存储在数据库中的。

数据库中的内容又需要特定的数据库语句进行操作。





# Day08-从MySQL到Mybatis入门







## Mybatis入门

以上都是通过Datagrip操控的数据库，而实际开发需要通过java操作数据库，就需要用到Mybatis。

Mybatis是持久层的框架，为了简化JDBC繁琐的开发。SpringBoot里又整合了Mybatis。

![1](figs/08-如何使用Mybatis.png)

使用的SpringBoot集成的Mybatis，就将数据库的四要素写在properties文件中，并使用Mapper注解。

## JDBC

Mybatis就是对JDBC操作的简化，**JDBC则是JAVA操作关系型数据库的一套API**。这只是一套接口规范，而各数据库的公司提供JDBC的实现，如MySQL实现、Oracle实现等（也叫数据库驱动）。

![1](figs/08-JDBC介绍.png)

直接使用JDBC有**硬编码**、**代码繁琐**、频繁的资源获取和释放同时导致了**资源浪费**。Mybatis通过**数据库连接池**技术，完胜！使用Spring Boot和Mybatis结合起来，只需要考虑properties文件和mapper接口的写法即可。

## 数据库连接池

![1](figs/08-数据库连接池.png)

SpringBoot中就默认着使用的连接池是**Hikari追光者**。另外用的多的就是一个Druid连接池。

## LomBok工具包

![1](figs/08-Lombok.png)

# Day09-Mybatis的细节

## Mybatis基础操作

就是通过Mybatis对数据库增删改查。这个要根据代码学习。

### 预编译SQL

将SQL语句编译后，存到缓存中。性能更高，且能防止SQL注入，更加安全。

### 主键返回

使用注解@Options自动将生成的主键值赋值给相应对象的指定属性。

### 驼峰命名自动映射

```
查询操作时，但若实体类中的属性名与数据库中的字段名不一致，需要使用@Results注解进行映射。
但MyBatis把这个方法封装到一个驼峰命名自动映射开关中了，可直接在properties文件中配置：
mybatis.configuration.map-underscore-to-camel-case=true
但成功映射的前提是，数据库严格用下划线命名，java程序严格用驼峰命名。
```

### XML映射文件

![1](figs/09-XML映射文件.png)

这是另一种配置SQL语句的方式，简单的推荐直接注解，复杂一点的话更推荐使用XML配置文件来配置SQL语句。

## 动态SQL

随着用户的输入或外部条件变化而变化的SQL语句，称为**动态SQL**。注解实现动态SQL很不方便，一般用XML的方式配置SQL语句。

> 前端用户可能有**非固定**的输入，后端代码固定死就无法应对灵活情况。

### \<if>标签

![1](figs/09-动态SQLIF标签.png)

**\<set>**标签是用于自动去除多个if中的多余逗号的标签，基本用于update更新语句中。

### \<foreach>标签

批量删除时常用的：

![1](figs/09-foreach标签.png)

### \<SQL>和\<include>标签

为了在xml文件中提升代码的复用性能，可以用SQL标签把某些SQL语句打包下，再通过Include标签引入打包过的 SQL语句。

![1](figs/09-SQL和Include标签.png)

# Day10-一个案例（上）

案例的准备工作可以概括为：

![1](figs/10-案例概述.png)

以及一些概念：**接口文档**、**Restful开发规范**（分为传统风格和Rest风格接口，本项目采用后者）、统一响应结果Result。

## 部门管理

一个简单的查询操作步骤可以分解成以下：

![1](figs/10-部门管理-查询操作.png)

### 限定请求方式

从@RequestMapping到更封装的注解**@GetMapping**。

### Controller中提取公共路径

Controller里的方法有公共路径，为了方便可以为这个类加一个@request Mapping作为公共路径。

## 员工管理

![1](figs/10-员工管理.png)

![1](figs/10-员工管理三层步骤.png)

参数默认值设置的注解**@DefaultValue**。

### 分页查询

分页查询是一个步骤比较固定，过程又比较繁琐的操作，所以简化是比较紧迫的。**PageHelper**就是一个简化的工具，其作用如下，需要引入pom依赖：

![1](figs/10-PageHelper分页工具.png)

### 条件分页查询

![1](figs/10-条件分页查询.png)

# Day11-一个案例（下）

## 新增员工

略

## 文件上传

在static中添加一个html文件去包含表单项，并配置相应的**UploadController**。

## 文件本地存储

调用transferTo方法，并指定目录存放，存储在服务器的磁盘目录中。但用的不多，因为还要让浏览器访问。因此对于上传文件的处理，一般都是用**云服务器**比较安全可靠。

### UUID

为了让存储的文件名是**唯一**的，需要使用UUID的方法设置。

### SpringBoot的请求大小设置

在application中设置：

```properties
# 设置最大文件上传大小为10MB
spring.servlet.multipart.max-file-size=10MB
# 设置最大请求大小为100MB，一次请求可以有多个文件
spring.servlet.multipart.max-request-size=100MB
```

## 利用阿里云进行文件上传

阿里云会将一些常用服务包装起来，供客户直接使用，就不用自己实现这些服务了：

![1](figs/11-阿里云服务.png)

### 阿里云OSS

![1](figs/11-阿里云OSS服务.png)

![1](figs/11-阿里云OSS使用步骤.png)

**Bucket**是用户用于存储对象的容器，所有对象必须存储在存储空间。

**SDK**是软件开发工具包，包括依赖（jar包）、代码实例等。

想使用的话，就直接在项目中**集成阿里云OSS的服务**。

### 集成阿里云服务

![1](figs/11-集成阿里云服务思路.png)

整体流程如上，但是没有买阿里云，就没跟着敲。

## 修改员工信息

分为**两步**：

> **查询回显**，展示在前端界面上；
>
> **修改员工**，将信息保存到数据库中。

## SB的配置文件

之前一直用的是application.properties，但是更常用的其实是yml文件。

### 参数配置化

尽量不要把参数分散的定义在java代码中，集中配置化则更加高效。

可以直接利用**@Value**注解，将properties文件的值映射过去，这样写代码，之后的修改直接改配置文件即可，如对阿里云的配置：

![1](figs/11-利用Value注解配置映射.png)

### yml/yaml型配置文件

对于不同的配置文件，写法稍有区别：

![1](figs/11-不同配置文件的语法.png)

最推荐的还是yml格式的配置文件

![1](figs/11-最推荐的yml格式配置文件.png)

### @ConfigurationProperties

一个个参数从application文件对应过去很麻烦，所以又有一个新的注解可以简化这个过程，只需要在注解中指定配置文件的名称，并在类中一一对应即可：

![1](figs/11-ConfigurationProperties注解.png)

# Day12-登录

## 登录功能

通过设置**SQL查询语句**来实现登录的功能。

```sql
select * from emp where username = "jinyong" and password = "123456"
```

实现思路为：

![1](figs/12-登录功能的思路.png)

## 登录校验

仅仅实现一个登录的Controller是不够的，还需要实现当没有登录时，将页面跳转到登录界面才正常。

### 限制

HTTP协议是**无状态**的协议，服务器无法仅靠HTTP请求判断是否登录成功。一般而言是存储一个登录标记来区分，并在取出登录标记前对登录请求进行统一拦截：

![1](figs/12-登录校验的整体过程.png)

### 会话技术

打开浏览器访问Web服务器资源，就是一个会话的建立。

![11](figs/12-会话跟踪技术.png)

#### Cookie

本身的HTTP协议就携带了Cookie技术，所以很多都是自带的。但是Cookie不太适用于**跨域请求**。

![1](figs/12-Cookie方案的详情.png)

#### Session

这是服务器端的会话跟踪方案，但是现在不怎么用了。

![1](figs/12-Session的详情.png)

#### 令牌技术

现在采用的方案是令牌技术，属于目前最优的方案。

![1](figs/12-令牌方案.png)

### JWT令牌技术

一种JSON数据格式的令牌技术。

![1](figs/12-JWT令牌.png)

过程为先生成令牌，后校验令牌：

![1](figs/12-JWT令牌的使用过程.png)

#### 生成和校验

引入Maven依赖：**jjwt**。通过**Jwts.builder**构造令牌。

测试一下生成令牌：

```java
@Test
    public void testGenJwt(){
        Map<String, Object> claims = new HashMap<>();
        claims.put("id",1);
        claims.put("name","tom");

        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "itheima")//签名算法
                .setClaims(claims) //自定义内容(载荷)
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000))//设置有效期为1h
                .compact();
        System.out.println(jwt);
    }
```

之后对这个令牌解码：

```java
@Test
    public void testParseJwt(){
        Claims claims = Jwts.parser()
                .setSigningKey("itheima")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoidG9tIiwiaWQiOjEsImV4cCI6MTcwMTg1ODcwMn0.QxfU2bNtPV2ZFUxgY9r-MHmibS2yR-MPYrZktMbZIgg")
                .getBody();
        System.out.println(claims);
    }
```

只有令牌校验通过后，才能允许进一步操作和服务。

为了能使用令牌功能，需要在之前实现的登录功能中引入令牌的操作：

```java
@PostMapping("/login")
    public Result login(@RequestBody Emp emp){
        log.info("员工登录: {}", emp);
        Emp e = empService.login(emp);

        //登录成功,生成令牌,下发令牌
        if (e != null){
            Map<String, Object> claims = new HashMap<>();
            claims.put("id", e.getId());
            claims.put("name", e.getName());
            claims.put("username", e.getUsername());

            String jwt = JwtUtils.generateJwt(claims); //jwt包含了当前登录的员工信息
            return Result.success(jwt);
        }

        //登录失败, 返回错误信息
        return Result.error("用户名或密码错误");
    }
```

### Filer过滤器

![1](figs/12-登录校验过滤器.png)

因为所有的Controller对过滤器的逻辑是相同的，可以一起实现。

![1](figs/12-实现Filter.png)

在SB项目中想使用Filter，还需要在主程序中添加注解：**@ServletComponentScan**，表明对Servlet组件的支持。

这种过滤器的拦截路径可以在**@WebFilter**中配置。

![1](figs/12-过滤器拦截路径选择.png)

过滤器甚至可以形成一个**过滤器链**：

![1](figs/12-过滤器链.png)

这种过滤器链的执行顺序是按照**类名的字母先后**执行的。

#### 登录校验过滤器

![1](figs/12-登录校验过滤器设置.png)

实现登录校验过滤器的步骤如下所示：

![1](figs/12-登录校验过滤器的实现步骤.png)

### 拦截器

算是一种Spring框架中提供的过滤器方法，两者很类似。对于拦截器而言，需要进行定义和配置拦截器：

![1](figs/12-定义和配置拦截器.png)

#### 拦截器配置

![1](figs/12-拦截器的拦截路径配置.png)

#### 拦截器执行流程

对于拦截器的执行流程而言，如下所示：

![1](figs/12-拦截器的执行流程.png)

#### 实现拦截器

和过滤器的过程基本相同。

# Day13-事务管理和AOP

AOP是SpringBoot框架的第二个核心。第一个是IOC控制反转。

## 事务管理

### 什么是事务

![1](figs/13-什么是事务.png)

### 案例-删除一个部门的员工

需要在mapper中增加一个部门删除的功能，并增加SQL语句来删除该部门下的所有员工。但这种直接写逻辑的方法可能发生进行一半就出错的异常，这时候就需要利用**事务机制**，实现事务的**回滚**。因为这部分逻辑都是一样的，SpringBoot框架把这个封装到了注解**@Transactional**中：

![1](figs/13-在删除部门逻辑中添加事务.png)

### @Transactional

![1](figs/13-Transactional注解.png)

### 事务管理日志

在application中添加语句：

```yml
#spring事务管理日志
logging:
  level:
    org.springframework.jdbc.support.JdbcTransactionManager: debug
```

### Rollback回滚细节

自动的回滚只针对运行时异常，其它类型的异常则不管，需要单独设置**rollbackFor**：

![1](figs/13-rollbackFor.png)

### Propagation事务的传播行为

对于事务传播行为：当一个事务方法被另一个事务方法调用时，这个事务方法应该如何进行事务控制。

![1](figs/13-事务的传播行为.png)

一般而言，大部分情况直接使用默认配置，只有当**不希望事务间相互影响**时，再使用New属性。

## AOP

### 概述

通俗来讲，可以理解成针对一个特定的方法进行编程，简化繁琐的代码，同时又不影响原来的代码逻辑。

![1](figs/13-AOP概述.png)

### AOP快速使用

步骤为：导入依赖，编写AOP程序，并通过注解**@Aspect**说明是AOP类型的程序，以一个记录程序运行时长的AOP程序为例：

![1](figs/13-AOP的快速使用.png)

这只是个牛刀小试的例子，还有其他常用的场景：记录操作日志，权限控制，事务管理等等。同时具有代码无侵入、维护方便，开发高效等优点。

### 核心概念

![1](figs/13-AOP核心概念.png)

一旦运用了AOP变成，运行的就不再是目标对象，而是AOP生成的**代理对象**。

### 通知类型

有以下几种不同注解的通知类型。

![1](figs/13-AOP的通知类型.png)

当很多的切入点表达式是相同的，还可以通过**@Pointcut**将公共切入点抽取出来：

![1](figs/13-@Pointcut注解抽取公共切点表达式.png)

### 通知顺序

不同的切面类中的目标方法执行时是有个先后顺序的，原始顺序是按照类名字母的先后顺序执行，但也可以通过**@Order**注解控制先后顺序：

![1](figs/13-通知顺序.png)

### 切入点表达式-execution

![1](figs/13-切入点表达式.png)

切入点表达式中也可以包含通配符符号，其含义为：

![1](figs/13-切入点表达式的通配符.png)

  ![1](figs/13-Execution表达式书写建议.png)

### 切入点表达式-@annotation

通过**自定义注解**的方式完成。

### 连接点

**@Around**类型只能使用**ProceedingJoinPoint**类型获得连接点信息，其他四种类型则可以使用其父类型**JoinPoint**获得连接点信息。

### AOP案例-将操作记录到Log中

使用学过的AOP技术，可以实现操作记录到Log中的功能，其实现思路为：

![1](figs/13-将操作记录到Log中.png)

# Day14-Spring Boot原理

## 配置优先级

就是application的配置文件优先级，**properties>yml>yaml**。主流还是采用yml类型配置文件。

原始方法而言，又可以通过java系统属性或命令行参数配置，优先级最高，但不咋用。

## Bean的管理





### Bean的作用域

![1](figs/14-Bean的作用域.png)

![1](figs/14-配置Bean的作用域.png)

### 第三方Bean

![1](figs/14-使用第三方Bean.png)

## SpringBoot原理

### 起步依赖

利用Maven的依赖传递，实现SB的起步依赖。

### 自动配置

自动配置指启动Spring容器后，一些配置类、Bean对象自动存入了IOC容器之中，免去了手动配置。

#### 原理（高频！！！）

比较常用的自动配置方式是使用**@Import**注解将类导入到IOC容器中，最优的还是使用**@EnableXXXX**封装@Import注解：

![1](figs/14-通过@imort导入类.png)

## 总结

整个项目的开发结构为：

![1](figs/14-项目开发结构.png)

用到的这些技术栈和框架为，SSM框架就是其中的右上方三个部分：

![1](figs/14-使用到的技术栈与框架.png)

# Day15-Maven高级

## 分模块设计

实际开发大型项目时，需要用到分模块设计的思想：

![1](figs/15-分模块设计.png)

将案例项目分化成各个模块后的结构如下图所示，通过在**Maven依赖中引入自己构建的模块**，就可以让各个模块关联起来：

![1](figs/15-分模块设计实例.png)

## 继承与聚合

重复的依赖配置比较繁琐，需要用到**Maven继承**来解决此问题。设置父工程来配置**共用的依赖**，子工程配置各自单独的依赖。

![1](figs/15-Maven继承与聚合.png)

### 继承配置方式

实现继承需要按照如下的步骤执行：

![1](figs/15-继承配置方式1.png)

![1](figs/15-继承配置方式2.png)

![1](figs/15-继承配置方式3.png)

两种父子工程的项目结构都可以，后者可以更直观感受差异：

![1](figs/15-两种父子工程项目结构.png)

## 版本锁定

引入的依赖是有版本的，不同的子工程如果版本不一就很混乱，在父工程中对依赖的版本进行锁定，子工程中就不再需要对依赖设置版本。

### \<dependencyManagement>字段配置

![1](figs/15-依赖的版本锁定.png)

> dependencyManagement仅仅管理依赖的版本，**没有真正引入依赖**！！！还需要在子工程中引入依赖。

### \<Properties>字段配置版本锁定

但上边的方法过于麻烦，Maven提供了一个属性值字段，可以快速配置：

![1](figs/15-第二种版本锁定方法.png)

先在Properties字段中配置好依赖及其版本号，之后在父/子工程中就可以通过占位符**${}**的形式使用这个版本号。即**先配置，再使用**。

`这也是为什么Web开发的起步依赖无需指定版本号，其在SpringBoot中已经默默的配置好了`

## Maven聚合

如果打包的工程中有**自己编写的代码依赖**，就需要在本地中包含对应的jar包才行，即install到本地中。手动的过程可能比较繁琐，可以使用**聚合工程**功能：

![1](figs/15-Maven聚合功能.png)

## 私服

开发者是找不到别人的私人仓库里的jar包的，普通人也没有权限向中央仓库上传jar包。构建**私服**，就可以在不同团队间**共享jar包**。

![1](figs/15-中央仓库和私服的依赖传入顺序.png)

私服的使用，无非对Jar包的上传与下载:

![1](figs/15-私服jar包的上传.png)

### 私服的访问配置

但这个私服配置的需要在Maven软件安装位置中的**settings.xml**中添加，配置方式为：

![1](figs/15-私服配置方法1.png)

![2](figs/15-私服配置方法2.png)

![3](figs/15-私服配置方法3.png)