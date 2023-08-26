package org.redStone.springboot;

/*
*단위 테스트의 장점
- 단위 테스트는 개발 초기에 문제를 발견하게 도와줍니다.
- 단위 테스트는 개발자가 나중에 코드를 리팩토링하거나 라이브러리 업그레이드 등에서 기존 기능이 올바르게 작동하는지 확인할 수 있습니다.
- 단위 테스트는 기능에 대한 불확실성을 감소시킬 수 있습니다.
- 단위 테스트는 시스템에 대한 실제 문서를 제공합니다.즉, 단위 테스트 자체가 문서로 사용할 수 있습니다.
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
* Application 클래스
- 앞으로 만들 프로젝트의 메인 클래스

* @SpringBootApplication
-스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정.
    ->프로젝트 최상단에 위치해야만 한다.
*/
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        /*
        * 내장WAS 서버 실행 -> Jar파일 실행하면 된다.

        * 내장WAS 사용 이유 -> 언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있다.
         */
        SpringApplication.run(Application.class, args);
    }
}
