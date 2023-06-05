package kodlama.io.Kodlama.io.Devs.business.concretes;

import kodlama.io.Kodlama.io.Devs.business.abstracts.SoftwareLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concrets.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareLanguageMenager implements SoftwareLanguageService {

    private SoftwareLanguageRepository softwareLanguageRepository;

    @Autowired
    public SoftwareLanguageMenager(SoftwareLanguageRepository softwareLanguageRepository) {
        this.softwareLanguageRepository = softwareLanguageRepository;
    }

    @Override
    public List<SoftwareLanguage> addLanguage(int id,String name) {
        return softwareLanguageRepository.addLanguage(id,name);
    }

    @Override
    public List<SoftwareLanguage> addSubTechnology(int id,String name,String subLanguage) {
        return softwareLanguageRepository.addSubTechnology(id,name,subLanguage);
    }

    @Override
    public List<SoftwareLanguage> delete(int id) {
        return softwareLanguageRepository.delete(id);
    }

    @Override
    public List<SoftwareLanguage> getAll() {
        return softwareLanguageRepository.getAll();
    }

    @Override
    public List<SoftwareLanguage> getById(int id) {
        return softwareLanguageRepository.getById(id);
    }

    @Override
    public List<SoftwareLanguage> upgrade(int id,String name) {
        return softwareLanguageRepository.upgrade(id,name);
    }
}
