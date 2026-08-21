Add meaningful comments to all source files in this Android project. For each file, read the existing code and add comments that improve understanding without stating the obvious.

Follow these guidelines:

1. **File-level comments** - Add a brief description at the top of each file explaining its purpose
2. **Class/Object comments** - Describe the responsibility of each class, object, or interface
3. **Function/Method comments** - Document parameters, return values, and non-obvious behavior using KDoc format (`/** */`)
4. **Inline comments** - Add short comments for complex logic, non-obvious decisions, or workarounds
5. **TODO/FIXME** - Mark any known issues or areas for improvement
6. Add k-doc comments for the all files. 

KDoc format to use for functions and classes:
```kotlin
/**
 * Brief description of what this does.
 *
 * @param paramName Description of the parameter
 * @return Description of the return value
 */
```

Process each source file in order:
- Every .kt extension kotlin files. 

For each file:
1. Read the current content
2. Add appropriate comments without changing any logic or functionality
3. Write the updated file back

After processing all files, provide a summary of the comments added per file.