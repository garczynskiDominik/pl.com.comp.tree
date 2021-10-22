package typeoftrees;

import org.junit.jupiter.api.Test;


class DeciduousTreesTest {

    DeciduousTrees deciduousTrees = new DeciduousTrees("Mid", "Mid", TypesOfLeaves.LEAVES);

    @Test
    void shouldshowDeciduousTree(){
        deciduousTrees.grow();

    }
}