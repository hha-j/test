# test

自用测试 git 库 —— Java Maven 示例项目

## 项目结构

```
test-app/
├── pom.xml
└── src/
    ├── main/java/com/example/app/
    │   ├── Application.java       # 程序入口
    │   └── GreetingService.java   # 示例业务服务
    └── test/java/com/example/app/
        └── GreetingServiceTest.java  # 单元测试
```

## 环境要求

- JDK 17+
- Maven 3.8+

## 快速开始

```bash
# 编译并运行测试
mvn clean verify

# 打包
mvn clean package

# 运行
java -jar target/test-app-1.0.0.jar
```
