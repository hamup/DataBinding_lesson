package com.example.hamu.databindtest.viewmodel

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.example.hamu.databindtest.BR

class MainViewModel : BaseObservable() {
    @Bindable
    var messageEditText : String = ""
    set(value) {
        field = value
        notifyPropertyChanged(BR.messageEditText)
        notifyPropertyChanged(BR.messageLength)
    }

    @get:Bindable
    var messageLength : String = "0"
    get() = "${messageEditText.length}"
}