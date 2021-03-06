package org.metaabm.gen.test;

import org.apache.commons.lang.RandomStringUtils;

import repast.context.Context;
import repast.context.DefaultContext;
import repast.context.space.grid.GridFactoryFinder;

import repast.dataLoader.ContextBuilder;

import repast.engine.schedule.ScheduledMethod;

import repast.parameter.Parameter;

import repast.space.grid.Grid;
import repast.space.grid.GridAdder;
import repast.space.grid.GridBuilderParameters;
import repast.space.grid.SimpleGridAdder;
import repast.space.grid.StickyBorders;

import repast.util.ContextUtils;

/**
 * Generated Model Java Implementation.
 *
 *
 * Generated by metaabm system: Nov 1, 2007 5:24:34 PM PDT
 */
public class GeneratedModel extends DefaultContext implements ContextBuilder {

    /**
     *
     */
    private boolean someFlag = true;

    /**
     * The number of generated member agents to create.
     */
    private int generatedMemberAgentCount = 10;

    /**
     *
     */
    private int someInteger = 45;

    /**
     *
     */
    private double someFloat = 1.8;

    /**
     * The number of generated member agents to create.
     */
    private int generatedMemberAgentCountCopy;

    /**
     * The size of each dimension.
     */
    private int[] grid2DDimensions = new int[2];

    /**
     *
     */
    private Grid grid2D;
    private String uniqueID;

    /**
     * Constructs a new Generated Model.
     */
    public GeneratedModel() {
        createUniqueID();
    }

    /**
     * Builds and returns a context based on MetaABM generation for Repast. Building a context consists of filling it with
     * agents, adding projects and so forth. When this is called for the master context
     * the system will pass in a created context based on information given in the
     * model.score file. When called for subcontexts, each subcontext that was added
     * when the master context was built will be passed in.
     *
     * @param context
     * @return the built context.
     */
    public Context build(Context context) {

        //Agents are never actually added automatically
        GridAdder grid2DAdder = new SimpleGridAdder();
        GridBuilderParameters params =
            new GridBuilderParameters(new StickyBorders(), grid2DAdder, true,
                grid2DDimensions);
        grid2D = GridFactoryFinder.createGridFactory(null)
                                  .createGrid("Grid 2D", context, params);

        GeneratedMemberAgent.setGeneratedModel(this);
        for (int i = 0; i < generatedMemberAgentCount; i++) {
            GeneratedMemberAgent generatedMemberAgent =
                new GeneratedMemberAgent();
            context.add(generatedMemberAgent);
        }

        return context;
    }

    /**
     * .
     */
    @ScheduledMethod(start = 1, interval = 1, priority = 2)
    public void testFake() {
        final Context context = ContextUtils.getContext(this);

        assertFake();

    }

    /**
     * .
     */
    public void assertFake() {
    }

    /**
     * Gets the Some Flag property for Generated Model.
     * @return
     */
    @Parameter(displayName = "Some Flag", usageName = "someFlag", defaultValue = "true")
    public boolean isSomeFlag() {
        return someFlag;
    }

    /**
     * Sets the Some Flag property for Generated Model.
     *
     * @param _someFlag the new Some Flag value
     */
    public void setSomeFlag(boolean _someFlag) {
        someFlag = _someFlag;

    }

    /**
     * Gets the Generated Member Agent Count property for Generated Model.
     * @return The number of generated member agents to create.
     */
    @Parameter(displayName = "Generated Member Agent Count", usageName = "generatedMemberAgentCount", defaultValue = "10")
    public int getGeneratedMemberAgentCount() {
        return generatedMemberAgentCount;
    }

    /**
     * Sets the Generated Member Agent Count property for Generated Model.
     * The number of generated member agents to create.
     * @param _generatedMemberAgentCount the new Generated Member Agent Count value
     */
    public void setGeneratedMemberAgentCount(int _generatedMemberAgentCount) {
        generatedMemberAgentCount = _generatedMemberAgentCount;

    }

    /**
     * Gets the Some Integer property for Generated Model.
     * @return
     */
    @Parameter(displayName = "Some Integer", usageName = "someInteger", defaultValue = "45")
    public int getSomeInteger() {
        return someInteger;
    }

    /**
     * Sets the Some Integer property for Generated Model.
     *
     * @param _someInteger the new Some Integer value
     */
    public void setSomeInteger(int _someInteger) {
        someInteger = _someInteger;

    }

    /**
     * Gets the Some Float property for Generated Model.
     * @return
     */
    @Parameter(displayName = "Some Float", usageName = "someFloat", defaultValue = "1.8")
    public double getSomeFloat() {
        return someFloat;
    }

    /**
     * Sets the Some Float property for Generated Model.
     *
     * @param _someFloat the new Some Float value
     */
    public void setSomeFloat(double _someFloat) {
        someFloat = _someFloat;

    }

    /**
     * Gets the Generated Member Agent Count Copy property for Generated Model.
     * @return The number of generated member agents to create.
     */
    @Parameter(displayName = "Generated Member Agent Count Copy", usageName = "generatedMemberAgentCountCopy", defaultValue = "")
    public int getGeneratedMemberAgentCountCopy() {
        return generatedMemberAgentCountCopy;
    }

    /**
     * Sets the Generated Member Agent Count Copy property for Generated Model.
     * The number of generated member agents to create.
     * @param _generatedMemberAgentCountCopy the new Generated Member Agent Count Copy value
     */
    public void setGeneratedMemberAgentCountCopy(
        int _generatedMemberAgentCountCopy) {
        generatedMemberAgentCountCopy = _generatedMemberAgentCountCopy;

    }

    /**
     * Gets the Width property for Grid 2D.
     * @return The horizontal extent of the space.
     */
    @Parameter(displayName = "Grid 2D Width", usageName = "grid2DWidth", defaultValue = "")
    public int getGrid2DWidth() {
        return grid2DDimensions[0];
    }

    /**
     * Sets the Width property for Grid 2D.
     * The horizontal extent of the space.
     * @param _grid2DWidth the new Width value
     */
    public void setGrid2DWidth(int _grid2DWidth) {
        grid2DDimensions[0] = _grid2DWidth;

    }

    /**
     * Gets the Height property for Grid 2D.
     * @return The vertical extent of the space.
     */
    @Parameter(displayName = "Grid 2D Height", usageName = "grid2DHeight", defaultValue = "")
    public int getGrid2DHeight() {
        return grid2DDimensions[1];
    }

    /**
     * Sets the Height property for Grid 2D.
     * The vertical extent of the space.
     * @param _grid2DHeight the new Height value
     */
    public void setGrid2DHeight(int _grid2DHeight) {
        grid2DDimensions[1] = _grid2DHeight;

    }

    /**
     * Gets the Grid 2D property for Projection.
     * @return
     */
    public Grid getGrid2D() {
        return grid2D;
    }

    /**
     * Sets the Grid 2D property for Projection.
     *
     * @param _grid2D the new Grid 2D value
     */
    public void setGrid2D(Grid _grid2D) {
        grid2D = _grid2D;

    }

    public String getUID() {
        return uniqueID;
    }

    public String toString() {
        return "Generated Model " + uniqueID;
    }

    public void createUniqueID() {
        uniqueID = RandomStringUtils.randomAlphanumeric(5);
    }

    /**
     * Clones the agent, ensuring that a unique id is assigned.
     */
    public Object clone() {
        try {
            GeneratedModel clone = (GeneratedModel) super.clone();
            clone.createUniqueID();
            return clone;
        } catch (Exception e) {
            throw new RuntimeException("Unexpected cloning exception: " + e);
        }
    }
}
