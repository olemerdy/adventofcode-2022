package org.lafeuille.adventofcode.y2022
package d01

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.*

val sample = List(
  Elf(List(1000, 2000, 3000)),
  Elf(List(4000)),
  Elf(List(5000, 6000)),
  Elf(List(7000, 8000, 9000)),
  Elf(List(10000))
)

class Part1Spec extends AnyFlatSpec with should.Matchers {

  val sampleResult = 24000

  "Sample list" should s"have max $sampleResult" in {
    Part1.result(sample) shouldBe sampleResult
  }

  val inputResult = 67016

  "My input" should s"have part 1 result of $inputResult calories" in {
    Part1.result(Day01.myElves) shouldBe inputResult
  }

}

class Part2Spec extends AnyFlatSpec with should.Matchers {

  val sampleResult = 45000

  "Sample list" should s"have max $sampleResult" in {
    Part2.result(sample) shouldBe sampleResult
  }

  val expected = 200116

  "My input" should s"have a part 2 result of $expected calories" in {
    Part2.result(Day01.myElves) shouldBe expected
  }
}
