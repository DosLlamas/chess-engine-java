package com.chess.squares;
import com.chess.common.Location
public class Square {
    private final SquareColor squareColor;
    private final Location location;
    private boolean isOccupied;

    public Square(SquareColor squareColor, Location location) {
        this.squareColor = squareColor;
        this.location = location;
        this.isOccupied = false;
    }
    public void reset() {
        this.isOccupied = false;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
    public SquareColor getSquareColor() {
        return squareColor;
    }
    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareColor=" + squareColor +
                ", location=" + location +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
