package com.example.common.base

fun <I, O> BaseMapper<I, O>.mapList(input: List<I>): List<O> =
    input.map { map(it) }