import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
class DummySpec extends AnyWordSpec with Matchers {

  "Dummy test" should {
    "run successfully" in {
      println(">>> DUMMY TEST EXECUTED <<<")
      assert(1 + 1 == 2)
    }
  }
}