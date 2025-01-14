package com.strumenta.antlrkotlin.runtime.ext

public fun String.codePointIndices(): IntArray {
  val intArray = IntArray(length)
  var p = 0

  for (i in indices) {
    if (!hasSurrogatePairAt(i - 1)) {
      intArray[p++] = i
    }
  }

  return intArray.copyOfRange(0, p)
}
