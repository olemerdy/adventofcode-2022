package org.lafeuille.adventofcode.y2022
package d01

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.*

val sample = List(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

class Part1Spec extends AnyFlatSpec with should.Matchers {

  "Sample list" should "have 7 measurements larger than the previous" in {
    Part1.result(sample) shouldBe 7
  }

  val expected = 1692

  "My input" should s"have $expected measurements larger than the previous" in {
    Part1.result(Day01.myNumbers) shouldBe 1692
  }

}

class Part2Spec extends AnyFlatSpec with should.Matchers {
  val triplets = List((199, 200, 208), (200, 208, 210), (208, 210, 200), (210, 200, 207), (200, 207, 240), (207, 240, 269), (240, 269, 260), (269, 260, 263))

  "Sample list" should s"have triplets $triplets" in {
    Part2.triplets(sample) shouldBe triplets
  }

  val tripletsSum = List(607, 618, 618, 617, 647, 716, 769, 792)

  "Sample list" should s"have tripletSum of $tripletsSum" in {
    Part2.tripletsSum(sample) shouldBe tripletsSum
  }

  it should "have 5 sums that are larger than the previous ones" in {
    Part2.result(sample) shouldBe 5
  }

  val expected = 1724

  "My input" should s"have a part 2 result of $expected" in {
    Part2.result(Day01.myNumbers) shouldBe expected
  }
}
