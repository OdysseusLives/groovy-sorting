package sorting

class Sorter {
    def elements

    public Sorter(List elements) {
        this.elements = elements
    }

    List bubbleSort() {
        def bubbledElements = this.elements

        for (def i = 0; i < bubbledElements.size() - 1; i++) {
            bubbledElements = singlePassBubbleSort(bubbledElements)
        }

        bubbledElements
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
