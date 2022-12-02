package org.lafeuille.adventofcode.y2022
package d02

import scala.io.Source
import scala.util.matching.Regex

object Shapes extends Enumeration {
  type Shape = Value
  val Rock, Paper, Scissor = Value

  def from(code: Char): Shape = code match {
    case 'A' => Rock
    case 'B' => Paper
    case 'C' => Scissor
    case 'X' => Rock
    case 'Y' => Paper
    case 'Z' => Scissor
    case _ => throw new IllegalArgumentException
  }
}

object RoundResults extends Enumeration {
  type RoundResult = Value
  val Win, Draw, Loss = Value
}

case class Round(shape1: Shapes.Shape, shape2: Shapes.Shape) {
  lazy val value = ???
}

object Day02 {
  private val regex: Regex = "(ABC)\\s+(XYZ)".r

  def myInput: Source =
    Source.fromURL(getClass.getResource("input.txt"))

  lazy val rounds: List[Round] =
    myInput.getLines.map {
      case regex(shape1, shape2) => Round(Shapes.from(shape1(0)), Shapes.from(shape2(0)))
    }.toList
}
object Part1 extends App {

  def result(input: List[Round]): Int =
    ???

  println(result(Day02.rounds))
}

object Part2 extends App {

  def result(input: Any): Int =
    ???

  println(result(Day02.myInput))
}
