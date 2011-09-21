/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SpriteInfoPanel.java
 *
 * Created on 24-Jun-2011, 09:26:31
 */
package dfEditor;

import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Point;
import dfEditor.GraphicPanel;
import java.awt.Color;

/**
 *
 * @author Sam
 */
public class SpriteInfoPanel extends javax.swing.JPanel {
    
    /** Creates new form SpriteInfoPanel */
    public SpriteInfoPanel() 
    {
        initComponents();
    }
        
    public void setSprite(String aName, Rectangle aRect, GraphicObject aGraphic)
    {
        setTitle(aName);

        if (aGraphic != null)        
            setCoords(aRect);        
        else
            setCoords(null);
        
        setGraphic(aGraphic);      
        
        repaint();        
    }
    
    public void setTitle(String aString)
    {
        spriteName.setText(aString);   
    }            
    
    public void setGraphic(GraphicObject aGraphic)
    {
        spritePanel.setGraphic(aGraphic);
    }
    
    public void setCoords(Rectangle aCoords)
    {
        if (aCoords != null)
        {
            String dimensionString = new String(
                    "(" 
                    + aCoords.x + ", "
                    + aCoords.y + ", "
                    + aCoords.width + ", "
                    + aCoords.height
                    + ")");
            spriteDimensions.setText(dimensionString);
        }
        else
            spriteDimensions.setText("");      
        
    }
    
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spriteName = new javax.swing.JLabel();
        spriteDimensions = new javax.swing.JLabel();
        spritePanel = new dfEditor.SimpleGraphicPanel();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(dfEditor.dfEditorApp.class).getContext().getResourceMap(SpriteInfoPanel.class);
        spriteName.setText(resourceMap.getString("spriteName.text")); // NOI18N
        spriteName.setName("spriteName"); // NOI18N

        spriteDimensions.setText(resourceMap.getString("spriteDimensions.text")); // NOI18N
        spriteDimensions.setName("spriteDimensions"); // NOI18N

        spritePanel.setName("spritePanel"); // NOI18N

        javax.swing.GroupLayout spritePanelLayout = new javax.swing.GroupLayout(spritePanel);
        spritePanel.setLayout(spritePanelLayout);
        spritePanelLayout.setHorizontalGroup(
            spritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        spritePanelLayout.setVerticalGroup(
            spritePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spriteName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(spriteDimensions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(spritePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spriteName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(spriteDimensions, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spritePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel spriteDimensions;
    private javax.swing.JLabel spriteName;
    private dfEditor.SimpleGraphicPanel spritePanel;
    // End of variables declaration//GEN-END:variables
}