import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import FizzBuzz.*

// system under test
val sut = FizzBuzz.fizzBuzz

class MainTest extends Properties("FizzBuzz"):
    property("validity") = forAll((i: Int) =>  
        Set("Fizz", "Buzz", "FizzBuzz", i.toString).contains(sut(i)))

    property("invertibility") = forAll((i: Int) =>  
        div3(i) || div5(i) || (sut(i).toInt == i))    

    property("stability") = forAll((i: Int) =>  
        (sut(i).contains("Fizz") == sut(-i).contains("Fizz")) &&
        (sut(i).contains("Buzz") == sut(-i).contains("Buzz")))
 
end MainTest    