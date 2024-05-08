# Strategy Training Project

This project demonstrates the implementation of various athletic training strategies using Go.

## Overview

The project showcases the Strategy Design Pattern, where different training strategies are encapsulated into separate
classes implementing a common interface. It allows athletes to perform training sessions for different types of athletic
events, such as sprinting, distance running, jumping, and throwing.

## Project Structure

The project is structured as follows:

- **AthleticTraining**: Interface representing different athletic training strategies.
- **Context**: Struct providing a context for executing training sessions using different strategies.
- **TrainingSession**: Struct representing details of a training session including date, time slot, and place.
- **DefaultTraining**: Default implementation of the AthleticTraining interface.
- **SprintTraining**: Implementation of the AthleticTraining interface for sprint training.
- **DistanceTraining**: Implementation of the AthleticTraining interface for distance training.
- **JumpTraining**: Implementation of the AthleticTraining interface for jump training.
- **ThrowTraining**: Implementation of the AthleticTraining interface for throw training.
- **main**: Contains the `main` function to demonstrate the usage of different training strategies.

## Usage

To run the project, follow these steps:

1. Clone this repository.
2. Navigate to the root directory of the project.
3. Run the following commands:

```bash
go mod init kmmania.com/strategy_go
go run main.go
```

This will execute the main function in main.go, demonstrating the usage of different data sources (MAS and HR) and their respective DAO and Service implementations.

### Running Unit Tests

Explore the comprehensive unit tests included in the project to ensure reliability and robustness. To execute them, simply run:

```bash
go test ./...
```

## Building and Running with Docker

The project includes a Dockerfile for containerization. To build an image and run the project within a container, execute the following commands:

```bash
docker build -t strategy_go .
docker run -it --rm strategy_go
```

## Dependencies

This project has no external dependencies beyond Go itself.

## Contributions

Contributions to enhance and expand this project are welcome. Feel free to fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.