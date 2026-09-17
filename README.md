# Campus Course & Records Manager (CCRM)

**Shreyas Agarwal (25BAI11356)**

CCRM is a Java console application for managing students, courses, and enrollments at a campus. It was built as a course project to demonstrate core object-oriented programming concepts using a simple command-line interface.

## Project Structure

```
java-ccrm-vityarthi-main/
├─ ccrm/
│  ├─ cli/       ← application entry point and menu (MainMenu.java)
│  ├─ config/    ← application configuration
│  ├─ domain/    ← core classes (Student, Course, etc.)
│  ├─ service/   ← business logic
│  └─ util/      ← utility/helper classes
├─ screenshots/  ← screenshots demonstrating functionality
├─ sample.txt    ← sample file used for the backup demo
├─ .gitignore
└─ README.md
```

## Requirements

- Java 17 or newer
- A terminal, or an IDE such as VS Code (with the Java Extension Pack) or Eclipse

## Running from the Command Line

1. Open a terminal in the project's root folder.
2. Compile the source files:

   **Linux/macOS:**
   ```
   mkdir -p out
   javac -d out $(find ccrm -name "*.java")
   ```

   **Windows PowerShell:**
   ```
   New-Item -ItemType Directory -Force out | Out-Null
   javac -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
   ```

3. Run the program:
   ```
   java -cp out ccrm.cli.MainMenu
   ```

### Running with assertions enabled (optional)

Some classes use assertions for input validation, e.g.:
```java
assert credits > 0 : "Credits must be positive";
```
To enable them at runtime:
```
java -ea -cp out ccrm.cli.MainMenu
```

## Running from an IDE

**VS Code:** Open the project folder with the Java Extension Pack installed, then run `ccrm/cli/MainMenu.java` directly.

**Eclipse:**
1. File → New → Java Project
2. Name it `CCRM-Java-Project`
3. Import the existing `ccrm/` package structure
4. Run `MainMenu.java`

## OOP Concepts Used

| Concept | Where | Purpose |
|---|---|---|
| Encapsulation | `Student.java` (private fields) | Protects internal state |
| Inheritance | `Person → Student, Instructor` | Shared behavior across subtypes |
| Abstraction | `Person.java` (abstract class) | Common interface for related classes |
| Polymorphism | `printProfile()` overrides | Same method signature, different behavior per subclass |
| Immutable classes | `CourseCode.java` | Thread-safe, predictable objects |
| Nested classes | `Course.Builder` | Groups construction logic with the class it builds |
| Enums | `Grade.java`, `Semester.java` | Type-safe constant sets |
| Design patterns | Singleton, Builder | Standard, well-understood object-creation patterns |
| File I/O | `FileUtil.java` (NIO.2) | Reading/writing and backup functionality |
| Date/Time API | Student admission dates | Modern replacement for the legacy `Date` class |

## Screenshots

The `screenshots/` folder contains images showing:
- Java version check
- Project structure in the IDE
- The CLI running
- The backup feature working

## Possible Future Additions

- Database connectivity (JDBC)
- A web interface or REST API
- Expanded reporting features

The current package structure (separating `domain`, `service`, and `util`) was chosen to make additions like these easier without needing to restructure existing code.
