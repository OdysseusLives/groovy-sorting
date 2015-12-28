package sorting

class Sorter {
    List elementsToBeSorted

    public Sorter(List elementsToBeSorted) {
        this.elementsToBeSorted = elementsToBeSorted;
    }

    def bubbleSort() {
        def sortedElements = new ArrayList()

        def counter = 0
        def current = elementsToBeSorted[counter]
        def next = elementsToBeSorted[counter + 1]

        if (current < next) {
            sortedElements.addAll(current, next)
        } else {
            sortedElements.addAll(next, current)
        }

        sortedElements
    }

}
