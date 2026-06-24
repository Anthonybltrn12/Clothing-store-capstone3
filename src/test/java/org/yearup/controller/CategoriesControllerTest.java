package org.yearup.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.yearup.controllers.CategoriesController;
import org.yearup.models.Category;
import org.yearup.service.CategoryService;

@WebMvcTest(CategoriesController.class)
public class CategoriesControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockitoBean
    private CategoryService categoryService;

    //tests
    //creating category
    Category category = new Category("fun","catgeories that are fun");
}
