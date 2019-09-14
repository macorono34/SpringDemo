package com.example.denemoto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/motorcycles")
public class MotorcycleController {
MotorcycleRepository motorcycleRepository;
@Autowired
 public MotorcycleController(MotorcycleRepository motorcycleRepository){
     this.motorcycleRepository=motorcycleRepository;


 }

 @RequestMapping(value = "/all", method = RequestMethod.GET)
 public List<Motorcycle> getAll(){
     return motorcycleRepository.findAll();
 }

 @RequestMapping(value = "/cheap/{price}", method = RequestMethod.GET)
 public List<Motorcycle> getCheap(@PathVariable double price){
    return motorcycleRepository.findByMotopriceLessThan(price);
 }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<Motorcycle> remove(@PathVariable long id){
        motorcycleRepository.deleteById(id);

        return motorcycleRepository.findAll();
}
@RequestMapping(value = "/find/{model}",method = RequestMethod.GET)
public List<Motorcycle> findModel(@PathVariable String model){
return motorcycleRepository.findByModelLike(model);

}
@RequestMapping(value = "/color/{color}", method = RequestMethod.GET)
public List<Motorcycle> findColor(@PathVariable String color){
    return motorcycleRepository.findByColorLike(color);

}



}
