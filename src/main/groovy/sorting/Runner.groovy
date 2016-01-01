package sorting

import org.apache.commons.lang3.time.StopWatch

println "Sorting algorithms time comparison\n"

println "Times listed in the following format: hours:minutes:seconds.milliseconds\n"

List list = new ArrayList(1..10_000)
Collections.shuffle(list)

recordTime("Bubble sort", list, {BubbleSorter.sort(listClone)})
recordTime("Insertion sort", list, {InsertionSorter.sort(listClone)})
recordTime("Groovy built-in sort", list, {listClone.sort()})

private void recordTime(String title, List list, Closure closure) {
    StopWatch stopWatch = new StopWatch()
    stopWatch.start()
    for (def i = 0; i < 10_000; i++) {
        def listClone = list.clone() as List
        closure
    }
    stopWatch.stop()

    println " - " + title + ": " + stopWatch.toString()
}
