package sorting

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class SorterSpec extends Specification {
    @Unroll("Bubble sort: #params.testCase")
    def "bubble sort can order a list"() {
        expect: BubbleSorter.sort(params.unsorted) == params.sorted

        where: params << parameterSet
    }

    @Unroll("Insertion sort: #params.testCase")
    def "insertion sort can order a list"() {
        expect: InsertionSorter.sort(params.unsorted) == params.sorted

        where: params << parameterSet
    }

    @Unroll("Groovy built-in sort: #params.testCase")
    def "groovy built-in sort can order a list"() {
        expect: params.unsorted.sort() == params.sorted

        where: params << parameterSet
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
        ["B", "A", "C"] | ["A", "B", "C"] | "should order an odd number of items"
        ["B", "A", "D", "C"] | ["A", "B", "C", "D"] | "should order more than two items, when subgroups are in order"
//        ["E", "B", "D", "A", "C"] | ["A", "B", "C", "D", "E"] | "should order using multiple passes"
        ["a"] | ["a"] | "should order a list of one"
        [] | [] | "should order a list of zero"
//        ["a", "c", "b", "b"] | ["a", "b", "b", "c"] | "should preserve duplicates"
    }

    @Shared
    def parameterSet = [
            [testCase: "should preserve order when already ordered",
                unsorted: ["A", "B"], sorted: ["A", "B"]],
            [testCase: "should order letters",
                unsorted: ["B", "A"], sorted: ["A", "B"]],
            [testCase: "should order numbers",
                unsorted: [2.0, 1], sorted: [1, 2.0]],
            [testCase:  "should order with a deep investigation",
                unsorted: ["Cat", "Car"], sorted: ["Car", "Cat"]],
            [testCase:  "should order capitals before lowercase",
                unsorted: ["Cat", "car"], sorted: ["Cat", "car"]],
            [testCase:  "should order an odd number of items",
                unsorted: ["B", "A", "C"], sorted: ["A", "B", "C"]],
            [testCase:  "should order more than two items, when subgroups are in order",
                unsorted: ["B", "A", "D", "C"], sorted: ["A", "B", "C", "D"]],
            [testCase:  "should order using multiple passes",
                unsorted: ["E", "B", "D", "A", "C"], sorted: ["A", "B", "C", "D", "E"]],
            [testCase:  "should order a list of one",
                unsorted: ["A"], sorted: ["A"]],
            [testCase:  "should handle a list of zero",
                unsorted: [], sorted: []],
            [testCase:  "should preserve duplicates",
                unsorted: ["a", "c", "b", "b"], sorted: ["a", "b", "b", "c"]]
    ]
}
