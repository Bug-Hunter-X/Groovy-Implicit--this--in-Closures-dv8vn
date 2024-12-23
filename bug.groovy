def myMethod(Closure closure) {
    closure()
}

myMethod { println "Hello" }

myMethod { println it }

myMethod { a -> println a }