package com.example.pertemuan9.viewmodel.provider

class DetailViewModel (
    savedStatehandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa) : ViewModel(){

    private val idSiswa: Int = checkNotNull(savedStateHandle[DestinasiDetailSiswa.itemIdArg])



}
