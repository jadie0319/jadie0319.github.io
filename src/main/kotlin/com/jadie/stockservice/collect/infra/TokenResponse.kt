package com.jadie.stockservice.collect.infra

import com.fasterxml.jackson.annotation.JsonProperty

data class TokenResponse(
    @field:JsonProperty("expires_dt") val expiresDt: String?,
    @field:JsonProperty("token_type") val tokenType: String?,
    @field:JsonProperty("token") val token: String?,
    @field:JsonProperty("return_code") val returnCode: Int?,
    @field:JsonProperty("return_msg") val returnMessage: String?
)
