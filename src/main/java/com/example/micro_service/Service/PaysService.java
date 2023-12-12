package com.example.micro_service.Service;

import com.example.micro_service.Repository.PaysRepository;
import com.example.micro_service.entities.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaysService {
    @Autowired
    private PaysRepository paysRepository;
    public Pay addPays(Pay pay){
        return paysRepository.save(pay);
    }
    public Pay updatePays(Pay pay){
        return paysRepository.save(pay);
    }
    public List<Pay> findALL(){
        return paysRepository.findAll();

    }
    public Pay findById(int id){
        return paysRepository.findById(id).orElse(null);
    }
    public void deletePays(int id){
        paysRepository.deleteById(id);
    }
}
