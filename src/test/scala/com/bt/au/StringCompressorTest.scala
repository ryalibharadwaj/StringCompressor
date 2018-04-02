package com.bt.au

import org.scalatest.FunSuite

class StringCompressorTest extends FunSuite {
  test("StringCompressor.compress") {
    assert(StringCompressor.compressStr("AAABBCCCD", 2) === "3A2B3CD")
    assert(StringCompressor.compressStr("ABBCDD", 2) === "A2BC2D")
    assert(StringCompressor.compressStr("ABBBCCDDD", 3) === "A3BCC3D")
    assert(StringCompressor.compressStr("ABBBCCDDD", 4) === "ABBBCCDDD")
  }
}
