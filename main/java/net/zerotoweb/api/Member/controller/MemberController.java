package net.zerotoweb.api.Member.controller;

import lombok.RequiredArgsConstructor;
import net.zerotoweb.api.Member.domain.*;
import net.zerotoweb.api.Member.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName: net.zerotoweb.api.Buy.Controller
 * fileName        : BuyController
 * author           : Kimhanseul
 * date               : 2022-02-11
 * desc               :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         Kimhanseul       최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
  private final MemberService service;

    @PostMapping("/calc")
  public String calc(@RequestBody CalcDTO calc){
    return service.calc(calc);
  }
  @PostMapping("/bmi")
  public String bmi(@RequestBody BmiDTO bmi){
    return service.bmi(bmi);
  }
  @PostMapping("/grade")
  public String grade(@RequestBody GradeDTO grade){
    return service.grade(grade);
  }

}
