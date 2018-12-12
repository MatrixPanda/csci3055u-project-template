## Scala

> - Zehan Song
> - ze.song@uoit.net

## About the language

> _Describe the language_
>
> Scala was released in 2003 and it is a language that combines functional and object-oriented programming in one concise, high level language. In complex applications, Scala’s static types help avoid bugs and its JavaScript and JVM runtime allows programmers to build high-performance systems with easy access to huge ecosystems of libraries. 

## About the syntax

> _give some code snippet of the language_

*The following object provides a factorial method that computes the factorial of a given number.This method definition is an example of a nested method*

```scala
def factorial(x: Int): Int = {
    def fact(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else fact(x - 1, x * accumulator)
    }  
    fact(x, 1)
 }

println("Factorial of 2: " + factorial(2))
println("Factorial of 3: " + factorial(3))
```

## About the tools

> _Describe the compiler or interpreter needed_.

> Two of the most popular Scala IDEs are “Intellij IDEA” and “Eclipse”. Eclipse provides dedicated support for developing pure Scala and mixed applications. 
> “Scalac” is a Scala complier that offers many complier options to change how to compile your program. However, nowadays most people are not running Scalac from the command line. They use the “sbt” IDE instead and other tools as their interface to the compiler. 


## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

>_The three most commonly used collections are scala.collection.seq, scala.collection.immutable.Set, and scala.collection.immuatable.Map. Shown below is an example of using a collection directly_. 

```scala
package collection

scala> val seq = Seq(1,2,3,4,1)
seq: Seq[Int] = List(1, 2, 3, 4, 1)

scala> val set = Set(1,2,3,4,1)
set: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)

scala> val map = Map(1 -> "one", 2 -> "two", 3 -> "three", 2 -> "too")
map: scala.collection.immutable.Map[Int,String] = Map(1 -> one, 2 -> too, 3 -> three)
```

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

> _Scala-csv is an open source library written by https://github.com/tototoshi/scala-csv. To use this library, include libraryDependencies += "com.github.tototoshi" %% "scala-csv" % "1.3.5" in your build.sbt, and import: scala> import com.github.tototoshi.csv._. Below is an example._

*sample.csv*
>a,b,c
>
>d,e,f

```scala
scala> val reader = CSVReader.open(new File("sample.csv"))
reader: com.github.tototoshi.csv.CSVReader = com.github.tototoshi.csv.CSVReader@36d0c6dd

scala> reader.all()
res0: List[List[String]] = List(List(a, b, c), List(d, e, f))

scala> reader.close()
```


# Analysis of the language

> _Organize your report according to the project description
document_.

>1.	Scala uses a combination of object-oriented programming and functional programming.
>
>2.	Scalameta allows Scala programmers to use meta-programming. Macros are currently not added but potentially will be in the future.
>


>3.	Scala supports closure. Below is an example which shows factor has a reference to a variable outside the function. 

```scala
object Demo {
   def main(args: Array[String]) {
      println( "multiplier(1) value = " +  multiplier(1) )
      println( "multiplier(2) value = " +  multiplier(2) )
   }
   var factor = 3
   val multiplier = (i:Int) => i * factor
}
```
>4.	Scala supports lexical scoping. Definitions of outer blocks are visible inside a block unless they are shadowed. 
>
>5.	Scala supports functional programming and its functions are objects.
>
>6.	Scala has a static type system. This is to help avoid bugs.
>
>7.	Pros: 
> -	Simple and straight forward syntax
> -	Inherently immutable objects, Scala reduces many thread safety concerns
> -	Highly Functional

>Cons:
> -	Hard to learn, syntactically Scala is significantly different from traditional Java
> -	Relatively limited community presence
> -	Limited Backward compatibility, new versions of Scala are not compatible with other versions



