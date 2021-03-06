package org.eclipse.amp.amf.examples.escape;

/**
 * Individual Java Implementation.
 * 
 * Generated by metaabm system: Nov 2, 2009 8:54:39 PM PST in project: org.eclipse.amp.amf.examples.repast  */

public class Individual {

	/**
	 * 
	 */

	private int age = 0;
	/**
	 * 
	 */

	private int wealth = 0;
	/**
	 * 
	 */

	private int vision = 5;
	/**
	 * Constructs a new Individual.
	 */

	public Individual() {
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
			Individual clone = (Individual) super.clone();
			clone.createUniqueID();
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	/**
	 * 
	 */

	private WikiExample wikiExampleList = null;

	/**
	 * Gets the WikiExample property for .
	 * @return 
	 */

	public WikiExample getWikiExample() {
		return wikiExampleList;
	}

	/**
	 * Sets the WikiExample property for .
	 * 
	 * @param _wikiExample the new WikiExample value
	 */

	public void setWikiExample(WikiExample _wikiExample) {
		wikiExampleList = _wikiExample;
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

	@repast.simphony.engine.schedule.ScheduledMethod(start = 1, interval = 1, priority = -0)
	public void findPartner() {

		final repast.simphony.context.Context context = repast.simphony.util.ContextUtils
				.getContext(this);

		final repast.simphony.space.grid.Grid city = (repast.simphony.space.grid.Grid) context
				.getProjection("City");

		{

			repast.simphony.query.Query<Object> partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_QueryCondition = new repast.simphony.query.Query<Object>() {
				public java.lang.Iterable<Object> query() {

					return new repast.simphony.util.collections.FilteredIterator<Object>(
							context.iterator(),
							new org.apache.commons.collections15.Predicate() {
								public boolean evaluate(Object object) {

									if (object instanceof Individual) {
										Individual partner = (Individual) object;
										return (partner.getAge() == partner
												.getAge());
									} else {
										return false;
									}

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

			repast.simphony.query.Query<Object> partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_Query = null;

			partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_Query = new repast.simphony.query.space.grid.GridWithin(
					city, this, partner.getVision());

			partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_Query = new repast.simphony.query.AndQuery<Object>(
					partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_Query,
					partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_QueryCondition);

			java.util.Iterator partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_Iter = partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_Query
					.query().iterator();
			if (partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_Iter
					.hasNext()) {
				java.util.List partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_List = org.apache.commons.collections15.IteratorUtils
						.toList(partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_Iter);
				final Individual partner = (Individual) partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_List
						.get(repast.simphony.random.RandomHelper.nextIntFromTo(
								0,
								partner_AgeIdenticalAgeQueryOrWithin_Vision_Query_List
										.size() - 1));

				{

					repast.simphony.query.Query<Object> partnerNeighbor_AvailableQueryOrNeighborQuery_Query = null;

					partnerNeighbor_AvailableQueryOrNeighborQuery_Query = new repast.simphony.query.space.grid.GridWithin(
							city, this, 1);

					repast.simphony.query.Query<Object> partnerNeighbor_AvailableQueryOrNeighborQuery_QueryAvailable = new repast.simphony.query.Query<Object>() {
						public java.lang.Iterable<Object> query() {

							return new repast.simphony.util.collections.FilteredIterator<Object>(
									context.iterator(),
									new org.apache.commons.collections15.Predicate() {
										public boolean evaluate(Object object) {

											repast.simphony.space.grid.GridPoint location = city
													.getLocation(object);
											if (location != null) {
												java.util.Iterator locIter = city
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

					partnerNeighbor_AvailableQueryOrNeighborQuery_Query = new repast.simphony.query.AndQuery<Object>(
							partnerNeighbor_AvailableQueryOrNeighborQuery_Query,
							partnerNeighbor_AvailableQueryOrNeighborQuery_QueryAvailable);

					java.util.Iterator partnerNeighbor_AvailableQueryOrNeighborQuery_Iter = partnerNeighbor_AvailableQueryOrNeighborQuery_Query
							.query().iterator();
					if (partnerNeighbor_AvailableQueryOrNeighborQuery_Iter
							.hasNext()) {
						java.util.List partnerNeighbor_AvailableQueryOrNeighborQuery_List = org.apache.commons.collections15.IteratorUtils
								.toList(partnerNeighbor_AvailableQueryOrNeighborQuery_Iter);
						final Block partnerNeighbor = (Block) partnerNeighbor_AvailableQueryOrNeighborQuery_List
								.get(repast.simphony.random.RandomHelper
										.nextIntFromTo(0,
												partnerNeighbor_AvailableQueryOrNeighborQuery_List
														.size() - 1));

						int[] moveIndividualLoc = city.getLocation(
								partnerNeighbor).toIntArray(null);
						city.moveTo(this, moveIndividualLoc);

					}
				}

			}
		}

	}

	/**
	 * Gets the Age property for Individual.
	 * @return 
	 */

	@repast.simphony.parameter.Parameter(displayName = "Age", usageName = "age", defaultValue = "0")
	public int getAge() {
		return age;
	}

	/**
	 * Sets the Age property for Individual.
	 * 
	 * @param _age the new Age value
	 */

	public void setAge(int _age) {
		age = _age;
	}

	/**
	 * Gets the Wealth property for Individual.
	 * @return 
	 */

	@repast.simphony.parameter.Parameter(displayName = "Wealth", usageName = "wealth", defaultValue = "0")
	public int getWealth() {
		return wealth;
	}

	/**
	 * Sets the Wealth property for Individual.
	 * 
	 * @param _wealth the new Wealth value
	 */

	public void setWealth(int _wealth) {
		wealth = _wealth;
	}

	/**
	 * Gets the Vision property for Individual.
	 * @return 
	 */

	@repast.simphony.parameter.Parameter(displayName = "Vision", usageName = "vision", defaultValue = "5")
	public int getVision() {
		return vision;
	}

	/**
	 * Sets the Vision property for Individual.
	 * 
	 * @param _vision the new Vision value
	 */

	public void setVision(int _vision) {
		vision = _vision;
	}

}
