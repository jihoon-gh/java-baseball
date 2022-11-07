package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseBallTest {

    @Test
    @DisplayName("랜덤 숫자 생성 테스트")
    public void randomNumbersGeneratorTest(){
        //given
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        //when
        int checker = 0;
        for(Integer a : computer){
            if(a<1||a>9) checker++;
        }
        if(computer.size()>3) checker++;

        //then
        assertThat(checker).isEqualTo(0);
    }

    @Test
    @DisplayName("입력받은 문자열 검증")
    public void validateInputStringTest(){

    }





}
