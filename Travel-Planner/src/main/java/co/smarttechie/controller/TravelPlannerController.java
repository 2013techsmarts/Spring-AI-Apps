package co.smarttechie.controller;

import co.smarttechie.service.TravelPlannerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelPlannerController {

    private final TravelPlannerService travelPlannerService;

    public TravelPlannerController(TravelPlannerService travelPlannerService) {
        this.travelPlannerService = travelPlannerService;
    }

    @PostMapping("/travel-planner")
    public String getResponse(@RequestBody String prompt){
        return travelPlannerService.getResponse(prompt);
    }
}
