package sami.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sami.springframework.domain.Category;
import sami.springframework.domain.UnitOfMeasure;
import sami.springframework.repositories.CategoryRepository;
import sami.springframework.repositories.UniOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UniOfMeasureRepository uniOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UniOfMeasureRepository uniOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.uniOfMeasureRepository = uniOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = uniOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM Id is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
