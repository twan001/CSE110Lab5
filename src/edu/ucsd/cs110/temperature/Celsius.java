package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float input =(float)(this.getValue() * (9.0/5.0) + 32);
        return new Fahrenheit(input) ;
    }

    public String toString()
    {
        // TODO: Complete this method
        float amount = this.getValue();
        String strAmount = String.valueOf(amount);

        return strAmount + " C";
    }
}