package com.massage.massenger.domain.use_case

import com.massage.massenger.data.repository.GroupApiRepository
import javax.inject.Inject


class CreateGroupUseCase @Inject constructor(
    val groupApiRepository: GroupApiRepository
) {

}