package lab5.ex3;

public class Thermometer {
    private int currentTemp;
    private int maxTemp;
    private int minTemp;

    public Thermometer(){
        setCurrentTemp(0);
        setMaxTemp(Integer.MIN_VALUE);
        setMinTemp(Integer.MAX_VALUE);
    }

    public Thermometer(int currentTemp){
        setCurrentTemp(currentTemp);
        setMaxTemp(currentTemp);
        setMinTemp(currentTemp);
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(int currentTemp) {
        this.currentTemp = currentTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public void setTemperature(int currentTemp){
        this.currentTemp=currentTemp;
        updateMaxMinTemp(currentTemp);
    }

    private void updateMaxMinTemp(int currentTemp){
        if(currentTemp>maxTemp)
            maxTemp=currentTemp;

        if(currentTemp<minTemp)
            minTemp=currentTemp;

    }

    @Override
    public String toString() {
        return "Current temp: " +getCurrentTemp()+"\nMax temp: " +getMaxTemp()+"\nMin temp: " +getMinTemp();
    }
}
