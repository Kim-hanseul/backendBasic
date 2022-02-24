package net.zerotoweb.api.Member.controller;

import lombok.RequiredArgsConstructor;
import net.zerotoweb.api.Member.domain.MemberDTO;
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
public class MemberController {

  private final MemberService service;

  @GetMapping("/member/bmi/김한슬/177.4/73.2")
  public String getBmi(@PathVariable String name,
                       @PathVariable double height,
                       @PathVariable double weight) {
    System.out.println(" 리액트에서 넘어온 이름: "+name);
    System.out.println(" 리액트에서 넘어온 키 : "+height);
    System.out.println(" 리액트에서 넘어온 몸무게 : "+weight);
    return "BMI 는 정상";
}
}
