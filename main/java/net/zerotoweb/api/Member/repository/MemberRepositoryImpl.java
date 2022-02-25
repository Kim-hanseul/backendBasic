package net.zerotoweb.api.Member.repository;

import net.zerotoweb.api.Member.domain.*;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepositoryImpl implements MemberRepository{

    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String bmi(MemberDTO bmi) {
        return null;
    }

    @Override
    public String grade(MemberDTO grade) {
        return null;
    }
}
