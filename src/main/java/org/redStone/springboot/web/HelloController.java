package org.redStone.springboot.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @RestController
- 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어줍니다.
- 예전에는 @ResponseBody를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 변경
 */
@RestController
public class HelloController {

    /*
    * @GetMapping
    - HTTP Method인 get의 요청을 받을 수 있는 API 생성
    - 예전에는 @RequestMapping(method = RequestMethod.GET)으로 사용했다.
        -> 여기서는 /hello로 요청이 오면 문자열 hello를 반환한다.
     */
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
