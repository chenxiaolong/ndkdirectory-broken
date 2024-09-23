This is a sample repo to demonstrate an issue where the eager `android.ndkDirectory` variable works, but the lazy `androidComponents.sdkComponents.ndkDirectory` does not.

```
$ ./gradlew printEager

> Task :app:printEager
SDK directory: /home/chenxiaolong/Applications/android-sdk
NDK directory: /home/chenxiaolong/Applications/android-sdk/ndk/27.0.12077973

BUILD SUCCESSFUL in 483ms
1 actionable task: 1 executed
```

```
$ ./gradlew printLazy

> Task :app:printLazy FAILED
SDK directory: /home/chenxiaolong/Applications/android-sdk

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:printLazy'.
> Cannot query the value of this provider because it has no value available.

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.
> Get more help at https://help.gradle.org.

BUILD FAILED in 470ms
1 actionable task: 1 executed
```
