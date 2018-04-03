package com.github.zxj5470.ktlext.invokes

/**
 * @author: zxj5470
 * @date: 2018/4/4
 */

operator fun Boolean.invoke(block:()->Unit) {
   if(this) block()
}