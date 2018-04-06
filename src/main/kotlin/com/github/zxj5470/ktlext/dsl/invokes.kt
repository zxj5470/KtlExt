package com.github.zxj5470.ktlext.dsl

/**
 * @author: zxj5470
 * @date: 2018/4/4
 */
/**
 * @usage
 * ```
 * var a = true
 * a {
 * 	dosomething()
 * }
 * ```
 * @receiver Boolean make sure it is true
 * @param block ()->Unit Running `dosomething`
 * @return Boolean true
 */
operator fun Boolean.invoke(block: () -> Unit): Boolean {
	if (this) block()
	return this
}

/**
 * @usage
 * ```
 * var a = false
 * a {
 * 	dosomething() // cannot invoke
 * }.orElse{
 *		doOtherThings()
 * }
 *
 * a.orElse{
 * 	doOtherThings()	// invoke
 * }
 * ```
 * @receiver Boolean
 * @param block () -> Unit
 * @return Boolean false
 */
fun Boolean.orElse(block: () -> Unit): Boolean {
	if (!this) block()
	return this
}