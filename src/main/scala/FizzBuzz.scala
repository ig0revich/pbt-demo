/* Write a program that prints a given range of numbers. But for
multiples of three print "Fizz" instead of the number and for 
the multiples of fivve print "Buzz" */
object FizzBuzz:
  def div3(i: Int): Boolean = !(i % 3 > 0) // correct: (i % 3) != 0 

  def div5(i: Int): Boolean = !(i % 5 > 0) // correct: (i % 5) != 0

  def fizzBuzz(i: Int): String =
    if(div3(i))
      if(div5(i))    "FizzBuzz"
      else           "Fizz"
    else if(div5(i)) "Buzz"
    else             i.toString

