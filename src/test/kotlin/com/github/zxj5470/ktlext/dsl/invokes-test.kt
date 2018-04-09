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

	interface I
	class A : I {
		fun a() = println("a")
	}

	@Test
	fun testCast() {
		fun getInstance(): I {
			return A()
		}

		val i = getInstance()
		// cannot success
		i.castApply<Int> { println(this) }

		// succeed
		i.castApply<A> { this.a() }
	}
}