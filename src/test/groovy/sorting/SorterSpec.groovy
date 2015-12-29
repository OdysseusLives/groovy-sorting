package sorting

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class SorterSpec extends Specification {
    @Shared
    def parameterSet = [
        [testCase: "should order A & B when A is first",
            unsorted: ["A", "B"], sorted: ["A", "B"]],
        [testCase: "should order A & B when B is first",
            unsorted: ["B", "A"], sorted: ["A", "B"]],
        [testCase: "should order numbers",
            unsorted: [2.0, 1], sorted: [1, 2.0]],
        [testCase:  "should order with a deep investigation",
            unsorted: ["Cat", "Car"], sorted: ["Car", "Cat"]],
        [testCase:  "should order capitals before lowercase",
            unsorted: ["Cat", "car"], sorted: ["Cat", "car"]],
        [testCase:  "should order more than two items",
            unsorted: ["B", "A", "D", "C"], sorted: ["A", "B", "C", "D"]],
        [testCase:  "should order using multiple passes",
            unsorted: ["E", "B", "D", "A", "C"], sorted: ["A", "B", "C", "D", "E"]]
    ]

    @Unroll("Bubble sort: #params.testCase")
    def "bubble sort can order a list"() {
        expect:
        Sorter.bubbleSort(params.unsorted) == params.sorted

        where:
        params << parameterSet
    }

    @Unroll("Insertion sort: #testCase")
    def "insertion sort can order a list"(List unsorted, List sorted, String testCase) {
        expect:
        Sorter.insertionSort(unsorted) == sorted

        where:
        unsorted | sorted | testCase
        ["A", "B"] | ["A", "B"] | "should order A & B when A is first"
        ["B", "A"] | ["A", "B"] | "should order A & B when B is first"
        [2.0, 1] | [1, 2.0] | "should order numbers"
        ["Cat", "Car"] | ["Car", "Cat"] | "should order with a deep investigation"
        ["Cat", "car"] | ["Cat", "car"] | "should order capitals before lowercase"
//        ["B", "A", "D", "C"] | ["A", "B", "C", "D"] | "should order more than two items"
//        ["E", "B", "D", "A", "C"] | ["A", "B", "C", "D", "E"] | "should order using multiple passes"
    }

}
