package com.github.zxj5470.ktlext.text

import com.github.zxj5470.ktlext.testing.*
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
		"asdfassdfasdf".indicesOf("[a-f]{3}", useRegex = true) shouldBe listOf(2, 7)
		"asdfassdfasdf".indicesOf("asdd", useRegex = true) shouldBe emptyIntList
	}
}
