package hello.hellospring3;

import hello.hellospring3.repository.MemberRepository;
import hello.hellospring3.repository.MemoryMemberRepository;
import hello.hellospring3.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
