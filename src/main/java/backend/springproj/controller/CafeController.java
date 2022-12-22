package backend.springproj.controller;

import backend.springproj.domain.Cafe;
import backend.springproj.service.CafeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CafeController {

    private final CafeService cafeService;

    @GetMapping("/api/cafe")
    public List<Cafe> list(Model model){
        List<Cafe> cafes = cafeService.findCafeList();
        model.addAttribute("cafes", cafes);
        return cafes;
    }
}
