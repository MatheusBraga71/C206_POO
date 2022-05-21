package projeto.oficina.DAO;

import projeto.oficina.documentos.Documento;

import java.sql.SQLException;
import java.util.ArrayList;

public class DocumentoDAO extends ConnectionDAO {

//DAO - Data Access Object

    boolean sucesso = false; //Para saber se funcionou

    public boolean inserirDocumento(Documento documento) {
        connectToDB();
        String sql = "INSERT INTO Documento (renavam, anoDoVeiculo) values(?,?)";

        try { //pst é um comando utilizado para a preparação do comando, usado quando se passa algo por parâmetro
            pst = con.prepareStatement(sql);
            pst.setInt(1, documento.getRenavam());
            pst.setString(2, documento.getAnoDoVeiculo());
            pst.execute();
            sucesso = true;
        } catch(SQLException exc) {
            System.out.println("Erro: " + exc.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public boolean atualizarAnoDocumento(int renavam, Documento documento) {
        connectToDB();
        String sql = "UPDATE Documento SET anoDoVeiculo=? where renavam=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, documento.getAnoDoVeiculo());
            pst.setInt(2, renavam);
            pst.execute();
            sucesso = true;

        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public boolean deletarDocumento(int renavam) {
        connectToDB();
        String sql = "DELETE FROM Documento where renavam=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, renavam);
            pst.execute();
            sucesso = true;

        } catch(SQLException ex) {
            System.out.println("Erro = " +  ex.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException exc) {
                System.out.println("Erro: " + exc.getMessage());
            }
        }
        return sucesso;
    }

    public ArrayList<Documento> buscarDocumentoSemFiltro() {
        ArrayList<Documento> listaDeDocumentos = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Documento";

        try { //st é um comando usado quando a função não precisa de uma preparação, função não recebe parâmetro
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Instrumentos: ");
            while (rs.next()) {
                Documento documentoAux = new Documento(rs.getInt("renavam"), rs.getString("anoDoVeiculo"));
                System.out.println("Renavam = " + documentoAux.getRenavam());
                System.out.println("Ano do Veículo = " + documentoAux.getAnoDoVeiculo());
                System.out.println("--------------------------------");
                listaDeDocumentos.add(documentoAux);
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                st.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return listaDeDocumentos;
    }
    public Documento buscarDocumentoPorRenavam(int renavam) {
        connectToDB();
        Documento documentoAux = null;
        String sql = "SELECT * FROM Documento WHERE renavam = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, renavam);
            rs = pst.executeQuery();
            while (rs.next()) {
                String aux = rs.getString("renavam");
                if(aux.isEmpty())
                {
                    sucesso = false;
                } else {
                    documentoAux = new Documento(rs.getInt("renavam"), rs.getString("anoDoVeiculo"));
                    System.out.println("Renavam = " + documentoAux.getRenavam());
                    System.out.println("Ano do Veículo = " + documentoAux.getAnoDoVeiculo());
                    System.out.println("--------------------------------");
                }
            }
            sucesso = true;
        } catch(SQLException e) {
            System.out.println("Erro: " + e.getMessage());
            sucesso = false;
        } finally {
            try {
                con.close();
                pst.close();
            } catch(SQLException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        return documentoAux;
    }
}
