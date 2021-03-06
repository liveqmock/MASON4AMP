package org.metaabm.gen.test;

/**
 * Spatial Model Java Implementation.
 * 
 * Generated by metaabm system: May 13, 2009 11:53:49 AM PDT in project: org.metaabm.gen.repast.test  (testing) */

import static org.junit.Assert.*;

public class SpatialModel extends repast.simphony.context.DefaultContext
		implements
			repast.simphony.dataLoader.ContextBuilder,
			ISpatialModel {

	/**
	 * The number of complex movement agents to create.
	 */

	private int complexMovementAgentCount = 1;
	/**
	 * The number of complex locations to create.
	 */

	private int complexLocationCount = 0;
	/**
	 * The number of spatial model agents to create.
	 */

	private int spatialModelAgentCount = 0;
	/**
	 * 
	 */

	private double[] goodBoundary = {1, 1, 4, 4};
	/**
	 * The size of each dimension.
	 */

	private int[] grid2DDimensions = new int[2];
	/**
	 * 
	 */

	private repast.simphony.space.grid.Grid grid2D = null;
	/**
	 * 
	 */

	private repast.simphony.space.graph.Network complexNet = null;
	/**
	 * Constructs a new Spatial Model.
	 */

	public SpatialModel() {
		createUniqueID();
		setGrid2DWidth(20);
		setGrid2DHeight(20);
	}

	repast.simphony.context.Context buildContext;

	//todo, make this a useful value for evaluating compatibility of different versions of generated classes
	private static final long serialVersionUID = 89989998L;

	private String uniqueID;

	public String getUID() {
		return uniqueID;
	}

	public void createUniqueID() {
		uniqueID = org.apache.commons.lang.RandomStringUtils
				.randomAlphanumeric(5);
	}

	/**
	 * Clones the agent, ensuring that a unique id is assigned.
	 */
	public Object clone() {
		try {
			SpatialModel clone = (SpatialModel) super.clone();
			clone.createUniqueID();
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	@org.junit.Test
	public void dummy() {
		assertTrue(true);
	}

	public repast.simphony.context.Context getContext() {
		return buildContext;
	}

	/**
	 * Builds and returns a context based on MetaABM generation for repast.simphony. Building a context consists of filling it with
	 * agents, adding projects and so forth. When this is called for the master context
	 * the system will pass in a created context based on information given in the
	 * model.score file. When called for subcontexts, each subcontext that was added
	 * when the master context was built will be passed in.
	 *
	 * @param context
	 * @return the built context.
	 */
	public repast.simphony.context.Context build(
			repast.simphony.context.Context context) {
		this.buildContext = context;

		ComplexMovementAgent createComplexMovementAgents = null;
		for (int i = 0; i < getComplexMovementAgentCount(); i++) {
			createComplexMovementAgents = new ComplexMovementAgent();
			context.add(createComplexMovementAgents);

			createComplexMovementAgents.setSpatialModel(this);

		}

		ComplexLocation createComplexLocations = null;
		for (int i = 0; i < getComplexLocationCount(); i++) {
			createComplexLocations = new ComplexLocation();
			context.add(createComplexLocations);

			createComplexLocations.setSpatialModel(this);

		}

		//Agents are never actually added automatically
		repast.simphony.space.grid.GridAdder buildGridAdder = new repast.simphony.space.grid.RandomGridAdder();
		repast.simphony.space.grid.GridBuilderParameters params = new repast.simphony.space.grid.GridBuilderParameters(
				new repast.simphony.space.grid.StickyBorders(), buildGridAdder,
				true, grid2DDimensions);
		grid2D = repast.simphony.context.space.grid.GridFactoryFinder
				.createGridFactory(null).createGrid("Grid 2D", context, params);

		repast.simphony.space.grid.GridDimensions dims = grid2D.getDimensions();

		for (int d0 = 0; d0 < dims.getDimension(0); d0++) {

			for (int d1 = 0; d1 < dims.getDimension(1); d1++) {

				int[] nextLoc = {

				d0, d1};
				org.metaabm.gen.test.ComplexLocation complexLocation = new org.metaabm.gen.test.ComplexLocation();
				context.add(complexLocation);
				grid2D.moveTo(complexLocation, nextLoc);

			}
		}

		complexNet = repast.simphony.context.space.graph.NetworkFactoryFinder
				.createNetworkFactory(null).createNetwork("Complex Net",
						context, false);
		return context;
	}

	/**
	 * Gets the Complex Movement Agent Count property for Spatial Model.
	 * @return The number of complex movement agents to create.
	 */

	@repast.simphony.parameter.Parameter(displayName = "Complex Movement Agent Count", usageName = "complexMovementAgentCount", defaultValue = "1")
	public int getComplexMovementAgentCount() {
		return complexMovementAgentCount;
	}

	/**
	 * Sets the Complex Movement Agent Count property for Spatial Model.
	 * The number of complex movement agents to create.
	 * @param _complexMovementAgentCount the new Complex Movement Agent Count value
	 */

	public void setComplexMovementAgentCount(int _complexMovementAgentCount) {
		complexMovementAgentCount = _complexMovementAgentCount;
	}

	/**
	 * Gets the Complex Location Count property for Spatial Model.
	 * @return The number of complex locations to create.
	 */

	@repast.simphony.parameter.Parameter(displayName = "Complex Location Count", usageName = "complexLocationCount", defaultValue = "0")
	public int getComplexLocationCount() {
		return complexLocationCount;
	}

	/**
	 * Sets the Complex Location Count property for Spatial Model.
	 * The number of complex locations to create.
	 * @param _complexLocationCount the new Complex Location Count value
	 */

	public void setComplexLocationCount(int _complexLocationCount) {
		complexLocationCount = _complexLocationCount;
	}

	/**
	 * Gets the Spatial Model Agent Count property for Spatial Model.
	 * @return The number of spatial model agents to create.
	 */

	@repast.simphony.parameter.Parameter(displayName = "Spatial Model Agent Count", usageName = "spatialModelAgentCount", defaultValue = "0")
	public int getSpatialModelAgentCount() {
		return spatialModelAgentCount;
	}

	/**
	 * Sets the Spatial Model Agent Count property for Spatial Model.
	 * The number of spatial model agents to create.
	 * @param _spatialModelAgentCount the new Spatial Model Agent Count value
	 */

	public void setSpatialModelAgentCount(int _spatialModelAgentCount) {
		spatialModelAgentCount = _spatialModelAgentCount;
	}

	/**
	 * Gets the Good Boundary property for Spatial Model.
	 * @return 
	 */

	public double[] getGoodBoundary() {
		return goodBoundary;
	}

	/**
	 * Sets the Good Boundary property for Spatial Model.
	 * 
	 * @param _goodBoundary the new Good Boundary value
	 */

	public void setGoodBoundary(double[] _goodBoundary) {
		goodBoundary = _goodBoundary;
	}

	/**
	 * Gets the Dimensions property for Grid 2D.
	 * @return The size of each dimension.
	 */

	public int[] getGrid2DDimensions() {
		return grid2DDimensions;
	}

	/**
	 * Sets the Dimensions property for Grid 2D.
	 * The size of each dimension.
	 * @param _grid2DDimensions the new Dimensions value
	 */

	public void setGrid2DDimensions(int[] _grid2DDimensions) {
		grid2DDimensions = _grid2DDimensions;
	}

	/**
	 * Gets the Width property for Grid 2D.
	 * @return The horizontal extent of the space.
	 */

	@repast.simphony.parameter.Parameter(displayName = "Grid 2D Width", usageName = "grid2DWidth", defaultValue = "20")
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

	@repast.simphony.parameter.Parameter(displayName = "Grid 2D Height", usageName = "grid2DHeight", defaultValue = "20")
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
	 * Gets the Grid 2D property for Spatial Model.
	 * @return 
	 */

	public repast.simphony.space.grid.Grid getGrid2D() {
		return grid2D;
	}

	/**
	 * Sets the Grid 2D property for Spatial Model.
	 * 
	 * @param _grid2D the new Grid 2D value
	 */

	public void setGrid2D(repast.simphony.space.grid.Grid _grid2D) {
		grid2D = _grid2D;
	}

	/**
	 * Gets the Complex Net property for Spatial Model.
	 * @return 
	 */

	public repast.simphony.space.graph.Network getComplexNet() {
		return complexNet;
	}

	/**
	 * Sets the Complex Net property for Spatial Model.
	 * 
	 * @param _complexNet the new Complex Net value
	 */

	public void setComplexNet(repast.simphony.space.graph.Network _complexNet) {
		complexNet = _complexNet;
	}

}
