package com.haryop.artgalleryviewerapp.data.api

import com.haryop.artgalleryviewerapp.data.helper.Constants
import com.haryop.artgalleryviewerapp.data.model.ArtworkResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("${Constants.PAGINATION_LIMIT}&${Constants.GET_ARTWORKS}")
    suspend fun getArtworks(
        @Query("page") page: String?
    ): Response<ArtworkResponseModel>
}