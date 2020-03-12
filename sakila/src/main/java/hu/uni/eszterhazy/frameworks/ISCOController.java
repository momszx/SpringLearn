package hu.uni.eszterhazy.frameworks;

import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



@RestController
@RequestMapping(value = {"/ISCO"})
public class ISCOController {



    @RequestMapping("/jo")
    public String proba() {
        return String.format("jó");

    }
    @RequestMapping("/{OCNum}")
    public String SearchISCO(@PathVariable("OCNum") String OcNum) {
        String SearchResult = ISCOSearch(OcNum);
        return  String.format(SearchResult);
    }
    private String ISCOSearch(String Search){
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/ISCO.csv"))) {
            boolean find=false;
            String line="";
            String csvSplitBy=",";
            String help="";
            line=br.readLine();
            do {
                String[]record = line.split(csvSplitBy,7);
                if (Search.equals(record[4])){
                    find=true;
                    help =record[6];
                }
            } while (!find&& ((line = br.readLine()) != null));
            if (find==true){
                return help;
            }
            else {
                return "OC not found . Try like OC1111";
            }

        } catch (IOException e) {
            return "ERROR ISCO.csv not found ";
        }
    }
}


