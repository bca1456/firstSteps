package interfaces;

public class Rectangle implements MathMethods {
    private int sideA;
    private int sideB;

    public Rectangle(){
        this.sideA = 1;
        this.sideB = 1;
    }

    public Rectangle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public Double getPerimeter() {
        return (double)this.sideA * 2 + this.sideB * 2;
    }

    @Override
    public Double getSquare() {
        return (double)this.sideA*this.sideB;
    }

    @Override
    public String toString() {
        return "this is a rectangle, sideA:" + this.sideA +
                " sideB:" + this.sideB +
                " perimeter:" + this.getPerimeter() +
                " square:" + this.getSquare();
    }
}
