package com.company.composite_pattern;

import java.awt.Color;

import com.company.composite_pattern.editor.ImageEditor;
import com.company.composite_pattern.shapes.CompoundShape;
import com.company.composite_pattern.shapes.Dot;
import com.company.composite_pattern.shapes.Rectangle;
import com.company.composite_pattern.shapes.Circle;

public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                    new Circle(110, 110, 50, Color.RED),
                    new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
	}

}
