Analyze all Kotlin source files in this Android project and add null-safety improvements to avoid NullPointerExceptions and runtime crashes.

For each file, read the existing code and apply Kotlin null-safety best practices without changing the intended logic or functionality.

Follow these guidelines:

1. **Replace nullable types with non-null where safe** - If a variable is always initialized before use, change `Type?` to `Type`
2. **Use safe-call operator (`?.`)** - Replace direct calls on nullable types (`obj.method()`) with safe calls (`obj?.method()`)
3. **Use Elvis operator (`?:`)** - Provide fallback values for nullables: `val name = user?.name ?: "Unknown"`
4. **Use `let` for null-safe blocks** - Replace null checks with `?.let { }` blocks for cleaner null-safe execution
5. **Use `requireNotNull` / `checkNotNull`** - For values that must not be null at a specific point, use these to fail fast with a clear message instead of a cryptic NPE
6. **Use `!!` sparingly** - Remove or replace non-null assertions (`!!`) with safe alternatives; only keep `!!` where null is truly impossible and document why
7. **lateinit var safety** - Add `::variable.isInitialized` checks before accessing `lateinit var` properties where initialization is not guaranteed
8. **Collection null-safety** - Use `orEmpty()`, `filterNotNull()`, or `listOfNotNull()` to avoid NPEs from null collections or null elements
9. **Parameter null-safety** - Add `requireNotNull(param)` or default values for function parameters that must not be null

Kotlin null-safety patterns to apply:

```kotlin
// Safe call
val length = text?.length

// Elvis operator with fallback
val display = name ?: "N/A"

// let block for null-safe scope
user?.let {
    showProfile(it.name)
}

// requireNotNull with message
val config = requireNotNull(appConfig) { "appConfig must be initialized before use" }

// filterNotNull on collections
val validItems = rawList.filterNotNull()

// isInitialized check for lateinit
if (::myObject.isInitialized) {
    myObject.doSomething()
}
```

Process each source file in order:
- Every `.kt` Kotlin file under `app/src/main/java/`

For each file:
1. Read the current content
2. Identify all potential null pointer risks
3. Apply the appropriate null-safety patterns above
4. Write the updated file back without altering business logic

After processing all files, provide a summary listing:
- Which files were modified
- What null-safety changes were applied in each file
- Any `!!` usages that remain and why they were left in place