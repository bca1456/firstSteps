package interfaces;

public class Square implements MathMethods {
    private int side;

    public Square(){
        this.side = 1;
    }

    public Square(int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public Double getSquare() {
        return Math.pow(side, 2);
    }

    @Override
    public Double getPerimeter() {
        return (double) this.side * 4;
    }

    @Override
    public String toString() {
        return "this is a square, side:" + this.side +
                " perimeter:" + this.getPerimeter() +
                " square:" + this.getSquare();
    }
}
