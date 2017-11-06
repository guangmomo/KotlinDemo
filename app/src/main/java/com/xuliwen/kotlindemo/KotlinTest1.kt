package com.xuliwen.kotlindemo

/**
 * Created by xuliwen on 2017/11/6.
 */
class KotlinTest1 {
    
    
    
    fun main(args: Array<String>) {
        var a = 1000
        println(a === a)
        
        var boxedA : Int ?= a
        var boxedB : Int ?= a
        println(boxedA == boxedB)
        println(boxedA === boxedB)
    }
}