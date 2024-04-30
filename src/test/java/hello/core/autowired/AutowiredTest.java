package hello.core.autowired;

import hello.core.member.Member;
import io.micrometer.common.lang.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{

        @Autowired(required = false)
        public void setNoBean1(Member noBean1){
            //spring bean으로 관리되는 객체가 없는 상황
            System.out.println("noBean1 = " + noBean1);
            //이 메서드 자체가 호출이 아예 안됨
        }

        @Autowired
        public void setNoBean2(@Nullable Member noBean2){
            //spring bean으로 관리되는 member가 없는 상황
            System.out.println("noBean2 = " + noBean2);
            //호출은 되지만 null로 들어옴
        }

        @Autowired(required = false)
        public void setNoBean3(Optional<Member> noBean3){
            System.out.println("noBean3 = " + noBean3);
            //null이 들어오면 empty로 들어옴
        }
    }
}
