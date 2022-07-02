package com.inflearn.hellospring;

import com.inflearn.hellospring.repository.MemberRepository;
import com.inflearn.hellospring.repository.MemoryMemberRepository;
import com.inflearn.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
