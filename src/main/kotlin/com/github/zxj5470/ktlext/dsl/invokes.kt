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

/**
 * @usage
 *	```
 *	interface I
 *
 * class A : I {
 * 	fun a() = println("a")
 * }
 *
 * fun getInstance(): I {
 * 	return A()
 * }
 *
 * val i = getInstance()
 * i.castApply<A> { this.a() }
 *
 * // do nothing if the cast is unsuccessful
 * i.castApply<Int> { println(this) }
 *	```
 * @receiver Any?
 * @param block T.() -> Unit
 */
inline fun <reified T> Any?.castApply(block: T.() -> Unit) {
	(this as? T)?.apply {
		block()
	}
}