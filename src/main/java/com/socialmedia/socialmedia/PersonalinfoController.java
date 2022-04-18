package com.socialmedia.socialmedia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.* ;

@RestController
public class PersonalinfoController {
    @GetMapping("/Personalinfo")
  //  Personalinfo p=new Personalinfo();
    public Personalinfo getdetails(){
        return  new Personalinfo("anushiya","Sudent");
    }


    @GetMapping("/listofpersonlainfo")
           public List<Personalinfo>getinfo(){
       List<Personalinfo>personalinfo=new ArrayList<Personalinfo>();
       personalinfo.add(new Personalinfo("anu","java"));
       personalinfo.add(new Personalinfo("priya","commerce"));
       personalinfo.add(new Personalinfo("swathi","android"));
       return personalinfo;
    }
    @GetMapping("/Personalinfo/{name}/{designation}")
public Personalinfo usingpathmethod(@PathVariable("name") String name, @PathVariable("designation")String designation){
        return new Personalinfo(name, designation);
    }


    @GetMapping("/Personalinfo/query")
    public Personalinfo method(@RequestParam (name="name")String name ,
                               @RequestParam (name="designation")String designation){
        return new Personalinfo(name,designation);
    }
}
