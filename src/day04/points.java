public class Points {
    private int posX;
    private int posY;
    private int posZ;
    private String name;

    public void setXYZ( int posX, int posY, int posZ, String name){
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
        this.name = name;
    }

    public int[] getXYZ(){
        int[] output = new int[3];
        output[0] = posX;
        output[1] = posY;
        output[2] = posZ;

        return output;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosZ() {
        return posZ;
    }

    public void setPosZ(int posZ) {
        this.posZ = posZ;
    }
}
