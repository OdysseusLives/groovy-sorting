package sorting

import spock.lang.Specification
import spock.lang.Unroll

class SorterSpec extends Specification {
    @Unroll("Bubble sort: #testCase")
    def "can order a list"(List unsorted, List sorted, String testCase) {
        expect:
        Sorter.bubbleSort(unsorted) == sorted

        where:
        unsorted | sorted | testCase
        ["B", "A"] | ["A", "B"] | "should order A & B"
        [2.0, 1] | [1, 2.0] | "should order numbers"
        ["Cat", "Car"] | ["Car", "Cat"] | "should order with a deep investigation"
        ["Cat", "car"] | ["Cat", "car"] | "should order capitals before lowercase"
        ["B", "A", "D", "C"] | ["A", "B", "C", "D"] | "should order more than two items"
        ["E", "B", "D", "A", "C"] | ["A", "B", "C", "D", "E"] | "should order using multiple passes"
    }
}
