package sorting

class SorterTest extends GroovyTestCase {
    void testBubbleSort_shouldOrderAB() {
        def unsorted = ["B", "A"]
        def sorted = ["A", "B"]

        def sorter = new Sorter(unsorted)

        def results = sorter.bubbleSort()

        assertEquals(sorted, results)
    }

    void testBubbleSort_shouldOrderNumbers() {
        def unsorted = [2.0, 1]
        def sorted = [1, 2.0]

        def sorter = new Sorter(unsorted)

        def results = sorter.bubbleSort()

        assertEquals(sorted, results)
    }

    void testBubbleSort_shouldOrderPastTheFirstLetter() {
        def unsorted = ["Cat", "Car"]
        def sorted = ["Car", "Cat"]

        def sorter = new Sorter(unsorted)

        def results = sorter.bubbleSort()

        assertEquals(sorted, results)
    }

    void testBubbleSort_shouldOrderCatAndCar_PreservingCase() {
        def unsorted = ["cat", "Car"]
        def sorted = ["Car", "cat"]

        def sorter = new Sorter(unsorted)

        def results = sorter.bubbleSort()

        assertEquals(sorted, results)
    }

    void testBubbleSort_shouldOrderCarAndCat_PreservingCase() {
        def unsorted = ["Cat", "car"]
        def sorted = ["Cat", "car"]

        def sorter = new Sorter(unsorted)

        def results = sorter.bubbleSort()

        assertEquals(sorted, results)
    }

    void testBubbleSort_shouldOrderForMoreThanTwoItems() {
        def unsorted = ["B", "A", "D", "C"]
        def sorted = ["A", "B", "C", "D"]

        def sorter = new Sorter(unsorted)

        def results = sorter.bubbleSort()

        assertEquals(sorted, results)
    }

    void testBubbleSort_shouldOrderUsingMultiplePasses() {
        def unsorted = ["E", "B", "D", "A", "C"]
        def sorted = ["A", "B", "C", "D", "E"]

        def sorter = new Sorter(unsorted)

        def results = sorter.bubbleSort()

        assertEquals(sorted, results)
    }
}
