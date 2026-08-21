# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Run Commands

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

## Architecture & Structure

This is a minimal Android app using **Jetpack Compose** with a single-activity architecture.

- `app/src/main/java/com/example/claudecodeexample/`
  - `MainActivity.kt` — sole Activity; sets up edge-to-edge display and hosts the Compose content tree
  - `ui/theme/` — Material3 theme: `Theme.kt`, `Color.kt`, `Type.kt`

**Key configuration:**
- `compileSdk`/`minSdk`/`targetSdk` = 36
- Kotlin 2.0.21, AGP 8.9.0
- Compose BOM 2024.09.00
- Dependency versions managed via `gradle/libs.versions.toml` (version catalog)

## Custom Commands

`.claude/commands/add-code-comments.md` — slash command (`/add-code-comments`) that adds KDoc comments to all `.kt` files without changing logic.

For every null pointer exception related input read add-avoid-null-pointer-exceptions skills. 
When you develop a website use ui-ux-pro-max skill.