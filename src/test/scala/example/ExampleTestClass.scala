package example

import org.scalatest.FlatSpec
import org.scalatest.Assertions
import org.scalatest.Matchers

class ExampleTestClass extends FlatSpec with Matchers {

  "Html Reports" should "get created" in {
    
    1 shouldBe 1
  }

  "Html Reports" should "be complex" in {

    fail
  }
  it must "be text" in {

    cancel
  }
}