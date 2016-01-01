package sorting

import spock.lang.Specification
import spock.lang.Unroll

class SorterSpec extends Specification {
    @Unroll("Bubble sort: #testCase")
    def "bubble sort can order a list"() {
        expect:
        BubbleSorter.sort(unsorted) == sorted

        where:
        unsorted | sorted | testCase
        ["A", "B"] | ["A", "B"] | "should preserve order when already ordered"
        ["B", "A"] | ["A", "B"] | "should order letters"
        [2.0, 1] | [1, 2.0] | "should order numbers"
        ["Cat", "Car"] | ["Car", "Cat"] | "should order with a deep investigation"
        ["Cat", "car"] | ["Cat", "car"] | "should order capitals before lowercase"
        ["B", "A", "D", "C"] | ["A", "B", "C", "D"] | "should order more than two items"
        ["E", "B", "D", "A", "C"] | ["A", "B", "C", "D", "E"] | "should order using multiple passes"
        ["a"] | ["a"] | "should order a list of one"
        [] | [] | "should order a list of zero"
        ["a", "c", "b", "b"] | ["a", "b", "b", "c"] | "should preserve duplicates"
    }

    @Unroll("Insertion sort: #testCase")
    def "insertion sort can order a list"(List unsorted, List sorted, String testCase) {
        expect:
        InsertionSorter.sort(unsorted) == sorted

        where:
        unsorted | sorted | testCase
        ["A", "B"] | ["A", "B"] | "should preserve order when already ordered"
        ["B", "A"] | ["A", "B"] | "should order letters"
        [2.0, 1] | [1, 2.0] | "should order numbers"
        ["Cat", "Car"] | ["Car", "Cat"] | "should order with a deep investigation"
        ["Cat", "car"] | ["Cat", "car"] | "should order capitals before lowercase"
        ["B", "A", "D", "C"] | ["A", "B", "C", "D"] | "should order more than two items"
        ["E", "B", "D", "A", "C"] | ["A", "B", "C", "D", "E"] | "should order using multiple passes"
        ["a"] | ["a"] | "should order a list of one"
        [] | [] | "should order a list of zero"
        ["a", "c", "b", "b"] | ["a", "b", "b", "c"] | "should preserve duplicates"
    }

    @Unroll("Merge sort: #testCase")
    def "merge sort can order a list"(List unsorted, List sorted, String testCase) {
        expect:
        MergeSorter.sort(unsorted) == sorted

        where:
        unsorted | sorted | testCase
        ["A", "B"] | ["A", "B"] | "should preserve order when already ordered"
        ["B", "A"] | ["A", "B"] | "should order letters"
        [2.0, 1] | [1, 2.0] | "should order numbers"
        ["Cat", "Car"] | ["Car", "Cat"] | "should order with a deep investigation"
        ["Cat", "car"] | ["Cat", "car"] | "should order capitals before lowercase"
//        ["B", "A", "D", "C"] | ["A", "B", "C", "D"] | "should order more than two items"
//        ["E", "B", "D", "A", "C"] | ["A", "B", "C", "D", "E"] | "should order using multiple passes"
//        ["a"] | ["a"] | "should order a list of one"
//        [] | [] | "should order a list of zero"
//        ["a", "c", "b", "b"] | ["a", "b", "b", "c"] | "should preserve duplicates"
    }
}
