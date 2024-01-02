# JUnit 5

Testing Framework for Java.


>[!TIP]
> Assertions are the most important part when you make testing with JUnit.

### Assertions
Below i'm going to add the assertions methods that i consider most important:
* assertEquals(expected, actual);
* 

### Annotations
Below i'm going to add the annotations that i consider most important:
* @Test
* 


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