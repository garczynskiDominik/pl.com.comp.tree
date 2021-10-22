import kindtrees.Oak;
import kindtrees.Pine;
import typeoftrees.AbstractTree;
import typeoftrees.ConfireTrees;
import typeoftrees.DeciduousTrees;
import typeoftrees.TypesOfLeaves;

public class Main {
    public static void main(String[] args) {
        AbstractTree deciduousTrees = new DeciduousTrees("Fat", "Long", TypesOfLeaves.LEAVES);
        AbstractTree confireTrees = new ConfireTrees("Tiny", "Short", TypesOfLeaves.LEAVES);

        System.out.println(deciduousTrees);
        System.out.println(confireTrees);

        deciduousTrees.grow();
        confireTrees.grow();

        DeciduousTrees oak = new Oak("Mid", "Mid", TypesOfLeaves.NEEDLES, "Oak");
        System.out.println(oak);
        ConfireTrees pine = new Pine("Slim", "Mid", TypesOfLeaves.NEEDLES, "Pine");
        System.out.println(pine);

        oak.grow();
        pine.grow();

    }
}
