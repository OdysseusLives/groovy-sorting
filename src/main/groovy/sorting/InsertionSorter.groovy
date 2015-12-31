package sorting

class InsertionSorter extends Sorter {
    static List sort(List unsorted) {
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