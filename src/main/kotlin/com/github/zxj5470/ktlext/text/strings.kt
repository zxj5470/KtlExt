package com.github.zxj5470.ktlext.text

/**
 * @author: zxj5470
 * @date: 2018/3/27
 */
fun String.indicesOf(regex: String): List<Int> =
		if (regex.isNotEmpty()) {
			this.indicesOf(regex.first()).filter {
				it == this.indexOf(regex, it)
			}
		} else {
			emptyList()
		}

fun String.indicesOf(char: Char): List<Int> =
		this.mapIndexedNotNull { index, c ->
			if (c == char)
				index
			else null
		}

fun String.countTimes(regex: String): Int =
		this.indicesOf(regex).size