package projeto.oficina.DAO;

import projeto.oficina.manutencao.Manutencao;

import java.sql.SQLException;
import java.util.ArrayList;

public class ManutencaoDAO extends ConnectionDAO{

//DAO - Data Access Object

    boolean sucesso = false; //Para saber se funcionou

    public boolean inserirManutencao(Manutencao manutencao) {
        connectToDB();
        String sql = "INSERT INTO Manutencao (id, status) values(?,?)";

        try { //pst é um comando utilizado para a preparação do comando, usado quando se passa algo por parâmetro
            pst = con.prepareStatement(sql);
            pst.setInt(1, manutencao.getId());
            pst.setString(2, manutencao.getStatus());
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

    public boolean atualizarManutencao(int id, Manutencao manutencao) {
        connectToDB();
        String sql = "UPDATE Manutencao SET status=? where id=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, manutencao.getStatus());
            pst.setInt(2, id);
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

    public boolean deletarManutencao(int id) {
        connectToDB();
        String sql = "DELETE FROM Manutencao where id=?";

        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
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

    public ArrayList<Manutencao> buscarManutencaoSemFiltro() {
        ArrayList<Manutencao> listaDeManutencao = new ArrayList<>();
        connectToDB();
        String sql = "SELECT * FROM Manutencao";

        try { //st é um comando usado quando a função não precisa de uma preparação, função não recebe parâmetro
            st = con.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Lista de Manutenção: ");
            while (rs.next()) {
                Manutencao manutencaoAux = new Manutencao(rs.getInt("id"), rs.getString("status"));
                System.out.println("id = " + manutencaoAux.getId());
                System.out.println("Status = " + manutencaoAux.getStatus());
                System.out.println("--------------------------------");
                listaDeManutencao.add(manutencaoAux);
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
        return listaDeManutencao;
    }
    public Manutencao buscarManutencaoPorId(int id) {
        connectToDB();
        Manutencao manutencaoAux = null;
        String sql = "SELECT * FROM Manutencao WHERE id = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                String aux = rs.getString("id");
                if(aux.isEmpty())
                {
                    sucesso = false;
                } else {
                    manutencaoAux = new Manutencao(rs.getInt("id"), rs.getString("status"));
                    System.out.println("id = " + manutencaoAux.getId());
                    System.out.println("Status = " + manutencaoAux.getStatus());
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
        return manutencaoAux;
    }
}
