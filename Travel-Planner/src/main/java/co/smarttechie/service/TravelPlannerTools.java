package co.smarttechie.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;

public class TravelPlannerTools {

    @Tool(name = "getHotelPrices", description = "Fetches the hotel prices in a given city")
    public String getHotelPrices(@ToolParam(description = "The city to get hotel information for") String city) {
        System.out.println("The getHotelPrices is called for " + city);
        return "The hotel price in " + city + " is : $150";
    }

    @Tool(name = "getFlightCosts", description = "Fetches the flight cost to a given city from current city")
    public String getFlightCosts(@ToolParam(description = "The flight cost to city") String toCity,
                                 @ToolParam(description = "The flight cost from city") String fromCity) {
        System.out.println("The getFlightCosts is called for   " + toCity + " from " + fromCity);
        return "The flight cost from  " + fromCity + " to " + toCity + " is : $500";
    }
}
