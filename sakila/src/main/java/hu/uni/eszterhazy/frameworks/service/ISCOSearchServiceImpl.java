package hu.uni.eszterhazy.frameworks.service;

import hu.uni.eszterhazy.frameworks.model.ISCO;
import hu.uni.eszterhazy.frameworks.dao.ISCORepository;

import java.util.Collection;

public class ISCOSearchServiceImpl implements ISCOSearchService{

    private ISCORepository iscoRepository;

    public ISCOSearchServiceImpl(ISCORepository iscoRepository){this.iscoRepository=iscoRepository;}

    @Override
    public Collection<ISCO> ISCOlist() {
        return (Collection<ISCO>) iscoRepository.findAll();
    }
}
