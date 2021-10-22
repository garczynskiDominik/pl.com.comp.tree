package typeoftrees;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class AbstractTree {

    private String treeTrank;
    private String branches;
    private TypesOfLeaves typeOfLeaves;

    public abstract void grow();
}
