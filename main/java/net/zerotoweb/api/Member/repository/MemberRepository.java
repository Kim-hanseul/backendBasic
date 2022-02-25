package net.zerotoweb.api.Member.repository;

import net.zerotoweb.api.Member.domain.*;

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
public interface MemberRepository {

    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);
}
