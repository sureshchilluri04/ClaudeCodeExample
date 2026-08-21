/**
 * MainActivity.kt
 *
 * Entry point of the ClaudeCodeExample Android application.
 * Sets up the Compose UI with edge-to-edge display and renders the main greeting screen.
 */
package com.example.claudecodeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.claudecodeexample.ui.theme.ClaudeCodeExampleTheme

/**
 * The main and only activity of the application.
 *
 * Hosts the Compose content tree and configures edge-to-edge display so the UI
 * can draw behind system bars (status bar, navigation bar).
 */
class MainActivity : ComponentActivity() {

    /**
     * Called when the activity is first created.
     *
     * Enables edge-to-edge rendering and sets the Compose content with the app theme,
     * a [Scaffold] for proper inset handling, and the [Greeting] composable.
     *
     * @param savedInstanceState Previously saved instance state, or null on first creation.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Extend the app layout to fill behind system bars.
        // Wrapped in try-catch to guard against crashes on custom OEM ROMs
        // where edge-to-edge APIs may not behave as expected.
        try {
            enableEdgeToEdge()
        } catch (e: Exception) {
            // Non-fatal: continue without edge-to-edge if unsupported
        }
        setContent {
            ClaudeCodeExampleTheme {
                // Scaffold provides default slot-based layout with proper system inset padding
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        // Apply scaffold-provided padding to avoid overlap with system bars
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

/**
 * Displays a simple greeting text message.
 *
 * @param name The name to include in the greeting.
 * @param modifier Optional [Modifier] for layout customization; defaults to [Modifier].
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Guard against blank input to avoid displaying an empty or misleading greeting
    val safeName = name.takeIf { it.isNotBlank() } ?: "User"
    Text(
        text = "Hello $safeName!",
        modifier = modifier
    )
}

/**
 * Android Studio preview for [Greeting] rendered inside the app theme.
 *
 * Displays the composable with a white background in the IDE preview pane.
 */
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ClaudeCodeExampleTheme {
        Greeting("Android")
    }
}
