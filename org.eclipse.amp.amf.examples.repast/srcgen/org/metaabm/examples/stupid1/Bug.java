package org.metaabm.examples.stupid1;

/**
 * Bug Java Implementation.
 * 
 * Generated by metaabm system: Nov 2, 2009 8:54:42 PM PST in project: org.eclipse.amp.amf.examples.repast  */

public class Bug {

	/**
	 * Constructs a new Bug.
	 */

	public Bug() {
		createUniqueID();
	}

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
			Bug clone = (Bug) super.clone();
			clone.createUniqueID();
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	/**
	 * 
	 */

	private StupidModel1 stupidModel1List = null;

	/**
	 * Gets the StupidModel1 property for .
	 * @return 
	 */

	public StupidModel1 getStupidModel1() {
		return stupidModel1List;
	}

	/**
	 * Sets the StupidModel1 property for .
	 * 
	 * @param _stupidModel1 the new StupidModel1 value
	 */

	public void setStupidModel1(StupidModel1 _stupidModel1) {
		stupidModel1List = _stupidModel1;
	}

	public double randomInRange(double minValue, double maxValue) {
		return repast.simphony.random.RandomHelper.nextDoubleFromTo(minValue,
				maxValue);
	}

	public double randomToLimit(double maxValue) {
		return repast.simphony.random.RandomHelper.nextDoubleFromTo(0.0,
				maxValue);
	}

	public int randomToLimit(int maxValue) {
		return repast.simphony.random.RandomHelper.nextIntFromTo(0, maxValue);
	}
	/**
	 * .
	 */

	@repast.simphony.engine.schedule.ScheduledMethod(start = 0, interval = 0, priority = -0)
	public void intializeNonFramework() {

		final repast.simphony.context.Context context = repast.simphony.util.ContextUtils
				.getContext(this);

		final repast.simphony.space.grid.Grid grid2D = (repast.simphony.space.grid.Grid) context
				.getProjection("Grid 2D");

		{

			repast.simphony.query.Query<Object> randomHabitatAvailableQueryQuery = null;

			repast.simphony.query.Query<Object> randomHabitatAvailableQueryQueryAvailable = new repast.simphony.query.Query<Object>() {
				public java.lang.Iterable<Object> query() {

					return new repast.simphony.util.collections.FilteredIterator<Object>(
							context.iterator(),
							new org.apache.commons.collections15.Predicate() {
								public boolean evaluate(Object object) {

									repast.simphony.space.grid.GridPoint location = grid2D
											.getLocation(object);
									if (location != null) {
										java.util.Iterator locIter = grid2D
												.getObjectsAt(
														location
																.toIntArray(null))
												.iterator();
										if (locIter.hasNext()) {
											locIter.next();
											if (!locIter.hasNext()) {
												return true;
											}
										}
									}
									return false;

								}
							});

				}
				public java.lang.Iterable<Object> query(
						java.lang.Iterable<Object> other) {
					return new repast.simphony.util.collections.FilteredIterator<Object>(
							query().iterator(),
							repast.simphony.query.QueryUtils
									.createContains(other));
				}
			};

			randomHabitatAvailableQueryQuery = randomHabitatAvailableQueryQueryAvailable;

			java.util.Iterator randomHabitatAvailableQueryIter = randomHabitatAvailableQueryQuery
					.query().iterator();
			if (randomHabitatAvailableQueryIter.hasNext()) {
				java.util.List randomHabitatAvailableQueryList = org.apache.commons.collections15.IteratorUtils
						.toList(randomHabitatAvailableQueryIter);
				final Habitat randomHabitat = (Habitat) randomHabitatAvailableQueryList
						.get(repast.simphony.random.RandomHelper.nextIntFromTo(
								0, randomHabitatAvailableQueryList.size() - 1));

				int[] movetoHabitatinGrid2DLoc = grid2D.getLocation(
						randomHabitat).toIntArray(null);
				grid2D.moveTo(this, movetoHabitatinGrid2DLoc);

			}
		}

	}

	/**
	 * .
	 */

	@repast.simphony.engine.schedule.ScheduledMethod(start = 1, interval = 1, priority = -4)
	public void bugRule() {

		final repast.simphony.context.Context context = repast.simphony.util.ContextUtils
				.getContext(this);

		final repast.simphony.space.grid.Grid grid2D = (repast.simphony.space.grid.Grid) context
				.getProjection("Grid 2D");

		{

			repast.simphony.query.Query<Object> nearbySpace_HabitatAvailableAndHabitatWItin_Query = null;

			nearbySpace_HabitatAvailableAndHabitatWItin_Query = new repast.simphony.query.space.grid.MooreQuery(
					grid2D, this, getStupidModel1().getBugVision(),
					getStupidModel1().getBugVision());

			repast.simphony.query.Query<Object> nearbySpace_HabitatAvailableAndHabitatWItin_QueryAvailable = new repast.simphony.query.Query<Object>() {
				public java.lang.Iterable<Object> query() {

					return new repast.simphony.util.collections.FilteredIterator<Object>(
							context.iterator(),
							new org.apache.commons.collections15.Predicate() {
								public boolean evaluate(Object object) {

									repast.simphony.space.grid.GridPoint location = grid2D
											.getLocation(object);
									if (location != null) {
										java.util.Iterator locIter = grid2D
												.getObjectsAt(
														location
																.toIntArray(null))
												.iterator();
										if (locIter.hasNext()) {
											locIter.next();
											if (!locIter.hasNext()) {
												return true;
											}
										}
									}
									return false;

								}
							});

				}
				public java.lang.Iterable<Object> query(
						java.lang.Iterable<Object> other) {
					return new repast.simphony.util.collections.FilteredIterator<Object>(
							query().iterator(),
							repast.simphony.query.QueryUtils
									.createContains(other));
				}
			};

			nearbySpace_HabitatAvailableAndHabitatWItin_Query = new repast.simphony.query.AndQuery<Object>(
					nearbySpace_HabitatAvailableAndHabitatWItin_Query,
					nearbySpace_HabitatAvailableAndHabitatWItin_QueryAvailable);

			java.util.Iterator nearbySpace_HabitatAvailableAndHabitatWItin_Iter = nearbySpace_HabitatAvailableAndHabitatWItin_Query
					.query().iterator();
			if (nearbySpace_HabitatAvailableAndHabitatWItin_Iter.hasNext()) {
				java.util.List nearbySpace_HabitatAvailableAndHabitatWItin_List = org.apache.commons.collections15.IteratorUtils
						.toList(nearbySpace_HabitatAvailableAndHabitatWItin_Iter);
				final Habitat nearbySpace = (Habitat) nearbySpace_HabitatAvailableAndHabitatWItin_List
						.get(repast.simphony.random.RandomHelper.nextIntFromTo(
								0,
								nearbySpace_HabitatAvailableAndHabitatWItin_List
										.size() - 1));

				int[] movetoBuginGrid2DLoc = grid2D.getLocation(nearbySpace)
						.toIntArray(null);
				grid2D.moveTo(this, movetoBuginGrid2DLoc);

			}
		}

	}

}