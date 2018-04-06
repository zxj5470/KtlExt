package com.github.zxj5470.ktlext.text

import com.github.zxj5470.ktlext.testing.*
import org.intellij.lang.annotations.Language
import org.junit.Test

/**
 * @author: zxj5470
 * @date: 2018/4/1
 */
class StringTesting {
	private val emptyIntList = emptyList<Int>()

	@Test
	fun testTest() {
		"asdfassdfasdf".indicesOf("sd") shouldNotBe listOf(1, 6, 9)
		"asdfassdfasdf".indicesOf("sd") shouldBe listOf(1, 6, 10)
		"asdfasdfasdf".indicesOf("") shouldBe emptyIntList
		"asdfasdfasdf".countTimes("sd") shouldBe 3
	}

	@Test
	fun testRegex() {
		// index 2: dfa
		// index 7: dfa
		val regexStringA = "[a-f]{3}"
		val regexStringB = "asdd"
		"asdfassdfasdf".indicesOf(regexStringA, useRegex = true) shouldBe listOf(2, 7)
		"asdfassdfasdf".indicesOf(regexStringB, useRegex = true) shouldBe emptyIntList
	}

	@Test
	fun testLast() {
		val oldString = "asdfassdfasdf"
		oldString.replaceLast("df", "_ _") shouldBe "asdfassdfas_ _"
		oldString.replaceLast("[a-f]{3}", "_ _", true) shouldBe "asdfass_ _sdf"
	}
}
