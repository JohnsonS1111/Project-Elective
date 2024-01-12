package ie.atu.projectelective;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ElectiveService {
    private final List<Elective> electives = new ArrayList<>();

    public void chooseElectives(Elective elective){
        electives.add(elective);
    }

    public List<Elective> getElectives() {
        return electives;
    }
}
