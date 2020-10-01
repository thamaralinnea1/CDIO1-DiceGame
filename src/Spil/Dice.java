package Spil;

public class Dice {

    private final int Max = 6; //terning får 6 sider
    private int facevalue;

    public Dice(int value){
        facevalue = value;

    }
    //kast terningen og vis værdien
    public int roll()
    {
        //+1 for at terningen viser 6
        facevalue = (int)(Math.random()*Max)+ 1;

        return facevalue;

    }
    //vis værdi


    public void setFacevalue(int value){
        facevalue = value;

    }
    //hent værdien
    public int getFacevalue (){
        return facevalue;

    }
}
