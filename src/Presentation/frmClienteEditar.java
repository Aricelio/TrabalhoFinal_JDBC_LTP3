package Presentation;

import DataAccess.ClienteDAO;
import DominModel.Cliente;
import DominModel.Email;
import DominModel.Endereco;
import DominModel.ErroValidacaoException;
import DominModel.Telefone;
import java.awt.Color;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmClienteEditar extends javax.swing.JInternalFrame {

    //Declaração de Variaveis
    Cliente cliente;
    ClienteDAO clienteDAO;

    //Construtor
    public frmClienteEditar(Cliente cli, ClienteDAO dao) {
        initComponents();
        this.cliente = cli;
        this.clienteDAO = dao;

        if (cliente != null && clienteDAO != null) {
            carregaCamposCliente();

            if (cliente.getTelefones() != null) {
                atualizaTabelaTelefones(cliente.getTelefones());
            }
            if (cliente.getEnderecos() != null) {
                atualizaTabelaEnderecos(cliente.getEnderecos());
            }
            if (cliente.getEmails() != null) {
                atualizaTabelaEmails(cliente.getEmails());
            }
        } else {
            clienteDAO = new ClienteDAO();
            cliente = new Cliente();
        }
    }

    //Carrega os campos do cliente
    private void carregaCamposCliente() {
        txtNome.setText(cliente.getNome());
        txtData.setValue(cliente.getDataNascimento());
        txtRG.setText(cliente.getRG());
        txtCPF.setText(cliente.getCPF());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpClientes = new javax.swing.JTabbedPane();
        jpDadosGerais = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        lblRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jpTelefones = new javax.swing.JPanel();
        lblDDD = new javax.swing.JLabel();
        txtDDD = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnAdicionarTelefone = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListagemTelefones = new javax.swing.JTable();
        txtOperadora = new javax.swing.JTextField();
        lblOperadora = new javax.swing.JLabel();
        jpEmails = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListagemEmails = new javax.swing.JTable();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        btnAdicionarEmail = new javax.swing.JButton();
        jpEnderecos = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblListagemEnderecos = new javax.swing.JTable();
        btnAdicionarEndereco = new javax.swing.JButton();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        cbxUF = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();
        btnApagar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar Cliente");
        setName(""); // NOI18N
        setVisible(true);

        tpClientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblDataNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataNascimento.setText("Data de Nascimento:");

        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        txtData.setToolTipText("");
        txtData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRG.setText("RG: ");

        txtRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCPF.setText("CPF: ");

        txtCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpDadosGeraisLayout = new javax.swing.GroupLayout(jpDadosGerais);
        jpDadosGerais.setLayout(jpDadosGeraisLayout);
        jpDadosGeraisLayout.setHorizontalGroup(
            jpDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosGeraisLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblRG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosGeraisLayout.createSequentialGroup()
                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpDadosGeraisLayout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jpDadosGeraisLayout.setVerticalGroup(
            jpDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosGeraisLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRG)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(291, Short.MAX_VALUE))
        );

        tpClientes.addTab("Dados Gerais", jpDadosGerais);

        lblDDD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDDD.setText("DDD: ");

        txtDDD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelefone.setText("Telefone:");

        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAdicionarTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdicionarTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/Salvar.png"))); // NOI18N
        btnAdicionarTelefone.setText("Adicionar");
        btnAdicionarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarTelefoneActionPerformed(evt);
            }
        });

        tblListagemTelefones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblListagemTelefones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblListagemTelefones);

        txtOperadora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblOperadora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOperadora.setText("Operadora:");

        javax.swing.GroupLayout jpTelefonesLayout = new javax.swing.GroupLayout(jpTelefones);
        jpTelefones.setLayout(jpTelefonesLayout);
        jpTelefonesLayout.setHorizontalGroup(
            jpTelefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTelefonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDDD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblOperadora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(btnAdicionarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addComponent(jScrollPane1)
        );
        jpTelefonesLayout.setVerticalGroup(
            jpTelefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTelefonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTelefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDDD)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOperadora)
                    .addComponent(btnAdicionarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpClientes.addTab("Telefones", jpTelefones);

        tblListagemEmails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblListagemEmails.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblListagemEmails);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmail.setText("E-Mail:");

        btnAdicionarEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdicionarEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/Salvar.png"))); // NOI18N
        btnAdicionarEmail.setText("Adicionar");
        btnAdicionarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEmailsLayout = new javax.swing.GroupLayout(jpEmails);
        jpEmails.setLayout(jpEmailsLayout);
        jpEmailsLayout.setHorizontalGroup(
            jpEmailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmail)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(btnAdicionarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addComponent(jScrollPane2)
        );
        jpEmailsLayout.setVerticalGroup(
            jpEmailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEmailsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpEmailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpClientes.addTab("E-Mails", jpEmails);

        lblNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumero.setText("Numero:");

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRua.setText("Rua:");

        txtRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBairro.setText("Bairro:");

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCidade.setText("Cidade:");

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblUF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUF.setText("UF:");

        tblListagemEnderecos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblListagemEnderecos.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblListagemEnderecos);

        btnAdicionarEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdicionarEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/Salvar.png"))); // NOI18N
        btnAdicionarEndereco.setText("Adicionar");
        btnAdicionarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEnderecoActionPerformed(evt);
            }
        });

        lblComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblComplemento.setText("Complemento:");

        txtComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbxUF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbxUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout jpEnderecosLayout = new javax.swing.GroupLayout(jpEnderecos);
        jpEnderecos.setLayout(jpEnderecosLayout);
        jpEnderecosLayout.setHorizontalGroup(
            jpEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jpEnderecosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpEnderecosLayout.createSequentialGroup()
                        .addComponent(lblBairro)
                        .addGap(18, 18, 18)
                        .addComponent(txtBairro))
                    .addGroup(jpEnderecosLayout.createSequentialGroup()
                        .addComponent(lblNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblComplemento)
                        .addGap(18, 18, 18)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jpEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRua)
                    .addComponent(lblCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEnderecosLayout.createSequentialGroup()
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblUF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxUF, 0, 65, Short.MAX_VALUE))
                    .addComponent(txtRua))
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jpEnderecosLayout.setVerticalGroup(
            jpEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnderecosLayout.createSequentialGroup()
                .addGroup(jpEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEnderecosLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jpEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumero)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRua)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComplemento)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBairro)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUF)
                            .addComponent(lblCidade)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEnderecosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdicionarEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpClientes.addTab("Endereços", jpEnderecos);

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/Salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnApagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/Apagar.png"))); // NOI18N
        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icones/Error-icon.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpClientes)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tpClientes)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnApagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizaTabelaTelefones(List<Telefone> telefones) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("DDD");
        model.addColumn("Operadora");
        model.addColumn("Telefone");


        for (Telefone t : telefones) {
            Vector valores = new Vector();
            valores.add(0, t.getDdd());
            valores.add(1, t.getOperadora());
            valores.add(2, t.getTelefone());

            model.addRow(valores);
        }
        tblListagemTelefones.setModel(model);
        tblListagemTelefones.repaint();
    }

    //Atualiza a tabela de Emails
    private void atualizaTabelaEmails(List<Email> emails) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Email");

        for (Email e : emails) {
            Vector valores = new Vector();
            valores.add(0, e.getEmail());
            model.addRow(valores);
        }
        tblListagemEmails.setModel(model);
        tblListagemEmails.repaint();
    }

    //Atualiza a tabela de Endereços
    private void atualizaTabelaEnderecos(List<Endereco> enderecos) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Rua");
        model.addColumn("Numero");
        model.addColumn("Complemento");
        model.addColumn("Bairro");
        model.addColumn("Cidade");
        model.addColumn("Estado");

        for (Endereco end : enderecos) {
            Vector valores = new Vector();
            valores.add(0, end.getRua());
            valores.add(1, end.getNumero());
            valores.add(2, end.getComplemento());
            valores.add(3, end.getBairro());
            valores.add(4, end.getCidade());
            valores.add(5, end.getUf());

            model.addRow(valores);
        }
        tblListagemEnderecos.setModel(model);
        tblListagemEnderecos.repaint();
    }

    //Botão Adicionar Telefone
    private void btnAdicionarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarTelefoneActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(rootPane, "Deseja adicionar o Telefone?") == 0) {
                Telefone t = new Telefone();
                t.setDdd((byte) Integer.parseInt(txtDDD.getText()));
                t.setOperadora((byte) Integer.parseInt(txtOperadora.getText()));
                t.setTelefone(Integer.parseInt(txtTelefone.getText()));

                cliente.addTelefone(t);

                atualizaTabelaTelefones(cliente.getTelefones());

                JOptionPane.showMessageDialog(rootPane, "Telefone adicionado");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação Cancelada");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro! " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarTelefoneActionPerformed

    //Botão Adicionar Email
    private void btnAdicionarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEmailActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(rootPane, "Deseja adicionar o Email?") == 0) {
                Email e = new Email();
                e.setEmail(txtEmail.getText());

                cliente.addEmail(e);

                atualizaTabelaEmails(cliente.getEmails());

                JOptionPane.showMessageDialog(rootPane, "Email adicionado");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação Cancelada");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro! " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarEmailActionPerformed

    //Botão Adicionar Endereco
    private void btnAdicionarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEnderecoActionPerformed
        try {
            if (JOptionPane.showConfirmDialog(rootPane, "Deseja adicionar o Endereço?") == 0) {

                Endereco e = new Endereco();
                e.setNumero(Integer.parseInt(txtNumero.getText()));
                e.setComplemento(txtComplemento.getText());
                e.setRua(txtRua.getText());
                e.setBairro(txtBairro.getText());
                e.setCidade(txtCidade.getText());
                e.setUf((String) cbxUF.getSelectedItem());

                cliente.addEndereco(e);

                atualizaTabelaEnderecos(cliente.getEnderecos());

                JOptionPane.showMessageDialog(rootPane, "Endereço adicionado");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação Cancelada");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro! " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarEnderecoActionPerformed

    //Botão Salvar
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realemente salvar dos dados?") == 0) {
            try {
                boolean autenticacao = true;
                if (clienteDAO.AutenticarCPF(txtCPF.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "Erro! CPF ja cadastrado!");
                    autenticacao = false;
                }
                if (clienteDAO.AutenticarRG(txtRG.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "Erro! RG ja cadastrado!");
                    autenticacao = false;
                }
                if (autenticacao) {
                    cliente.setNome(txtNome.getText());
                    cliente.setDataNascimento((Date) txtData.getValue());
                    cliente.setCPF(txtCPF.getText());
                    cliente.setRG(txtRG.getText());
                    cliente.setTipoPessoa("Fisica");

                    clienteDAO.SalvarCliente(cliente);
                    JOptionPane.showMessageDialog(rootPane, "Dados Salvos com Sucesso!");
                    
                    this.setVisible(false);
                }
            } catch (ErroValidacaoException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro de validação! " + ex.getMessage());
                if (ex.getCampo() == "Nome") {
                    txtNome.setBackground(Color.red);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Salvar os dados! Consulte o administrador do sistema!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cadastro cancelado pelo usuario");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    //Botão Apagar
    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed

        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente apagar dos dados?") == 0) {
            try {
                clienteDAO.RemoverCliente(cliente);
                JOptionPane.showMessageDialog(rootPane, "Exclusão concluida com sucesso!");

                this.setVisible(false);
                frmClienteBuscar janela = new frmClienteBuscar();
                this.getParent().add(janela);
                janela.setVisible(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao Apagar os dados! " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Exclusão cancelada pelo usuario");
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    //Botão Cancelar
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realemente Cancelar?") == 0) {
            this.setVisible(false);
            frmClienteBuscar janela = new frmClienteBuscar();
            this.getParent().add(janela);
            janela.setVisible(true);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarEmail;
    private javax.swing.JButton btnAdicionarEndereco;
    private javax.swing.JButton btnAdicionarTelefone;
    private javax.swing.JToggleButton btnApagar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbxUF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpDadosGerais;
    private javax.swing.JPanel jpEmails;
    private javax.swing.JPanel jpEnderecos;
    private javax.swing.JPanel jpTelefones;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblDDD;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblOperadora;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTable tblListagemEmails;
    private javax.swing.JTable tblListagemEnderecos;
    private javax.swing.JTable tblListagemTelefones;
    private javax.swing.JTabbedPane tpClientes;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtDDD;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtOperadora;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
