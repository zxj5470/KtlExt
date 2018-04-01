package com.github.zxj5470.ktlext.text

import com.github.zxj5470.ktlext.testing.*
import org.junit.Test

/**
 * @author: zxj5470
 * @date: 2018/4/1
 */
class StringTesting {
	@Test
	fun testTest() {
		"asdfassdfasdf".indicesOf("sd") shouldNotBe listOf(1, 6, 9)
		"asdfassdfasdf".indicesOf("sd") shouldBe listOf(1, 6, 10)
		"asdfasdfasdf".indicesOf("") shouldBe emptyList<Int>()
		"asdfasdfasdf".countTimes("sd") shouldBe 3
	}
}