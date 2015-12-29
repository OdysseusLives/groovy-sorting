package sorting

class SorterTest extends GroovyTestCase {
    void testBubbleSort_shouldOrderAB() {
        def unsorted = ["B", "A"]
        def sorted = ["A", "B"]

        assertEquals(sorted, Sorter.bubbleSort(unsorted))
    }

    void testBubbleSort_shouldOrderNumbers() {
        def unsorted = [2.0, 1]
        def sorted = [1, 2.0]

        assertEquals(sorted, Sorter.bubbleSort(unsorted))
    }

    void testBubbleSort_shouldOrderPastTheFirstLetter() {
        def unsorted = ["Cat", "Car"]
        def sorted = ["Car", "Cat"]

        assertEquals(sorted, Sorter.bubbleSort(unsorted))
    }

    void testBubbleSort_shouldOrderCatAndCar_PreservingCase() {
        def unsorted = ["cat", "Car"]
        def sorted = ["Car", "cat"]

        assertEquals(sorted, Sorter.bubbleSort(unsorted))
    }

    void testBubbleSort_shouldOrderCarAndCat_PreservingCase() {
        def unsorted = ["Cat", "car"]
        def sorted = ["Cat", "car"]

        assertEquals(sorted, Sorter.bubbleSort(unsorted))
    }

    void testBubbleSort_shouldOrderForMoreThanTwoItems() {
        def unsorted = ["B", "A", "D", "C"]
        def sorted = ["A", "B", "C", "D"]

        assertEquals(sorted, Sorter.bubbleSort(unsorted))
    }

    void testBubbleSort_shouldOrderUsingMultiplePasses() {
        def unsorted = ["E", "B", "D", "A", "C"]
        def sorted = ["A", "B", "C", "D", "E"]

        assertEquals(sorted, Sorter.bubbleSort(unsorted))
    }
}
