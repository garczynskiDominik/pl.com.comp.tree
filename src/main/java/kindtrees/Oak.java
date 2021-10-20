package kindtrees;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import typeoftrees.DeciduousTrees;
import typeoftrees.TypesOfLeaves;

@Getter
@Setter
@ToString
public class Oak extends DeciduousTrees {
    private String name;

    public Oak(String treeTrank, String branches, TypesOfLeaves typeOfLeaves, String name) {
        super(treeTrank, branches, typeOfLeaves);
        this.name = name;
    }

    @Override
    public void grow() {
        super.grow();
        System.out.println("this tree have name Oak");
    }
}
