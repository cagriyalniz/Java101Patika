package metotlar_siniflar_diziler_OOP.FinalProject;

public class Area {
    public int coordX;
    public int coordY;
    public int aroundSwipe;
    public int ownSwipe;

    public Area(int coordX, int coordY, int ownSwipe) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.aroundSwipe = aroundSwipe;
        this.ownSwipe = ownSwipe;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getAroundSwipe() {
        return aroundSwipe;
    }

    public void setAroundSwipe(int aroundSwipe) {
        this.aroundSwipe = aroundSwipe;
    }

    public int getOwnSwipe() {
        return ownSwipe;
    }

    public void setOwnSwipe(int ownSwipe) {
        this.ownSwipe = ownSwipe;
    }
}
