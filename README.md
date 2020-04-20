# Users

User object contains the followings:
1. id
2. name
3. password
4. email
5. age
6. birthDate
7. gender

## Heroku Deployment
1. system.properties is required for heroku deployment
2. heroku default JDK is 1.8

## Log4j2
* What is log4j2? 
````
Open source logging framework written in Java and which is reliable, fast and flexible.
Logging is great for debugging, maintenance & tracing
````
* Components
````
Loggers: Capture logs
Appenders: Publish logs to various targets like file, console, database, etc.
Layouts: Format logs
````
* Thread safe - supports parallel execution
* Support multiple appenders i.e. it can output log to console, file, database all at the same time

* Logging levels
````
all - All logs
trace - Finer grained informational events e.g. a stack trace when java execution occurs
debug - Debug logs e.g. messages you would output while debugging issues (development phase)
info - Progress logs e.g. login with user, entering password, etc.
warn - warning messages, execution can continue
error - error logs, execution continue e.g. exceptions, assertion failures
fatal - serious events, abort execution e.g driver initializtion failure

All <  Debug < Info < Warn < Error < Fatal < Off
````

