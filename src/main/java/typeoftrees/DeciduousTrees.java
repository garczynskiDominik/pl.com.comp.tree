package typeoftrees;


public class DeciduousTrees extends AbstractTree {


    public DeciduousTrees(String treeTrank, String branches, TypesOfLeaves typeOfLeaves) {
        super(treeTrank, branches, typeOfLeaves);
    }

    @Override
    public void grow() {
        System.out.println("Deciduous trees growing");
    }

    @Override
    public String toString() {
        return "DeciduousTrees{treeTrank='" + getTreeTrank() + '\'' +
                ", branches='" + getBranches() + '\'' +
                ", typesOfLeaves=" + getTypeOfLeaves() +
                '}';
    }
}
