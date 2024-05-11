# Strategy Training Project

This project demonstrates the implementation of various athletic training strategies using Java and Maven.

## Overview

The project showcases the Strategy Design Pattern, where different training strategies are encapsulated into separate
classes implementing a common interface. It allows athletes to perform training sessions for different types of athletic
events, such as sprinting, distance running, jumping, and throwing.

## Project Structure

The project is structured as follows:

- **AthleticTraining**: Interface representing different athletic training strategies.
- **Context**: Class providing a context for executing training sessions using different strategies.
- **TrainingSession**: Class representing details of a training session including date, time slot, and place.
- **DefaultTraining**: Default implementation of the AthleticTraining interface.
- **SprintTraining**: Implementation of the AthleticTraining interface for sprint training.
- **DistanceTraining**: Implementation of the AthleticTraining interface for distance training.
- **JumpTraining**: Implementation of the AthleticTraining interface for jump training.
- **ThrowTraining**: Implementation of the AthleticTraining interface for throw training.
- **Main**: Contains the `main` method to demonstrate the usage of different training strategies.

## Usage

To run the project, follow these steps:

1. Clone this repository.
2. Navigate to the root directory of the project.
3. Run the following command:

```bash
mvn clean install
```

After successful build, run the Main class:

```bash
java -jar target/strategy_java-1.0-SNAPSHOT.jar
```

This will execute the main method in the Main class, demonstrating the usage of different training strategies.

### Running Unit Tests

Explore the comprehensive unit tests included in the project to ensure reliability and robustness. To execute them using
Maven, simply run:

```bash
mvn test
```

## Generate Javadoc

Use the following Maven command to generate Javadoc

```bash
mvn javadoc:javadoc
```

## Building and Running with Docker

The project includes a Dockerfile for containerization. To build an image and run the project within a container,
execute the following commands:

```bash
docker build -t strategy_java .
docker run -it --rm strategy_java
```

## Dependencies

Ensure the following dependencies are available:

- Java 8 or higher
- Apache Maven

## Contributions

Contributions to enhance and expand this project are welcome. Feel free to fork the repository, make your changes, and
submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
