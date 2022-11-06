package com.whasapp.net.domain.model

data class Call(
    var number: String,
    var time: String,
    var isSuccess: Boolean,
    var isMyCall: Boolean,
    var profile: Int
)