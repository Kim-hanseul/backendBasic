package net.zerotoweb.api.Member.service;

import lombok.RequiredArgsConstructor;
import net.zerotoweb.api.Member.domain.*;
import net.zerotoweb.api.Member.repository.MemberRepository;
import org.springframework.stereotype.Service;

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
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository repository;


    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        String op = calc.getOpcode();
        switch (op){
            case "+" : res = a + b; break;
            case "-" : res = a - b; break;
            case "*" : res = a * b; break;
            case "/" : res = a / b; break;
            case "%" : res = a % b; break;
        }
        return String.format("%d %s %d = %d", a, op, b, res);
    }

    @Override
    public String bmi(BmiDTO bmi) {
        return null;
    }

    @Override
    public String grade(GradeDTO grade) {
        String name = grade.getName();
        int kor = grade.getKor();
        int eng = grade.getEng();
        int math = grade.getMath();
        int res = 0;
        return null;
    }


}



