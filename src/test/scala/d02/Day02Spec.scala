package org.lafeuille.adventofcode.y2022
package d02

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.*

class Part1Spec extends AnyFlatSpec with should.Matchers {

  val sampleResult = ???

  "Sample list" should s"have max $sampleResult" in {
    Part1.result(sample) shouldBe sampleResult
  }

  val inputResult = ???

  "My input" should s"have part 1 result of $inputResult calories" in {
    Part1.result(Day01.myElves) shouldBe inputResult
  }

}
