package kindtrees;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import typeoftrees.ConfireTrees;
import typeoftrees.TypesOfLeaves;

@Getter
@Setter
@ToString
public class Pine extends ConfireTrees {
    String name;

    public Pine(String treeTrank, String branches, TypesOfLeaves typeOfLeaves, String name) {
        super(treeTrank, branches, typeOfLeaves);
        this.name = name;
    }

    @Override
    public void grow() {
        super.grow();
        System.out.println("this tree have name Pine");
    }

}
