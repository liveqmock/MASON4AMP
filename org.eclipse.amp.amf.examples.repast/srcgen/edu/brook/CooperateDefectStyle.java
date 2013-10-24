package edu.brook;

/**
 * Cooperate Defect Style Java Implementation.
 * 
 * Generated by metaabm system: Nov 2, 2009 8:54:43 PM PST in project: org.eclipse.amp.amf.examples.repast  */

public class CooperateDefectStyle
		extends
			repast.simphony.visualization.visualization2D.style.DefaultStyle2D {

	public static final java.awt.Shape SHAPE_OVAL = new java.awt.geom.Ellipse2D.Double(
			0, 0, 10, 10);
	public static final java.awt.Shape SHAPE_RECT = new java.awt.geom.Rectangle2D.Double(
			0, 0, 10, 10);
	public static final java.awt.Shape SHAPE_MARKER = new java.awt.geom.Rectangle2D.Double(
			0, 0, 5, 5);

	java.awt.Shape shape = SHAPE_RECT;

	public void updateValues(Object object) {

		setBounds(new java.awt.Rectangle(0, 0, 9, 9));

		Player playerRule = (Player) object;
		if (playerRule.isCooperate()) {

			java.awt.Color playerRuleColorBlue = java.awt.Color.BLUE

			;

			setPaint(playerRuleColorBlue);

			java.awt.Shape playerRuleShapeOval = SHAPE_OVAL;

			shape = playerRuleShapeOval;

		}

		if (!(playerRule.isCooperate())) {

			java.awt.Color playerRuleColorRed = java.awt.Color.RED

			;

			setPaint(playerRuleColorRed);

			java.awt.Shape playerRuleShapeOval = SHAPE_OVAL;

			shape = playerRuleShapeOval;

		}

	}
	public edu.umd.cs.piccolo.PNode getPNode(Object object,
			edu.umd.cs.piccolo.PNode node) {
		updateValues(object);
		edu.umd.cs.piccolo.nodes.PPath path = new edu.umd.cs.piccolo.nodes.PPath(
				shape);
		path.setBounds(getBounds(object));
		return path;
	}
	public java.awt.Paint getPaint(Object object) {
		updateValues(object);
		return super.getPaint(object);
	}
}
