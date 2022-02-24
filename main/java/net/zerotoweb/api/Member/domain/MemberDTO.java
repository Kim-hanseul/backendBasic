package net.zerotoweb.api.Member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

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
@Data
@Component
public class MemberDTO {
private final static MemberDTO memberDTO = new MemberDTO ();
public MemberDTO(){}
  public static MemberDTO getInstance(){return memberDTO;}

  private String userId;
  private String name;
  private String addr;
  private String phone1;
  private double height;
  private double weight;
  private String regdate;


}
