# lombok
Lombok Tests in Java 9+ modules 

Investigating: Error occurred during initialization of boot layer java.lang.module.FindException: Module lombok not found


Hint: In module-info.java put "requires **static** lombok" to mark lombok to be needed during compilation, but not later on ;)

