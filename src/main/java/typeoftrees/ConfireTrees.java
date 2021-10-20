package typeoftrees;

public class ConfireTrees extends AbstractTree {

    public ConfireTrees(String treeTrank, String branches, TypesOfLeaves typeOfLeaves) {
        super(treeTrank, branches, typeOfLeaves);
    }

    @Override
    public void grow() {
        System.out.println("Confire trees growing");
    }

    @Override
    public String toString() {
        return "ConfireTrees{treeTrank='" + getTreeTrank() + '\'' +
                ", branches='" + getBranches() + '\'' +
                ", typesOfLeaves=" + getTypeOfLeaves() +
                '}';
    }


}
