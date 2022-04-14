# Find the next smaller number program

This program finds the next smaller number after the entered one.

# BDD
Given a sample of numbers and their next smaller numbers:
```
Number---->next smaller number
2071-->2017
135-->135
531-->513
907-->790
1027-->0127
```
The first two digits of the first two numbers have not changed.Likewise, the first digit of the third number.

We derive a pattern:
```
2071-->2017
20..
71-->17
531-->513
5..
31-->13
//The number(s) on the left of the first number breaking the descending order from the right remain constant

//and the first number from the right that is less than the one breaking the descending order is swapped with it
531-->513
3 is the first number breaking the descending order from the right
1 is the first number from the right that is less than 3
So they swap positions:
31-->13

The same happens to 907
9 is the first number breaking the descending order from the right
7 is the first number from the right that is less than 9
So they swap positions:
907-->709....This brings us to the last part:

//after the position swap,the numbers after the first number on the left that has been swapped are reversed in order i.e.
709->09  //after 7
09-->90

907-->790

```
## Algorithm
### Parts:

#### 1.Find the first number from the right that is breaking the descending order of the digits.
#### 2.Swap it with the first number from the right that is less than it.
#### 3.Reverse the order of the numbers after the first swapped number on the left.


## Author

Dorcas Ndungu

## License

This software is under the [MIT](LICENSE) license
Copyright (c) {2022}



