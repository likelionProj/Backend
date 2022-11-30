package backend.springproj.controller;

import backend.springproj.domain.Cafe;
import backend.springproj.repository.CafeRepository;
import backend.springproj.service.CafeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class SearchController {

    private final CafeRepository cafeRepository;

    private final CafeService cafeService;

//    @GetMapping("/api/search")
//    public void getSearchCafe(@RequestParam(value = "search") String search){
//        try{
//            List<Cafe> cafeList = cafeService.findCafeList(search);
//        }catch (Exception exception){
//            return null;
//        }
//    }
}
