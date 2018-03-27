package com.github.zxj5470.ktlext.container

/**
 * @author: zxj5470
 * @date: 2018/3/27
 */
fun <T> MutableList<T>.swap(a: Int, b: Int) {
	val temp = this[a]
	this[a] = this[b]
	this[b] = temp
}