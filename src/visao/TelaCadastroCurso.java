package visao;

import controle.ControleCurso;
import controle.IControleCadastro;
import java.util.HashMap;
import modelo.Docente;
import util.DialogBoxUtils;

/**
 *
 * @author Vicente
 */
public class TelaCadastroCurso extends TelaCadastro {

    /**
     * Creates new form TelaCadastroCurso
     *
     * @param controle
     */
    public TelaCadastroCurso(IControleCadastro controle) {
        super(controle);
        initComponents();
        setLocationRelativeTo(null);
        inicializarComponentesTela();
    }

    @Override
    public void inicializarComponentesTela() {
        jT_Curso.setText("");
        jS_CargaHoraria.setValue(2000);
        jS_Semestres.setValue(6);

        ControleCurso controleAluno = (ControleCurso) controle;
        for (String nomeCoordenador : controleAluno.getControleDocente().getNomesDocentes()) {
            jC_Coordenador.addItem(nomeCoordenador);
        }
        jC_Coordenador.setSelectedIndex(0);
    }

    @Override
    public void setarDadosTela(HashMap<String, Object> dados) {
        if (dados == null || dados.isEmpty()) {
            DialogBoxUtils.exibirMensagemDeErro("Erro", "Erro ao setar dados na tela");
        }

        jT_Curso.setText((String) dados.getOrDefault("curso", ""));
        jS_CargaHoraria.setValue(dados.getOrDefault("cargahoraria", 0));
        jS_Semestres.setValue(dados.getOrDefault("semestres", 0));
        if (dados.get("coordenador") != null) {
            jC_Coordenador.setSelectedItem(((Docente) dados.get("coordenador")).getNome());
        }
    }

    @Override
    public HashMap<String, Object> getDadosTela() {
        HashMap<String, Object> dados = new HashMap<>();
        dados.put("curso", jT_Curso.getText());
        dados.put("cargahoraria", jS_CargaHoraria.getValue());
        dados.put("semestres", jS_Semestres.getValue());
        int indexCordenador = jC_Coordenador.getSelectedIndex() - 1;
        if (indexCordenador >= 0) {
            dados.put("coordenador", ((ControleCurso) controle).getControleDocente().getDocenteSelecionado(indexCordenador));
        } else {
            dados.put("coordenador", null);
        }
        return dados;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jT_Curso = new javax.swing.JTextField();
        jS_CargaHoraria = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jS_Semestres = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jC_Coordenador = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jB_Cancelar = new javax.swing.JButton();
        jB_Salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Curso");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Carga Horária");
        jLabel4.setPreferredSize(new java.awt.Dimension(60, 18));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Curso");

        jT_Curso.setActionCommand("<Not Set>");
        jT_Curso.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jS_CargaHoraria.setModel(new javax.swing.SpinnerNumberModel(2000, 360, 10000, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Semestres");
        jLabel5.setPreferredSize(new java.awt.Dimension(60, 18));

        jS_Semestres.setModel(new javax.swing.SpinnerNumberModel(6, 4, 12, 1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Curso");
        jLabel6.setPreferredSize(new java.awt.Dimension(60, 18));

        jC_Coordenador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Docente" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Coordenador");
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 18));

        jB_Cancelar.setBackground(java.awt.SystemColor.controlHighlight);
        jB_Cancelar.setText("Cancelar");
        jB_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CancelarActionPerformed(evt);
            }
        });

        jB_Salvar.setBackground(java.awt.SystemColor.activeCaption);
        jB_Salvar.setText("Salvar");
        jB_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jS_CargaHoraria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jS_Semestres)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jB_Cancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_Salvar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jC_Coordenador, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jT_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jS_CargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jS_Semestres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jC_Coordenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Salvar)
                    .addComponent(jB_Cancelar))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jB_CancelarActionPerformed

    private void jB_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalvarActionPerformed

        if (!editarDados) {
            controle.salvar(getDadosTela());
        } else {
            controle.editar(getDadosTela());
        }
        controle.atualizarTabelaTelaListagem();
        setVisible(false);
    }//GEN-LAST:event_jB_SalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Cancelar;
    private javax.swing.JButton jB_Salvar;
    private javax.swing.JComboBox<String> jC_Coordenador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jS_CargaHoraria;
    private javax.swing.JSpinner jS_Semestres;
    private javax.swing.JTextField jT_Curso;
    // End of variables declaration//GEN-END:variables

}
