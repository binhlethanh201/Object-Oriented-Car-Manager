# JAVA Project

This project is an Object-Oriented Car Manager implemented in Java. It demonstrates the use of object-oriented programming principles to manage car objects and provides a simple GUI for interacting with car data. The system is designed for educational purposes, showcasing Java classes, encapsulation, and basic GUI programming.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- (Optional) An IDE like IntelliJ IDEA, Eclipse, or VS Code for easier code navigation

## Installation

1. **Clone the repository** (if not already downloaded):
   ```sh
   git clone <repository-url>
   cd Object-Oriented-Car-Manager-main
   ```
2. **Compile the source code:**
   Use the following command from the project root to compile all Java files:
   ```sh
   javac -d out src/GUI/*.java
   ```
   This will compile the Java files and place the `.class` files in the `out` directory.

   Alternatively, if you use NetBeans, you can build the project using the provided `build.xml` (Ant build script).

## How to Run

After compiling, run the main class to start the Car Manager application. For example:

```sh
java -cp out GUI.Tester
```

Or, if you use NetBeans, simply run the project from the IDE.

## Project Structure

```
Object-Oriented-Car-Manager-main/
├── src/
│   └── GUI/
│       ├── Car.java        # Car entity class
│       └── Tester.java     # Main entry point and GUI logic
├── lib/                    # Libraries (if any)
├── build.xml               # Ant build script (for NetBeans)
├── manifest.mf             # Manifest file
├── README.md               # Project documentation
└── ... (other project and build files)
```

- The `GUI` package contains the main Java source files for the Car Manager application.
- The `lib` directory may contain additional libraries required for the project.
- The `build.xml` file is used for building the project with Apache Ant (commonly used in NetBeans projects).

## Learn More

- [Java Documentation](https://docs.oracle.com/javase/tutorial/)
- [How to Compile and Run Java](https://www.oracle.com/java/technologies/javase/codeconventions-137265.html)
- For questions or contributions, please open an issue or pull request.
