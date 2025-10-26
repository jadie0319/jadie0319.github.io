package com.jadie.stockservice.collect.infra

import com.fasterxml.jackson.annotation.JsonProperty

data class TokenRequest(
    @field:JsonProperty("grant_type") val grantType: String,
    @field:JsonProperty("appkey") val appKey: String,
    @field:JsonProperty("secretkey") val secretKey: String
)
