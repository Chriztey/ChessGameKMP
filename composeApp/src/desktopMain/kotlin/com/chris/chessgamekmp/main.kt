package com.chris.chessgamekmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ChessGameKMP",
    ) {
        App()
    }
}