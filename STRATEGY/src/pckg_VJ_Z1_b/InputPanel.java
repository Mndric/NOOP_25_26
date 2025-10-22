package pckg_VJ_Z1_b;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class InputPanel extends JPanel {

    private JTextField fstNumField;
    private JTextField sndNumField;
    private JComboBox<ALG_OPERATION> algOperationCombo;
    private JButton calculateButton;
    private InputPanelListener inputPanelListener;


    public InputPanel(){

        Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
        Border inner = BorderFactory.createTitledBorder("Input calculator");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
        Dimension dims = getPreferredSize();
        dims.width = 220;
        setPreferredSize(dims);
        initComponents();
        layoutComponents();
        activatePanel();
    }
    public void setInputPanelListener(InputPanelListener inputPanelListener){
        this.inputPanelListener = inputPanelListener;
    }

    private void initComponents() {
        this.fstNumField = new JTextField(10);
        this.sndNumField = new JTextField(10);
        this.algOperationCombo = new JComboBox<>();
        DefaultComboBoxModel<ALG_OPERATION> comboBoxModel = new DefaultComboBoxModel<>();
        for(ALG_OPERATION ao : ALG_OPERATION.values()){
            comboBoxModel.addElement(ao);
        }
        algOperationCombo.setModel(comboBoxModel);
        algOperationCombo.setSelectedIndex(-1);
        calculateButton = new JButton("Calculate");
    }

    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Num_1: "), gbc);

        gbc.gridx = 1;
        add(fstNumField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Num_2: "), gbc);

        gbc.gridx = 1;
        add(sndNumField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Operation:"), gbc);

        gbc.gridx = 1;
        add(algOperationCombo, gbc);

        gbc.gridy = 4;
        gbc.weighty = 1.0;

        add(calculateButton, gbc);
    }

    private void activatePanel() {

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    Double fst = Double.parseDouble(fstNumField.getText());
                    Double snd = Double.parseDouble(sndNumField.getText());
                    ALG_OPERATION alg_operation =  (ALG_OPERATION) algOperationCombo.getSelectedItem();
                    InputPanelData inputPanelData = new InputPanelData(fst, snd, alg_operation);
                    if(inputPanelListener != null){
                        inputPanelListener.inputPanelEventOccurred(inputPanelData);
                    }
                }catch(NumberFormatException nfe){

                    JOptionPane.showMessageDialog(InputPanel.this, nfe.getMessage(), "Exception input", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
    }


}
