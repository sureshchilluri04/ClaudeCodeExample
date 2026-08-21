# ClaudeCodeExample

A minimal Android app built with **Jetpack Compose**, using a single-activity architecture. This project serves as a sandbox for exploring Claude Code workflows on an Android codebase.

## Tech Stack

- **Language:** Kotlin 2.0.21
- **UI Toolkit:** Jetpack Compose (Material3)
- **Build System:** Gradle with Android Gradle Plugin (AGP) 8.9.0
- **Compose BOM:** 2024.09.00
- **SDK Levels:** `compileSdk` / `minSdk` / `targetSdk` = 36
- **Dependency Management:** Gradle version catalog (`gradle/libs.versions.toml`)

## Project Structure

```
app/src/main/java/com/example/claudecodeexample/
├── MainActivity.kt      # Sole Activity; sets up edge-to-edge display and hosts the Compose content tree
└── ui/theme/             # Material3 theme definitions
    ├── Color.kt
    ├── Theme.kt
    └── Type.kt
```

## Getting Started

### Prerequisites

- Android Studio (latest stable)
- JDK 11+

### Build & Run Commands

```bash
# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Run unit tests
./gradlew test

# Run a single unit test class
./gradlew test --tests "com.example.claudecodeexample.ExampleUnitTest"

# Run instrumented tests (requires connected device/emulator)
./gradlew connectedAndroidTest

# Lint check
./gradlew lint

# Clean build
./gradlew clean
```

## Custom Commands

- `.claude/commands/add-code-comments.md` — slash command (`/add-code-comments`) that adds KDoc comments to all `.kt` files without changing logic.

## Contributing

This is a practice/example repository. Feel free to open a PR with improvements or experiments.
