package change;

import graphic.GraphicComponent;

import java.awt.Rectangle;


public class BufferBounds implements Changeable
{
	Rectangle bounds;
	GraphicComponent gc;
	
	public BufferBounds(GraphicComponent gc)
	{
		this.gc = gc;
		bounds = gc.getBounds();
	}

	@Override
	public void restore()
	{
		Rectangle repaintBounds = gc.getBounds();
		gc.setBounds(bounds);
		gc.repaint();
		gc.getGraphicView().getScene().repaint(repaintBounds);
	}

}
