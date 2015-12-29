package sorting

class Sorter {
    public Sorter() {}

    static List bubbleSort(elements) {
        def bubbledElements = elements

        for (def i = 0; i < bubbledElements.size() - 1; i++) {
            bubbledElements = singlePassBubbleSort(bubbledElements)
        }

        bubbledElements
    }

    static List insertionSort(List unsorted) {
        def sorted = new ArrayList()

        sorted.add(unsorted.get(0))

        if(unsorted.get(1) < sorted.get(0)) {
            sorted = [unsorted.get(1)].plus(sorted)
        } else {
            sorted.add(unsorted.get(1))
        }

        sorted
    }

    private static List singlePassBubbleSort(List elementsToBeSorted) {
        def sortedElements = new ArrayList()

        while (elementsToBeSorted.size() > 1) {
            def counter = 0
            def current = elementsToBeSorted[counter]
            def next = elementsToBeSorted[counter + 1]

            if (current < next) {
                sortedElements.add(current)
                elementsToBeSorted.remove(current)
            } else {
                sortedElements.add(next)
                elementsToBeSorted.remove(next)
            }

        }

        sortedElements.add(elementsToBeSorted.get(0))

        sortedElements
    }

}
