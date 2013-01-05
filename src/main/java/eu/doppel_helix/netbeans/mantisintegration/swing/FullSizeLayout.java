package eu.doppel_helix.netbeans.mantisintegration.swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import javax.swing.JLayeredPane;

public class FullSizeLayout implements LayoutManager {

    @Override
    public void addLayoutComponent(String name, Component comp) {
    }

    @Override
    public void removeLayoutComponent(Component comp) {
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        synchronized (parent.getTreeLock()) {
            JLayeredPane pane = (JLayeredPane) parent;
            int maxX = 0;
            int maxY = 0;
            for (Component c : pane.getComponents()) {
                Dimension d = c.getPreferredSize();
                if (d.getHeight() > maxY) {
                    maxY = (int) d.getHeight();
                }
                if (d.getWidth() > maxX) {
                    maxX = (int) d.getWidth();
                }
            }
            return new Dimension(maxX, maxY);
        }
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        synchronized (parent.getTreeLock()) {
            JLayeredPane pane = (JLayeredPane) parent;
            int maxX = 0;
            int maxY = 0;
            for (Component c : pane.getComponents()) {
                Dimension d = c.getMinimumSize();
                if (d.getHeight() > maxY) {
                    maxY = (int) d.getHeight();
                }
                if (d.getWidth() > maxX) {
                    maxX = (int) d.getWidth();
                }
            }
            return new Dimension(maxX, maxY);
        }
    }

    @Override
    public void layoutContainer(Container parent) {
        synchronized (parent.getTreeLock()) {
            Rectangle innerBounds = parent.getBounds();
            innerBounds.setLocation(0, 0);
            JLayeredPane pane = (JLayeredPane) parent;
            for (Component c : pane.getComponents()) {
                c.setBounds(innerBounds);
                c.doLayout();
            }
        }
    }
}
