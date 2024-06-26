package chess.pieces;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {

    @Test
    @DisplayName("Piece가 생성되어야 한다.")
    public void create_piece() {
        verifyPiece(Piece.createWhitePawn(), Piece.WHITE_COLOR, Piece.WHITE_PAWN_REPRESENTATION);
        verifyPiece(Piece.createWhiteKnight(), Piece.WHITE_COLOR, Piece.WHITE_KNIGHT_REPRESENTATION);
        verifyPiece(Piece.createWhiteRook(), Piece.WHITE_COLOR, Piece.WHITE_ROOK_REPRESENTATION);
        verifyPiece(Piece.createWhiteBishop(), Piece.WHITE_COLOR, Piece.WHITE_BISHOP_REPRESENTATION);
        verifyPiece(Piece.createWhiteQueen(), Piece.WHITE_COLOR, Piece.WHITE_QUEEN_REPRESENTATION);
        verifyPiece(Piece.createWhiteKing(), Piece.WHITE_COLOR, Piece.WHITE_KING_REPRESENTATION);

        verifyPiece(Piece.createBlackPawn(), Piece.BLACK_COLOR, Piece.BLACK_PAWN_REPRESENTATION);
        verifyPiece(Piece.createBlackKnight(), Piece.BLACK_COLOR, Piece.BLACK_KNIGHT_REPRESENTATION);
        verifyPiece(Piece.createBlackRook(), Piece.BLACK_COLOR, Piece.BLACK_ROOK_REPRESENTATION);
        verifyPiece(Piece.createBlackBishop(), Piece.BLACK_COLOR, Piece.BLACK_BISHOP_REPRESENTATION);
        verifyPiece(Piece.createBlackQueen(), Piece.BLACK_COLOR, Piece.BLACK_QUEEN_REPRESENTATION);
        verifyPiece(Piece.createBlackKing(), Piece.BLACK_COLOR, Piece.BLACK_KING_REPRESENTATION);
    }

    private void verifyPiece(final Piece piece, final String color, final char representation) {
        assertEquals(color, piece.getColor());
        assertEquals(representation, piece.getRepresentation());
    }

    @Test
    @DisplayName("검은색 말과 흰색 말을 구분할 수 있어야한다.")
    public void checkColor(){
        Piece piece = Piece.createWhitePawn();
        assertEquals(piece.isBlack(), false);
        assertEquals(piece.isWhite(), true);
    }

}
