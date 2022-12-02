package org.lafeuille.adventofcode.y2022
package d02

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.*

val sample = ???

class Part1Spec extends AnyFlatSpec with should.Matchers {

  val sampleResult: Int = ???

  "Sample list" should s"have max $sampleResult" in {
    Part1.result(sample) shouldBe sampleResult
  }

  val inputResult: Int = ???

  "My input" should s"have part 1 result of $inputResult calories" in {
    Part1.result(Day02.rounds) shouldBe inputResult
  }

}

class Part2Spec extends AnyFlatSpec with should.Matchers {

  val sampleResult: Int = ???

  "Sample list" should s"have max $sampleResult" in {
    Part2.result(sample) shouldBe sampleResult
  }

  val inputResult: Int = ???

  "My input" should s"have part 1 result of $inputResult calories" in {
    Part2.result(Day02.myInput) shouldBe inputResult
  }

}
