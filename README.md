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

this issue may be resolved with version 2.5.1 - see [comment#1916](https://github.com/typetools/checker-framework/issues/1916#issuecomment-391096577) - but there is a new one: see [branch CheckerFw_2_5_1](https://github.com/tmtron/As31CheckerFw/tree/CheckerFw_2_5_1)

