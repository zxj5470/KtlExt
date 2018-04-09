package com.github.zxj5470.ktlext.ice1000


/**
 *
 * @property first A
 * @property second B
 * @property third C
 * @property fourth D
 */
data class Quad<out A, out B, out C, out D>
(val first: A, val second: B, val third: C, val fourth: D)

/**
 *
 * @property first A
 * @property second B
 * @property third C
 * @property fourth D
 * @property fifth E
 */
data class Penta<out A, out B, out C, out D, out E>
(val first: A, val second: B, val third: C, val fourth: D, val fifth: E)

/**
 *
 * @property first A
 * @property second B
 * @property third C
 * @property fourth D
 * @property fifth E
 * @property sixth F
 */
data class Hexa<out A, out B, out C, out D, out E, out F>
(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F)