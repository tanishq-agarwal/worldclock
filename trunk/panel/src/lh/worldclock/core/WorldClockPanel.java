/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lh.worldclock.core;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * <p>
 * Title: WorldClockPanel
 * </p>
 * 
 * <p>
 * Description: Embeds a WorldClockBoard
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2008 The WorldClock Application Team
 * </p>
 * 
 * @author Ludovic HOCHET
 * @version $Revision:  $ $Date:  $
 */
public class WorldClockPanel extends JPanel
{
  private WorldClockBoard board = new WorldClockBoard();
  
  /**
   * Construct a new panel
   */
  public WorldClockPanel()
  {
  }

  /**
   * Constructs a new panel setting the board and panel preferred size to the given size
   * @param width width of the panel
   * @param height height of the panel
   */
  public WorldClockPanel(int width, int height)
  {
    updateSize(width, height);
  }  

  /**
   * Paint the panel
   * @param graphics
   */
  @Override
  public void paintComponent(Graphics graphics)
  {
    board.paintComponent(graphics);
  }
  
  /**
   * Update the board and panel preferred size
   * @param width new width
   * @param height new height
   */
  public void updateSize(int width, int height)
  {
    board.updateSizeValues(width, height);
    setPreferredSize(new Dimension(width, height));
  }
}
