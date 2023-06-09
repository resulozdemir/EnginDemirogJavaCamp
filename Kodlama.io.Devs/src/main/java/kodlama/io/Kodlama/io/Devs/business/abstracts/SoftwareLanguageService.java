package kodlama.io.Kodlama.io.Devs.business.abstracts;

import kodlama.io.Kodlama.io.Devs.entities.concrets.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageService {
    List<SoftwareLanguage> addLanguage(int id,String name);
    List<SoftwareLanguage> addSubTechnology(int id,String name,String subTechnology);
    List<SoftwareLanguage> delete(int id);
    List<SoftwareLanguage> getAll();
    List<SoftwareLanguage> getById(int id);
    List<SoftwareLanguage> upgrade(int id,String name);

}
