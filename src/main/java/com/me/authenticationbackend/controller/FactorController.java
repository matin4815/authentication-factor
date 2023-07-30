package com.me.authenticationbackend.controller;

import com.me.authenticationbackend.dto.FactorDto;
import com.me.authenticationbackend.service.FactorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factor")
@RequiredArgsConstructor
@CrossOrigin("*")
public class FactorController {

    private final FactorService factorService;

    @PostMapping("/")
    public String createFactor(@RequestBody FactorDto factorDto) {
        return factorService.createFactor(factorDto);
    }

    @GetMapping("/")
    public List<FactorDto> getFactors() {
        return factorService.getFactors();
    }

    @GetMapping("/{factorNumber}")
    public FactorDto getFactorByNumber(@PathVariable Long factorNumber) {
        return factorService.getFactorByNumber(factorNumber);
    }


}
