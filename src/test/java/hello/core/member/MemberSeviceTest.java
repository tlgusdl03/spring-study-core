package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberSeviceTest {

    MemberService memberService = new MemberServiceimpl();
    @Test
    void join(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
        //join한 멤버와 찾은 멤버가 같으면 정상 작동한 것
    }

}
