package com.github.zxj5470.ktlext.testing

/**
 * @author: zxj5470
 * @date: 2018/4/1
 */
infix fun Any?.shouldBe(another: Any?) = assert((this == another)
	.apply { if (!this) System.err.println("Should be $another, but given is ${this@shouldBe}") })

infix fun Any?.shouldNotBe(another: Any?) = assert((this != another)
	.apply { if (!this) System.err.println("Shouldn't be $another, but actually it is.") })