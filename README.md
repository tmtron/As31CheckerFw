# As31CheckerFw
Test usage of checker-framework with an Android Studio 3.1 project

<!--
 ![] is the markdown syntax to add an image and this is surounded by a link to the travis-ci builds page
-->
[![Build Status](https://travis-ci.org/tmtron/As31CheckerFw.svg?label=travis)](https://travis-ci.org/tmtron/As31CheckerFw/builds) 

Currently (with Android Studio 3.1)  the checker-framework execution fails with these errors:
```
class file for java.lang.Class$AnnotationData not found
class file for java.lang.Class$ReflectionData not found
```
see [checker-framework issue 1916](https://github.com/typetools/checker-framework/issues/1916)
