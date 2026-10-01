# Base commands for assignments

build:
	mvn clean compile

test:
	mvn clean test

check:
	mvn clean spotbugs:check

style:
	mvn checkstyle:check
