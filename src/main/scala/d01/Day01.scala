package org.lafeuille.adventofcode.y2022
package d01

import scala.io.Source

object Day01 {
  def myInput: Source =
    Source.fromURL(getClass.getResource("input.txt"))

  lazy val myNumbers: List[Int] =
    myInput.getLines.map(_.toInt).toList
}

object Part1 {
  def pairs[T](list: List[T]): List[(T, T)] =
    if list.isEmpty then Nil else
      list zip list.tail

  def result(numbers: List[Int]): Int =
    pairs(numbers).count { case (a, b) => a < b }

  @main def runPart1(): Unit =
    println(result(Day01.myNumbers))
}

object Part2 {
  def triplets[T](list: List[T]): List[(T, T, T)] =
    if list.size < 3 then Nil else
      list zip list.tail zip list.tail.tail map { case ((a, b), c) => (a, b, c) }

  def tripletsSum(numbers: List[Int]): List[Int] =
    triplets(numbers).map { case (a, b, c) => a + b + c }

  def result(numbers: List[Int]): Int =
    Part1.result(tripletsSum(numbers))

  @main def runPart2(): Unit =
    println(result(Day01.myNumbers))
}
