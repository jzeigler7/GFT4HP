# GFT4HP: Group Formation Tool for Hackathon Participants

## Overview

The GFT4HP (Group Formation Tool for Hackathon Participants) Application is a JavaFX-based platform designed to streamline the process of forming balanced, productive teams during hackathons. Originally developed for HackGT9, this tool uses a binary heap-based matchmaking system to efficiently create and manage participant groups based on their skills, interests, and other attributes.

## Features

### Core Functionalities

- **Participant Management**:
  - Add, edit, and remove participant profiles, including their skills, interests, and preferences.

- **Team Formation**:
  - Automatically generate teams based on participant compatibility, skills, and preferences.
  - Supports creating balanced teams for diverse hackathon projects.

- **Heap-Based Matchmaking**:
  - Utilizes a generic binary heap implementation to optimize team formation by prioritizing participant compatibility.
  - Ensures fair and efficient matching.

- **Visualization**:
  - Displays the current status of participants and teams in an intuitive GUI.

### Educational and Practical Value

- Provides an efficient algorithmic approach to solve team formation challenges.
- Offers practical insights into balancing teams for hackathon success.

## Installation

### Prerequisites

1. **Java 11 or higher**
2. **JavaFX**: Ensure JavaFX libraries are installed and configured in your environment.

### Setup

1. **Clone the Repository**:
   ```bash
   git clone <repository_url>
   cd <repository_name>
   ```

2. **Compile and Run**:
   Compile the project with JavaFX libraries included, then run the application:
   ```bash
   javac --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml -d . src/com/example/gft4hp/*.java
   java --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml com.example.gft4hp.GFT4HPApplication
   ```

## Key Components

### GUI Components

- **`GFT4HPApplication.java`**:
  - Entry point for the JavaFX application.
  - Loads the `hello-view.fxml` file for the graphical interface.

- **`GFT4HPController.java`**:
  - Handles user interactions with the GUI, such as adding participants and forming teams.
  - Updates the interface dynamically to reflect participant and team changes.

### Data Structures

- **`BinaryHeap.java`**:
  - Implements a generic binary heap used to prioritize participants during team formation.
  - Supports efficient addition, removal, and prioritization of participants.

- **`Participant.java`**:
  - Represents a hackathon participant, including attributes like skills, interests, and availability.

### Workflow

1. **Participant Input**:
   - Add participant details through the GUI.

2. **Team Formation**:
   - Automatically generate teams based on participant data.

3. **Visualization**:
   - View the formed teams and their composition in the GUI.

## Usage

1. **Launch the Application**:
   Run the application to open the GUI.

2. **Add Participants**:
   Use the provided form to input participant details, including name, skills, and preferences.

3. **Form Teams**:
   Click the "Form Teams" button to automatically generate balanced groups.

4. **Manage Participants and Teams**:
   Edit or remove participants and recreate teams as necessary.

## Dependencies

- **JavaFX**: Required for graphical user interface.

## Contribution

Contributions are welcome! Feel free to submit a pull request or open an issue for new features, bug fixes, or documentation improvements.

## License

This project is licensed under the MIT License.

## Author

**Jacob Zeigler**

