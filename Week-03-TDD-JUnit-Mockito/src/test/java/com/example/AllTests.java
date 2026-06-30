package com.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import com.example.advanced.*;

@Suite
@SelectClasses({
    CalculatorTest.class,
    AssertionsTest.class,
    BankAccountTest.class,
    EvenCheckerTest.class,
    OrderedTests.class,
    ExceptionThrowerTest.class,
    PerformanceTesterTest.class,
    MyServiceTest.class,
    ServiceTest.class,
    ApiServiceTest.class,
    FileServiceTest.class,
    NetworkServiceTest.class,
    MultiReturnServiceTest.class
})
public class AllTests {
}
