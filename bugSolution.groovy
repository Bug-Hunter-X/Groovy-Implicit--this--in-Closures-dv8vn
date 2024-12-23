def myMethod(Closure closure) {
    closure(this)
}

myMethod { println it }

myMethod { a -> println a }

//Alternative more explicit solution
def myMethod2(Object obj, Closure closure) {
    closure.delegate = obj
    closure()
}

myMethod2(this) { println it }