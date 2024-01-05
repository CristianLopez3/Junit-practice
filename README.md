# JUnit 5

Testing Framework for Java.


> [!TIP]
> Assertions are the most important part when you make testing with JUnit.

### Assertions
Below i'm going to add the assertions methods that i consider most important:
<a href="https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html"> JUnit <b> Asserts Methods </b> </a>
* assertEquals(expected, actual): Asserts that expected and actual are equal.
* assertArrayEqual(expectedArray, actualArray): Verifies each item in the arrays are equal in the right position.
* assertIterableEquals(expectedArray, actualArray): Verifies each item in the iterable are equal in the corresponding positions.
* assertThrows(expectedException, actualException (lambda)): Verifies if the expected exception is equal to the actual exception between a lambda functions.
* assertAll((a bunch of lambdas)): use it when you need to run a bunch of assertions.

### Annotations
Below I'm going to add the annotations that i consider most important:
* @Test
* Scale my test
    - @DisplayName
    - @Disabled
* @Nested: Allow us create nested code in a class
### Life Cycle
The instance is: 
1. Created.
2. Managed.
3. Destroyed.
>[!IMPORTANT]
>Every process should be independent for others process, It meaning that the test class shouldn't be have an specific order to run its methods.

#### Life Cycle Hooks
Below you can see the hooks for the life cycle in a test:
* @BeforeAll
* @AfterAll
* @BeforeEach
* @AfterEach

### Dependencies to Add
```xml
   <properties>
        <maven.compiler.source>21</maven.compiler.source>
        <maven.compiler.target>21</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <junit.jupiter.version>5.4.0</junit.jupiter.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>${junit.jupiter.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>${junit.jupiter.version}</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```