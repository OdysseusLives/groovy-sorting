package sorting

class SorterTest extends GroovyTestCase {
    void testBubbleSort_shouldOrderAB() {
        def list = ["B", "A"]

        def sorter = new Sorter(list)

        def results = sorter.bubbleSort()

        assertEquals("A", results.get(0))
        assertEquals("B", results.get(1))
    }

    void testBubbleSort_shouldOrderPastTheFirstLetter() {
        def list = ["Cat", "Car"]

        def sorter = new Sorter(list)

        def results = sorter.bubbleSort()

        assertEquals("Car", results.get(0))
        assertEquals("Cat", results.get(1))
    }

    void testBubbleSort_shouldOrderCatAndCar_PreservingCase() {
        def list = ["cat", "Car"]

        def sorter = new Sorter(list)

        def results = sorter.bubbleSort()

        assertEquals("Car", results.get(0))
        assertEquals("cat", results.get(1))
    }

    void testBubbleSort_shouldOrderCarAndCat_PreservingCase() {
        def list = ["Cat", "car"]

        def sorter = new Sorter(list)

        def results = sorter.bubbleSort()

        assertEquals("Cat", results.get(0))
        assertEquals("car", results.get(1))
    }

}
