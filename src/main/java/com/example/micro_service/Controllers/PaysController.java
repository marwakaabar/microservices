package com.example.micro_service.Controllers;

import com.example.micro_service.Service.PaysService;
import com.example.micro_service.entities.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/pays")
public class PaysController {
    @Autowired
    private PaysService paysService;
    @GetMapping
    public List<Pay> getAll() {
        return paysService.findALL(); // tjr appel d'une méthode provenant du service associé.
    }

    @GetMapping("{id}")
    public Pay getPaysbyId(@PathVariable int id) { //@pathvariable prend la mémé chaîne que le nom de l'attribut voir @GetMapping
        return paysService.findById(id);
    }

    @PostMapping
    public Pay addPay(@RequestBody Pay pay) {// @RequestBody pr les objets et @PathVariable pour les attributs
        return paysService.addPays(pay);
    }

    @PutMapping("{id}")
    public Pay updatePays(@RequestBody Pay pay) {
        return paysService.updatePays(pay);
    }

    @DeleteMapping("{id}")
    public void deletePays(@PathVariable int id) {

         paysService.deletePays(id);
    }


}
