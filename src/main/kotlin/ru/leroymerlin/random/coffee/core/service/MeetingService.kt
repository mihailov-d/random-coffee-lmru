package ru.leroymerlin.random.coffee.core.service

import ru.leroymerlin.random.coffee.core.dto.request.MeetingCreateRequest
import ru.leroymerlin.random.coffee.core.dto.request.MeetingUpdateRequest
import ru.leroymerlin.random.coffee.core.model.Meeting
import java.util.UUID

interface MeetingService {
    // Create meeting
    fun create(createReq: MeetingCreateRequest): Meeting
    // Update meeting
    fun update(updateReq: MeetingUpdateRequest): Meeting
    // Cancel meeting
    fun cancel(id: UUID)
    // Delete meeting
    fun delete(id: UUID)
}
