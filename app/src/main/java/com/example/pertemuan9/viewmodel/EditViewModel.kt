package com.example.pertemuan9.viewmodel

class EditViewModel (
    savedStateHandle: SavedStatehandle,
    private val repositoriSiswa: RepositoriSiswa): ViewModel() {

    var uiStateSiswa by mutableStateOf( value = UIStateSiswa())
        private set
    }
}