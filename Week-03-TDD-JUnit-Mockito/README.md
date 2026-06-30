# Week 3: Test Driven Development, JUnit 5 & Mockito

Weekly content focusing on unit testing and test isolation.

*   **Repository URL:** https://github.com/dhairyagothi/Digital-Nurture-JavaFSE-Cognizant

---

## Study Topics

### 1. Test Driven Development (TDD)
- TDD Red-Green-Refactor Cycle
- Writing failing tests, minimal implementation code, and refactoring
- TDD vs Traditional Testing

### 2. JUnit 5 Framework
- Setting up JUnit 5
- Basic assertions and Test Structure (Arrange-Act-Assert / AAA pattern)
- Test Fixtures (Setup and Teardown methods)
- Parameterized Tests, test suites, execution order, exception validation, and timeouts

### 3. Mockito Framework
- Mocking and stubbing dependencies
- Verifying interactions and argument matching
- Mocking databases, repositories, and external APIs
- Mocking void methods and strategies for external dependencies

---

## Weekly Tasks
- Write a utility library following strict TDD cycles.
- Create parameterized JUnit 5 test suites.
- Code mock repository objects using Mockito and write service-level unit tests.

---

## Hands-On Exercises

*   [pom.xml](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/pom.xml) - Maven Project configuration with JUnit dependency
*   [Calculator](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/Calculator.java) / [Test](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/CalculatorTest.java) - Exercise 2: Basic JUnit Tests
*   [AssertionsTest](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/AssertionsTest.java) - Exercise 3: Assertions in JUnit
*   [BankAccount](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/BankAccount.java) / [Test](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/BankAccountTest.java) - Exercise 4: AAA Pattern and Test Fixtures

### Advanced JUnit Testing Exercises
*   [EvenChecker](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/EvenChecker.java) / [Test](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/EvenCheckerTest.java) - Exercise 1: Parameterized Tests (JUnit 5)
*   [AllTests](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/AllTests.java) - Exercise 2: Test Suites and Categories (JUnit 5 Suite Engine)
*   [OrderedTests](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/OrderedTests.java) - Exercise 3: Test Execution Order (JUnit 5)
*   [ExceptionThrower](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/ExceptionThrower.java) / [Test](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/ExceptionThrowerTest.java) - Exercise 4: Exception Testing (JUnit 5)
*   [PerformanceTester](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/PerformanceTester.java) / [Test](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/PerformanceTesterTest.java) - Exercise 5: Timeout and Performance Testing (JUnit 5)

### Mockito Hands-On Exercises
*   [ExternalApi](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/ExternalApi.java) / [MyService](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/MyService.java) / [Test](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/MyServiceTest.java) - Exercises 1 to 7 (Mocking, Stubbing, Verification, Matchers, Void Methods, Call Ordering, Void Exceptions)

### Advanced Mockito Hands-On Exercises
*   [Repository](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/advanced/Repository.java) / [Service](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/advanced/Service.java) / [Test](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/advanced/ServiceTest.java) - Exercise 1: Mocking Databases & Repositories
*   [RestClient](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/advanced/RestClient.java) / [ApiService](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/advanced/ApiService.java) / [Test](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/advanced/ApiServiceTest.java) - Exercise 2: Mocking External Services (REST APIs)
*   [FileReader](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/advanced/FileReader.java) / [FileWriter](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/advanced/FileWriter.java) / [FileService](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/advanced/FileService.java) / [Test](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/advanced/FileServiceTest.java) - Exercise 3: Mocking File I/O
*   [NetworkClient](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/advanced/NetworkClient.java) / [NetworkService](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/main/java/com/example/advanced/NetworkService.java) / [Test](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/advanced/NetworkServiceTest.java) - Exercise 4: Mocking Network Interactions
*   [Test](file:///c:/personal%20dg/github_repo/Digital-Nurture-JavaFSE-Cognizant/Week-03-TDD-JUnit-Mockito/src/test/java/com/example/advanced/MultiReturnServiceTest.java) - Exercise 5: Mocking Multiple Return Values (Consecutive Calls)
