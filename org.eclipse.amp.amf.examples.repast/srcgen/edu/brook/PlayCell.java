package edu.brook;

/**
 * Play Cell Java Implementation.
 * 
 * Generated by metaabm system: Nov 2, 2009 8:54:43 PM PST in project: org.eclipse.amp.amf.examples.repast  */

public class PlayCell {

	/**
	 * Constructs a new Play Cell.
	 */

	public PlayCell() {
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
			PlayCell clone = (PlayCell) super.clone();
			clone.createUniqueID();
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	/**
	 * 
	 */

	private DemographicPrisonersDilemma demographicPrisoner_sDilemmaList = null;

	/**
	 * Gets the Demographic Prisoner_s Dilemma property for .
	 * @return 
	 */

	public DemographicPrisonersDilemma getDemographicPrisoner_sDilemma() {
		return demographicPrisoner_sDilemmaList;
	}

	/**
	 * Sets the Demographic Prisoner_s Dilemma property for .
	 * 
	 * @param _demographicPrisoner_sDilemma the new Demographic Prisoner_s Dilemma value
	 */

	public void setDemographicPrisoner_sDilemma(
			DemographicPrisonersDilemma _demographicPrisoner_sDilemma) {
		demographicPrisoner_sDilemmaList = _demographicPrisoner_sDilemma;
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
}