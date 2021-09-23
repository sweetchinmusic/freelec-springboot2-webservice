package com.jojoldu.book.springboot.web.dto;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombok_function_test() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
// helloResponseDto 생성자에 지금 Test에 값을 초기화한 변수를 파라미터로 넣고
        //then
// assertThat을 통해서 확인한다. 그리고 이 메소드는 isEqualTo까지 사용할 수 있다.
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
