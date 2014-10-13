VersionComprator - Tool for comparing two version string
========================================================

Comparing two strings are very easy in Java. But when you want to compare two version string, it is really complex. The goal of this tool is to simplify this problem and provide out of the box features for comparing all sort of versions used in the indurstruy.

USAGE:
======
VersionComprator comprator = new VersionComprator();<br/>
int result = comprator.compare("1.4.2", "1.4");<br/>

It will return -1/0/1 based on the parameters passed:<br/>

-1 means 1st parameter < 2nd parameter<br/>
 0 means 1st parameter = 2nd parameter<br/>
 1 means 1st parameter > 2nd parameter
 
Supported Formats:
==================
"1.1.2", "1.2", "1.2.0", "1.2.1", "1.12", "1.3", "1.3a", "1.3b", "1.3-SNAPSHOT"
 

