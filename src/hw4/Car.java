package hw4;

public  class Car {
    private  int flueTankVolume;
    private   int resideFlue;
    private  double flueConsumptionPer100km;

    public int getFlueTankVolume() {
        return flueTankVolume;
    }

    public void setFlueTankVolume(int flueTankVolume) {
        this.flueTankVolume = flueTankVolume;
    }

    public void setResideFlue(int resideFlue) {
        this.resideFlue = resideFlue;
    }

    public void setFlueConsumptionPer100km(double flueConsumptionPer100km) {
        this.flueConsumptionPer100km = flueConsumptionPer100km;
    }

    public int getResideFlue() {
        return resideFlue;
    }

    public double getFlueConsumptionPer100km() {
        return flueConsumptionPer100km;
    }
}
