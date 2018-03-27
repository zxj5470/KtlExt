package com.github.zxj5470.ktlext.text

import java.util.*

/**
 * @author: zxj5470
 * @date: 2018/3/27
 */
fun String.indicesOf(regex: String): List<Int> {
	val ll = LinkedList<Int>()
	var temp = -1
	var b: Int
	this.forEachIndexed { index, _ ->
		b = this.indexOf(regex, index)
		if (b > temp) {
			temp = b
			ll.add(temp)
		}
	}
	return ll.toList()
}

fun String.countTimes(regex: String): Int {
	var count = 0
	var temp = -1
	var b: Int
	this.forEachIndexed { index, _ ->
		b = this.indexOf(regex, index)
		if (b > temp) {
			temp = b
			count++
		}
	}
	return count
}