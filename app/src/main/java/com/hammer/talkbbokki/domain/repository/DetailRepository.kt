package com.hammer.talkbbokki.domain.repository

import kotlinx.coroutines.flow.Flow

interface DetailRepository {
    fun getTalkOrder(): Flow<String?>

    fun postViewCnt(topicId: Int): Flow<Unit>
}
