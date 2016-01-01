package sorting

class BubbleSorter extends Sorter {
    static List sort(List unsorted) {
        List bubbledElements = unsorted.clone() as List

        for (def i = 0; i < bubbledElements.size() - 1; i++) {
            bubbledElements = singlePassBubbleSort(bubbledElements)
        }

        bubbledElements
    }

    private static List singlePassBubbleSort(List unsorted) {
        def sorted = new ArrayList()

        while (unsorted.size() > 1) {
            def counter = 0
            def current = unsorted[counter]
            def next = unsorted[counter + 1]

            if (current < next) {
                sorted.add(current)
                unsorted.remove(current)
            } else {
                sorted.add(next)
                unsorted.remove(next)
            }
        }

        sorted.add(unsorted.get(0))

        sorted
    }
}