## Modified version of [azure-data-appconfiguration](https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/appconfiguration/azure-data-appconfiguration) that runs on Android

Building and running in Android API level 26 with Gradle.

I've stripped out basically everything that isn't source code. Haven't touched nor looked at the samples.
I've left in the tests that are passing without any work, most of the ones that aren't were referring to things that aren't imported for whatever reason.
(Most of the problems were with trying to reference azure.core.test, I haven't looked into this at all)

I threw together an example app as a proof of concept, showing that the library is accessible in Android.

The tests are not executing in Android.
