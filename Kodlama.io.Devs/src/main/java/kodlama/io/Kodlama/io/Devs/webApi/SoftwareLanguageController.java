package kodlama.io.Kodlama.io.Devs.webApi;

import kodlama.io.Kodlama.io.Devs.business.abstracts.SoftwareLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concrets.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/softwareLanguage")
public class SoftwareLanguageController {

    private SoftwareLanguageService softwareLanguageService;

    @Autowired
    public SoftwareLanguageController(SoftwareLanguageService softwareLanguageService) {
        this.softwareLanguageService = softwareLanguageService;
    }

    @GetMapping("/getall")
    public List<SoftwareLanguage> getAll(){
        return softwareLanguageService.getAll();
    }

    @GetMapping("/add")
    public List<SoftwareLanguage> add(int id,String name){
        return softwareLanguageService.add(id,name);
    }

    @GetMapping("/delete")
    public List<SoftwareLanguage> delete(int id){
        return softwareLanguageService.delete(id);
    }

    @GetMapping("/getById")
    public List<SoftwareLanguage> getById(int id){
        return softwareLanguageService.getById(id);
    }

    @GetMapping("/upgrade")
    public List<SoftwareLanguage> upgrade(int id,String name){
        return softwareLanguageService.upgrade(id,name);
    }


}
