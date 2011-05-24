/*
Copyright 2008-2011 Gephi
Authors : Antonio Patriarca <antoniopatriarca@gmail.com>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.visualization.api.selection;

import java.util.Collection;
import javax.swing.event.ChangeListener;
import org.gephi.graph.api.Edge;
import org.gephi.graph.api.Node;

/**
 *
 * @author Antonio Patriarca <antoniopatriarca@gmail.com>
 */
public interface SelectionManager {

    Collection<Node> getSelectedNodes();

    void addChangeListener(ChangeListener changeListener);

    void blockSelection(boolean block);

    void disableSelection();

    int getMouseSelectionDiameter();

    public void centerOnNode(Node node);

    boolean isBlocked();

    boolean isCustomSelection();

    boolean isDirectMouseSelection();

    boolean isDraggingEnabled();

    boolean isMouseSelectionZoomProportionnal();

    boolean isRectangleSelection();

    boolean isSelectionEnabled();

    boolean isSelectionUpdateWhileDragging();

    void removeChangeListener(ChangeListener changeListener);

    void resetSelection();

    void selectEdge(Edge edge);

    void selectEdges(Edge[] edges);

    void selectNode(Node node);

    void selectNodes(Node[] nodes);

    void setCustomSelection();

    void setDirectMouseSelection();

    void setDraggingEnable(boolean dragging);

    void setDraggingMouseSelection();

    void setMouseSelectionDiameter(int mouseSelectionDiameter);

    void setMouseSelectionZoomProportionnal(boolean mouseSelectionZoomProportionnal);

    void setRectangleSelection();

    void setSelectionUpdateWhileDragging(boolean selectionUpdateWhileDragging);

}
