# Local Spec Sample

This sample demonstrates various ways to configure the `openapi-generator-gradle-plugin`.

The following tasks can be run from this directory.

```bash
./gradlew openApiGenerate              # expected outcome: BUILD SUCCESSFUL
./gradlew openApiMeta                  # expected outcome: BUILD SUCCESSFUL
./gradlew openApiValidate              # expected outcome: BUILD FAILED
./gradlew buildGoSdk                   # expected outcome: BUILD SUCCESSFUL
./gradlew buildDotnetSdk               # expected outcome: BUILD SUCCESSFUL
./gradlew buildJavaRestTemplateSdk     # expected outcome: BUILD SUCCESSFUL
./gradlew generateGoWithInvalidSpec    # expected outcome: BUILD FAILED
./gradlew validateGoodSpec             # expected outcome: BUILD SUCCESSFUL
./gradlew validateBadSpec              # expected outcome: BUILD FAILED
```

The following lifecycle tasks can also be run from this directory, executing multiple validate and generate tasks at
once. These are all expected to fail since they depend on tasks which are intended to fail.

```bash
./gradlew build                       # expected outcome: BUILD FAILED
./gradlew check                       # expected outcome: BUILD FAILED
./gradlew generateSpecs               # expected outcome: BUILD FAILED
./gradlew validateSpecs               # expected outcome: BUILD FAILED
```

The samples can be tested against other versions of the plugin using the `openApiGeneratorVersion` property. For
example:

```bash
./gradlew -PopenApiGeneratorVersion=6.2.1 openApiValidate
```
