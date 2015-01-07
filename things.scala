1 + 2 // 3

println("Hello Scala!")

// Vars

var a: String = "I'm a string"

val a: String = "I'm a string that cannot be reassigned"

val a = "I'm a string"

// Functions

def sum(a: Int, b: Int): Int = {
    return a + b;
}

def sum(a: Int, b: Int): Int = {
    a + b
}

def sum(a: Int, b: Int): Int = a + b

def sum(a: Int, b: Int) = a + b

// Classes

class Person

class Person(name: String, age: Int)

class Person(val name: String, val age: Int)

class Person(var name: String, var age: Int)

case class Person(name: String, age: Int)

// Methods

class Greeter {
    def sayHi() = println("Hi")
}

class Greeter(word: String) {
    def sayHi() = println(s"Hi $word")
}

class Person(_name: String, val age: Int){
    def name = _name.toUpperCase
}

object Greeter {
    def sayHi() = println("Hi")
}

1 + 2
1.+(2) // 3

class Person(_name: String, val age: Int){
    def name = _name.toUpperCase

    def <<#>>(other: Person) = "This is not a good method"
}


// Loops

var a = 10;

while( a < 20 ){
    a = a + 1;
}


for (i <- List(1, 2, 3)){
    println(i)
}

val someInts = for {
    x <- List(1, 2, 3)
    y <- List(4, 5, 6)
} yield (x, y) // List((1,4), (1,5), (1,6), (2,4), (2,5), (2,6), (3,4), (3,5), (3,6))

// Collections
List(1, 2, 3).sum

List(1, 2, 3).filter((x: Int) => x > 2).sum

List(1, 2, 3).filter(x => x > 2).sum

List(1, 2, 3).filter(_ > 2).sum

List(Person("Alex", 25), Person("Ben", 28), Person("Khalid", 28)).map(_.age).sum



