This program is in Java and all you need to do to run it is have Java installed and open the file. When this program
is ran, it will prompt the user how many times they want to crack the code. The code will then run through an array list
starting at index 0 and randomly generate a number 0-9. The unlock code is 886831 and the random number generator will
try to match the unlock code through brute force. When the randomly generated number matches the first index number in
the unlock code, it will accept that number and store it in the corresponding index. It will then move onto the next
index and brute force random numbers again. If a number doesn't match the corresponding index number, that number will
be thrown away and a new number will be generated until it matches the unlock code. To lock the security device, the
locking code 886834 is needed to lock it.

To BUILD and run this code in the Command Prompt:
1. Make sure you are using java SDK/JDK version 1.8
2. git clone https://github.com/rivermaners/CS330-SecurityDevice/tree/master/src
3. cd CS330-SecurityDevice
4. cd src
5. locate your jdk version 1.8 in your files and go to the bin. Copy the file path of the folder.
6. path [paste the copied file path];%path% (this makes the jar file build in the correct java version)
    example: path C:\Program Files\Java\jdk1.8.0_202\bin;%path%
7. javac Main.java
8. echo Main-Class: Main >manifest.txt (builds manifest)
9. jar cvfm Main.jar manifest.txt Main.class (builds jar file)
10. java -jar Main.jar (this will execute the newly built jar file)
11. to view the README or MEMO, type README.txt or MEMO.txt
12. to view the actual code of the program, type Main.java
13. to view code flow chart, type codeFlowChart.pdf

To view files in src, type dir

While typing in the name of the file you would like to open, you can press tab to autofill the name
When running the code in Command Prompt, it will take much longer since the Command Prompt is slower than other IDEs.
So be patient :)

The code will then display something like:
[]
[8]
[8, 8]
[8, 8, 6]
[8, 8, 6, 8]
[8, 8, 6, 8, 3]
Unlocked!
Numbers generated: 61917913
[8, 8, 6, 8, 3, 1]
Program ran 50 times.
Minimum symbols used out of each run to unlock: 2474096
Maximum symbols used out of each run to unlock: 61917913
The average amount of symbols used out of each run to unlock: 2.92288034E7
