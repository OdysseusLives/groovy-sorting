package sorting

class MergeSorter extends Sorter {
    static List sort(List unsorted) {
        def individuals = unsorted.collate(1)

        def sorted = new ArrayList()

        for(def i = 0; i < individuals.size(); i = i + 2) {
            sorted = sorted.plus(mergeTwoElementsAndHandleRemainders(individuals, i))
        }

        sorted
    }

    private static ArrayList<Object> mergeTwoElementsAndHandleRemainders(List<List> individuals, int i) {
        if(i + 1 < individuals.size()) {
            mergeTwoElements(individuals[i][0], individuals[i + 1][0])
        } else {
            individuals[i]
        }
    }

    static List mergeTwoElements(Object first, Object second) {
        first < second ? [first, second] : [second, first]
    }
}