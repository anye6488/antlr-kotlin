@file:Suppress("NOTHING_TO_INLINE", "INVISIBLE_MEMBER")

package com.strumenta.antlrkotlin.runtime

internal actual inline fun platformPrintErrLn(): Unit =
  printError("\n")

internal actual inline fun platformPrintErrLn(message: String): Unit =
  printError("$message\n")

internal actual inline fun platformPrintErr(message: String): Unit =
  printError(message)
