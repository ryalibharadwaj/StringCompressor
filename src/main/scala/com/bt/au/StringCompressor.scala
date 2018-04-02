package com.bt.au

object StringCompressor {
  def compressStr(input: String, minOccurency: Int = 1) : String =
    input.foldLeft(List.empty[(Char, Int)]) {
      (consol, char) =>
        consol match {
          case(`char`, n) :: tail => (char, n+1) :: tail
          case _ => (char, 1) :: consol
        }
    }.reverse.view.map {
      case (ch, 1) => ch.toString
      case (ch, nt) if (nt < minOccurency) => ch.toString * nt
      case (ch, nt) => s"$nt$ch"
    }.mkString
  def main(args : Array[String]): Unit = {
    println(compressStr("ABCDDDEEFFF",3))
  }
}