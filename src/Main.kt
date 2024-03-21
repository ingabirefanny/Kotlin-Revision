fun main(){
   var numArray = arrayOf(10,14,32,6,43,6,43,2,75,8)

    println(numArray[0])
    println(numArray[2])
    println(numArray[5])

    var elements= numArray.count()
    println(elements)

    var add= numArray.sum()
    println(add)

    var minValue = numArray.minOrNull()
    println(minValue)

    var maxValue = numArray.maxOrNull()
    println(maxValue)

    var change= numArray[2] + numArray[4]
    println(change)

    var avera = numArray.average()
    println(avera)

var code = numArray.indexOf(6)
    println(code)


    var sortedArray= numArray.sorted()
    println(sortedArray)


    var namesArray= arrayOf("Ada", "Beth", "Chris", "Diana", "Elsie", "Fiona")

    for (x in namesArray){
        println(x)
    }
    var newNames = namesArray.sorted()
    println(newNames)

    namesArray.set(2,"nancy")
    println(namesArray.contentToString())

    var name= namesArray.get(2)
    println(name)
}

