package com.hfad.starbuzz;

/**
 * Created by krist on 30.11.2017..
 */

public class foodFats {

    private int saturatedFat;
    private int monosaturatedFat;
    private int polysaturatedFat;
    private int transFat;

    public static foodFats lean=new foodFats(0,0,0,0);

    public foodFats(int saturatedFat, int monosaturatedFat, int polysaturatedFat, int transFat) {
        this.saturatedFat = saturatedFat;
        this.monosaturatedFat = monosaturatedFat;
        this.polysaturatedFat = polysaturatedFat;
        this.transFat = transFat;
    }

    public int getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(int saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public int getMonosaturatedFat() {
        return monosaturatedFat;
    }

    public void setMonosaturatedFat(int monosaturatedFat) {
        this.monosaturatedFat = monosaturatedFat;
    }

    public int getPolysaturatedFat() {
        return polysaturatedFat;
    }

    public void setPolysaturatedFat(int polysaturatedFat) {
        this.polysaturatedFat = polysaturatedFat;
    }

    public int getTransFat() {
        return transFat;
    }

    public void setTransFat(int transFat) {
        this.transFat = transFat;
    }

    public int getTotalFat()
    {
        return saturatedFat+monosaturatedFat+polysaturatedFat+transFat;
    }

    @Override
    public String toString() {
        return "foodFats{" +
                "saturatedFat=" + saturatedFat +
                ", monosaturatedFat=" + monosaturatedFat +
                ", polysaturatedFat=" + polysaturatedFat +
                ", transFat=" + transFat +
                '}';
    }
}
