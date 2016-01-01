package sorting

class MergeSorter extends Sorter {
    static List sort(List unsorted) {
        def individuals = unsorted.collate(unsorted.size() - 1)

        def sorted = mergeTwoElements(individuals[0][0], individuals[1][0])

        sorted
    }

    static List mergeTwoElements(Object first, Object second) {
        first < second ? [first, second] : [second, first]
    }
}