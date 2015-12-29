package sorting

class SorterTest extends GroovyTestCase {
    void testBubbleSort_shouldOrderAB() {
        def list = ["B", "A"]

        def sorter = new Sorter()

        def results = sorter.bubbleSort(list)

        assertEquals("A", results.get(0))
        assertEquals("B", results.get(1))
    }

    void testBubbleSort_shouldOrderPastTheFirstLetter() {
        def list = ["Cat", "Car"]

        def sorter = new Sorter()

        def results = sorter.bubbleSort(list)

        assertEquals("Car", results.get(0))
        assertEquals("Cat", results.get(1))
    }

    void testBubbleSort_shouldOrderCatAndCar_PreservingCase() {
        def list = ["cat", "Car"]

        def sorter = new Sorter()

        def results = sorter.bubbleSort(list)

        assertEquals("Car", results.get(0))
        assertEquals("cat", results.get(1))
    }

    void testBubbleSort_shouldOrderCarAndCat_PreservingCase() {
        def list = ["Cat", "car"]

        def sorter = new Sorter()

        def results = sorter.bubbleSort(list)

        assertEquals("Cat", results.get(0))
        assertEquals("car", results.get(1))
    }

    void testBubbleSort_shouldOrderForMoreThanTwoItems() {
        def list = ["B", "A", "D", "C"]

        def sorter = new Sorter()

        def results = sorter.bubbleSort(list)

        assertEquals("A", results.get(0))
        assertEquals("B", results.get(1))
        assertEquals("C", results.get(2))
        assertEquals("D", results.get(3))
    }
}
