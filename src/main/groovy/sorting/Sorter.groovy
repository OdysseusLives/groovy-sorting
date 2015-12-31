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
        def firstUnsortedElement = unsorted.get(0)

        sorted.add(firstUnsortedElement)

        for(def i = 1; i < unsorted.size(); i++) {
            def currentUnsorted = unsorted.get(i)
            sorted = singlePassInsertionSort(currentUnsorted, sorted, 0)
        }

        sorted
    }

    private static List<Object> singlePassInsertionSort(currentUnsorted, List sorted, Integer sortedCounter) {
        if (currentUnsorted < sorted.get(sortedCounter)) {
            if(sortedCounter.equals(0)) {
                sorted = [currentUnsorted].plus(sorted)
            } else {
                sorted = sorted[0..sortedCounter - 1].plus([currentUnsorted]).plus(sorted[sortedCounter..sorted.size() - 1])
            }
        } else {
            if (sortedCounter < sorted.size() - 1) {
                sorted = singlePassInsertionSort(currentUnsorted, sorted, sortedCounter + 1)
            } else {
                sorted.add(currentUnsorted)
            }
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
