package points_lecture;

public class Point1D {
    protected int positionX;  //public - verejne dostupne
                              // private - sukromne
                              // protected - chranene

    public Point1D(){
    }

    public Point1D(int positionX){
        this.positionX = positionX;
    }

    public int getPositionX(){  //geter
        return this.positionX;
    }

    public void setPositionX(int positionX){
        this.positionX = positionX;
    }

    public double distanceFromZero(){
        return positionX;
    }
}
