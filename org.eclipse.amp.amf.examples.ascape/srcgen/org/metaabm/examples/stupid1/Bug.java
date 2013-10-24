package org.metaabm.examples.stupid1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import org.ascape.model.Agent;
import org.ascape.model.Cell;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.ascape.model.LocatedAgent;
import org.ascape.model.Scape;
import org.ascape.model.event.ScapeEvent;
import org.ascape.model.rule.Rule;
import org.ascape.model.rule.ExecuteThenUpdate;
import org.ascape.model.space.CollectionSpace;
import org.ascape.model.space.Coordinate;
import org.ascape.model.space.Coordinate2DDiscrete;
import org.ascape.model.space.Graph;
import org.ascape.model.space.Singleton;
import org.ascape.model.space.Location;
import org.ascape.util.Conditional;

import org.eclipse.amp.escape.runtime.extension.IAgentChild;

/**
 * <!-- begin-user-doc -->
 * Bug Java Implementation.
 * 
 * Generated by AMF for model: StupidModel1.metaabm in project: org.eclipse.amp.amf.examples.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public class Bug extends CellOccupant {

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
	 * Constructs a new Bug.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bug() {

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
			Bug clone = (Bug) super.clone();
			clone.uniqueID = 0;
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StupidModel1 getStupidModel1() {
		return (StupidModel1) getScape().getScape();
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return Color.LIGHT_GRAY;
	}
	/**
	 * <!-- begin-user-doc -->
	 * Initialize Initialization. Executed once at the beginning of each model run.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void intializeNonFramework() {
		Habitat randomHabitat = (Habitat) ((org.ascape.model.space.Discrete) getStupidModel1()
				.getGrid2D().getSpace()).findRandomAvailable();
		if (randomHabitat != null) {
			if (getHostScape() != ((Agent) randomHabitat).getScape()) {
				die();
				getStupidModel1().getBugScape().add(this);
			}
			moveTo(randomHabitat);
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * Bug Rule Rule. Executed every period.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bugRule() {
		Habitat nearbySpace = (Habitat) ((org.ascape.model.space.Discrete) getStupidModel1()
				.getGrid2D().getSpace()).findRandomAvailable(
				((org.ascape.model.CellOccupant) this).getHostCell(), null,
				false, getStupidModel1().getBugVision());
		if (nearbySpace != null) {
			if (getHostScape() != ((Agent) nearbySpace).getScape()) {
				die();
				getStupidModel1().getBugScape().add(this);
			}
			moveTo(nearbySpace);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		if (name == null) {
			return "Bug " + getUID();
		} else {
			return name;
		}
	}
}
