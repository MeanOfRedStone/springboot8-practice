package org.redStone.springboot.web;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class IndexControllerTest {

    //@Autowired 스프링이 관리하는 beans 주입받는다
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void 메인페이지_로딩() {
        //when
        String body = this.restTemplate.getForObject("/", String.class);

        //전체 코드 다 검사할 것이 아니라 일부 코드가 있는 확인
        //then
        assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");
    }

    @Test
    public void 지도페이지_로딩() {
        //when
        String body = this.restTemplate.getForObject("/map", String.class);

        //then
        assertThat(body).contains("<h1>카카오톡 지도 생성 / 자동 새로고침 확인</h1>");
    }

}
