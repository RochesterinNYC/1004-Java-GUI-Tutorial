[Java GUI Tutorial](https://github.com/RochesterinNYC/1004-Java-GUI-Tutorial)
---
####1004 - Intro to Computer Science and Programming in Java
-------

This is a tutorial on Java GUIs. Written by James Wen.

-------

###Table of Contents

- [Terms and Definitions](#terms)
- [Common Components](#common)
- [Inheritance](#inheritance)
- [Global Operations](#global)
- [Events](#events)
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
- Java Swing is built on top of AWT. (Swing uses AWT API and AWT components).
- Java Swing and JVM?
- Portable look and functionality across different operating systems
- Usually has the look of a Java application no matter which operating system run on
- Java Swing GUI components have a J as the first letter of the class. (Ex. JButton, JLabel)
- 

####Heavyweight

- 

####Lightweight

- 

####Event

- Some interaction between the user and some aspect, component, or part of a Java GUI.

####Listeners

- 

####Layouts

- The Java LayoutManagers that dictate how your GUI Components will be arranged in a Container or Container subclass.

- https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html

------

<a name="common"></a>

###Common Components:

Container (AWT/Swing):

- A generic AWT object that is essentially a Component that can hold other AWT Components in it.

Window (AWT)/JWindow (Swing):

- A Container that can be displayed on the user's desktop.
- If something is actually to be displayed to the user, that something (ex. Frame or JFrame) must inherit from Window/JWindow.

Frame (AWT)/JFrame (Swing):

- A top-level, framed window that contains a title and border. Can be closed or minified or etc.
- Frames can be nested within each other. (Reference: http://docs.oracle.com/javase/tutorial/uiswing/components/internalframe.html)

Panel (AWT)/JPanel (Swing):

- Container used for organizing and grouping GUI components within frames.
- Used to organize GUI Components (ex. buttons, labels, textfields, etc.).
- Panels can be nested within each other.

Point (AWT/Swing):

- A point with an x/y location.
- Bear in mind that the y axis is flipped in context of Java GUIs. (http://mathbits.com/MathBits/Java/Graphics/GraphingMethods.htm)

Label (AWT)/JLabel (Swing):

- Text that cannot be edited by the user.

Button (AWT)/JButton (Swing):

- A button that the user can click.
- Clicking a button will generate an ActionEvent that can be handled by an ActionListener to run some method or code.

TextField (AWT)/JTextField (Swing):

- Text/Field for text that can be edited by the user.

TextArea (AWT)/JTextArea (Swing):

- Box that holds multiple lines of text. Can either be set to editable by user or uneditable.

JRadioButton (Swing):

- An item that can either be selected or deselected.
- Usually part of a group of more than one JRadioButton.
- ButtonGroup used to group JRadioButtons together so that only one radio button in that group can be selected at a time.

CheckBox (AWT)/JCheckBox (Swing):

- A checkbox item that can either be selected or deselected.

------

<a name="inheritance"></a>

###Inheritance:

Java AWT is in the java.awt package.

Java Swing is in the javax.swing package.

AWT:

- All GUI components will inherit from java.awt.Component which inherits from java.lang.Object.

For a quick overview on the inheritance hierarchy of the most popular AWT GUI components: http://cs.saddleback.edu/rwatkins/CS4A/Section7/Hierarchy.html

- All AWT Events will inherit either directly or indirectly from java.awt.AWTEvent, which inherits from java.util.EventObject (which inherits from java.lang.Object).

Java Swing:

- All GUI components will inherit from javax.swing.JComponent which inherits from java.awt.Container which inherits from java.awt.Component.

For a quick overview on the inheritance hierarchy of the most popular Java Swing GUI components: http://www.comp.nus.edu.sg/~cs3283/ftp/Java/swingConnect/archive/what_is_arch/tool_set/tool_set.html

Java Swing Events will either inherit from java.util.EventObject directly or indirectly from java.awt.AWTEvent and AWT subclasses of java.awt.AWTEvent (like java.awt.event.ComponentEvent)

------

<a name="global"></a>

###Global Operations:

All subclasses that have these classes as superclasses can utilize the following functionalities.

####Component (java.awt.Component):

setSize(int width, int height):
- Sets the width and height of the Component.
- Width and height are in pixels.
- Also available: setSize(Dimension d) and setPreferredSize(Dimension preferredSize)
- Also has accessor getSize that returns a Dimension object.

setBackground(Color c):
- Sets the background color for the Component.
- Also has accessor getBackground that returns a Color object.

setFont(Font f):
- Sets the font for the Component.
- Also has accessor getFont that returns a Font object.

####Container (java.awt.Container):

add(Component comp):
- Adds the specified Component to the Container.
- Many other overloaded add methods that allow you to add Components to the Container in a certain way or with certain conditions/attributes.
- Also has various getComponent accessors that return a Component object.

remove(Component comp):
- Removes the specified Component from the Container.

setLayout(LayoutManager mgr):
- Sets the layout manager for the Container.
- Also has accessor getLayout that returns a LayoutManager object.


------

<a name="events"></a>

###Events:

- All GUI Events have a source (an Object that caused the event) because all Java Events inherit either directly or indirectly from java.util.EventObject which has a getSource method that returns the Source as an Object.

Listeners:

- Action vs Event Listeners

------

<a name="other"></a>

###Other Notes:

- Use themes/skins! Ex. http://geeknizer.com/best-java-swing-look-and-feel-themes-professional-casual-top-10/
- Examples of nice looking Java GUIs: SPSS Modeler, Palantir Client
- Stigma
- Java Swing is not thread safe. (https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html#threading)

- Menu Guide: https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html

- Oracle Documentation/Guide to Swing: https://docs.oracle.com/javase/tutorial/uiswing/components/index.html

- Note that x/y coordinates/axes are as following: x = - --> + from left to right, y = - --> + from up to down (reversed from mathematical y axis)

https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html

https://docs.oracle.com/javase/8/docs/api/java/awt/package-summary.html

------

<a name="docs"></a>

###More Resources/Documentation:

- http://en.wikipedia.org/wiki/List_of_widget_toolkits#Based_on_Java

- Weaknesses and Strengths: http://edn.embarcadero.com/article/26970