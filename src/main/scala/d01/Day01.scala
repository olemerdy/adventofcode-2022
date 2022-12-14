package org.lafeuille.adventofcode.y2022
package d01

import scala.annotation.tailrec
import scala.io.Source

case class Elf(caloriesList: List[Int]) {
  lazy val total: Int = caloriesList.sum
}

object Day01 {
  private def myInput: Source =
    Source.fromURL(getClass.getResource("input.txt"))

  @tailrec
  private def rec(elves: List[Elf], remainingLines: List[String]): List[Elf] =
    remainingLines match {
      case Nil => elves
      case a :: tail if a.isBlank => rec(elves, tail)
      case x => rec(Elf(x.takeWhile(!_.isBlank).map(_.toInt)) :: elves, x.dropWhile(!_.isBlank))
    }

  lazy val myElves: List[Elf] =
    rec (Nil, myInput.getLines.toList)
}

object Part1 extends App {

  def result(elves: List[Elf]): Int =
    elves.map(_.total).max

  println(result(Day01.myElves))
}

object Part2 extends App {

  def result(elves: List[Elf]): Int =
    elves.map(_.total).sorted.takeRight(3).sum

  println(result(Day01.myElves))
}
