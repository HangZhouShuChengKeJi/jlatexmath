package org.scilab.forge.jlatexmath.web.geom;

import com.google.gwt.core.client.JavaScriptObject;

import org.scilab.forge.jlatexmath.share.platform.geom.Rectangle2D;
import org.scilab.forge.jlatexmath.share.platform.geom.Shape;
import org.scilab.forge.jlatexmath.web.graphics.JLMContext2d;

/**
 * 
 * Wrapper for Opentype.js Glyph
 *
 */
public class ShapeW implements Shape {

	private JavaScriptObject outline;
	private Rectangle2D rect;

	// translate (tx,ty) when drawing
	private double tx = 0;
	private double ty = 0;

	public ShapeW(JavaScriptObject outline, Rectangle2D rect) {
		this.outline = outline;
		this.rect = rect;
	}

	public void fill(JLMContext2d ctx) {
		ctx.translate2(tx, ty);
		ctx.fillOpentype(outline);
		ctx.translate2(-tx, -ty);
	}

	@Override
	public Rectangle2D getBounds2DX() {
		return rect;
	}

	public void translate(double x, double y) {
		tx += x;
		ty += y;

	}

}
