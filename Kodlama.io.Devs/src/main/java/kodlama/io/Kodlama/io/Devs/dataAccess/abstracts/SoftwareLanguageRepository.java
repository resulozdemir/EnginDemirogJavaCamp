package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Kodlama.io.Devs.entities.concrets.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageRepository {
    List<SoftwareLanguage> addLanguage(int id,String name);

    List<SoftwareLanguage> addSubTechnology(int id,String name,String subTechnology);

    List<SoftwareLanguage> delete(int id);
    List<SoftwareLanguage> upgrade(int id,String name);

    List<SoftwareLanguage> getAll();

    List<SoftwareLanguage> getById(int id);
}
