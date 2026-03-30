# Social Sparks

Social Sparks is an Android application designed to help users ignite their social life and "find their spark." Whether you're looking for conversation starters or inspiration for social activities, Social Sparks provides the prompts you need to start socializing.

## Purpose

The primary goal of Social Sparks is to facilitate meaningful social interactions. The app offers features like:
- **Spark Shower**: A collection of prompts and ideas to get conversations flowing.
- **Time-based Suggestions**: Tailored experiences based on the time of day.
- **Easy Navigation**: A simple, intuitive interface to get you straight to the "sparks."

## Design Considerations

- **Visual Appeal**: The app features a warm and colorful artistic design to create an inviting and energetic atmosphere for users.
- **Modern Android Development**: Built using Kotlin and modern libraries like Jetpack Compose (or standard XML layouts with ConstraintLayout), following best practices for performance and maintainability.
- **Material Design**: Utilizes Material 3 components for a consistent and high-quality user experience.
- **Target SDK**: Optimized for the latest Android features by targeting API Level 36.

## GitHub & GitHub Actions

This project leverages GitHub for version control and collaborative development. 

### Continuous Integration (CI)
We have implemented a **GitHub Actions** workflow (`.github/workflows/android.yml`) to ensure code quality and stability. The workflow automatically performs the following on every push or pull request to the `main` branch:

1.  **Environment Setup**: Configures the build environment with JDK 17.
2.  **Build**: Compiles the application to ensure there are no build errors.
3.  **Unit Testing**: Runs the test suite to verify the core logic of the application.

## Getting Started

To get started with the project:

1.  Clone the repository.
2.  Open the project in **Android Studio**.
3.  Ensure you have the **Android SDK 36** installed.
4.  Build and run the app on an emulator or a physical device.

---
Developed with ❤️ by the Social Sparks Team.
