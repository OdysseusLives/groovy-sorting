package sorting

class Sorter {
    List elementsToBeSorted

    public Sorter(List elementsToBeSorted) {
        this.elementsToBeSorted = elementsToBeSorted;
    }

    def bubbleSort() {
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
