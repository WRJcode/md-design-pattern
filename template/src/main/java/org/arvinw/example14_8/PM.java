package org.arvinw.example14_8;

public abstract class PM {

    public abstract String analyze();

    public abstract String design(String project);

    public abstract String develop(String project);

    public abstract boolean test(String project);

    public abstract void release(String project);

    protected final void kickoff(){
        String requirement = analyze();
        String designCode = design(requirement);
        do {
            designCode = develop(designCode);
        } while(!test(designCode));
        release(designCode);
    }
}
