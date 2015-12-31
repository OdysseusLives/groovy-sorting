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
        unsorted.remove(firstUnsortedElement)

        sorted = singlePassInsertionSort(unsorted, sorted)

        sorted
    }

    private static ArrayList<Object> singlePassInsertionSort(List unsorted, ArrayList sorted) {
        if (unsorted.get(0) < sorted.get(0)) {
            sorted = [unsorted.get(0)].plus(sorted)
        } else {
            sorted.add(unsorted.get(0))
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
