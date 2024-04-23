//Name:Michael Plafcan, Date: 9/20/22, Section: 04
import java.util.Random;
public class Project2 {
  public static void main(String[] args){

    Random randomNumber = new Random();
    //generates the temperature number
    int temperature;
    temperature = randomNumber.nextInt(60) + 35;
    //generates the precipitation number
    int precipitation;
    precipitation = randomNumber.nextInt(100) + 1;
    //Variables for clothing and the forecast temps, ie. cold, sunny, humid (not actualy temperature) (actual temperature is the temperature variable)
    String Tops;
    String Bottoms;
    String Outer_Wear;
    String Forecast_Temp;
    String Forecast_Precip;
    //this was for debugging purposes to see which variable wasn't assigning
    Tops = ("didn't work");
    Bottoms = ("didn't work");
    Outer_Wear = ("didn't work");
    Forecast_Precip = ("didn't work");
    Forecast_Temp = ("didn't work");
    //these if statements change the clothe variables and forecast variables to fit the temp and precipitation
      if (temperature >= 35 && temperature <=44){
        Tops = ("Warm Coat");
        Bottoms = ("Snow Pants");
        Forecast_Temp = ("Really Cold");
      }else if (temperature >= 45 && temperature <=54){
        Tops = ("Jacket");
        Bottoms = ("Jeans");
        Forecast_Temp = ("Cold");
      }else if (temperature >= 60 && temperature <=64){
        Tops = ("Long sleeve shirt");
        Bottoms = ("Cargo Pants");
        Forecast_Temp = ("Chilly");
      }else if (temperature >= 70 && temperature <=74){
        Tops = ("Short Sleeve Shirt");
        Bottoms = ("Cargo Shorts");
        Forecast_Temp = ("Warm");
      }else {
        Tops = ("Short Sleeve Shirt");
        Bottoms = ("Shorts");
        Forecast_Temp = ("Hot");
      }
      if (precipitation >= 0 && precipitation <=19){
        Outer_Wear = ("Sunglasses");
        Forecast_Precip = ("Sunny");
      }else if (precipitation >= 20 && precipitation <=39){
        Outer_Wear = ("a Sun Hat");
        Forecast_Precip = ("Mostly Sunny");
      }else if (precipitation >= 40 && precipitation <=59){
        Outer_Wear = ("A Ball Cap");
        Forecast_Precip = ("Cloudy");
      }else if (precipitation >= 60 && precipitation <=79){
        Outer_Wear = ("an Umbrella");
        Forecast_Precip = ("Rainy");
      }else {
        Outer_Wear = ("an Umbrella");
        Forecast_Precip = ("Very Rainy");
      }
      //Output lines with places for the variables
      System.out.println("Todays forcecast shows");
      System.out.println("A temperature of " + temperature + " Degrees Fahrenheit");
      System.out.println("With a " + precipitation + "% Chance of Precipitation");
      System.out.println("It's looking " + Forecast_Precip + " and " + Forecast_Temp);
      System.out.println("I'd recommend wearing a " + Tops + " With " + Bottoms + " and " + Outer_Wear);

  }
}
