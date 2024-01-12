package ie.atu.projectelective;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ElectiveController {
    private ElectiveService electiveService;

    @Autowired
    public void setElectiveService(ElectiveService electiveService){
        this.electiveService = electiveService;
    }

    @PostMapping("/electiveChoices")
    public String chooseElectives(@Valid @RequestBody Elective elective){
        electiveService.chooseElectives(elective);
        return "Successfully chosen elective modules";
    }

    @GetMapping("electiveDetails")
    public @ResponseBody List<Elective> getElective(){
        return electiveService.getElectives();
    }
}
