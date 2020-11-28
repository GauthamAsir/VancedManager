package com.vanced.manager.feature.home.domain.usecase

import com.vanced.manager.feature.home.domain.entity.App
import com.vanced.manager.feature.home.domain.repository.AppRepository

class GetYouTubeVancedInformationUseCase(
    private val repository: AppRepository
) {

    suspend operator fun invoke(
        packageName: (App.YouTubeVanced.Companion) -> String
    ): App.YouTubeVanced = repository.getYouTubeVancedInformation(packageName)
}