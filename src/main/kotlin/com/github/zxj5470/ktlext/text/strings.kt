package com.github.zxj5470.ktlext.text

/**
 * @author: zxj5470
 * @date: 2018/3/27
 */

fun String.indicesOf(string: String, useRegex: Boolean = false): List<Int> =
	if (string.isNotEmpty()) {
		if (!useRegex) {
			this.indicesOf(string.first()).filter {
				it == this.indexOf(string, it)
			}
		} else {
			string.toRegex().findAll(this).map { it.range.first }.toList()
		}
	} else {
		emptyList()
	}

fun String.indicesOf(char: Char): List<Int> =
	this.mapIndexedNotNull { index, c ->
		index.takeIf { c == char }
	}

fun String.countTimes(string: String): Int =
	this.indicesOf(string).size

fun String.replaceLast(oldValue: String, newValue: String, useRegex: Boolean = false) =
	this.indicesOf(oldValue, useRegex)
		.takeIf { it.isNotEmpty() }
		?.last()
		?.let {
			this.substring(0, it) +
				this.substring(it).let {
					if (useRegex)
						it.replace(oldValue.toRegex(), newValue)
					else
						it.replace(oldValue, newValue)
				}
		}
		?: this