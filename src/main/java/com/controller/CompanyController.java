package com.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.CompanyDTO;

@RestController
@RequestMapping("/Company")
@CrossOrigin(origins = "http://localhost:4200")
public class CompanyController extends AbstractController<CompanyDTO> {

}
