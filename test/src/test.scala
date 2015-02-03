object test extends AnyRef {

  def main(args: Array[String]) = {

    def three() = 1 + 2

    def oneN(m: Int) = m + 1

    val n = 1 + 1

    var str = "test scala string"

    println(oneN(10))

    println(three)

    println(str)

    val addOne = (x: Int) => x + 1

    println(addOne(1))

    val test = { i: Int =>
      println("hello world")
      i * 2
    }

    println(test(2))

    def adder(m: Int, n: Int) = m + n

    val add2 = adder(5, _: Int)

    println(add2(2))

    def multiply(m: Int)(n: Int): Int = m * n

    val tt = multiply(2) _

    println(tt(4))

    val cal = new Calculator("TI")

    cal.add(4, 5)

    println("cal res " + cal.color + " add " + cal.add(4, 5))

    val car = new BMW

    println("cal brand " + car.brand)

    class Bar {
      def apply() = 10
    }

    val bar = new Bar

    println("Bar " + bar())

    object Timer {
      var count = 0

      def currentCount(): Long = {
        count += 1
        count
      }
    }
    
    println("currentCount " + Timer.currentCount())
    println("currentCount " + Timer.currentCount())
    println("currentCount " + Timer.currentCount())

  }
  class Calculator(brand: String) {
    /**
     * Конструктор.
     */
    val color: String = if (brand == "TI") {
      "blue"
    } else if (brand == "HP") {
      "black"
    } else {
      "white"
    }

    // Метод экземпляра класса.
    def add(m: Int, n: Int): Int = m + n
  }
  trait Car {
    val brand: String
  }

  class BMW extends Car {
    val brand = "BMW"
  }
}