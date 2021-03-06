package org.eclipse.amp.amf.examples.escape;

/**
 * WikiExample Java Implementation.
 * 
 * Generated by metaabm system: Nov 2, 2009 8:54:38 PM PST in project: org.eclipse.amp.amf.examples.repast  */

public class WikiExample extends repast.simphony.context.DefaultContext
		implements
			repast.simphony.dataLoader.ContextBuilder {

	/**
	 * The number of individuals to create.
	 */

	private int individualCount = 0;
	/**
	 * The number of blocks to create.
	 */

	private int blockCount = 0;
	/**
	 * The size of each dimension.
	 */

	private int[] cityDimensions = new int[2];
	/**
	 * 
	 */

	private repast.simphony.space.grid.Grid city = null;
	/**
	 * Constructs a new WikiExample.
	 */

	public WikiExample() {
		createUniqueID();
		setCityWidth(20);
		setCityHeight(20);
	}

	repast.simphony.context.Context buildContext;

	//todo, make this a useful value for evaluating compatibility of different versions of generated classes
	private static final long serialVersionUID = 89989998L;

	private String uniqueID;

	public String getUID() {
		return uniqueID;
	}

	public void createUniqueID() {
		//uniqueID = org.apache.commons.lang.RandomStringUtils.randomAlphanumeric(5);
	}

	/**
	 * Clones the agent, ensuring that a unique id is assigned.
	 */
	public Object clone() {
		try {
			WikiExample clone = (WikiExample) super.clone();
			clone.createUniqueID();
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
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

		Individual createIndividuals = null;
		for (int i = 0; i < getIndividualCount(); i++) {
			createIndividuals = new Individual();
			context.add(createIndividuals);

			createIndividuals.setWikiExample(this);

		}

		//Agents are never actually added automatically
		repast.simphony.space.grid.GridAdder buildGrid2DAdder = new repast.simphony.space.grid.RandomGridAdder();
		repast.simphony.space.grid.GridBuilderParameters params = new repast.simphony.space.grid.GridBuilderParameters(
				new repast.simphony.space.grid.StickyBorders(),
				buildGrid2DAdder, true, cityDimensions);
		city = repast.simphony.context.space.grid.GridFactoryFinder
				.createGridFactory(null).createGrid("City", context, params);

		repast.simphony.space.grid.GridDimensions dims = city.getDimensions();

		for (int d0 = 0; d0 < dims.getDimension(0); d0++) {

			for (int d1 = 0; d1 < dims.getDimension(1); d1++) {

				int[] nextLoc = {

				d0, d1};
				org.eclipse.amp.amf.examples.escape.Block block = new org.eclipse.amp.amf.examples.escape.Block();
				context.add(block);
				city.moveTo(block, nextLoc);

			}
		}

		return context;
	}

	/**
	 * Gets the Individual Count property for WikiExample.
	 * @return The number of individuals to create.
	 */

	@repast.simphony.parameter.Parameter(displayName = "Individual Count", usageName = "individualCount", defaultValue = "0")
	public int getIndividualCount() {
		return individualCount;
	}

	/**
	 * Sets the Individual Count property for WikiExample.
	 * The number of individuals to create.
	 * @param _individualCount the new Individual Count value
	 */

	public void setIndividualCount(int _individualCount) {
		individualCount = _individualCount;
	}

	/**
	 * Gets the Block Count property for WikiExample.
	 * @return The number of blocks to create.
	 */

	@repast.simphony.parameter.Parameter(displayName = "Block Count", usageName = "blockCount", defaultValue = "0")
	public int getBlockCount() {
		return blockCount;
	}

	/**
	 * Sets the Block Count property for WikiExample.
	 * The number of blocks to create.
	 * @param _blockCount the new Block Count value
	 */

	public void setBlockCount(int _blockCount) {
		blockCount = _blockCount;
	}

	/**
	 * Gets the Dimensions property for City.
	 * @return The size of each dimension.
	 */

	public int[] getCityDimensions() {
		return cityDimensions;
	}

	/**
	 * Sets the Dimensions property for City.
	 * The size of each dimension.
	 * @param _cityDimensions the new Dimensions value
	 */

	public void setCityDimensions(int[] _cityDimensions) {
		cityDimensions = _cityDimensions;
	}

	/**
	 * Gets the Width property for City.
	 * @return The horizontal extent of the space.
	 */

	@repast.simphony.parameter.Parameter(displayName = "City Width", usageName = "cityWidth", defaultValue = "20")
	public int getCityWidth() {
		return cityDimensions[0];
	}

	/**
	 * Sets the Width property for City.
	 * The horizontal extent of the space.
	 * @param _cityWidth the new Width value
	 */

	public void setCityWidth(int _cityWidth) {
		cityDimensions[0] = _cityWidth;
	}

	/**
	 * Gets the Height property for City.
	 * @return The vertical extent of the space.
	 */

	@repast.simphony.parameter.Parameter(displayName = "City Height", usageName = "cityHeight", defaultValue = "20")
	public int getCityHeight() {
		return cityDimensions[1];
	}

	/**
	 * Sets the Height property for City.
	 * The vertical extent of the space.
	 * @param _cityHeight the new Height value
	 */

	public void setCityHeight(int _cityHeight) {
		cityDimensions[1] = _cityHeight;
	}

	/**
	 * Gets the City property for WikiExample.
	 * @return 
	 */

	public repast.simphony.space.grid.Grid getCity() {
		return city;
	}

	/**
	 * Sets the City property for WikiExample.
	 * 
	 * @param _city the new City value
	 */

	public void setCity(repast.simphony.space.grid.Grid _city) {
		city = _city;
	}

}
