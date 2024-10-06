package com.chris.chessgamekmp.pieces

import androidx.compose.ui.unit.IntOffset
import chessgamekmp.composeapp.generated.resources.Res
import chessgamekmp.composeapp.generated.resources.compose_multiplatform
import chessgamekmp.composeapp.generated.resources.pawn_black
import chessgamekmp.composeapp.generated.resources.pawn_white
import org.jetbrains.compose.resources.DrawableResource

class Pawn(
    override val color: Piece.Color,
    override val position: IntOffset
) : Piece {
    override val drawable: DrawableResource =
        if (color.isWhite)
            Res.drawable.pawn_white
            else Res.drawable.pawn_black

    override fun getAvailableMoves(pieces: List<Piece>): Set<IntOffset> {

        val moves = mutableSetOf<IntOffset>()

        val direction = if (color.isWhite) 1 else -1
        val isFirstMove = position.y == 2 && color.isWhite ||
                position.y == 7 && color.isBlack

        val nextPosition1 = IntOffset(
            x = position.x,
            y = position.y + direction
        )

        val nextPiece1 = pieces.find {
            it.position == nextPosition1
        }

        if (nextPiece1 == null) {
            moves.add(nextPosition1)
        }



        return moves
    }
}