package com.example.pertemuan9.viewmodel

class EditViewModel (
    savedStateHandle: SavedStatehandle,
    private val repositoriSiswa: RepositoriSiswa): ViewModel() {

    var uiStateSiswa by mutableStateOf( value = UIStateSiswa())
        private set

    private val idSiswa: Int = checkNotNull(savedStateHandle[DestinasiDetailSiswa.itemIdArg])
        init {
            viewModelScope.launch {
                uiStateSiswa = repositoriSiswa.getSiswaStream(idSiswa)
                    .filterNotNull()
                    .first()
                    .toUIStateSiswa(isEntryValid = true)
            }
        }
    }
}