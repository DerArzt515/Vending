# Specs:
- Editor
    - Intellij
- Java version 11
- Maven 3

# Pre-reqs for this project:
##  Have git installed
  - If using windows see here: [link](https://git-scm.com/download/win) (be sure to download the 64 bit version)
## Have IntelliJ installed see here: [link](https://www.jetbrains.com/idea/download/#section=windows) (community edition should be more than enough)
  - Note that this will most likely also install a JDK for you, if so you may be able to skip the next item.
## Have JDK 11 installed see here: [link](https://www.oracle.com/java/technologies/javase-downloads.html)
  - Go to the Java SE 11 (LTS) section and download the jdk for that

# Goals of this project
The goals for this project are as follows:
- Demonstrate an understanding of Object-Oriented Programming via Java
- Demonstrate good testing practices
- Demonstrate good design through low coupling and avoidance of [anti-paterns](https://refactoring.guru/refactoring/smells)

# Initial Ask
We need to build software for a vending machine that has the following capabilities:
- A customer can punch in a code to get an item's price
- A customer can add money and then purchase an item, then get change
- A customer can put in money and request it back
- Items can be restocked
- The software can keep track of its inventory, prices, and current cash on hand
