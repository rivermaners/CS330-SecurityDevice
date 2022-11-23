This program is in Java and all you need to do to run it is have Java installed and open the file. When this program
is ran, it will prompt the user how many times they want to crack the code. The code will then run through an array list
starting at index 0 and randomly generate a number 0-9. The unlock code is 886831 and the random number generator will
try to match the unlock code through brute force. When the randomly generated number matches the first index number in
the unlock code, it will accept that number and store it in the corresponding index. It will then move onto the next
index and brute force random numbers again. If a number doesn't match the corresponding index number, that number will
be thrown away and a new number will be generated until it matches the unlock code. To lock the security device, the
locking code 886834 is needed to lock it.

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
