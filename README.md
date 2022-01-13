**Hibernate Advanced concepts**
1. JUnit5 new tags
2. Test Fixture
3. Test Suite
4. Tagging
5. Parameterized Tests
	- Value Source
	- Null and Empty source
	- Method Source
	- CSV source
	- CSV File Source
	- Arguments source (ArgumentsProvider interface)
6. Dynamic Test
7. Exception and Timeout testing
8. Extensions
9. Conditional testing
10. Repeated tests
11. Nested Tests
12. Test Interface
13. Dependency Injection
	- TestInfoParameterResolver
	- RepetitionInfoParameterResolver
	- TestReporterParameterResolver
14. Backward compatability

**Java Tech stacks**
- Storing a Roman letters in Enum
- Passing Arguments in method with a help of Arguments.of()  [junit]
- Stream.of("I", "V", "X").map(Arguments::of) to map Arguments.of() function to each arguments of stream
- Executable is a functional interface added in dynamic test method to run the executables

**Advice**
- @Tag can be used twice in the test
- use the proper version mentioned in pom.xml for using @RunWith(JUnitPlatform.class)
- BeforeAll and AfterALl methods should be static
- @BeforeEach will gets executed only once for @TestFactory
- Disabling Test at class level diables all of the Test methods inside it
- for n repetition, @BeforeEach method print n number of times
- in @Nested class sinario we can use the same method name outer class as well as inner class