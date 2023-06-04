package kodlama.io.Kodlama.io.Devs.dataAccess.concrets;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concrets.SoftwareLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository //bu bir sınıfın dataAccess nesnesi oldugunu gosterir
public class InMemorySoftwareLanguageRepository implements SoftwareLanguageRepository {

    List<SoftwareLanguage> softwareLanguages;

    public InMemorySoftwareLanguageRepository(){
        softwareLanguages = new ArrayList<SoftwareLanguage>();
        softwareLanguages.add(new SoftwareLanguage(1,"C"));
        softwareLanguages.add(new SoftwareLanguage(2,"C++"));
        softwareLanguages.add(new SoftwareLanguage(3,"C#"));
    }

    @Override
    public List<SoftwareLanguage> add(int id, String name) {
        boolean hasDuplicate = false;

        for (SoftwareLanguage language : softwareLanguages) {
            if (language.getName().equals(name)) {
                hasDuplicate = true;
                break;
            }
        }

        if (!hasDuplicate && !name.equals("")) {
            softwareLanguages.add(new SoftwareLanguage(id - 1, name));
        }

        return softwareLanguages;
    }




    @Override
    public List<SoftwareLanguage> delete(int id) {
        softwareLanguages.remove(id-1);
        return softwareLanguages;
    }


    @Override
    public List<SoftwareLanguage> getAll() {
        return softwareLanguages;
    }

    @Override
    public List<SoftwareLanguage> upgrade(int id, String name) {
        if(0<=id && id<= softwareLanguages.size()){
            softwareLanguages.remove(id-1);
            softwareLanguages.add(new SoftwareLanguage(id,name));
        }
        return softwareLanguages;
    }

    @Override
    public List<SoftwareLanguage> getById(int id) {
        List<SoftwareLanguage> idSoftwareLanguage = new ArrayList<>();
        if (id >= 0 && id < softwareLanguages.size()) {
            idSoftwareLanguage.add(softwareLanguages.get(id-1));
        }
        return idSoftwareLanguage;
    }
}
