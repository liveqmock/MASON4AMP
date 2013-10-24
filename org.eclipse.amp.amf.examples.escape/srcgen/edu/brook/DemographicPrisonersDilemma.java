package edu.brook;

import org.eclipse.amp.escape.runtime.extension.IAgentChild;

/**
 * <!-- begin-user-doc -->
 * Demographic Prisoner_s Dilemma Java Implementation.
 * 
 * Generated by AMF for model: DemographicPrisoner_sDilemma.metaabm in project: org.eclipse.amp.amf.examples.escape 
 * <!-- end-user-doc -->
 * @generated
 */
public class DemographicPrisonersDilemma {

	/**
	 * <!-- begin-user-doc -->
	 * The number of players to create.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int playerCount = 100;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int minimumWealth = 20;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int maximumWealth = 100;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int maximumAge = 100;
	/**
	 * <!-- begin-user-doc -->
	 * The change in wealth for a player when playing cooperate against cooperate.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int payoffCC = 2;
	/**
	 * <!-- begin-user-doc -->
	 * The change in wealth for a player when playing cooperate against defect.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int payoffCD = -6;
	/**
	 * <!-- begin-user-doc -->
	 * The change in wealth for a player when playing defect against cooperate.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int payoffDC = 6;
	/**
	 * <!-- begin-user-doc -->
	 * The change in wealth for a player when both players defect.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int payoffDD = -5;
	/**
	 * <!-- begin-user-doc -->
	 * The wealth level at which an agent can fission.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int fissionWealth = 11;
	/**
	 * <!-- begin-user-doc -->
	 * The wealth that is passed from parent to child.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int inheiritedWealth = 6;
	/**
	 * <!-- begin-user-doc -->
	 * The wealth initially assigned to an agent at the beginning of model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int initialWealth = 6;
	/**
	 * <!-- begin-user-doc -->
	 * The probabaility that a given agent will change strategies in a given period, expressed as a value from 0.0 to 1.0.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private double mutationRate = .1;
	/**
	 * <!-- begin-user-doc -->
	 * The number of periods before an agent will be removed from game when Die At Age rule is active.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int deathAge = 100;
	/**
	 * <!-- begin-user-doc -->
	 * The actual age in years as determined by data set.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int birthAge = 0;
	/**
	 * <!-- begin-user-doc -->
	 * The size of each dimension.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int[] gameSpaceDimensions = new int[2];
	/**
	 * <!-- begin-user-doc -->
	 * The horizontal extent of the space.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int gameSpaceWidth = 20;
	/**
	 * <!-- begin-user-doc -->
	 * The vertical extent of the space.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private int gameSpaceHeight = 20;
	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Object gameSpace = null;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private List<IAgentChild> children;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IAgentChild> getChildren() {
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Constructs a new Demographic Prisoner_s Dilemma.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemographicPrisonersDilemma() {

		children = new ArrayList<IAgentChild>();

	}
	//todo, make this a useful value for evaluating compatibility of different versions of generated classes

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 89989998L;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static long nextUniqueID;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private long uniqueID;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUID() {
		if (uniqueID == 0) {
			uniqueID = nextUniqueID++;
		}
		return uniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Clones the agent, ensuring that a unique id is assigned.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object clone() {
		try {
			DemographicPrisonersDilemma clone = (DemographicPrisonersDilemma) super
					.clone();
			clone.uniqueID = 0;
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Player Count property for Demographic Prisoner_s Dilemma.
	 * @return The number of players to create.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPlayerCount() {
		return playerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Player Count property for Demographic Prisoner_s Dilemma.
	 * The number of players to create.
	 * @param _playerCount the new Player Count value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayerCount(int _playerCount) {
		playerCount = _playerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Minimum Wealth property for Demographic Prisoner_s Dilemma.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinimumWealth() {
		return minimumWealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Minimum Wealth property for Demographic Prisoner_s Dilemma.
	 * 
	 * @param _minimumWealth the new Minimum Wealth value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumWealth(int _minimumWealth) {
		minimumWealth = _minimumWealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Maximum Wealth property for Demographic Prisoner_s Dilemma.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumWealth() {
		return maximumWealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Maximum Wealth property for Demographic Prisoner_s Dilemma.
	 * 
	 * @param _maximumWealth the new Maximum Wealth value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumWealth(int _maximumWealth) {
		maximumWealth = _maximumWealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Maximum Age property for Demographic Prisoner_s Dilemma.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumAge() {
		return maximumAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Maximum Age property for Demographic Prisoner_s Dilemma.
	 * 
	 * @param _maximumAge the new Maximum Age value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumAge(int _maximumAge) {
		maximumAge = _maximumAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Payoff Cooperate Cooperate property for Demographic Prisoner_s Dilemma.
	 * @return The change in wealth for a player when playing cooperate against cooperate.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPayoffCC() {
		return payoffCC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Payoff Cooperate Cooperate property for Demographic Prisoner_s Dilemma.
	 * The change in wealth for a player when playing cooperate against cooperate.
	 * @param _payoffCC the new Payoff Cooperate Cooperate value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayoffCC(int _payoffCC) {
		payoffCC = _payoffCC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Payoff Cooperate Defect property for Demographic Prisoner_s Dilemma.
	 * @return The change in wealth for a player when playing cooperate against defect.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPayoffCD() {
		return payoffCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Payoff Cooperate Defect property for Demographic Prisoner_s Dilemma.
	 * The change in wealth for a player when playing cooperate against defect.
	 * @param _payoffCD the new Payoff Cooperate Defect value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayoffCD(int _payoffCD) {
		payoffCD = _payoffCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Payoff Defect Cooperate property for Demographic Prisoner_s Dilemma.
	 * @return The change in wealth for a player when playing defect against cooperate.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPayoffDC() {
		return payoffDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Payoff Defect Cooperate property for Demographic Prisoner_s Dilemma.
	 * The change in wealth for a player when playing defect against cooperate.
	 * @param _payoffDC the new Payoff Defect Cooperate value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayoffDC(int _payoffDC) {
		payoffDC = _payoffDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Payoff Defect Defect property for Demographic Prisoner_s Dilemma.
	 * @return The change in wealth for a player when both players defect.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPayoffDD() {
		return payoffDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Payoff Defect Defect property for Demographic Prisoner_s Dilemma.
	 * The change in wealth for a player when both players defect.
	 * @param _payoffDD the new Payoff Defect Defect value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayoffDD(int _payoffDD) {
		payoffDD = _payoffDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Fission Wealth property for Demographic Prisoner_s Dilemma.
	 * @return The wealth level at which an agent can fission.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFissionWealth() {
		return fissionWealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Fission Wealth property for Demographic Prisoner_s Dilemma.
	 * The wealth level at which an agent can fission.
	 * @param _fissionWealth the new Fission Wealth value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFissionWealth(int _fissionWealth) {
		fissionWealth = _fissionWealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Inheirited Wealth property for Demographic Prisoner_s Dilemma.
	 * @return The wealth that is passed from parent to child.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInheiritedWealth() {
		return inheiritedWealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Inheirited Wealth property for Demographic Prisoner_s Dilemma.
	 * The wealth that is passed from parent to child.
	 * @param _inheiritedWealth the new Inheirited Wealth value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheiritedWealth(int _inheiritedWealth) {
		inheiritedWealth = _inheiritedWealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Initial Wealth property for Demographic Prisoner_s Dilemma.
	 * @return The wealth initially assigned to an agent at the beginning of model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialWealth() {
		return initialWealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Initial Wealth property for Demographic Prisoner_s Dilemma.
	 * The wealth initially assigned to an agent at the beginning of model run.
	 * @param _initialWealth the new Initial Wealth value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialWealth(int _initialWealth) {
		initialWealth = _initialWealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Mutation Rate property for Demographic Prisoner_s Dilemma.
	 * @return The probabaility that a given agent will change strategies in a given period, expressed as a value from 0.0 to 1.0.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMutationRate() {
		return mutationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Mutation Rate property for Demographic Prisoner_s Dilemma.
	 * The probabaility that a given agent will change strategies in a given period, expressed as a value from 0.0 to 1.0.
	 * @param _mutationRate the new Mutation Rate value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutationRate(double _mutationRate) {
		mutationRate = _mutationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Death Age property for Demographic Prisoner_s Dilemma.
	 * @return The number of periods before an agent will be removed from game when Die At Age rule is active.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeathAge() {
		return deathAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Death Age property for Demographic Prisoner_s Dilemma.
	 * The number of periods before an agent will be removed from game when Die At Age rule is active.
	 * @param _deathAge the new Death Age value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeathAge(int _deathAge) {
		deathAge = _deathAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Birth Age property for Demographic Prisoner_s Dilemma.
	 * @return The actual age in years as determined by data set.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBirthAge() {
		return birthAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Birth Age property for Demographic Prisoner_s Dilemma.
	 * The actual age in years as determined by data set.
	 * @param _birthAge the new Birth Age value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthAge(int _birthAge) {
		birthAge = _birthAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Dimensions property for Game Space.
	 * @return The size of each dimension.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] getGameSpaceDimensions() {
		return gameSpaceDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Dimensions property for Game Space.
	 * The size of each dimension.
	 * @param _gameSpaceDimensions the new Dimensions value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameSpaceDimensions(int[] _gameSpaceDimensions) {
		gameSpaceDimensions = _gameSpaceDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Width property for Game Space.
	 * @return The horizontal extent of the space.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGameSpaceWidth() {
		return gameSpaceWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Width property for Game Space.
	 * The horizontal extent of the space.
	 * @param _gameSpaceWidth the new Width value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameSpaceWidth(int _gameSpaceWidth) {
		gameSpaceWidth = _gameSpaceWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Height property for Game Space.
	 * @return The vertical extent of the space.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGameSpaceHeight() {
		return gameSpaceHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Height property for Game Space.
	 * The vertical extent of the space.
	 * @param _gameSpaceHeight the new Height value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameSpaceHeight(int _gameSpaceHeight) {
		gameSpaceHeight = _gameSpaceHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Gets the Game Space property for Demographic Prisoner_s Dilemma.
	 * @return 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getGameSpace() {
		return gameSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets the Game Space property for Demographic Prisoner_s Dilemma.
	 * 
	 * @param _gameSpace the new Game Space value
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameSpace(Object _gameSpace) {
		gameSpace = _gameSpace;
	}

}
