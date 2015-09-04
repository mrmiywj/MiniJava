This is the start of a simple compiler which you can modify to compile
the MiniJava language.  It is meant primarily to show how the
toolchain works and how the various parts of the compiler project plug
together.

To demonstrate the basics of scanning and parsing, as well as to
provide some basic structure, we're providing a "compiler" that will
scan and parse "programs" in the following tiny programming language:

	program ::= statement | program statement
	statement ::= assignStmt | displayStmt
	assignStmt ::= id = expr ;
	displayStmt ::= display expr ;
	expr ::= id | expr + expr | ( expr )
	id ::= [a-zA-Z][a-zA-Z0-9_]*

The AST classes provided are closely based on those on the MiniJava
website, slightly modified to add tracking of line numbers, as well as
adding a separate Display node only used in the toy language, but not
for MiniJava.  They have also been updated to use Lists with type
parameters instead of the original Vector class.

All of the compiler source code is in the src directory.

The TestScanner and TestParser classes are examples of how to use the
scanner and parser.  You will need to create an actual MiniJava class
with the main program for your project, but the test code here should
provide some useful hints.  The rest of the compiler is stored in
several subdirectories:

    Scanner: the implementation of a demo scanner

    Parser: the implementation of a demo parser

    AST: the implementation of the abstract syntax tree

The lib directory stores the jar files for CUP and JFlex that are
needed to build and run the compiler and a couple of source files from
CUP that may be useful for reference.

SamplePrograms contains a sample program in the example language,
which you can replace with MiniJava programs to be be compiled and run
to test your MiniJava compiler as you develop it.  The
SampleMiniJavaPrograms directory contains larger MiniJava programs for
testing, mostly taken from the MiniJava web site.

The build.xml ant file supports building, running, and testing the
demo compiler scanning and parsing examples.  Look at it for details
and use it as a start for your own project's build sequence.

Sources: AST classes and SampleMiniJavaPrograms from the Appel/
Palsberg MiniJava project.  Some code and ideas borrowed from an
earlier UW version by Craig Chambers with modifications by Jonathan
Beall and Hal Perkins.  Most recent updates to include current
releases of JFlex and CUP by Hal Perkins.
