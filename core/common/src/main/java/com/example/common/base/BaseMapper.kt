package com.example.common.base

interface BaseMapper<I, O> {
    fun map(input: I): O
}