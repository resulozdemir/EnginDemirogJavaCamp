package kodlama.io.Kodlama.io.Devs.entities.concrets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class SoftwareLanguage {
    private int id;
    private String name;
    private List<String> subTechnology;

    public SoftwareLanguage(int id, String name) {
        this.id=id;
        this.name=name;
        this.subTechnology = new ArrayList<String>();
    }

    public void setSubTechnology(String subTechnology) {
        this.subTechnology.add(subTechnology);
    }

    public String getName() {
        return name;
    }
}
