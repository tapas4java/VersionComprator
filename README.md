VersionComprator - Tool for comparing two version numbers.
==========================================================

Comparing two strings are very easy in Java. But when you want to compare two version string, it is really complex. The goal of this tool is to simplify this problem and provide out of the box fetures for all sort of versions used in the indurstruy.

USAGE:
======
VersionComprator comprator = new VersionComprator();
int result = comprator.compare("1.4.2", "1.4");

It will return -1/0/1 based on the parameters passed:

-1 means 1st parameter < 2nd parameter
 0 means 1st parameter = 2nd parameter
 1 means 1st parameter > 2nd parameter

