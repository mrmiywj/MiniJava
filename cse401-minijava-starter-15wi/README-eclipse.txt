Instructions for setting up MiniJava in Eclipse
Hal Perkins, Oct. 2011, Jan. 2015

Eclipse knows how to work with projects that include an ant buildfile,
but for some reason it is a bit tricky to set up a minijava project
correctly in Eclipse, partially because some of the Java source files
don't exist until CUP and JFlex have created them for the first time.
If you follow these instructions carefully everything should work and
you shouldn't have to fiddle with classpath settings or perform other
mysterious rituals.

0. Download the MiniJava project starter code and unpack the archive
wherever you like.  Feel free to rename the top-level folder, but do
not rename or move anything inside.

1. BEFORE you start eclipse, open a command window, navigate to the
MiniJava project folder, and enter 'ant' (without the quotes).  This
should build the sample scanner and parser and compile all of the Java
files.  If this step doesn't work, fix it before going on.

2. Start Eclipse and create a new project for MiniJava EXACTLY as
follows.

0) WAIT: did you do the ant build in step 1, above?  If not, quit
eclipse RIGHT NOW and do that first.

a) Select New project... (_not_ New Java project) from the File>New menu.

b) Select "Java Project from Existing Ant Buildfile" in the New
Project window and click next.

c) In the New Java Project from Ant Buildfile window that appears,
click Browse... next to the Ant buildfile box.  Navigate to your
MiniJava project folder, select the build.xml file in it, and click
Open.  (Or type the full path name of the build.xml file into the box
if you wish).

d) _Before_ closing the New Java Project from Ant Buildfile window,
_be sure_ to select the "link to buildfile in the file system"
checkbox towards the bottom.  This tells Eclipse to use the existing
build.xml file and not make its own local copy.  You really, really
want to use the single build.xml file instead of having multiple
copies that can get out of sync as you change things.

e) Click finish.  You should see the minijava project in the Eclipse
Package Explorer window.  There will be various warnings about casts
and other issues in the Java code for the parser and scanner that you
can ignore.  If you have actual errors (red flags) something went
wrong when you created the project.  Be sure you followed the
instructions exactly.

4. Once you've created the project you can run it by right-clicking
build.xml in the Eclipse Package Explorer window.  Select Ant Build
under Run As... in the popup menu.

5. If you feel compelled to start tinkering with classpaths or other
Eclipse options, please post a message to the class discussion board
describing the apparent problem and what you did to fix it.  That will
help all of us figure out how to get Eclipse's internal build
machinery to play nice with the project.


One last (general) suggestion: If it seems that changes to your source
files are not properly reflected in your project, it may be that some
.class files are out of date and weren't recompiled when they should
have been.  (Shouldn't be possible, but it seems to happen
occasionally.)  If you suspect this to be the case, quit Eclipse if it
is running, open a command window, navigate to the MiniJava folder,
then enter 'ant clean' followed by 'ant' to recompile everything.
