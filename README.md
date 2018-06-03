# As31CheckerFw
Test usage of checker-framework with an Android Studio 3.1 project

<!--
 ![] is the markdown syntax to add an image and this is surounded by a link to the travis-ci builds page
-->
[![Build Status](https://travis-ci.org/tmtron/As31CheckerFw.svg?label=travis&branch=CheckerFw_2_5_1)](https://travis-ci.org/tmtron/As31CheckerFw/builds) 

This branch uses checker-framework 2.5.1 - the original issue [checker-framework#1916](https://github.com/typetools/checker-framework/issues/1916) does not show up, instead we see a new one [checker-framework#1990](https://github.com/typetools/checker-framework/pull/1990):
``` 
.../checker-qual-2.5.1.jar: Error: Invalid package reference in library; not included in Android: java.awt.image. Referenced from org.checkerframework.checker.signedness.SignednessUtil. [InvalidPackage]
.../checker-qual-2.5.1.jar: Error: Invalid package reference in library; not included in Android: java.awt. Referenced from org.checkerframework.checker.signedness.SignednessUtil. [InvalidPackage]
```

[Full Build Output](https://travis-ci.org/tmtron/As31CheckerFw/builds/383560306)

In **[Branch CheckerFw 2.5.2](../../tree/CheckerFw_2_5_2)** we use verison 2.5.2 where this issue is also fixed.
