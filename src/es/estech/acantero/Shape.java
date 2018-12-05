package es.estech.acantero;

abstract public class Shape {
    protected int sides;
    protected int size;
    protected char pencil;

    public Shape(int sides, int size, char pencil) {
        this.sides = sides;
        this.size = size;
        this.pencil = pencil;
    }


    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char getPencil() {
        return pencil;
    }

    public void setPencil(char pencil) {
        this.pencil = pencil;
    }


}
