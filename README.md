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


**Java Tech stacks**
- Storing a Roman letters in Enum
- Passing Arguments in method with a help of Arguments.of()  [junit]
- Stream.of("I", "V", "X").map(Arguments::of) to map Arguments.of() function to each arguments of stream
- Executable is a functional interface added in dynamic test method to run the executables

**Advice**
- @Tag can be used twice in the test
- use the proper version mentioned in pom.xml for using @RunWith(JUnitPlatform.class)
- BeforeAll and AfterALl methods should be static