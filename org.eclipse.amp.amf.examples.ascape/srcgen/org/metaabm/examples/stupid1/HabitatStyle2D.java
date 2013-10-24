package org.metaabm.examples.stupid1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import org.ascape.util.vis.DrawFeature;

import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;

/**
 * <!-- begin-user-doc -->
 * Habitat Style 2D Java Implementation.
 * 
 * Generated by AMF for model: StupidModel1.metaabm in project: org.eclipse.amp.amf.examples.ascape 
 * <!-- end-user-doc -->
 * @generated
 */
public class HabitatStyle2D extends DrawFeature {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void draw(Graphics g, Object object, int width, int height) {
		Shape shape = null;
		Habitat rootActGroup = (Habitat) object;
		Habitat habitatRule = rootActGroup;
		java.awt.Color habitatRuleColorGreen = java.awt.Color.GREEN

		;

		g.setColor(habitatRuleColorGreen);
		shape = new Rectangle2D.Double(0, 0, width, height);
		((Graphics2D) g).fill(shape);
	}
}
