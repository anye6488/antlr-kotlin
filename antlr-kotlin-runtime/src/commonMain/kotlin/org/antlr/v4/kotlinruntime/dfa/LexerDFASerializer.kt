/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.dfa

import com.strumenta.antlrkotlin.runtime.ext.appendCodePoint
import org.antlr.v4.kotlinruntime.VocabularyImpl

public class LexerDFASerializer(dfa: DFA) : DFASerializer(dfa, VocabularyImpl.EMPTY_VOCABULARY) {
  protected override fun getEdgeLabel(i: Int): String {
    val buf = StringBuilder()
    buf.append("'")
    buf.appendCodePoint(i)
    buf.append("'")
    return buf.toString()
  }
}
