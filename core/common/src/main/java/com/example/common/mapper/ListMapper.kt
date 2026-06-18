package com.example.common.mapper

fun <I, O> Mapper<I, O>.mapList(input: List<I>): List<O> =
    input.map { map(it) }