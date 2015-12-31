# Sorting

## Purpose

- Play with groovy in this given problem space
- Create clear and well-tested sorting algorithms 
- Investigate parameterized testing
- Investigate re-using the same test cases for different implementations 
- Compare the speed of my sorting algoritms

## Problem space

Write a sorting app that will take 50 states and sort them 10,000 times to get the best sorting algorithm.  

#### Sorting algorithms:

- bubble sort
- insertion sort
- merge sort
- quicksort

#### Sort state data:  

- alphabetically 
- by population size
- by population in the capitol city
- by area

Apply same algorithm to sorting cat species 


## Work done to date
- Set up environment 
- Algorithms: bubble sort, insertion sort
- Behavior testing using Spock
- Run app via gradle task (echoes a 'hello world' answer presently)

## Todo
- Algorithms: merge sort, quicksort
- Performance test(s)
- Using the runner to sort data
- Include/ pull data

## Installations
- Groovy Version: 2.4.5 
- JVM: 1.8.0_25
- Gradle: 2.7

## Download dependencies and run all tests: 
```$ gradle```, using the default tasks

## How to run

```$ gradle runScript```

Or, most manually: 

```
$ cd src/main/groovy/sorting
$ groovy Runner.groovy
```

