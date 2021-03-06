/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meteoinfo.desktop.forms;

import org.meteoinfo.projection.KnownCoordinateSystems;
import org.meteoinfo.projection.info.ProjectionInfo;
import org.meteoinfo.projection.ProjectionNames;
import java.awt.Component;
import java.awt.Cursor;
import org.meteoinfo.projection.proj4j.proj.Projection;
import static org.meteoinfo.projection.ProjectionNames.Mercator;

/**
 *
 * @author Yaqiang Wang
 */
public class FrmProjection extends javax.swing.JDialog {

    private final FrmMain _parent;
    private boolean _isLoading = false;
    private ProjectionInfo projInfo;

    /**
     * Creates new form FrmProjection
     * @param parent
     * @param modal
     */
    public FrmProjection(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        _parent = (FrmMain) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox_Projection = new javax.swing.JComboBox();
        jPanel_Parameters = new javax.swing.JPanel();
        jLabel_CentralMeridian = new javax.swing.JLabel();
        jTextField_CentralMeridian = new javax.swing.JTextField();
        jLabel_RefLat = new javax.swing.JLabel();
        jTextField_RefLat = new javax.swing.JTextField();
        jLabel_StdPara1 = new javax.swing.JLabel();
        jTextField_StandPara1 = new javax.swing.JTextField();
        jLabel_StdPara2 = new javax.swing.JLabel();
        jTextField_StandPara2 = new javax.swing.JTextField();
        jLabel_FalseEasting = new javax.swing.JLabel();
        jTextField_FalseEasting = new javax.swing.JTextField();
        jLabel_FalseNorthing = new javax.swing.JLabel();
        jTextField_FalseNorthing = new javax.swing.JTextField();
        jLabel_ScaleFactor = new javax.swing.JLabel();
        jTextField_ScaleFactor = new javax.swing.JTextField();
        jButton_Apply = new javax.swing.JButton();
        jButton_Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("bundle/Bundle_FrmProjection"); // NOI18N
        jLabel1.setText(bundle.getString("FrmProjection.jLabel1.text")); // NOI18N

        jComboBox_Projection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_Projection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ProjectionActionPerformed(evt);
            }
        });

        jPanel_Parameters.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("FrmProjection.jPanel_Parameters.border.title"))); // NOI18N

        jLabel_CentralMeridian.setText(bundle.getString("FrmProjection.jLabel_CentralMeridian.text")); // NOI18N

        jLabel_RefLat.setText(bundle.getString("FrmProjection.jLabel_RefLat.text")); // NOI18N

        jLabel_StdPara1.setText(bundle.getString("FrmProjection.jLabel_StdPara1.text")); // NOI18N

        jLabel_StdPara2.setText(bundle.getString("FrmProjection.jLabel_StdPara2.text")); // NOI18N

        jLabel_FalseEasting.setText(bundle.getString("FrmProjection.jLabel_FalseEasting.text")); // NOI18N

        jLabel_FalseNorthing.setText(bundle.getString("FrmProjection.jLabel_FalseNorthing.text")); // NOI18N

        jLabel_ScaleFactor.setText(bundle.getString("FrmProjection.jLabel_ScaleFactor.text")); // NOI18N

        javax.swing.GroupLayout jPanel_ParametersLayout = new javax.swing.GroupLayout(jPanel_Parameters);
        jPanel_Parameters.setLayout(jPanel_ParametersLayout);
        jPanel_ParametersLayout.setHorizontalGroup(
            jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ParametersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ParametersLayout.createSequentialGroup()
                        .addGroup(jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_StdPara1)
                            .addComponent(jLabel_RefLat)
                            .addComponent(jLabel_CentralMeridian))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_CentralMeridian, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(jTextField_RefLat)
                            .addComponent(jTextField_StandPara1)))
                    .addGroup(jPanel_ParametersLayout.createSequentialGroup()
                        .addGroup(jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_StdPara2)
                            .addComponent(jLabel_FalseEasting)
                            .addComponent(jLabel_FalseNorthing)
                            .addComponent(jLabel_ScaleFactor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_StandPara2)
                            .addComponent(jTextField_FalseEasting)
                            .addComponent(jTextField_FalseNorthing)
                            .addComponent(jTextField_ScaleFactor))))
                .addContainerGap())
        );
        jPanel_ParametersLayout.setVerticalGroup(
            jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ParametersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_CentralMeridian)
                    .addComponent(jTextField_CentralMeridian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_RefLat)
                    .addComponent(jTextField_RefLat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_StdPara1)
                    .addComponent(jTextField_StandPara1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_StdPara2)
                    .addComponent(jTextField_StandPara2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_FalseEasting)
                    .addComponent(jTextField_FalseEasting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_FalseNorthing)
                    .addComponent(jTextField_FalseNorthing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ParametersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ScaleFactor)
                    .addComponent(jTextField_ScaleFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_Apply.setText(bundle.getString("FrmProjection.jButton_Apply.text")); // NOI18N
        jButton_Apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ApplyActionPerformed(evt);
            }
        });

        jButton_Close.setText(bundle.getString("FrmProjection.jButton_Close.text")); // NOI18N
        jButton_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_Parameters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Projection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jButton_Apply)
                .addGap(59, 59, 59)
                .addComponent(jButton_Close)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox_Projection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_Parameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Close, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jButton_Apply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        _isLoading = true;
        this.jComboBox_Projection.removeAllItems();
        for (ProjectionNames pName : ProjectionNames.values()) {
            switch (pName) {
                case Lambert_Equal_Area_Conic:
                case Lambert_Azimuthal_Equal_Area:
                case Stereographic_Azimuthal:
                case Wagner3:
                case Undefine:
                    continue;
            }
            this.jComboBox_Projection.addItem(pName.toString());
        }
        _isLoading = false;
        this.jComboBox_Projection.setSelectedItem(_parent.getMapDocument().getActiveMapFrame().getMapView().
                getProjection().getProjInfo().getProjectionName().toString());
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox_ProjectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ProjectionActionPerformed
        // TODO add your handling code here:
        if (_isLoading) {
            return;
        }

        ProjectionNames aPrjName = ProjectionNames.valueOf(this.jComboBox_Projection.getSelectedItem().toString());
        ProjectionInfo aProjInfo = _parent.getMapDocument().getActiveMapFrame().getMapView().getProjection().getProjInfo();
        Projection aProj = aProjInfo.getCoordinateReferenceSystem().getProjection();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("bundle/Bundle_FrmProjection");
        this.jLabel_RefLat.setText(bundle.getString("FrmProjection.jLabel_RefLat.text"));
        switch (aPrjName) {
            case LongLat:
                this.jPanel_Parameters.setEnabled(false);
                for (Component aControl : this.jPanel_Parameters.getComponents()) {
                    aControl.setVisible(false);
                }
                break;
            case Lambert_Conformal_Conic:
            case Albers_Equal_Area:
                this.jPanel_Parameters.setEnabled(true);
                for (Component aControl : this.jPanel_Parameters.getComponents()) {
                    aControl.setVisible(true);
                    //aControl.setEnabled(true);
                }
                this.jLabel_ScaleFactor.setVisible(false);
                this.jTextField_ScaleFactor.setVisible(false);
                if (aProjInfo.getProjectionName() == aPrjName) {
                    this.jTextField_CentralMeridian.setText(String.valueOf(aProj.getProjectionLongitudeDegrees()));
                    this.jTextField_RefLat.setText(String.valueOf(aProj.getProjectionLatitudeDegrees()));
                    this.jTextField_StandPara1.setText(String.valueOf(aProj.getProjectionLatitude1Degrees()));
                    this.jTextField_StandPara2.setText(String.valueOf(aProj.getProjectionLatitude2Degrees()));
                    this.jTextField_FalseEasting.setText(String.valueOf(aProj.getFalseEasting()));
                    this.jTextField_FalseNorthing.setText(String.valueOf(aProj.getFalseNorthing()));
                } else {
                    this.jTextField_CentralMeridian.setText("105");
                    this.jTextField_RefLat.setText("0");
                    this.jTextField_StandPara1.setText("25");
                    this.jTextField_StandPara2.setText("47");
                    this.jTextField_FalseEasting.setText("0");
                    this.jTextField_FalseNorthing.setText("0");
                }
                break;
            case Lambert_Azimuthal_Equal_Area:
                this.jPanel_Parameters.setEnabled(true);
                for (Component aControl : this.jPanel_Parameters.getComponents()) {
                    aControl.setVisible(false);
                }
                this.jLabel_CentralMeridian.setVisible(true);
                this.jTextField_CentralMeridian.setVisible(true);
                this.jLabel_RefLat.setVisible(true);
                this.jTextField_RefLat.setVisible(true);
                this.jLabel_FalseEasting.setVisible(true);
                this.jTextField_FalseEasting.setVisible(true);
                this.jLabel_FalseNorthing.setVisible(true);
                this.jTextField_FalseNorthing.setVisible(true);
                if (aProjInfo.getProjectionName() == aPrjName) {
                    this.jTextField_CentralMeridian.setText(String.valueOf(aProj.getProjectionLongitudeDegrees()));
                    this.jTextField_RefLat.setText(String.valueOf(aProj.getProjectionLatitudeDegrees()));
                    this.jTextField_FalseEasting.setText(String.valueOf(aProj.getFalseEasting()));
                    this.jTextField_FalseNorthing.setText(String.valueOf(aProj.getFalseNorthing()));
                } else {
                    this.jTextField_CentralMeridian.setText("105");
                    this.jTextField_RefLat.setText("90");
                    this.jTextField_FalseEasting.setText("0");
                    this.jTextField_FalseNorthing.setText("0");
                }
                break;
            case North_Polar_Stereographic_Azimuthal:
            case South_Polar_Stereographic_Azimuthal:
                this.jPanel_Parameters.setEnabled(true);
                for (Component aControl : this.jPanel_Parameters.getComponents()) {
                    aControl.setVisible(false);
                }
                this.jLabel_CentralMeridian.setVisible(true);
                this.jTextField_CentralMeridian.setVisible(true);
                this.jLabel_StdPara1.setVisible(true);
                this.jTextField_StandPara1.setVisible(true);
                this.jLabel_ScaleFactor.setVisible(true);
                this.jTextField_ScaleFactor.setVisible(true);
                this.jLabel_FalseEasting.setVisible(true);
                this.jTextField_FalseEasting.setVisible(true);
                this.jLabel_FalseNorthing.setVisible(true);
                this.jTextField_FalseNorthing.setVisible(true);
                if (aProjInfo.getProjectionName() == aPrjName) {
                    this.jTextField_CentralMeridian.setText(String.valueOf(aProj.getProjectionLongitudeDegrees()));
                    this.jTextField_StandPara1.setText(String.valueOf(aProj.getTrueScaleLatitudeDegrees()));
                    this.jTextField_ScaleFactor.setText(String.valueOf(aProj.getScaleFactor()));
                    this.jTextField_FalseEasting.setText(String.valueOf(aProj.getFalseEasting()));
                    this.jTextField_FalseNorthing.setText(String.valueOf(aProj.getFalseNorthing()));
                } else {
                    this.jTextField_CentralMeridian.setText("105");
                    if (aPrjName == ProjectionNames.North_Polar_Stereographic_Azimuthal)
                        this.jTextField_StandPara1.setText("90");
                    else
                        this.jTextField_StandPara1.setText("-90");
                    this.jTextField_ScaleFactor.setText("1.0");
                    this.jTextField_FalseEasting.setText("0");
                    this.jTextField_FalseNorthing.setText("0");
                }
                break;
            case Mercator:
                this.jPanel_Parameters.setEnabled(true);
                for (Component aControl : this.jPanel_Parameters.getComponents()) {
                    aControl.setVisible(false);
                }
                this.jLabel_CentralMeridian.setVisible(true);
                this.jTextField_CentralMeridian.setVisible(true);
                this.jLabel_StdPara1.setVisible(true);
                this.jTextField_StandPara1.setVisible(true);
                this.jLabel_FalseEasting.setVisible(true);
                this.jTextField_FalseEasting.setVisible(true);
                this.jLabel_FalseNorthing.setVisible(true);
                this.jTextField_FalseNorthing.setVisible(true);
                if (aProjInfo.getProjectionName() == aPrjName) {
                    this.jTextField_CentralMeridian.setText(String.valueOf(aProj.getProjectionLongitudeDegrees()));
                    this.jTextField_StandPara1.setText(String.valueOf(aProj.getProjectionLatitude1Degrees()));
                    this.jTextField_FalseEasting.setText(String.valueOf(aProj.getFalseEasting()));
                    this.jTextField_FalseNorthing.setText(String.valueOf(aProj.getFalseNorthing()));
                } else {
                    this.jTextField_CentralMeridian.setText("105");
                    this.jTextField_StandPara1.setText("0");
                    this.jTextField_FalseEasting.setText("0");
                    this.jTextField_FalseNorthing.setText("0");
                }
                break;
            case Robinson:
            case Molleweide:
            case Hammer_Eckert:
                this.jPanel_Parameters.setEnabled(true);
                for (Component aControl : this.jPanel_Parameters.getComponents()) {
                    aControl.setVisible(false);
                }
                this.jLabel_CentralMeridian.setVisible(true);
                this.jTextField_CentralMeridian.setVisible(true);
                if (aProjInfo.getProjectionName() == aPrjName) {
                    this.jTextField_CentralMeridian.setText(String.valueOf(aProj.getProjectionLongitudeDegrees()));
                } else {
                    this.jTextField_CentralMeridian.setText("105");
                }
                break;
            case Geostationary_Satellite:
                this.jPanel_Parameters.setEnabled(true);
                for (Component aControl : this.jPanel_Parameters.getComponents()) {
                    aControl.setVisible(false);
                }
                this.jLabel_CentralMeridian.setVisible(true);
                this.jTextField_CentralMeridian.setVisible(true);
                this.jLabel_RefLat.setText(bundle.getString("FrmProjection.jLabel_RefLat_1.text"));
                this.jLabel_RefLat.setVisible(true);
                this.jTextField_RefLat.setVisible(true);
                if (aProjInfo.getProjectionName() == aPrjName) {
                    this.jTextField_CentralMeridian.setText(String.valueOf(aProj.getProjectionLongitudeDegrees()));
                    this.jTextField_RefLat.setText(String.valueOf(aProj.getHeightOfOrbit()));
                } else {
                    this.jTextField_CentralMeridian.setText("105");
                    this.jTextField_RefLat.setText("35785831");
                }
                break;
            case Orthographic_Azimuthal:
            case Oblique_Stereographic_Alternative:
            case Transverse_Mercator:
                this.jPanel_Parameters.setEnabled(true);
                for (Component aControl : this.jPanel_Parameters.getComponents()) {
                    aControl.setVisible(false);
                }
                this.jLabel_CentralMeridian.setVisible(true);
                this.jTextField_CentralMeridian.setVisible(true);
                this.jLabel_RefLat.setVisible(true);
                this.jTextField_RefLat.setVisible(true);
                if (aProjInfo.getProjectionName() == aPrjName) {
                    this.jTextField_CentralMeridian.setText(String.valueOf(aProj.getProjectionLongitudeDegrees()));
                    this.jTextField_RefLat.setText(String.valueOf(aProj.getProjectionLatitudeDegrees()));
                } else {
                    this.jTextField_CentralMeridian.setText("105");
                    this.jTextField_RefLat.setText("45");
                }
                break;
            case Sinusoidal:
                this.jPanel_Parameters.setEnabled(true);
                for (Component aControl : this.jPanel_Parameters.getComponents()) {
                    aControl.setVisible(false);
                }
                this.jLabel_CentralMeridian.setVisible(true);
                this.jTextField_CentralMeridian.setVisible(true);
                if (aProjInfo.getProjectionName() == aPrjName) {
                    this.jTextField_CentralMeridian.setText(String.valueOf(aProj.getProjectionLongitudeDegrees()));
                } else {
                    this.jTextField_CentralMeridian.setText("105");
                }
                break;
            case Cylindrical_Equal_Area:
                this.jPanel_Parameters.setEnabled(true);
                for (Component aControl : this.jPanel_Parameters.getComponents()) {
                    aControl.setVisible(false);
                }
                this.jLabel_CentralMeridian.setVisible(true);
                this.jTextField_CentralMeridian.setVisible(true);
                this.jLabel_StdPara1.setVisible(true);
                this.jTextField_StandPara1.setVisible(true);
                this.jLabel_FalseEasting.setVisible(true);
                this.jTextField_FalseEasting.setVisible(true);
                this.jLabel_FalseNorthing.setVisible(true);
                this.jTextField_FalseNorthing.setVisible(true);
                if (aProjInfo.getProjectionName() == aPrjName) {
                    this.jTextField_CentralMeridian.setText(String.valueOf(aProj.getProjectionLongitudeDegrees()));
                    this.jTextField_StandPara1.setText(String.valueOf(aProj.getProjectionLatitude1Degrees()));
                    this.jTextField_FalseEasting.setText(String.valueOf(aProj.getFalseEasting()));
                    this.jTextField_FalseNorthing.setText(String.valueOf(aProj.getFalseNorthing()));
                } else {
                    this.jTextField_CentralMeridian.setText("105");
                    this.jTextField_StandPara1.setText("0");
                    this.jTextField_FalseEasting.setText("0");
                    this.jTextField_FalseNorthing.setText("0");
                }
                break;
        }

        if (this.jTextField_FalseEasting.getText().isEmpty()) {
            this.jTextField_FalseEasting.setText("0");
        }
        if (this.jTextField_FalseNorthing.getText().isEmpty()) {
            this.jTextField_FalseNorthing.setText("0");
        }
    }//GEN-LAST:event_jComboBox_ProjectionActionPerformed

    private void jButton_ApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ApplyActionPerformed
        // TODO add your handling code here:
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        ProjectionNames aPrjName = ProjectionNames.valueOf(this.jComboBox_Projection.getSelectedItem().toString());
        String toProjStr;

        switch (aPrjName) {
            case Lambert_Conformal_Conic:
                toProjStr = "+proj=lcc"
                        + " +lat_1=" + this.jTextField_StandPara1.getText()
                        + " +lat_2=" + this.jTextField_StandPara2.getText()
                        + " +lat_0=" + this.jTextField_RefLat.getText()
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText()
                        + " +x_0=" + this.jTextField_FalseEasting.getText()
                        + " +y_0=" + this.jTextField_FalseNorthing.getText();
                break;
            case Albers_Equal_Area:
                toProjStr = "+proj=aea"
                        + " +lat_1=" + this.jTextField_StandPara1.getText()
                        + " +lat_2=" + this.jTextField_StandPara2.getText()
                        + " +lat_0=" + this.jTextField_RefLat.getText()
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText()
                        + " +x_0=" + this.jTextField_FalseEasting.getText()
                        + " +y_0=" + this.jTextField_FalseNorthing.getText();
                break;
            case Lambert_Azimuthal_Equal_Area:
                toProjStr = "+proj=laea"
                        + " +lat_0=" + this.jTextField_RefLat.getText()
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText()
                        + " +x_0=" + this.jTextField_FalseEasting.getText()
                        + " +y_0=" + this.jTextField_FalseNorthing.getText();
                break;
            case North_Polar_Stereographic_Azimuthal:
                toProjStr = "+proj=stere"
                        + " +lat_ts=" + this.jTextField_StandPara1.getText()
                        + " +lat_0=90"
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText();
                break;
            case South_Polar_Stereographic_Azimuthal:
                toProjStr = "+proj=stere"
                        + " +lat_ts=" + this.jTextField_StandPara1.getText()
                        + " +lat_0=-90"
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText();
                break;
            case Mercator:
                toProjStr = "+proj=merc"
                        + " +lat_ts=" + this.jTextField_StandPara1.getText()
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText()
                        + " +x_0=" + this.jTextField_FalseEasting.getText()
                        + " +y_0=" + this.jTextField_FalseNorthing.getText();
                break;
            case Robinson:
                toProjStr = "+proj=robin"
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText();
                break;
            case Molleweide:
                toProjStr = "+proj=moll"
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText();
                break;
            case Hammer_Eckert:
                toProjStr = "+proj=hammer"
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText();
                break;
            case Orthographic_Azimuthal:
                toProjStr = "+proj=ortho"
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText()
                        + " +lat_0=" + this.jTextField_RefLat.getText();
                break;
            case Geostationary_Satellite:
                toProjStr = "+proj=geos"
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText()
                        + " +h=" + this.jTextField_RefLat.getText();
                break;
            case Oblique_Stereographic_Alternative:
                toProjStr = "+proj=stere"
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText()
                        + " +lat_0=" + this.jTextField_RefLat.getText();
                break;
            case Transverse_Mercator:
                toProjStr = "+proj=tmerc"
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText()
                        + " +lat_0=" + this.jTextField_RefLat.getText();
                break;
            case LongLat:
                toProjStr = KnownCoordinateSystems.geographic.world.WGS1984.toProj4String();
                break;
            case Sinusoidal:
                toProjStr = "+proj=sinu"
                        + "+lon_0=" + this.jTextField_CentralMeridian.getText();
                break;
            case Cylindrical_Equal_Area:
                toProjStr = "+proj=cea"
                        + " +lat_ts=" + this.jTextField_StandPara1.getText()
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText()
                        + " +x_0=" + this.jTextField_FalseEasting.getText()
                        + " +y_0=" + this.jTextField_FalseNorthing.getText();
                break;
            default:
                toProjStr = "+proj=robin"
                        + " +lon_0=" + this.jTextField_CentralMeridian.getText();
                break;
        }

        ProjectionInfo toProj = ProjectionInfo.factory(toProjStr);
        _parent.getMapDocument().getActiveMapFrame().getMapView().projectLayers(toProj);

        this.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_jButton_ApplyActionPerformed

    private void jButton_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_CloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProjection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProjection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProjection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProjection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmProjection dialog = new FrmProjection(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Apply;
    private javax.swing.JButton jButton_Close;
    private javax.swing.JComboBox jComboBox_Projection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_CentralMeridian;
    private javax.swing.JLabel jLabel_FalseEasting;
    private javax.swing.JLabel jLabel_FalseNorthing;
    private javax.swing.JLabel jLabel_RefLat;
    private javax.swing.JLabel jLabel_ScaleFactor;
    private javax.swing.JLabel jLabel_StdPara1;
    private javax.swing.JLabel jLabel_StdPara2;
    private javax.swing.JPanel jPanel_Parameters;
    private javax.swing.JTextField jTextField_CentralMeridian;
    private javax.swing.JTextField jTextField_FalseEasting;
    private javax.swing.JTextField jTextField_FalseNorthing;
    private javax.swing.JTextField jTextField_RefLat;
    private javax.swing.JTextField jTextField_ScaleFactor;
    private javax.swing.JTextField jTextField_StandPara1;
    private javax.swing.JTextField jTextField_StandPara2;
    // End of variables declaration//GEN-END:variables
}
