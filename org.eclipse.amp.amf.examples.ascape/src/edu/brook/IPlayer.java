package edu.brook;

/**
 * Player Java Implementation.
 * 
 * Generated by metaabm system: Nov 18, 2008 11:59:45 PM PST in project: org.metaabm.examples.ascape  */

public interface IPlayer {

	/**
	 * .
	 */

	public void intializeNonFramework();
	/**
	 * .
	 */

	public void moveToRandomLocation();
	/**
	 * .
	 */

	public void randomWalk();
	/**
	 * .
	 */

	public void playNeighbor();
	/**
	 * Increment the Age by One..
	 */

	public void updateAge();
	/**
	 * .
	 */

	public void fissionRule();
	/**
	 * .
	 */

	public void dieAtAge();
	/**
	 * .
	 */

	public void dieAtWealth0();
	/**
	 * Gets the Cooperate property for Player.
	 * @return 
	 */

	public boolean isCooperate();

	/**
	 * Sets the Cooperate property for Player.
	 * 
	 * @param _cooperate the new Cooperate value
	 */

	public void setCooperate(boolean _cooperate);
	/**
	 * Gets the Age property for Player.
	 * @return 
	 */

	public int getAge();

	/**
	 * Sets the Age property for Player.
	 * 
	 * @param _age the new Age value
	 */

	public void setAge(int _age);
	/**
	 * Gets the Wealth property for Player.
	 * @return 
	 */

	public int getWealth();

	/**
	 * Sets the Wealth property for Player.
	 * 
	 * @param _wealth the new Wealth value
	 */

	public void setWealth(int _wealth);
}