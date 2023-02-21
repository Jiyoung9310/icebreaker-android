package com.hammer.talkbbokki.data.entity

data class TalkOrderEntity(
    val result: TalkOrderItem
)

data class TalkOrderItem(
    val id: Int? = null,
    val rule: String? = null
)
