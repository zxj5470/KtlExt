package com.github.zxj5470.ktlext.dsl

import org.junit.Test


/**
 * @author zxj5470
 * @date 2018/4/7
 */
class InvokesTest {
	@Test
	fun testDSL() {
		val t = true
		val f = false
		println("Run t:")
		t {
			println("true")
		}.orElse {
			println("false")
		}

		println("Run f:")
		f.orElse {
			println("false")
		}
	}
}