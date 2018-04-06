package com.github.zxj5470.ktlext.testing

/**
 * @author: zxj5470
 * @date: 2018/4/1
 */
/**
 * @usage
 * ```
 * val a="a"
 * a shouldBe "a"
 * ```
 * @receiver Any?
 * @param another Any?
 * @return Unit
 */
infix fun Any?.shouldBe(another: Any?) = assert((this == another)
	.apply { if (!this) System.err.println("Should be $another, but given is ${this@shouldBe}") })

/**
 * @usage
 * ```
 * val a="a"
 * a shouldNotBe "b"
 * ```
 * @receiver Any?
 * @param another Any?
 * @return Unit
 */
infix fun Any?.shouldNotBe(another: Any?) = assert((this != another)
	.apply { if (!this) System.err.println("Shouldn't be $another, but actually it is.") })