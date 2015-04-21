[Java GUI Tutorial](https://github.com/RochesterinNYC/1004-Java-GUI-Tutorial)
---
####1004 - Intro to Computer Science and Programming in Java
-------

This is a tutorial on Java GUIs. Written by James Wen.

-------

###Table of Contents

- [Terms and Definitions](#terms)
- [Other Notes](#other)
- [More Resources/Documentation](#docs)

-------

<a name="terms"></a>

###Terms and Definitions:

####GUI

- 

####AWT

- Stands for Abstract Window Toolkit
- Set of Java APIs, components, etc. used to create GUIs that are OS-specific
- Uses the native Operating System GUI code/functionality and thus programs with Java AWT work and look different on different operating systems
- OS-Specific Display: "the same Java program, when run on a Windows PC, would have the look and feel of a native Windows application and the look and feel of a native Mac application when run on a Mac" (http://www.techopedia.com/definition/3735/abstract-window-toolkit-awt)

####Swing

- Java Swing is a 
- Portable look and functionality across different operating systems
- Usually has the look of a Java application no matter which operating system run on
- Java Swing GUI components have a J as the first letter of the class. (Ex. JButton, JLabel)
- 

####Window

- 

####Button

- 

####JFrame

- 

####JPanel

- 

####Listeners

- 

####Layouts

- 

------

<a name="inheritance"></a>

###Inheritance:

Java AWT is in the java.awt package.

Java Swing is in the javax.swing package.

AWT:

- All GUI components will inherit from java.awt.Component which inherits from java.lang.Object.

For a quick overview on the inheritance hierarchy of the most popular AWT GUI components: http://cs.saddleback.edu/rwatkins/CS4A/Section7/Hierarchy.html

Java Swing:

- All GUI components will inherit from javax.swing.JComponent which inherits from java.awt.Container which inherits from java.awt.Component.

For a quick overview on the inheritance hierarchy of the most popular Java Swing GUI components: http://www.comp.nus.edu.sg/~cs3283/ftp/Java/swingConnect/archive/what_is_arch/tool_set/tool_set.html

------


<a name="other"></a>

###Other Notes:

------

<a name="docs"></a>

###More Resources/Documentation:

- http://en.wikipedia.org/wiki/List_of_widget_toolkits#Based_on_Java

- Weaknesses and Strengths: http://edn.embarcadero.com/article/26970