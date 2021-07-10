package karling.nicolas.HarryPotterAPI.Controller;

import net.minidev.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Random;

@RestController
public class HarryPotterController {
    @GetMapping ("/sorting-hat")
   public ResponseEntity<Object> SortingHat(){
       ArrayList<String> houses = new ArrayList<String>();

       houses.add("Grifinoria");
       houses.add("Corvinal");
       houses.add("Sonserina");
       houses.add("Lufa-lufa");

       Random number = new Random();
       int generateNumber = number.nextInt(4);

        JSONObject entity = new JSONObject();
        entity.put("house", houses.get(generateNumber));
       return new ResponseEntity<Object>(entity, HttpStatus.ACCEPTED);
   }
}
