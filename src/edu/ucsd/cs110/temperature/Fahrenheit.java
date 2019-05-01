package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float input =(float)((this.getValue() - 32) * (5.0/9.0) );
        return new Celsius(input) ;    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        float amount = this.getValue();
        String strAmount = String.valueOf(amount);

        return strAmount + " F";
    }
}