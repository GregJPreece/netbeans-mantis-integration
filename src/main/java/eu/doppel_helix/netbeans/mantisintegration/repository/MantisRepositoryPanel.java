package eu.doppel_helix.netbeans.mantisintegration.repository;

import java.awt.TextComponent;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.JTextComponent;

public class MantisRepositoryPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form MantisRepositoryPanel
     */
    public MantisRepositoryPanel() {
        initComponents();
        
        scheduleDateFieldCustom.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                if(scheduleDateFieldCustom.isSelected()) {
                    scheduleDateFieldCustomName.setEnabled(true);
                } else {
                    scheduleDateFieldCustomName.setEnabled(false);
                }
            }
        });
      
        scheduleLengthFieldCustom.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                if(scheduleLengthFieldCustom.isSelected()) {
                    scheduleLengthFieldCustomName.setEnabled(true);
                } else {
                    scheduleLengthFieldCustomName.setEnabled(false);
                }
            }
        });
        
        httpUserField.setPreferredSize(httpUserField.getMinimumSize());
        httpPwdField.setPreferredSize(httpPwdField.getMinimumSize());
        usernameTextField.setPreferredSize(usernameTextField.getMinimumSize());
        passwordTextField.setPreferredSize(passwordTextField.getMinimumSize());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        scheduleDateButtonGroup = new javax.swing.ButtonGroup();
        scheduleLengthButtonGroup = new javax.swing.ButtonGroup();
        nameLabel = new javax.swing.JLabel();
        urlLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        urlTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        scheduleConfigPanel = new javax.swing.JPanel();
        scheduleDateFieldLabel = new javax.swing.JLabel();
        scheduleDateFieldBuiltIn = new javax.swing.JRadioButton();
        scheduleDateFieldCustom = new javax.swing.JRadioButton();
        scheduleDateFieldCustomName = new javax.swing.JTextField();
        scheduleLengthFieldLabel = new javax.swing.JLabel();
        scheduleLengthFieldBuiltIn = new javax.swing.JRadioButton();
        scheduleLengthFieldCustom = new javax.swing.JRadioButton();
        scheduleLengthFieldCustomName = new javax.swing.JTextField();
        httpAuthEnabled = new javax.swing.JCheckBox();
        httpUserLabel = new javax.swing.JLabel();
        httpUserField = new javax.swing.JTextField();
        httpPwdField = new javax.swing.JPasswordField();
        httpPasswordLabel = new javax.swing.JLabel();
        checkResult = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setLayout(new java.awt.GridBagLayout());

        nameLabel.setText("Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(nameLabel, gridBagConstraints);

        urlLabel.setText("Mantis-URL:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(urlLabel, gridBagConstraints);

        usernameLabel.setText("Username:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(usernameLabel, gridBagConstraints);

        passwordLabel.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(passwordLabel, gridBagConstraints);

        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                selectAllOnFocusGain(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(nameTextField, gridBagConstraints);

        urlTextField.setText("http://<host>/<mantis-basepath>");
        urlTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                selectAllOnFocusGain(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(urlTextField, gridBagConstraints);

        usernameTextField.setText("DEMOVALUE");
        usernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                selectAllOnFocusGain(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(usernameTextField, gridBagConstraints);

        checkButton.setText("Check");
        checkButton.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(checkButton, gridBagConstraints);

        passwordTextField.setText("DEMOVALUE");
        passwordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                selectAllOnFocusGain(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(passwordTextField, gridBagConstraints);

        scheduleConfigPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Schedule"));
        scheduleConfigPanel.setToolTipText("<html>\nMantisIntegration has an integrated schedule handling,<br>\nby specifying a custom field the schedule information can<br>\nbe published/read to/from to the bugtracker.");
        scheduleConfigPanel.setLayout(new java.awt.GridBagLayout());

        scheduleDateFieldLabel.setText("Date-Field:");
        scheduleDateFieldLabel.setToolTipText("<html>\nWhere should date part of schedule be saved to/read from?<br>\nField needs to be a calendar type.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        scheduleConfigPanel.add(scheduleDateFieldLabel, gridBagConstraints);

        scheduleDateButtonGroup.add(scheduleDateFieldBuiltIn);
        scheduleDateFieldBuiltIn.setSelected(true);
        scheduleDateFieldBuiltIn.setText("built-in");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        scheduleConfigPanel.add(scheduleDateFieldBuiltIn, gridBagConstraints);

        scheduleDateButtonGroup.add(scheduleDateFieldCustom);
        scheduleDateFieldCustom.setText("Custom-Field:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        scheduleConfigPanel.add(scheduleDateFieldCustom, gridBagConstraints);

        scheduleDateFieldCustomName.setColumns(20);
        scheduleDateFieldCustomName.setToolTipText(scheduleDateFieldLabel.getToolTipText());
        scheduleDateFieldCustomName.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        scheduleConfigPanel.add(scheduleDateFieldCustomName, gridBagConstraints);

        scheduleLengthFieldLabel.setText("Length-Field:");
        scheduleLengthFieldLabel.setToolTipText("<html>\nWhere should length part of schedule be saved to/read from?<br>\nField needs to be a number type and may only contain integer values.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        scheduleConfigPanel.add(scheduleLengthFieldLabel, gridBagConstraints);

        scheduleLengthButtonGroup.add(scheduleLengthFieldBuiltIn);
        scheduleLengthFieldBuiltIn.setSelected(true);
        scheduleLengthFieldBuiltIn.setText("built-in");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        scheduleConfigPanel.add(scheduleLengthFieldBuiltIn, gridBagConstraints);

        scheduleLengthButtonGroup.add(scheduleLengthFieldCustom);
        scheduleLengthFieldCustom.setText("Custom-Field:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        scheduleConfigPanel.add(scheduleLengthFieldCustom, gridBagConstraints);

        scheduleLengthFieldCustomName.setColumns(20);
        scheduleLengthFieldCustomName.setToolTipText(scheduleLengthFieldLabel.getToolTipText());
        scheduleLengthFieldCustomName.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        scheduleConfigPanel.add(scheduleLengthFieldCustomName, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 220;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(scheduleConfigPanel, gridBagConstraints);

        httpAuthEnabled.setText(org.openide.util.NbBundle.getMessage(MantisRepositoryPanel.class, "RedmineRepositoryPanel.httpAuthEnabled.text")); // NOI18N
        httpAuthEnabled.setActionCommand("httpAuth");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 2, 5);
        add(httpAuthEnabled, gridBagConstraints);

        httpUserLabel.setText(org.openide.util.NbBundle.getMessage(MantisRepositoryPanel.class, "RedmineRepositoryPanel.httpUserLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 5, 5);
        add(httpUserLabel, gridBagConstraints);

        httpUserField.setText(org.openide.util.NbBundle.getMessage(MantisRepositoryPanel.class, "RedmineRepositoryPanel.httpUserField.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 5, 5);
        add(httpUserField, gridBagConstraints);

        httpPwdField.setText(org.openide.util.NbBundle.getMessage(MantisRepositoryPanel.class, "RedmineRepositoryPanel.httpPwdField.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 5, 5);
        add(httpPwdField, gridBagConstraints);

        httpPasswordLabel.setText(org.openide.util.NbBundle.getMessage(MantisRepositoryPanel.class, "RedmineRepositoryPanel.httpPasswordLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(2, 5, 5, 5);
        add(httpPasswordLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        add(checkResult, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.weighty = 1.0;
        add(filler1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void selectAllOnFocusGain(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_selectAllOnFocusGain
        if (evt.getComponent() instanceof JTextComponent) {
            ((JTextComponent) evt.getComponent()).selectAll();
        } else if (evt.getComponent() instanceof TextComponent) {
            ((TextComponent) evt.getComponent()).selectAll();
        }
    }//GEN-LAST:event_selectAllOnFocusGain

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton checkButton;
    javax.swing.JLabel checkResult;
    javax.swing.Box.Filler filler1;
    javax.swing.JCheckBox httpAuthEnabled;
    javax.swing.JLabel httpPasswordLabel;
    javax.swing.JPasswordField httpPwdField;
    javax.swing.JTextField httpUserField;
    javax.swing.JLabel httpUserLabel;
    javax.swing.JLabel nameLabel;
    javax.swing.JTextField nameTextField;
    javax.swing.JLabel passwordLabel;
    javax.swing.JPasswordField passwordTextField;
    javax.swing.JPanel scheduleConfigPanel;
    private javax.swing.ButtonGroup scheduleDateButtonGroup;
    javax.swing.JRadioButton scheduleDateFieldBuiltIn;
    javax.swing.JRadioButton scheduleDateFieldCustom;
    javax.swing.JTextField scheduleDateFieldCustomName;
    javax.swing.JLabel scheduleDateFieldLabel;
    private javax.swing.ButtonGroup scheduleLengthButtonGroup;
    javax.swing.JRadioButton scheduleLengthFieldBuiltIn;
    javax.swing.JRadioButton scheduleLengthFieldCustom;
    javax.swing.JTextField scheduleLengthFieldCustomName;
    javax.swing.JLabel scheduleLengthFieldLabel;
    javax.swing.JLabel urlLabel;
    javax.swing.JTextField urlTextField;
    javax.swing.JLabel usernameLabel;
    javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
