package com.example.pertemuan9.viewmodel.provider

class DetailViewModel (
    savedStatehandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa) : ViewModel(){

    private val idSiswa: Int = checkNotNull(savedStateHandle[DestinasiDetailSiswa.itemIdArg])

    val uiDetailState: StateFlow<DetailSiswaUiState> =
        repositoriSiswa.getSiswaStream(idSiswa)
            .filterNotNull()
            .map {
                detailSiswaUiState(detailSiswa = it.toDetailSiswa())
            }.statein(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed( stopTimeoutmilis = TIMEOUT_MILIS),
                initialValue = DetailSiswaUiState()
            )

    suspend fun deleteSiswa(){
        repositoriSiswa.deleteSiswa(uiDetailState.value.detailSiswa.toSiswa())
    }

    companion object {
        private const val TIMEOUT_MILIS = 5_000L
    }

}
