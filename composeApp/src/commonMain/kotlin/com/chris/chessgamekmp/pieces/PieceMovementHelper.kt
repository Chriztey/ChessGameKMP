package com.chris.chessgamekmp.pieces

import androidx.compose.ui.unit.IntOffset

fun Piece.getMoves(
    pieces: List<Piece>,
    getPosition: (Int) -> IntOffset,
    maxMovement: Int = 7
) : Set<IntOffset> {

    val moves = mutableSetOf<IntOffset>()

    for (i in 1 .. maxMovement) {

        val targetPosition = getPosition(i)
        val targetPiece = pieces.find { it.position == targetPosition }

        if (targetPiece != null) {
            if (targetPiece.color != this.color) {
                moves.add(targetPosition)
            }
            break
        } else {
            moves.add(targetPosition)
        }

    }

    return moves

}