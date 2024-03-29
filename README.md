# Algorithms for Javagony

Here, you can find various functions and algoritms implemented in Javagony.

### What is Javagony?

Javagony is just like ordinary Java, but here are the following statements that are not available in Javagony:
```java
for (){}
if (){} else if (){} else {}
while (){}
do {} while ();
switch(){}
?:
```
### How do loops work?

For loops, you must use recursion and pass in a loop counter as one of the function parameters.

### How do conditionals work?

I've decided to use bitwise operators to convert negative and non-negative integers to ints 0 and 1.

When you use bitwise right shift operator, >>, it shifts the binary digits a specified number of places to the right.

Consider the following:
```java
4 >> 1 => 2

In binary:
00000000000000000000000000000100 >> 1 => 00000000000000000000000000000010 => 2
```
```java
-8 >> 2 => -2

In binary:
11111111111111111111111111111000 >> 2 => 11111111111111111111111111111110 => -2
```

Interestingly, performing bitwise right shift operations will not change the sign of the value.

Non-negative values approach 0 and negative values approach -1.
```java
(non-negative) >> 31 => 00000000000000000000000000000000

(negative)     >> 31 => 11111111111111111111111111111111
```

Using a bitwise AND operator, &, we can get 0 for non-negative values and 1 for negative values.
```java
00000000000000000000000000000000 & 1 => 0

11111111111111111111111111111111 & 1 => 1
```

Using these techniques, we can simulate if conditionals in Java.
```java
int[] ints = {1, 0};
try {
    int temp = 1 / ints[((b - a) >> 31) & 1];
} catch (ArithmeticException e) {
    doSomething();
}
```
which executes `doSomething()` when `a > b`.
