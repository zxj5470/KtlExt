package com.github.zxj5470.ktlext.container

/**
 * @author: zxj5470
 * @date: 2018/3/27
 */

/**
 * Kotlin Official Extension sample swap:
 * @ref https://kotlinlang.org/docs/reference/extensions.html
 * @receiver MutableList<T>
 * @param a Int
 * @param b Int
 * @return Unit
 */
fun <T> MutableList<T>.swap(a: Int, b: Int) {
	val temp = this[a]
	this[a] = this[b]
	this[b] = temp
}