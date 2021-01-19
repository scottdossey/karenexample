package com.tts.karenexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DefaultController {
    
    @GetMapping(value="/")
    String mainPage(HoldsFormData formdata, Model model)
    {
        formdata.setName("Scott");
        formdata.setComment("Whatever");
        model.addAttribute("formdata", formdata);
        return "index";
    }

    @GetMapping(value="/otherpage")
    String otherPage()
    {
        return "otherpage";
    }

    @PostMapping(value="/formpage")
    String formPage(HoldsFormData formdata, Model model)    
    {
        model.addAttribute("info", 
                           "The name is:" 
                           + formdata.getName() 
                           + " and the comment is: "
                           + formdata.getComment());
        return "formpage";
    }
}
