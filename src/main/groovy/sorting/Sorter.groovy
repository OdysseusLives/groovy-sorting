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

        if(unsorted.size() >= 1) {
            sorted.add(unsorted.get(0))
        }

        for(def i = 1; i < unsorted.size(); i++) {
            def currentUnsorted = unsorted.get(i)
            sorted = insertionSortOneElement(currentUnsorted, sorted, 0)
        }

        sorted
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

    private static List<Object> insertionSortOneElement(Object currentUnsorted, List sorted, Integer sortedIndex) {
        if (currentUnsorted < sorted.get(sortedIndex)) {
            sorted = sorted.plus(sortedIndex, currentUnsorted)
        } else {
            if (indexIsNotAtEndOfList(sortedIndex, sorted)) {
                sorted = insertionSortOneElement(currentUnsorted, sorted, sortedIndex + 1)
            } else {
                sorted.add(currentUnsorted)
            }
        }
        sorted
    }

    private static boolean indexIsNotAtEndOfList(int index, List list) {
        index < list.size() - 1
    }

}
