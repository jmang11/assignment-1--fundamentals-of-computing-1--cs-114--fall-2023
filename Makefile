filename = Jeremys_Assignment1

all: compile run

compile:
	javac $(filename).java
run:
	java $(filename).java
