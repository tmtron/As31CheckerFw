# As31CheckerFw
Test usage of checker-framework with an Android Studio 3.1 project

## Master Branch: Version 2.4.0

<!--
 ![] is the markdown syntax to add an image and this is surounded by a link to the travis-ci builds page
-->
[![Build Status](https://travis-ci.org/tmtron/As31CheckerFw.svg?label=travis)](https://travis-ci.org/tmtron/As31CheckerFw/builds) 

Currently (with Android Studio 3.1)  and checker-framework 2.4.0 execution fails with these errors:
```
class file for java.lang.Class$AnnotationData not found
class file for java.lang.Class$ReflectionData not found
```
see [checker-framework issue 1916](https://github.com/typetools/checker-framework/issues/1916)

## [Branch CheckerFw 2.5.1](../../tree/CheckerFw_2_5_1)

[Checker-framework issue 1916](https://github.com/typetools/checker-framework/issues/1916) is resolved in version 2.5.1, but there is another issue - [checker-framework#1990](https://github.com/typetools/checker-framework/pull/1990):

```
.../checker-qual-2.5.1.jar: Error: Invalid package reference in library; not included in Android: java.awt.image. Referenced from org.checkerframework.checker.signedness.SignednessUtil. [InvalidPackage]
.../checker-qual-2.5.1.jar: Error: Invalid package reference in library; not included in Android: java.awt. Referenced from org.checkerframework.checker.signedness.SignednessUtil. [InvalidPackage]
```

## [Branch CheckerFw 2.5.2](../../tree/CheckerFw_2_5_2)
Checker framework 2.5.2 works as expected.


